package io.renren.common;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @date 2018/8/24
 */
public abstract class AbstractServiceBase {

    @Autowired
    protected SqlSessionTemplate sqlSession;


}
