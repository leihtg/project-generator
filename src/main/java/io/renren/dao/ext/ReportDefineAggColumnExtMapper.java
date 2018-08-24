package io.renren.dao.ext;

import java.util.List;
import io.renren.bean.param.ReportDefineAggColumnParam;
import io.renren.dao.ReportDefineAggColumnMapper;
import io.renren.bean.ReportDefineAggColumn;

public interface ReportDefineAggColumnExtMapper extends ReportDefineAggColumnMapper{

    List<ReportDefineAggColumn> query(ReportDefineAggColumnParam param);

}