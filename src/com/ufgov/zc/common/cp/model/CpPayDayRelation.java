package com.ufgov.zc.common.cp.model;import java.io.Serializable;import com.ufgov.zc.common.commonbiz.model.BaseBill;public class CpPayDayRelation extends BaseBill implements Serializable {  /**   *    */  private static final long serialVersionUID = -608963950102932458L;  private String payDayRelationId;  private String cpVoucherId;  private String payDayBillId;  public CpPayDayRelation() {  }  /**   * @return the cpVoucherId   */  public String getCpVoucherId() {    return cpVoucherId;  }  /**   * @param cpVoucherId the cpVoucherId to set   */  public void setCpVoucherId(String cpVoucherId) {    this.cpVoucherId = cpVoucherId;  }  /**   * @return the payDayBillId   */  public String getPayDayBillId() {    return payDayBillId;  }  /**   * @param payDayBillId the payDayBillId to set   */  public void setPayDayBillId(String payDayBillId) {    this.payDayBillId = payDayBillId;  }  /**   * @return the payDayRelationId   */  public String getPayDayRelationId() {    return payDayRelationId;  }  /**   * @param payDayRelationId the payDayRelationId to set   */  public void setPayDayRelationId(String payDayRelationId) {    this.id = payDayRelationId;    this.payDayRelationId = payDayRelationId;  }}