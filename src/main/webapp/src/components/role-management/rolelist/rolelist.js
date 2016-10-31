define(['knockout', 'text!./rolelist.html', 'jquery'], function (ko, templateMarkup, $) {



    function RoleListViewModel(params) {
        var self = this;
        //角色条目
        self.roleItemList = ko.observableArray([]);
        self.isAdd = ko.observable(false);
        //权限条目
        self.permissionList = ko.observableArray([]);

        //添加数据
        self.addRoleName = ko.observable();
        self.roleDescription = ko.observable();

        //选择条目
        self.chosenFolderId = ko.observable();
        self.chosenRoleId = ko.observable();
        self.goToFolder = function (folder) {
            self.chosenFolderId(folder);
            self.chosenRoleId(folder.roleId());
            //选择条目时查询相应的权限
            var url = globle_var.ctx + '/sysPermission/queryId/' + folder.roleId();
            $.ajax({
                type: 'GET',
                url: url,
                dataType: 'json',
                success: function (data) {
                    var permissionList = self.permissionList(),
                        hasPermissionIdCache = [];
                    $.each(data.data, function (i, v) {
                        hasPermissionIdCache.push(v.permissionId);
                    });
                    $.each(permissionList, function (index, value) {
                        if ($.inArray(value.permissionId(), hasPermissionIdCache) !== -1) {
                            value.ischosenP(true);
                        } else {
                            value.ischosenP(false);
                        }
                    });
                }
            });
        };



        //新增角色
        self.addRole = function () {
            self.isAdd(true);
        }

        //取消新增角色
        self.cancelAddRole = function () {
            self.addRoleName("");
            self.roleDescription("");
            self.isAdd(false);
        }


        //确认新增角色
        self.makeSureRole = function () {
            var url = globle_var.ctx + '/sysRole/createRole';
            var prepostdata = {
                "roleName": this.addRoleName(),
                "description": this.roleDescription(),
            };
            var postdata = JSON.stringify(prepostdata);
            $.ajax({
                type: 'POST',
                url: url,
                data: postdata,
                contentType: 'application/json',
                dataType: 'json',
                success: function (data) {
                    if (data.code == '200') {
                        self.addRoleName("");
                        self.roleDescription("");
                        self.roleItemList.push(new RoleItemViewModel(prepostdata));
                        alert("新增成功");
                    }


                    self.isAdd(false);
                }
            });
        }
        //删除角色
        self.deleteRole = function (pdata) {
            var url = globle_var.ctx + '/sysRole/deleteRole';
            var prepostdata = {
                "roleId": pdata.roleId(),
            };
            var postdata = JSON.stringify(prepostdata);
            $.ajax({
                type: 'POST',
                url: url,
                data: postdata,
                contentType: 'application/json',
                dataType: 'json',
                success: function () {
                    self.roleItemList.remove(pdata);
                    alert("删除成功");
                }
            });
        }
        //读取角色
        self.loadRolePermission = function (data) {
            var url = globle_var.ctx;

        }

        //保存权限设置
        self.setPermission = function () {
            var permissionList = self.permissionList();
            var pList = ko.observableArray([]);
            $.each(permissionList, function (index, value) {
                if (value.ischosenP() == true) {
                    pList.push(value.permissionId());
                }
            });
            var url = globle_var.ctx + '/rolePermissionRelation/update';
            var pdata = {
                "roleId": self.chosenRoleId(),
                "permissionIds": pList(),

            };
            var postdata = JSON.stringify(pdata);
            $.ajax({
                type: 'POST',
                url: url,
                dataType: 'json',
                data: postdata,
                contentType: 'application/json',
                success: function (data) {
                    if (data.code == '200') {
                        alert("设置成功");
                    }
                }
            });
        };
        //还原权限
        self.resetPermission = function () {
            var url = globle_var.ctx + '/sysPermission/queryId/' + self.chosenRoleId();
            $.ajax({
                type: 'GET',
                url: url,
                dataType: 'json',
                success: function (data) {
                    var permissionList = self.permissionList(),
                        hasPermissionIdCache = [];
                    $.each(data.data, function (i, v) {
                        hasPermissionIdCache.push(v.permissionId);
                    });
                    $.each(permissionList, function (index, value) {
                        if ($.inArray(value.permissionId(), hasPermissionIdCache) !== -1) {
                            value.ischosenP(true);
                        } else {
                            value.ischosenP(false);
                        }
                    });
                }
            });
        }
        //读取权限信息

        loadPermission();
        function loadPermission() {
            var url = globle_var.ctx + '/sysPermission/query';
            $.ajax({
                type: 'GET',
                url: url,
                dataType: 'json',
                success: function (data) {
                    $.each(data.data, function (index, value) {
                        self.permissionList.push(new PermissionViewModel(value));
                    });
                }
            });
        }

        //读取角色信息
        loadRoleData();
        function loadRoleData() {
            var url = globle_var.ctx + '/sysRole/queryRole';
            $.ajax({
                type: 'GET',
                url: url,
                dataType: 'json',
                success: function (data) {
                    $.each(data.data, function (index, value) {
                        self.roleItemList.push(new RoleItemViewModel(value));
                    });
                }
            });
        }
    }
    //角色数据模型
    function RoleItemViewModel(data) {
        var self = this;
        self.roleId = ko.observable(data.roleId);
        self.roleName = ko.observable(data.roleName);
        self.isFocus = ko.observable(true);

    }
    //权限数据模型
    function PermissionViewModel(data) {
        var self = this;
        self.permissionId = ko.observable(data.permissionId);
        self.permissionName = ko.observable(data.permissionName);
        self.ischosenP = ko.observable();

    }


    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    RoleListViewModel.prototype.dispose = function () { };
    return { viewModel: RoleListViewModel, template: templateMarkup };

});
