package com.ufgov.zc.common.zc.model;import java.io.Serializable;import java.util.Date;/** * 对应表ZC_XYGH_SPPC  * ZcBdSppc.java * com.ufgov.zc.common.zc.model *@author shenwanchao * 2012-03-22 */public class ZcBdSppc extends ZcBaseBill implements Serializable {  private static final long serialVersionUID = 39452805540222303L;  private String zcSppcID;  private String zcSppcNa;  private String zcSppcNd;  private String zcSppcStatus;  private Date zcBgnDate;  private Date zcEndDate;  private String zcInputCode;  private Date zcInputDate;  private String zcOperCode;  private Date zcOperDate;  public String getZcSppcID() {    return zcSppcID;  }  public void setZcSppcID(String zcSppcID) {    this.zcSppcID = zcSppcID;  }  public String getZcSppcNa() {    return zcSppcNa;  }  public void setZcSppcNa(String zcSppcNa) {    this.zcSppcNa = zcSppcNa;  }  public String getZcSppcNd() {    return zcSppcNd;  }  public void setZcSppcNd(String zcSppcNd) {    this.zcSppcNd = zcSppcNd;  }  public String getZcSppcStatus() {    return zcSppcStatus;  }  public void setZcSppcStatus(String zcSppcStatus) {    this.zcSppcStatus = zcSppcStatus;  }  public Date getZcBgnDate() {    return zcBgnDate;  }  public void setZcBgnDate(Date zcBgnDate) {    this.zcBgnDate = zcBgnDate;  }  public Date getZcEndDate() {    return zcEndDate;  }  public void setZcEndDate(Date zcEndDate) {    this.zcEndDate = zcEndDate;  }  public String getZcInputCode() {    return zcInputCode;  }  public void setZcInputCode(String zcInputCode) {    this.zcInputCode = zcInputCode;  }  public Date getZcInputDate() {    return zcInputDate;  }  public void setZcInputDate(Date zcInputDate) {    this.zcInputDate = zcInputDate;  }  public String getZcOperCode() {    return zcOperCode;  }  public void setZcOperCode(String zcOperCode) {    this.zcOperCode = zcOperCode;  }  public Date getZcOperDate() {    return zcOperDate;  }  public void setZcOperDate(Date zcOperDate) {    this.zcOperDate = zcOperDate;  }}