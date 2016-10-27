define(['knockout', 'text!./prolist.html', 'jquery'], function (ko, templateMarkup, $) {

    function ProListViewModel(params) {
        var self = this;
        //项目列表
        self.projectList = ko.observableArray([]);

    }

    //项目列表模型
    function ProjectViewModel(data){
        self.projectId = ko.observable(data.projectId());
        self.projectName = ko.observable(data.projectName());
        self.isSingle = ko.observable(data.projectId());
        self.projectId = ko.observable(data.projectId());
        self.projectId = ko.observable(data.projectId());
        self.projectId = ko.observable(data.projectId());
        self.projectId = ko.observable(data.projectId());
        self.projectId = ko.observable(data.projectId());
        self.projectId = ko.observable(data.projectId());
    }

    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    ProListViewModel.prototype.dispose = function () { };
    return { viewModel: ProListViewModel, template: templateMarkup };

});
