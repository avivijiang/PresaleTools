define(['knockout', 'text!./adduser.html', 'jquery'], function (ko, templateMarkup, $) {

    function AddUserViewModel(params) {
        var self = this;

    }

       

    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    AddUserViewModel.prototype.dispose = function () { };

    return { viewModel: AddUserViewModel, template: templateMarkup };

});
