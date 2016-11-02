define(['knockout', 'text!./prolist.html', 'jquery', 'moment'], function (ko, templateMarkup, $, moment) {

    function ProListViewModel(params) {
        var self = this;
        //项目列表
        self.projectList = ko.observableArray([]);
        //分页信息
        self.pageIndex = ko.observable(0);
        self.pageSize = ko.observable();
        self.pageNum = ko.observable();
        self.gopage = ko.observable("");
        //页面跳转
        self.lastpage = function () {
            self.pageIndex(self.pageIndex() - 1);
            self.loadProject(self.pageIndex());
        }
        self.nextpage = function () {
            self.pageIndex(self.pageIndex() + 1);
            self.loadProject(self.pageIndex());
        }
        self.turnToPage = function () {
            self.pageIndex(self.gopage() - 1);
            self.loadProject(self.pageIndex());
        }
        self.pressToPage = function (e) {
            var keyCode ;
            if (e.which)
                keyCode = e.which;
            else if (e.keyCode)
                keyCode = e.keyCode;
            if (keyCode == 13) {
                self.pageIndex(self.gopage() - 1);
                self.loadProject(self.pageIndex());
            }
        }

        //显示详情
        self.showDetial = function (chosenData) {
            if (chosenData.detailsEnabled() == false) {
                var url = globle_var.ctx + '/project/detail?projectId=' + chosenData.projectId();
                $.ajax({
                    type: 'GET',
                    url: url,
                    dataType: 'json',
                    success: function (data) {
                        if (data.code == "200") {
                            $.each(data.data.listProjectFollow, function (index, value) {
                                chosenData.projectFollow.push(new ProjectFollowModel(value));
                                chosenData.nextStepArray.push(new ProjectFollowModel(value));

                                chosenData.nextStepInfo(chosenData.nextStepArray.pop());
                            });
                            chosenData.detailsEnabled(true);

                        }

                    }
                });
            } else {
                chosenData.projectFollow.removeAll();
                chosenData.detailsEnabled(false);
            }
        }


        //读取项目信息
        self.loadProject = function (index) {
            var url = globle_var.ctx + '/project/query?pageIndex=' + index + '&pageSize=' + 5 + '&regionId=' + 0;
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
                    self.projectList.removeAll();
                    $.each(data.data.palist, function (index, value) {
                        self.projectList.push(new ProjectViewModel(value));
                    });
                    self.pageNum(Math.floor((data.data.pageNum) / 5));
                }
            });
        }
        self.loadProject(0);






    }


    //项目记录模型
    function ProjectFollowModel(data) {
        var self = this;
        self.followId = ko.observable(data.followId);
        self.projectId = ko.observable(data.projectId);
        self.salesStage = ko.observable(data.salesStage)
        self.record = ko.observable(data.record);
        self.nextStep = ko.observable(data.nextStep);
        self.createT = ko.observable(data.createTime);

        self.createTime = ko.computed(function () {
            var t = moment(self.createT()).format();
            return t.substr(0, 10) + ' ' + t.substr(11, 8);

        });
    }

    //项目列表模型
    function ProjectViewModel(data) {
        var self = this;
        //默认显示信息
        self.projectId = ko.observable(data.projectId);
        self.projectName = ko.observable(data.projectName);
        self.customerName = ko.observable(data.customerName)
        self.salesMan = ko.observable(data.salesMan);
        self.preSale = ko.observable(data.headSale);
        self.salesSt = ko.observable(data.salesStage);

        //隐藏信息
        self.regionName = ko.observable(data.regionName);
        self.branchName = ko.observable(data.branchName);
        self.onelevelProfession = ko.observable(data.onelevelProfession);
        self.isSing = ko.observable(data.isSingle);
        self.competitor = ko.observable(data.competitor);
        self.estimatedT = ko.observable(data.estimatedTime);
        self.valueaddProduct = ko.observable(data.valueaddProduct);
        self.estimatedAmount = ko.observable(data.estimatedAmount);
        self.productAmount = ko.observable(data.productAmount);
        self.projectRequirement = ko.observable(data.projectRequirement);
        self.remarks = ko.observable(data.remarks);

        self.salesStage = ko.computed(function () {
            switch (self.salesSt()) {
                case '0':
                    return "已流失";
                case '1':
                    return "意向阶段-10%";
                case '2':
                    return "立项阶段-25%";
                case '3':
                    return "方案阶段-50%";
                case '4':
                    return "投标阶段-75%";
                case '5':
                    return "商务阶段-90%";
                case '6':
                    return "已签约";
                default:
                    return "默认";

            }
        });

        self.estimatedTime = ko.computed(function () {
            var time = new Date(self.estimatedT());
            var year = time.getFullYear();
            var month = time.getMonth() + 1;
            var day = time.getDate();
            return year + "年" + month + "月" + day + "日";
        });
        self.isSingle = ko.computed(function () {
            switch (self.isSing()) {
                case '1':
                    return "独立项目";
                case '2':
                    return "混签项目";
                default:
                    return "缺省项目";
            }
        });
        self.detailsEnabled = ko.observable(false);
        //项目跟进记录
        self.projectFollow = ko.observableArray([]);
        self.nextStepArray = ko.observableArray([]);
        self.nextStepInfo = ko.observable();
    }

    // This runs when the component is torn down. Put here any logic necessary to clean up,
    // for example cancelling setTimeouts or disposing Knockout subscriptions/computeds.
    ProListViewModel.prototype.dispose = function () { };
    return { viewModel: ProListViewModel, template: templateMarkup };

});
