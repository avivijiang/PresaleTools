define(['knockout', 'jquery', 'select2'], function (ko, $) {

    function loadRole() {

    }

    ko.bindingHandlers.roleset = {
        init: function (element, valueAccessor, allBindings, viewModel, bindingContext) {
            // This will be called when the binding is first applied to an element
            // Set up any initial state, event handlers, etc. here

            var url = globle_var.ctx + '/region/queryRole';
            $.ajax({
                type: "GET",
                url: url,
                dataType: "json",
                success: function (xhw) {
                    var optionData = [];
                    $.each(xhw.data.systemRoleList, function (index, value) {
                        var d = {
                            id: value.roleId,
                            text: value.roleName
                        }
                        optionData.push(d);
                    });
                    var select2 = $(element).select2({
                        data: optionData,
                        placeholder: "角色可多选"
                    });

                    select2.on('change', function (e) {
                        var selectedRoleIds = $(e.currentTarget).val();
                        valueAccessor()(selectedRoleIds);
                    });
                }
            });


        },
        update: function (element, valueAccessor, allBindings, viewModel, bindingContext) {
            // This will be called once when the binding is first applied to an element,
            // and again whenever any observables/computeds that are accessed change
            // Update the DOM element based on the supplied values here.
        }
    };




            function loadArea() {

            }
            ko.bindingHandlers.regionset = {
        init: function (element, valueAccessor, allBindings, viewModel, bindingContext) {
            // This will be called when the binding is first applied to an element
            // Set up any initial state, event handlers, etc. here

                var url = globle_var.ctx + '/region/queryRole';
                $.ajax({
                    type: "GET",
                    url: url,
                    dataType: "json",
                    success: function (xhw) {
                        var optionData = [];
                        $.each(xhw.data.regionInfoList, function (index, value) {
                            var f = {
                                id: value.regionId,
                                text: value.regionName
                            }
                            optionData.push(f);
                        });
                      var select2 = $(element).select2({
                        data: optionData,
                        placeholder: "地区可多选"
                    });

                    select2.on('change', function (e) {
                        var selectedRegionIds = $(e.currentTarget).val();
                        valueAccessor()(selectedRegionIds);
                    });
                }
            });


        },
        update: function (element, valueAccessor, allBindings, viewModel, bindingContext) {
            // This will be called once when the binding is first applied to an element,
            // and again whenever any observables/computeds that are accessed change
            // Update the DOM element based on the supplied values here.
        }
    };

            });