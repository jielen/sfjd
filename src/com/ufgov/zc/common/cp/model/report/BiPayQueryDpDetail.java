package com.ufgov.zc.common.cp.model.report;import java.math.BigDecimal;public class BiPayQueryDpDetail extends PayQueryReport {  private BigDecimal unauditdp0201;//在途直接计划  private BigDecimal unauditdp0202;//在途授权计划  private BigDecimal auditdp0201;//已批直接计划  private BigDecimal auditdp0202;//已批授权计划  private BigDecimal effectdp0202;//已下达授权计划  public BigDecimal getUnauditdp0201() {    return unauditdp0201;  }  public void setUnauditdp0201(BigDecimal unauditdp0201) {    this.unauditdp0201 = unauditdp0201;  }  public BigDecimal getUnauditdp0202() {    return unauditdp0202;  }  public void setUnauditdp0202(BigDecimal unauditdp0202) {    this.unauditdp0202 = unauditdp0202;  }  public BigDecimal getAuditdp0201() {    return auditdp0201;  }  public void setAuditdp0201(BigDecimal auditdp0201) {    this.auditdp0201 = auditdp0201;  }  public BigDecimal getAuditdp0202() {    return auditdp0202;  }  public void setAuditdp0202(BigDecimal auditdp0202) {    this.auditdp0202 = auditdp0202;  }  public BigDecimal getEffectdp0202() {    return effectdp0202;  }  public void setEffectdp0202(BigDecimal effectdp0202) {    this.effectdp0202 = effectdp0202;  }}