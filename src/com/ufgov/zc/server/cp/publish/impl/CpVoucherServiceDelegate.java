package com.ufgov.zc.server.cp.publish.impl;import java.math.BigDecimal;import java.util.Date;import java.util.List;import java.util.Map;import com.ufgov.zc.common.commonbiz.model.BankAccount;import com.ufgov.zc.common.cp.model.CpVoucher;import com.ufgov.zc.common.cp.publish.ICpVoucherServiceDelegate;import com.ufgov.zc.common.system.RequestMeta;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.system.dto.PrintObject;import com.ufgov.zc.common.system.exception.BusinessException;import com.ufgov.zc.common.system.util.ExceptionUtil;import com.ufgov.zc.server.cp.service.ICpVoucherService;public class CpVoucherServiceDelegate implements ICpVoucherServiceDelegate {  ICpVoucherService cpVoucherService;  public ICpVoucherService getCpVoucherService() {    return cpVoucherService;  }  public void setCpVoucherService(ICpVoucherService cpVoucherService) {    this.cpVoucherService = cpVoucherService;  }  public PrintObject genSumMainSubPrintObjectFN(List printList, RequestMeta requestMeta) {    return this.cpVoucherService.genSumMainSubPrintObject(printList);  }  public void sumCpVoucherFN(List cpVoucherList, RequestMeta requestMeta) {    cpVoucherService.sumACpVoucher(cpVoucherList);  }  public void sumCpDVoucherFN(List selectList, String compoId, RequestMeta requestMeta) {    cpVoucherService.sumDCpVoucher(selectList, compoId);  }  public void cancelSumCpVoucherFN(List cpVoucherList, RequestMeta requestMeta) {    cpVoucherService.cancelSumCpVoucher(cpVoucherList);  }  public List getCpVoucherBySumCpVoucherId(String sumCpVoucherId, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherBySumCpVoucherId(sumCpVoucherId);  }  public List getCpVoucherForCpAvSum(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return this.cpVoucherService.getCpVoucherForCpAvSum(eleConditionDto);  }  public List getCpVoucherForCpAvNewSum(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return this.cpVoucherService.getCpVoucherForCpAvNewSum(eleConditionDto);  }  public List getCpVoucherForCpDvSum(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return this.cpVoucherService.getCpVoucherForCpDvSum(eleConditionDto);  }  public List getCpVoucherForCpDvNewSum(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return this.cpVoucherService.getCpVoucherForCpDvNewSum(eleConditionDto);  }  public List getCpVoucherForCpAv(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpAv(eleConditionDto);  }  public List getCpVoucherForRefund(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForRefund(eleConditionDto);  }  public List getCpVoucherForRefundAudit(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForRefundAudit(eleConditionDto);  }  public List getCpVoucherForCpDvEdit(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return this.cpVoucherService.getCpVoucherForCpDvEdit(eleConditionDto);  }  public List getCpVoucher(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucher(eleConditionDto);  }  public List getCpVoucherForCpDVou(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpDVou(eleConditionDto);  }  public List getCpVoucherForCpAVou(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpAVou(eleConditionDto);  }  public List getAuditedForCpVoucher(ElementConditionDto elementDto, RequestMeta requestMeta) {    return cpVoucherService.getAuditedForCpVoucher(elementDto);  }  public List getCpVoucherForCpDtzd(ElementConditionDto elementDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpDtzd(elementDto);  }  public List getCpVoucherForCpDv(int nd, String a_status_code, String co_code, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpDv(nd, a_status_code, co_code);  }  public List getCpVoucherInfo(String dpBalanceId, String paytypeCode, int nd, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherInfo(dpBalanceId, paytypeCode, nd);  }  public CpVoucher insertCpVoucher(CpVoucher cpVoucher, RequestMeta requestMeta) {    return cpVoucherService.insertCpVoucher(cpVoucher);  }  public CpVoucher saveForCpAvEdit(CpVoucher cpVoucher, RequestMeta requestMeta) {    return cpVoucherService.saveForCpAvEditBAF(cpVoucher);  }  public CpVoucher saveForCpAvBiEditFN(CpVoucher cpVoucher, RequestMeta requestMeta) {    return cpVoucherService.saveForCpAvBiEdit(cpVoucher);  }  public CpVoucher saveCpVoucherForRefund(CpVoucher cpVoucher, RequestMeta requestMeta) {    return cpVoucherService.saveCpVoucherForRefund(cpVoucher);  }  public void auditForCpAvEdit(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.auditForCpAvEdit(cpVoucher);      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的授权支付凭证审核失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public void deleteForCpAvEdit(CpVoucher cpVoucher, RequestMeta requestMeta) {    cpVoucherService.deleteForCpAvEdit(cpVoucher);  }  public void increasePrintTimes(List cpVoucherIdList, RequestMeta requestMeta) {    cpVoucherService.increasePrintTimes(cpVoucherIdList);  }  public void updatePrintTimes(List cpVoucherIdList, int printTimes, RequestMeta requestMeta) {    cpVoucherService.updatePrintTimes(cpVoucherIdList, printTimes);  }  public void deleteListForCpAvEdit(List cpVoucherList, RequestMeta meta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        int num = cpVoucherService.deleteForCpAvEdit(cpVoucher);        if (num == 0) {          errorInfo.append(": ");          errorInfo.append(cpVoucher.getCpVoucherId());          errorInfo.append("已被删除");          fail = true;        }      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的支付凭证删除失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public void deleteListForCpAvBiEdit(List cpVoucherList, RequestMeta meta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        int num = cpVoucherService.deleteForCpAvBiEdit(cpVoucher);        if (num == 0) {          errorInfo.append(": ");          errorInfo.append(cpVoucher.getCpVoucherId());          errorInfo.append("已被删除");          fail = true;        }      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的支付凭证删除失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public void deleteForRefund(CpVoucher cpVoucher, RequestMeta requestMeta) {    cpVoucherService.deleteForRefund(cpVoucher);  }  public void deleteForRefund(List cpVoucherList, RequestMeta meta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        int num = cpVoucherService.deleteForRefund(cpVoucher);        if (num == 0) {          errorInfo.append(": ");          errorInfo.append(cpVoucher.getCpVoucherId());          errorInfo.append("已被删除");          fail = true;        }      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("删除失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public String cpApplyToCpVoucher(List cpApplyList, String userId, String userName,  BankAccount payBankAccount, Date payDate, RequestMeta requestMeta) {    return cpVoucherService.cpApplyToCpVoucher(cpApplyList, userId, userName, payBankAccount, payDate);  }  public String cpApplyToVoucherNew(List cpApplyList, Date payDate, RequestMeta requestMeta) {    return cpVoucherService.cpApplyToVoucherNew(cpApplyList, payDate);  }  public List getCpVoucherForCpDtzdPrint(ElementConditionDto elementDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpDtzdPrint(elementDto);  }  public List getCpVoucherForCpDtzdDealStateQuery(ElementConditionDto elementDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpDtzdDealStateQuery(elementDto);  }  public List getCpVoucherForCpDv(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpDv(eleConditionDto);  }  public void auditForCpDvApplyAudit(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.auditForCpDvApplyAudit(cpVoucher);      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的支付凭证审核失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public void depassForCpDvApplyAudit(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.depassForCpDvApplyAudit(cpVoucher);      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的授权支付凭证销审失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public String revoCpVoucher(String cpVoucherIds, RequestMeta requestMeta) {    return cpVoucherService.revoCpVoucher(cpVoucherIds);  }  public CpVoucher getCpVoucherById(String cpVoucherId, int nd, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherById(cpVoucherId, nd);  }  public List getCpVoucherByIdList(List cpVoucherIdList, RequestMeta requestMeta) {    return this.cpVoucherService.getCpVoucherByIdList(cpVoucherIdList);  }  public BigDecimal getCurMoneyAvailableForRefund(String cpVoucherId, RequestMeta requestMeta) {    return this.cpVoucherService.getCurMoneyAvailableForRefund(cpVoucherId);  }  public List getAvCpVoucherByVouNoList(String cpVoucherVouNo, RequestMeta requestMeta) {    return this.cpVoucherService.getAvCpVoucherByVouNoList(cpVoucherVouNo);  }  public List getDvCpVoucherByVouNoList(String cpVoucherVouNo, RequestMeta requestMeta) {    return this.cpVoucherService.getDvCpVoucherByVouNoList(cpVoucherVouNo);  }  public List getCpVoucherForCpDzCzBank(ElementConditionDto elementDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpDzCzBank(elementDto);  }  public List getCpVoucherForBbBalDtzd(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForBbBalDtzd(eleConditionDto);  }  public PrintObject genMainSubPrintObject(List cpVoucherList, int nd, String elementId,  RequestMeta requestMeta) {    return cpVoucherService.genMainSubPrintObject(cpVoucherList, nd, elementId);  }  public List getCpVoucherForBbAmveDtzd(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForBbAmveDtzd(eleConditionDto);  }  public List getCpVoucherForBbDmveDtzd(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForBbDmveDtzd(eleConditionDto);  }  public void auditForRefund(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer returnInfo = new StringBuffer("");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    StringBuffer tipInfo = new StringBuffer("");    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.auditForRefund(cpVoucher);      } catch (Exception ex) {        returnInfo.append("cpVoucherId = ");        returnInfo.append(cpVoucher.getCpVoucherId());        returnInfo.append("的凭证审核失败！");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    if (fail) {      BusinessException be = new BusinessException(tipInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public String auditForCpVoucherAudit(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer returnInfo = new StringBuffer("");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    StringBuffer tipInfo = new StringBuffer("");    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.auditForCpVoucherAuditBAF(cpVoucher);        if (cpVoucher.getTipInfo() != null) {          tipInfo.append("凭证号=");          tipInfo.append(cpVoucher.getCpVouNo());          tipInfo.append(cpVoucher.getTipInfo());          tipInfo.append("\n");        }      } catch (Exception ex) {        returnInfo.append("cpVoucherId = ");        returnInfo.append(cpVoucher.getCpVoucherId());        returnInfo.append("的支付凭证审核失败！");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    if (fail) {      tipInfo.append(returnInfo);      BusinessException be = new BusinessException(tipInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }    return tipInfo.toString();  }  public String auditForCpVoucherBiAudit(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer returnInfo = new StringBuffer("");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    StringBuffer tipInfo = new StringBuffer("");    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.auditForCpVoucherBiAudit(cpVoucher);        if (cpVoucher.getTipInfo() != null) {          tipInfo.append("凭证号=");          tipInfo.append(cpVoucher.getCpVouNo());          tipInfo.append(cpVoucher.getTipInfo());          tipInfo.append("\n");        }      } catch (Exception ex) {        returnInfo.append("cpVoucherId = ");        returnInfo.append(cpVoucher.getCpVoucherId());        returnInfo.append("的支付凭证审核失败！");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    if (fail) {      tipInfo.append(returnInfo);      BusinessException be = new BusinessException(tipInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }    return tipInfo.toString();  }  public void unauditForRefund(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    errorInfo.append("以下凭证审核失败\n");    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.unauditForRefund(cpVoucher);      } catch (Exception ex) {        errorInfo.append(cpVoucher.getCpVoucherId());        errorInfo.append(": ");        errorInfo.append(ex.getMessage());        errorInfo.append("\n");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  //授权支付凭证消审  public void UnauditForCpAvAudit(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    errorInfo.append("以下支付凭证审核失败\n");    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.unauditForCpAvAuditBAF(cpVoucher);      } catch (Exception ex) {        errorInfo.append(cpVoucher.getCpVoucherId());        errorInfo.append(": ");        errorInfo.append(ex.getMessage());        errorInfo.append("\n");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public void UnauditForCpAvBiAudit(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    errorInfo.append("以下支付凭证审核失败\n");    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.UnauditForCpAvBiAudit(cpVoucher);      } catch (Exception ex) {        errorInfo.append(cpVoucher.getCpVoucherId());        errorInfo.append(": ");        errorInfo.append(ex.getMessage());        errorInfo.append("\n");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public void untreadForRefund(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.untreadForRefund(cpVoucher);      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的数据处理失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  //zhaolh add method退回  public void untreadForCpAvAudit(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.untreadForCpAvAudit(cpVoucher);      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的数据处理失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public List getCpVoucherForCpAvAudit(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpAvAudit(eleConditionDto);  }  public List getCpVoucherForCpAvBiAudit(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpAvBiAudit(eleConditionDto);  }  public List getCpVoucherForCpAvBiEdit(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForCpAvBiEdit(eleConditionDto);  }  /**   * 作废   */  public void blankout2ForCpAvEditFN(CpVoucher cpVoucher, RequestMeta requestMeta) {    this.cpVoucherService.blankout2ForCpAvEdit(cpVoucher);  }  /**   * 批量作废   */  public void blankout2ForCpAvEditFN(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为 ");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.blankout2ForCpAvEdit(cpVoucher);      } catch (Exception ex) {        errorInfo.append(cpVoucher.getCpVoucherId() + "\n");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的作废失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public void blankoutForCpAvBiEditFN(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为 ");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.blankoutForCpAvBiEdit(cpVoucher);      } catch (Exception ex) {        errorInfo.append(cpVoucher.getCpVoucherId() + "\n");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的作废失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public void blankoutForRefund(CpVoucher cpVoucher, RequestMeta requestMeta) {    this.cpVoucherService.blankoutForRefund(cpVoucher);  }  public void blankoutForRefund(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为 ");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.blankoutForRefund(cpVoucher);      } catch (Exception ex) {        errorInfo.append(cpVoucher.getCpVoucherId() + "\n");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的作废失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  /**   * 作废   */  public void blankoutForCpAvEditFN(CpVoucher cpVoucher, RequestMeta requestMeta) {    this.cpVoucherService.blankoutForCpAvEdit(cpVoucher);  }  /**   * 批量作废   */  public void blankoutForCpAvEditFN(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为 ");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.blankoutForCpAvEdit(cpVoucher);      } catch (Exception ex) {        errorInfo.append(cpVoucher.getCpVoucherId() + "\n");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的直接支付申请作废失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public List getCpVoucherForBbAdrDtzd(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForBbAdrDtzd(eleConditionDto);  }  public List getCpVoucherForBbAvcFN(CpVoucher cpVoucher, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForBbAvc(cpVoucher);  }  public List getCpVoucherForBbReturnFN(ElementConditionDto eleConditionDto, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherForBbReturn(eleConditionDto);  }  /**   * 审核   */  public CpVoucher auditForCpAvEditFN(CpVoucher cpVoucher, RequestMeta meta) {    return cpVoucherService.auditForCpAvEditFN(cpVoucher);  }  /**   * 收回   */  public void callbackForCpAvEditFN(CpVoucher cpVoucher, RequestMeta requestMeta) {    cpVoucherService.callbackForCpAvEditFN(cpVoucher);  }  /**   * 批量收回   */  public void callbackForCpAvEditFN(List cpVoucherList, RequestMeta requestMeta) {    StringBuffer errorInfo = new StringBuffer("id为 ");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.callbackForCpAvEditFN(cpVoucher);      } catch (Exception ex) {        errorInfo.append(cpVoucher.getCpVoucherId() + "\n");        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的授权支付凭证收回失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  /**   * 保存并送审   */  public CpVoucher saveAndSendForCpAvEditFN(CpVoucher cpVoucher, RequestMeta meta) {    return cpVoucherService.saveAndSendForCpAvEditFN(cpVoucher);  }  public CpVoucher saveAndSendForCpAvBiEditFN(CpVoucher cpVoucher, RequestMeta meta) {    return cpVoucherService.saveAndSendForCpAvBiEdit(cpVoucher);  }  public CpVoucher saveAndSendForRefundFN(CpVoucher cpVoucher, RequestMeta meta) {    return cpVoucherService.saveAndSendForRefund(cpVoucher);  }  /**   * 送审   */  public CpVoucher sendForCpAvEditFN(CpVoucher cpVoucher, RequestMeta meta) {    return cpVoucherService.sendForCpAvEditFN(cpVoucher);  }  /**   * 批量送审   */  public void sendForCpAvEditFN(List cpVoucherList, RequestMeta meta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.sendForCpAvEditFN(cpVoucher);      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的支付凭证送审失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public void sendForCpAvBiEditFN(List cpVoucherList, RequestMeta meta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.sendForCpAvBiEditFN(cpVoucher);      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("的支付凭证送审失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  public CpVoucher sendForRefund(CpVoucher cpVoucher, RequestMeta meta) {    return cpVoucherService.sendForRefund(cpVoucher);  }  public void sendForRefund(List cpVoucherList, RequestMeta meta) {    StringBuffer errorInfo = new StringBuffer("id为");    StringBuffer stackTraceMessage = new StringBuffer();    boolean fail = false;    for (int i = 0; i < cpVoucherList.size(); i++) {      CpVoucher cpVoucher = (CpVoucher) cpVoucherList.get(i);      try {        cpVoucherService.sendForRefund(cpVoucher);      } catch (Exception ex) {        errorInfo.append(": ");        errorInfo.append(cpVoucher.getCpVoucherId());        stackTraceMessage.append(ExceptionUtil.getStackTrace(ex));        fail = true;      }    }    errorInfo.append("处理失败！");    if (fail) {      BusinessException be = new BusinessException(errorInfo.toString());      be.setStackTraceMessage(stackTraceMessage.toString());      throw be;    }  }  /**   * 直接支付凭证,授权支付凭证确认/取消确认   */  public void updateCpVoucherForBbAvc(CpVoucher cpVoucher, RequestMeta requestMeta) {    cpVoucherService.updateCpVoucherForBbAvc(cpVoucher);  }  public void updateCpVoucherForBbReturn(CpVoucher cpVoucher, RequestMeta requestMeta) {    cpVoucherService.updateCpVoucherForBbReturn(cpVoucher);  }  public String sendBankFN(Map cpVoucherMap, String transType, RequestMeta meta) {    return cpVoucherService.sendBank(cpVoucherMap, transType);  }  public List getCpVoucherSplitByCpVoucherId(String id, RequestMeta requestMeta) {    return cpVoucherService.getCpVoucherSplitByCpVoucherId(id);  }  public void saveCpVoucherSplitFN(List insertList, RequestMeta requestMeta) {    this.cpVoucherService.saveCpVoucherSplit(insertList);  }  public void deleteCpVoucherSplitFN(String id, RequestMeta requestMeta) {    this.cpVoucherService.deleteCpVoucherSplit(id);  }  public void cancelSplitFN(List idList, RequestMeta requestMeta) {    this.cpVoucherService.cancelSplit(idList);  }  public PrintObject genCpVoucherPrintObjectFN(List cpVoucherList, RequestMeta requestMeta) {    return cpVoucherService.genCpVoucherPrintObject(cpVoucherList);  }  public BigDecimal getRequestSeri(RequestMeta requestMeta) {    return cpVoucherService.getRequestSeri();  }  public void updateVoucherGroupDealState(Map params, RequestMeta requestMeta) {    // TODO Auto-generated method stub    cpVoucherService.updateVoucherGroupDealState(params);  }  public void updateCpVoucherPayInfo(List cpVoucherList, RequestMeta requestMeta) {    cpVoucherService.updateCpVoucherPayInfo(cpVoucherList);  }  public int getUnHXCpVoucher(String coCode, RequestMeta requestMeta) {    return this.cpVoucherService.getUnHXCpVoucher(coCode);  }  public void editRemarkForCpVoucher(List idList, String remark, RequestMeta requestMeta) {    cpVoucherService.editRemarkForCpVoucher(idList, remark);  }  public int getVoucherIsSum(List cpVoucherIdList, RequestMeta requestMeta) {    return this.cpVoucherService.getVoucherIsSum(cpVoucherIdList);  }  public List getCpVoucherForCpAvtList(ElementConditionDto elementDto, RequestMeta requestMeta) {    return this.cpVoucherService.getCpVoucherForCpAvtList(elementDto);  }  public List getCpVoucherForCpDvtList(ElementConditionDto elementDto, RequestMeta requestMeta) {    return this.cpVoucherService.getCpVoucherForCpDvtList(elementDto);  }  public void cpAvtSendFN(List cpVoucherList, RequestMeta requestMeta) {    cpVoucherService.cpAvtSend(cpVoucherList);  }  public void cpAvtCancelSendFN(List cpVoucherList, RequestMeta requestMeta) {    cpVoucherService.cpAvtCancelSend(cpVoucherList);  }  public void cpDvtCheckInFN(List cpVoucherList, RequestMeta requestMeta) {    cpVoucherService.cpDvtCheckIn(cpVoucherList);  }  public void cpDvtCancelCheckInFN(List cpVoucherList, RequestMeta requestMeta) {    cpVoucherService.cpDvtCancelCheckIn(cpVoucherList);  }  public List getSubCpVoucherForSumVouNo(List vouList, RequestMeta requestMeta) {    return cpVoucherService.getSubCpVoucherForSumVouNo(vouList);  }  public void saveCpImpRecordFN(List list, RequestMeta requestMeta) {    cpVoucherService.saveCpImpRecord(list);  }  public List getCpImpRecordList(ElementConditionDto elementDto, RequestMeta requestMeta) {    return this.cpVoucherService.getCpImpRecordList(elementDto);  }}