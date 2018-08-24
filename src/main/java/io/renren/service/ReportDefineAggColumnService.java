package io.renren.service;

import java.util.List;

import io.renren.bean.param.ReportDefineAggColumnParam;
import io.renren.bean.ReportDefineAggColumn;

public interface ReportDefineAggColumnService{
    
    List<ReportDefineAggColumn> query(ReportDefineAggColumnParam param);

    Integer queryTotal(ReportDefineAggColumnParam param);
    
}