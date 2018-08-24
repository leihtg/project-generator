/*
 * Since 2008 - 2018-08-24 16:23:19
 */

package io.renren.service.impl;

import io.renren.bean.ReportDefineAggColumn;
import io.renren.bean.param.ReportDefineAggColumnParam;
import io.renren.common.AbstractServiceBase;
import io.renren.dao.ext.ReportDefineAggColumnExtMapper;
import io.renren.service.ReportDefineAggColumnService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportDefineAggColumnServiceImpl extends AbstractServiceBase implements ReportDefineAggColumnService {
    private final static Logger logger = LogManager.getLogger(ReportDefineAggColumnServiceImpl.class);

    @Override
    public List<ReportDefineAggColumn> query(ReportDefineAggColumnParam param) {
        ReportDefineAggColumnExtMapper mapper = sqlSession.getMapper(ReportDefineAggColumnExtMapper.class);
        return mapper.query(param);
    }

    @Override
    public Integer queryTotal(ReportDefineAggColumnParam param) {
        ReportDefineAggColumnExtMapper mapper = sqlSession.getMapper(ReportDefineAggColumnExtMapper.class);
        return mapper.queryTotal(param);
    }
}
