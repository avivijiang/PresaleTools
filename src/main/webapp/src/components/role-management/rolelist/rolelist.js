define(['knockout', 'text!./rolelist.html', 'jquery'], function (ko, templateMarkup, $) {



    function RoleListViewModel(params) {
        var self = this;
        self.roleItemList = ko.observableArray([]);
        self.isAdd = ko.observable(false);
        self.addRoleName = ko.observable();
        self.roleDescription = ko.observable();


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
    function RoleItemViewModel(data) {
        var self = this;
        self.roleId = ko.observable(data.roleId);
        self.roleName = ko.observable(data.roleName);
        self.isFocus = ko.observable(true);
    }



    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    RoleListViewModel.prototype.dispose = function () { };
    return { viewModel: RoleListViewModel, template: templateMarkup };

});
