define(['knockout', 'text!./list.html', 'jquery'], function (ko, templateMarkup, $) {

    function UserListViewModel(params) {
        var self = this;

        self.userItemList = ko.observableArray([]);

        self.editUser = function (chosenData) {
            chosenData.isEditUser(true);
        }

        self.saveEdit = function (chosenData) {
            var url = globle_var.ctx + '/mgr/account/update';
            var recieveData = ko.toJS(chosenData);
            delete recieveData["isEditUser"];
            var postdata = JSON.stringify(recieveData);
            $.ajax({
                type: "POST",
                url: url,
                data: postdata,
                contentType: 'application/json',
                dataType: 'json',
                success: function (data) {
                    if (data != null) {
                        console.log("success");
                        chosenData.isEditUser(false);
                    } else {
                        alert("更新失败！");
                        console.log("resData is empty! update failed!");
                    }


                },
                error: function () {

                }
            });

        }


        loadUserData();
        function loadUserData() {
            var url = globle_var.ctx + '/mgr/account/page';
            $.ajax({
                url: url,
                dataType: 'json',
                success: function (data) {
                    $.each(data.content, function (index, value) {
                        self.userItemList.push(new UserItemViewModel(value));
                    });
                }
            });
        }
    }

    function UserItemViewModel(data) {
        var self = this;
        self.id = ko.observable(data.id);
        self.name = ko.observable(data.name);
        self.loginName = ko.observable(data.loginName);
        self.status = ko.observable(data.status);
        self.registerDate = ko.observable(data.registerDate);
        self.isEditUser = ko.observable(false);
    }


    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    UserListViewModel.prototype.dispose = function () { };

    return { viewModel: UserListViewModel, template: templateMarkup };

});
