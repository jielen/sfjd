/** *  */package com.ufgov.zc.common.zc.model;import java.math.BigDecimal;import java.util.Date;/** * @author Administrator * */public class EmFundPayReport extends ZcBaseBill {  private String fundReportId;  private String fundReportName;  private String useId;  private String useName;  private Date useTime;  private Date createTime;  private String fileId;  private String deptId;  private String fundType;  private BigDecimal paySum;  private String status;  public String getFundReportId() {    return fundReportId;  }  public void setFundReportId(String fundReportId) {    this.fundReportId = fundReportId;  }  public String getFundReportName() {    return fundReportName;  }  public void setFundReportName(String fundReportName) {    this.fundReportName = fundReportName;  }  public String getUseId() {    return useId;  }  public void setUseId(String useId) {    this.useId = useId;  }  public String getUseName() {    return useName;  }  public void setUseName(String useName) {    this.useName = useName;  }  public Date getUseTime() {    return useTime;  }  public void setUseTime(Date useTime) {    this.useTime = useTime;  }  public Date getCreateTime() {    return createTime;  }  public void setCreateTime(Date createTime) {    this.createTime = createTime;  }  public String getFileId() {    return fileId;  }  public void setFileId(String fileId) {    this.fileId = fileId;  }  public String getDeptId() {    return deptId;  }  public void setDeptId(String deptId) {    this.deptId = deptId;  }  public String getFundType() {    return fundType;  }  public void setFundType(String fundType) {    this.fundType = fundType;  }  public BigDecimal getPaySum() {    return paySum;  }  public void setPaySum(BigDecimal paySum) {    this.paySum = paySum;  }  public String getStatus() {    return status;  }  public void setStatus(String status) {    this.status = status;  }}