/*
 * Since 2008 - 2018-08-24 10:28:03
 */

package io.renren.controller;

import io.renren.bean.ReportDefineAggColumn;
import io.renren.bean.param.ReportDefineAggColumnParam;
import io.renren.service.ReportDefineAggColumnService;
import io.renren.utils.PageUtils;
import io.renren.utils.Query;
import io.renren.utils.R;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/reportDefineAggColumn")
public class ReportDefineAggColumnController {
    private static final Logger logger = LogManager.getLogger(ReportDefineAggColumnController.class);

    @Autowired
    private ReportDefineAggColumnService service;

    @RequestMapping("query")
    public R query(@RequestParam Map<String, Object> params, @ModelAttribute ReportDefineAggColumnParam param) {
        logger.info("{}", params);
        // 查询列表数据
        Query query = new Query(params);

        List<ReportDefineAggColumn> list = service.query(param);
        int total = service.queryTotal(param);

        PageUtils pageUtil = new PageUtils(list, total, query.getLimit(), query.getPage());

        return R.ok().put("page", pageUtil);

    }
}