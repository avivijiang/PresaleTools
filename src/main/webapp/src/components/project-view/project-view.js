define(['knockout', 'text!./project-view.html'], function (ko, templateMarkup) {

  ko.components.register('prolist', { require: 'components/project-view/prolist/prolist' });

  function RoleManagement(params) {}

  // This runs when the component is torn down. Put here any logic necessary to clean up,
  // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
  RoleManagement.prototype.dispose = function () {};

  return { viewModel: RoleManagement, template: templateMarkup };

});
