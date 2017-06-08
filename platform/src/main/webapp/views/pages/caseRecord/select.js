(function () {

    //绑定案件
    var SelectModule = smart.SelectModule.extend({
        //构造函数
        init: function (options) {
            smart.SelectModule.fn.init.call(this, options);
        },

        //初始化组件
        initComponents: function () {
            var self = this;
            smart.kendoui.grid(this.$("#mainGrid"),
                $.extend(true, this.gridOptions(), {
                    columns: [
                        {field: "id", width: 100, hidden: true},
                        {field: "caseCode", type: "string", title: "案件编号", width: 100},
                        {field: "caseName", type: "string", title: "案件名称", width: 100},
                        {field: "suspect", type: "string", title: "嫌疑人", width: 100},
                        {field: "masterUnitName", type: "string", title: "主办单位", width: 100},
                        {field: "masterPoliceName", type: "string", title: "主办人", width: 100},
                        {field: "acceptDate", type: "date", title: "受案时间", width: 100, format: '{0:yyyy-MM-dd}'},
                        {field: "caseStatus", type: "enum", title: "办理状态", width: 100,
                            values: smart.Enums["com.bycc.enumitem.CaseStatus"].getData()
                        }
                    ],
                    selectable: "single" //单选
                })
            )
        },

        //@overwrite
        bindEvents: function () {
            var self = this;
            //绑定选择事件
            smart.bind("#" + this.containerId + " #btnDoSelect", function () {
                var $row = self.mainGrid.select(),
                    data = self.mainGrid.dataItem($row);
                smart.Event('ITEM_SELECTED_EVENT', data).fire();
            });
            //绑定选择回调事件
            self.mainGrid.bind('smartRowDblClick', function (e) {
                var data = e.data.rowData;
                smart.Event('ITEM_SELECTED_EVENT', data).fire();
            })
        }
    });

    new SelectModule({
        name: "SmartCaseSelect", //必需，模块名
        containerId: "ctnCaseSelect", //必需，模块的容器id
        restUrl: "/cases/" //必需，请求的rest地址
    });

})();