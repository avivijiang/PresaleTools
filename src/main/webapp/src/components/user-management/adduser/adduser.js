define(['knockout', 'text!./adduser.html', 'jquery', 'select2', 'validate', 'components/common/bindings/roleSetBindings'],
    function (ko, templateMarkup, $) {

        function AddUserViewModel(params) {
            var self = this;
            //数据模型
            self.addName = ko.observable();
            self.addPassword = ko.observable();
            self.addEmail = ko.observable();
            self.addTelphone = ko.observable();
            self.roleIds = ko.observableArray([]);
            self.regionIds = ko.observableArray([]);

            //保存人员
            self.preServe = function () {
                var url = globle_var.ctx + '/mgr/account/add';
                // $.each(data,function(index,value){
                // self.roleIdArray.push(value.roleIds);
                // });
                var predata = {
                    'name': this.addName(),
                    'loginName': this.addEmail(),
                    'password': this.addPassword(),
                    'tel': this.addTelphone(),
                    'roleIds': this.roleIds(),
                    'regionIds': this.regionIds(),
                }
                //将Object转化成为可存入的json格式
                var postdata = JSON.stringify(predata);
                $.ajax({
                    type: "POST",
                    url: url,
                    data: postdata,
                    contentType: 'application/json',
                    dataType: "json",
                    success: function (data) {
                            alert("保存成功");
                            
                        if (data.code == '200') {
                            // self.addName("");
                            // self.addPassword("");
                            // self.addTelphone("");
                            // self.addRole(""),
                            // self.addArea("");
                            // self.data.push(new RoleListItem(predata));
                            // self.data.push(new regionInfoList(predata));
                            history.go(-1);
                        }

                    }
                });

            }
        }
        //获取后台给的value
        function RoleListItem(data) {
            var self = this;
            self.RoleId = ko.observable(data.roleId);
            self.RoleName = ko.observable(data.roleName);
        }
        function regionInfoList(data) {
            var self = this;
            self.AreaId = ko.observable(data.regionId);
            self.AreaName = ko.observable(data.regionName);
        }
        // This runs when the component is torn down. Put here any logic necessary to clean up,
        // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
        AddUserViewModel.prototype.dispose = function () { };

        return { viewModel: AddUserViewModel, template: templateMarkup };

    });