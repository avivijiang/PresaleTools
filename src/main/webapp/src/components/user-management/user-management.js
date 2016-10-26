define(['knockout', 'text!./user-management.html'], function (ko, templateMarkup) {

  ko.components.register('userlist', { require: 'components/user-management/userlist/list' });

  function UserManagement(params) {}

  // This runs when the component is torn down. Put here any logic necessary to clean up,
  // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
  UserManagement.prototype.dispose = function () {};

  return { viewModel: UserManagement, template: templateMarkup };

});
