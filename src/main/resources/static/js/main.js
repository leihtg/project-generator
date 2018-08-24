$(function () {
    $("#jqGrid").jqGrid({
        url: 'reportDefineAggColumn/query',
        datatype: "json",
        colModel: [
            {label: '报表名称', name: 'reportDefName'},
            {label: '聚合表', name: 'aggTable'},
            {label: 'columnCode', name: 'columnCode'},
            {label: '列名称', name: 'columnName'},
            {
                label: '可钻取', name: 'drillable', formatter: function (val) {
                    return val == 0 ? '是' : '否';
                }
            },
        ],
        viewrecords: true,
        recordtext: '{0}',
        height: 385,
        rowNum: 10,
        rowList: [10, 30, 50, 100, 200],
        rownumbers: true,
        rownumWidth: 25,
        autowidth: true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader: {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames: {
            page: "page",
            rows: "limit",
            order: "order"
        },
        gridComplete: function () {
            //隐藏grid底部滚动条
            $("#jqGrid").closest(".ui-jqgrid-bdiv").css({"overflow-x": "hidden"});
        }
    });
});

var vm = new Vue({
    el: '#rrapp',
    data: {
        q: {
            tableName: null
        }
    },
    methods: {
        query: function () {
            $("#jqGrid").jqGrid('setGridParam', {
                postData: {'tableName': vm.q.tableName},
                page: 1
            }).trigger("reloadGrid");
        },
        generator: function () {
            var tableNames = getSelectedRows();
            if (tableNames == null) {
                return;
            }
            location.href = "sys/generator/code?tables=" + JSON.stringify(tableNames);
        }
    }
});

