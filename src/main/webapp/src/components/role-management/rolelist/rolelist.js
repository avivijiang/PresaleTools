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


        //读取权限信息
        /*
        loadPermission();
        function loadPermission() {
            var url = globle_var.ctx;
            $.ajax({
                type: 'GET',
                url: url,
                dataType: 'json',
                success: function (data) {
                    $.each(data.data, function (index, value) {
                        self.permissionList.push(new PermissionViewMode(value));
                    });
                }
            });
        }
        */
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
        self.permissionId = ko.observable();
        self.permissionName = ko.observable();
        self.ischosenP = ko.observable();

    }


    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    RoleListViewModel.prototype.dispose = function () { };
    return { viewModel: RoleListViewModel, template: templateMarkup };

});
