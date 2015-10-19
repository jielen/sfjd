package com.ufgov.zc.common.sf.model;

import java.math.BigDecimal;

import com.ufgov.zc.common.zc.model.ZcBaseBill;

public class SfXysxType extends ZcBaseBill {

  /**
   * 
   */
  private static final long serialVersionUID = 2385905290871743081L;

  public static final String COL_DEFAULT_VAL = "SF_XYSX_TYPE_DEFAULT_VAL"; // 默认值

  public static final String COL_IS_LEAF = "SF_XYSX_TYPE_IS_LEAF"; // 是否末级

  public static final String COL_LIST_INDEX = "SF_XYSX_TYPE_LIST_INDEX"; // 排列顺序

  public static final String COL_NAME = "SF_XYSX_TYPE_NAME"; // 名称

  public static final String COL_PARENT_ID = "SF_XYSX_TYPE_PARENT_ID"; // 父级ID

  public static final String COL_VAL_TYPE = "SF_XYSX_TYPE_VAL_TYPE"; // 值类别

  public static final String COL_XYSX_TYPE_ID = "SF_XYSX_TYPE_XYSX_TYPE_ID"; // 协议事项类别ID

  public static final String COL_IS_ENABLE = "SF_XYSX_TYPE_IS_ENABLE"; // 是否启用

  /**
   * 选择框类型
   */
  public static final String VAL_TYPE_CHECKBOX = "1";

  /**
   * 文本框输入类型
   */
  public static final String VAL_TYPE_TEXTBOX = "2";

  /**
   * 长文本输入框
   */
  public static final String VAL_TYPE_LONG_TEXTBOX = "3";

  /**
   * 段落输入框
   */
  public static final String VAL_TYPE_TEXTAREA = "4";

  private String isEnable;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_XYSX_TYPE.XYSX_TYPE_ID
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  private BigDecimal xysxTypeId;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_XYSX_TYPE.PARENT_ID
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  private BigDecimal parentId;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_XYSX_TYPE.NAME
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  private String name;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_XYSX_TYPE.DEFAULT_VAL
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  private String defaultVal;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_XYSX_TYPE.LIST_INDEX
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  private BigDecimal listIndex;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_XYSX_TYPE.VAL_TYPE
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  private String valType;

  /**
   * This field was generated by MyBatis Generator.
   * This field corresponds to the database column SF_XYSX_TYPE.IS_LEAF
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  private String isLeaf;

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_XYSX_TYPE.XYSX_TYPE_ID
   *
   * @return the value of SF_XYSX_TYPE.XYSX_TYPE_ID
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public BigDecimal getXysxTypeId() {
    return xysxTypeId;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_XYSX_TYPE.XYSX_TYPE_ID
   *
   * @param xysxTypeId the value for SF_XYSX_TYPE.XYSX_TYPE_ID
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public void setXysxTypeId(BigDecimal xysxTypeId) {
    this.xysxTypeId = xysxTypeId;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_XYSX_TYPE.PARENT_ID
   *
   * @return the value of SF_XYSX_TYPE.PARENT_ID
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public BigDecimal getParentId() {
    return parentId;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_XYSX_TYPE.PARENT_ID
   *
   * @param parentId the value for SF_XYSX_TYPE.PARENT_ID
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public void setParentId(BigDecimal parentId) {
    this.parentId = parentId;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_XYSX_TYPE.NAME
   *
   * @return the value of SF_XYSX_TYPE.NAME
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public String getName() {
    return name;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_XYSX_TYPE.NAME
   *
   * @param name the value for SF_XYSX_TYPE.NAME
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_XYSX_TYPE.DEFAULT_VAL
   *
   * @return the value of SF_XYSX_TYPE.DEFAULT_VAL
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public String getDefaultVal() {
    return defaultVal;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_XYSX_TYPE.DEFAULT_VAL
   *
   * @param defaultVal the value for SF_XYSX_TYPE.DEFAULT_VAL
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public void setDefaultVal(String defaultVal) {
    this.defaultVal = defaultVal;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_XYSX_TYPE.LIST_INDEX
   *
   * @return the value of SF_XYSX_TYPE.LIST_INDEX
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public BigDecimal getListIndex() {
    return listIndex;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_XYSX_TYPE.LIST_INDEX
   *
   * @param listIndex the value for SF_XYSX_TYPE.LIST_INDEX
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public void setListIndex(BigDecimal listIndex) {
    this.listIndex = listIndex;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_XYSX_TYPE.VAL_TYPE
   *
   * @return the value of SF_XYSX_TYPE.VAL_TYPE
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public String getValType() {
    return valType;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_XYSX_TYPE.VAL_TYPE
   *
   * @param valType the value for SF_XYSX_TYPE.VAL_TYPE
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public void setValType(String valType) {
    this.valType = valType;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method returns the value of the database column SF_XYSX_TYPE.IS_LEAF
   *
   * @return the value of SF_XYSX_TYPE.IS_LEAF
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public String getIsLeaf() {
    return isLeaf;
  }

  /**
   * This method was generated by MyBatis Generator.
   * This method sets the value of the database column SF_XYSX_TYPE.IS_LEAF
   *
   * @param isLeaf the value for SF_XYSX_TYPE.IS_LEAF
   *
   * @mbggenerated Thu Feb 05 22:13:07 CST 2015
   */
  public void setIsLeaf(String isLeaf) {
    this.isLeaf = isLeaf;
  }

  public String getIsEnable() {
    return isEnable;
  }

  public void setIsEnable(String isEnable) {
    this.isEnable = isEnable;
  }
}