package com.ufgov.zc.server.sf.dao;

import java.math.BigDecimal;
import java.util.List;

import com.ufgov.zc.common.sf.model.SfEntrust;
import com.ufgov.zc.common.system.dto.ElementConditionDto;

public interface SfEntrustMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUST
   * @mbggenerated  Wed Jan 07 11:38:37 CST 2015
   */
  int deleteByPrimaryKey(BigDecimal entrustId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUST
   * @mbggenerated  Wed Jan 07 11:38:37 CST 2015
   */
  int insert(SfEntrust record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUST
   * @mbggenerated  Wed Jan 07 11:38:37 CST 2015
   */
  int insertSelective(SfEntrust record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUST
   * @mbggenerated  Wed Jan 07 11:38:37 CST 2015
   */
  SfEntrust selectByPrimaryKey(BigDecimal entrustId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUST
   * @mbggenerated  Wed Jan 07 11:38:37 CST 2015
   */
  int updateByPrimaryKeySelective(SfEntrust record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUST
   * @mbggenerated  Wed Jan 07 11:38:37 CST 2015
   */
  int updateByPrimaryKey(SfEntrust record);

  List getEntrustLst(ElementConditionDto dto);

  int updateStatus(ElementConditionDto dto);
}