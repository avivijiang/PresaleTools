define(['knockout', 'text!./rolelist.html', 'jquery'], function (ko, templateMarkup, $) {



    function RoleListViewModel(params) {
        var self = this;
        self.roleItemList = ko.observableArray([]);

        loadRoleData();
        function loadRoleData() {
            var url = globle_var.ctx + '/sysRole/queryRole';
            $.ajax({
                type: 'GET',
                url: url,
                dataType: 'json',
                success: function (data) {
                    $.each(data.content, function (index, value) {
                        self.roleItemList.push(new RoleItemViewModel(value));
                    });
                }
            });
        }
    }
    function RoleItemViewModel() {
        var self = this;
        self.rolename = ko.observable();
        self.description = ko.observable();
    }

    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    RoleListViewModel.prototype.dispose = function () { };
    return { viewModel: RoleListViewModel, template: templateMarkup };

});
