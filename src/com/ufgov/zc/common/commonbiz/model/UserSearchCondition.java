package com.ufgov.zc.common.commonbiz.model;import java.io.Serializable;public class UserSearchCondition implements Serializable {  /**   *   */  private static final long serialVersionUID = 5202261593458298469L;  private String userId;  private String conditionId;  private String conditionFieldCode;  private int conditionFieldOrder;  private String conditionDefaultValue;  public int getConditionFieldOrder() {    return conditionFieldOrder;  }  public void setConditionFieldOrder(int conditionFieldOrder) {    this.conditionFieldOrder = conditionFieldOrder;  }  public String getUserId() {    return userId;  }  public void setUserId(String userId) {    this.userId = userId;  }  public String getConditionId() {    return conditionId;  }  public void setConditionId(String conditionId) {    this.conditionId = conditionId;  }  public String getConditionFieldCode() {    return conditionFieldCode;  }  public void setConditionFieldCode(String conditionFieldCode) {    this.conditionFieldCode = conditionFieldCode;  }  public int hashCode() {    final int prime = 31;    int result = 1;    result = prime * result + ((userId == null) ? 0 : userId.hashCode());    result = prime * result + ((conditionId == null) ? 0 : conditionId.hashCode());    return result;  }  public boolean equals(Object obj) {    if (this.hashCode() == obj.hashCode())      return true;    return false;  }  public String toString() {    return userId + " " + conditionId;  }  public String getConditionDefaultValue() {    return conditionDefaultValue;  }  public void setConditionDefaultValue(String conditionDefaultValue) {    this.conditionDefaultValue = conditionDefaultValue;  }}