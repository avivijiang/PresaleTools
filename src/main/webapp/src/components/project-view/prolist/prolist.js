define(['knockout', 'text!./prolist.html', 'jquery'], function (ko, templateMarkup, $) {

    function ProListViewModel(params) {
        var self = this;
        //项目列表
        self.projectList = ko.observableArray([]);
        //分页信息
        self.pageIndex = ko.observable();
        self.pageSize = ko.observable();
        self.pageNum = ko.observable();
        //显示详情
        self.detailsEnabled = ko.observable(false);

        //读取项目信息
        self.loadProject(0);
        self.loadProject = function (index) {
            var url = globle_var.ctx + '/project/query';
            var pdata = {
                "pageIndex": index,
                "pageSize": 5,
                "regionId": 0,
            }
            var postdata = JSON.stringify(pdata);
            $.ajax({
                type: 'GET',
                url: url,
                dataType: 'json',
                data: postdata,
                contentType: 'application/json',
                success: function (data) {
                    $.each(data.data.palist, function (index, value) {
                        self.projectList.push(new ProjectViewModel(value));
                    });
                }
            });
        }






    }


    //项目列表模型
    function ProjectViewModel(data) {
        //默认显示信息
        self.projectId = ko.observable(data.projectId);
        self.customerName = ko.observable(data.customerName)
        self.salesMan = ko.observable(data.salesMan);
        self.preSale = ko.observable(data.headSale);
        self.salesStage = ko.observable(data.salesStage);
        self.estimatedTime = ko.observable(data.estimatedTime);

        //隐藏信息
        self.projectName = ko.observable(data.projectName);
        self.isSingle = ko.observable(data.isSingle);
        self.onelevelProfession = ko.observable(data.onelevelProfession);
        self.valueaddProduct = ko.observable(data.valueaddProduct);
        self.projectRequirement = ko.observable(data.projectRequirement);
        self.estimatedAmount = ko.observable(data.estimatedAmount);
        self.productAmount = ko.observable(data.productAmount);
        self.competitor = ko.observable(data.competitor);
        self.remarks = ko.observable(data.remarks);
        self.branchName = ko.observable(data.branchName);
        self.regionName = ko.observable(data.regionName);
    }

    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    ProListViewModel.prototype.dispose = function () { };
    return { viewModel: ProListViewModel, template: templateMarkup };

});
