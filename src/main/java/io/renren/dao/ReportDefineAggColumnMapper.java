package io.renren.dao;

import java.util.List;

import io.renren.bean.param.ReportDefineAggColumnParam;
import io.renren.bean.ReportDefineAggColumn;

public interface ReportDefineAggColumnMapper{
    
    Integer insert(ReportDefineAggColumn param);

    Integer queryTotal(ReportDefineAggColumn param);

    List<ReportDefineAggColumn> select(ReportDefineAggColumn param);

    
}