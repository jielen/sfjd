package com.ufgov.zc.server.commonbiz.dao.ibatis;import java.util.List;import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.server.commonbiz.dao.IOperationTypeDao;public class OperationTypeDao extends SqlMapClientDaoSupport implements IOperationTypeDao {  public List getOperationType(ElementConditionDto dto) {    return this.getSqlMapClientTemplate().queryForList("OperationType.getOperationType", dto);  }}