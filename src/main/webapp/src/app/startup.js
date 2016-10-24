define(['jquery', 'knockout', './router', 'bootstrap', 'knockout-projections'], function ($, ko, router) {

  window.ko = ko;
  window.globle_var = {
    ctx: '/Pre_project_manage'
  }

  // Components can be packaged as AMD modules, such as the following:
  ko.components.register('nav-bar', { require: 'components/nav-bar/nav-bar' });
  ko.components.register('home-page', { require: 'components/home-page/home' });

  // ... or for template-only components, you can just point to a .html file directly:
  ko.components.register('about-page', {
    template: { require: 'text!components/about-page/about.html' }
  });

  // 用户管理前台页面
  ko.components.register('user-management', { require: 'components/user-management/user-management' });
  // 增加用户界面
  ko.components.register('add-user', { require: 'components/user-management/adduser/adduser' });

  // [Scaffolded component registrations will be inserted here. To retain this feature, don't remove this comment.]

  // Start the application
  ko.applyBindings({ route: router.currentRoute });
});
