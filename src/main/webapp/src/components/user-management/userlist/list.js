define(['knockout', 'text!./list.html', 'jquery'], function (ko, templateMarkup, $) {

    function UserListViewModel(params) {
        var self = this;

        self.userItemList = ko.observableArray([]);

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
        self.username = ko.observable(data.name);
        self.loginname = ko.observable(data.loginName);
        self.roles = ko.observable(data.roles);
        self.registerDate = ko.observable(data.registerDate);
    }



    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    UserListViewModel.prototype.dispose = function () { };

    return { viewModel: UserListViewModel, template: templateMarkup };

});
