define(['knockout', 'text!./adduser.html', 'jquery', 'select2', 'validate'], function (ko, templateMarkup, $) {

    function AddUserViewModel(params) {
        var self = this;
        //数据模型
        self.addName = ko.observable();
        self.addPassword = ko.observable();
        self.addEmail = ko.observable();
        self.addTelphone = ko.observable();
        self.addRole = ko.observableArray([]);
        self.addArea = ko.observableArray([]);

        //加载角色
        loadRole();
        function loadRole() {
            var url = globle_var.ctx + '/region/queryRole';
            $.ajax({
                type: "GET",
                url: url,
                dataType: "json",
                success: function (xhw) {
                    $.each(xhw.data.systemRoleList), function (index, value) { }
                    self.addRole.push(new SystemRoeList(value));

                }
            });
        }

        //loadArea();
        function loadArea() {
            var url = globle_var.ctx + '/region/queryRole';
            $.ajax({
                type: "GET",
                url: url,
                dataType: "json",
                success: function (data) {
                    $.each(data.area), function (index, value) { }
                    self.addArea.push(new regionInfoList().value);
                }
            });
        }
        function regionInfoList(data) {
            var self = this;
            this.AreaId = ko.observable(data.regionId);
            this.AreaName = ko.observable(data.regionName);

        }


        $(".js-example-basic-single").select2(
            { placeholder: "角色可多选" });
        $.validator.setDefaults({
            ignore: '[data-js-val-prefix] *'
        });
    }

    function preServe() {
        var url = globle_var.ctx + '/add/imformation';
        var predata = {
            'username': this.addName(),
            'password': this.addPassword(),
        }
        //将Object转化成为可存入的json格式
        var postdata = JSON.stringfy(prepostdata);

        $.ajax({
            type: "POST",
            url: url,
            data: postdata,
            contentType: 'application/json',
            dataType: "json",
            success: function (sign) {
                if (data.code == '200') {
                    history.go(-1);
                }

            }
        });
    }
    //获取后台给的hw.value
    function SystemRoeList(data) {
        var self = this;
        this.RoleId = ko.observable(data.roleId);
        this.RoleName = ko.observable(data.roleName);

    }

    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    AddUserViewModel.prototype.dispose = function () { };

    return { viewModel: AddUserViewModel, template: templateMarkup };

});

