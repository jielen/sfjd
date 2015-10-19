package com.ufgov.zc.common.zc.checkrule;import java.math.BigDecimal;import java.util.HashMap;import java.util.Map;import com.ufgov.zc.common.zc.model.ZcPProMake;import com.ufgov.zc.common.zc.model.ZcPProMitem;/* * 西安省厅采购计划的校验提示规则实现类 * 具体校验规则: *  一、协议、定点采购品目： *     D.定点印刷： *        a.单项或批量20万（不含）以下的：采购人自主选择协议商品。 *            采购组织形式：集中采购。 *            采购方式：公开招标。 *            采购类型：协议采购。 *            委托机构：无。 *         b.20万（包含）到50万（不包含）以内的：采购人委托采购中心进行竞争性谈判。 *            采购组织形式：集中采购。 *            采购方式：竞争性谈判。 *            采购类型：协议采购。 *            委托机构：采购中心。 *            选择供应商个数：3家（不包含）以上 *         c.50万（包含）以上的：采购人委托采购中心进行公开招标。 *            采购组织形式：集中采购。 *            采购方式：公开招标。 *            采购类型：项目采购。 *            委托机构：采购中心。 * */public class ZcMakeDDYSCheckRuleBySX implements BaseRule {  private Map resultMap = new HashMap();  private BigDecimal limtItemMinSum = new BigDecimal(200000);  private BigDecimal limtItemMaxSum = new BigDecimal(500000);  public Map check(Map parameter) {    ZcPProMake resultMake = new ZcPProMake();    StringBuffer titleInfo = new StringBuffer();    StringBuffer resInfo = new StringBuffer();    ZcPProMake make = (ZcPProMake) parameter.get("data");    // 批复采购方式  (1公开招标,2邀请招标,3竞争性谈判,4单一来源采购,5询价,6其他)    String pifuMode = make.getZcPifuCgfs();    // 采购组织形式 (1集中采购,2部门集中采购,3分散采购)    String sequence = make.getZcMakeSequence();    // 采购类型 （G02定点采购,G01协议供货,Z01项目采购）    String fukuanType = make.getZcFukuanType();    // 代理机构名称    String ageyCode = make.getAgency();    ZcPProMitem item = (ZcPProMitem) parameter.get("itemInfo");    // 采购数量    int caigNum = item.getZcCaigNum().intValue();    // 采购金额    BigDecimal itemSum = item.getZcItemSum();    if (itemSum.compareTo(limtItemMinSum) == -1) {      titleInfo.append("{采购金额在20万（不包含）以下的}");      // 小于20万      if (!"1".equals(sequence)) {        // 采购组织形式 应该是  集中采购        resInfo.append("[采购组织形式]应采取[集中采购],");        resultMake.setZcMakeSequence("1");      }      if (!"G01".equals(fukuanType)) {        // 采购类型 应该是 协议采购        resInfo.append("[采购类型]应采取[协议供货],");        resultMake.setZcFukuanType("G01");      }      /*      if (!"1".equals(pifuMode)) {              // 采购类型 应该是 协议采购              resInfo.append("[采购方式]应采取[公开招标],");              resultMake.setZcPifuCgfs("1");            }*/    } else if (itemSum.compareTo(limtItemMinSum) >= 0 && itemSum.compareTo(limtItemMaxSum) == -1) {      titleInfo.append("{采购金额在20万（包含）到50万（不包含）以内的}");      // 20万（包含）到50万（不包含）      if (!"1".equals(sequence)) {        // 采购组织形式 应该是  集中采购        resInfo.append("[采购组织形式]应采取[集中采购],");        resultMake.setZcMakeSequence("1");      }      if (!"G02".equals(fukuanType)) {//xiaofei update G02为协议供货二次谈判        // 采购类型 应该是 协议采购        resInfo.append("[采购类型]应采取[协议供货二次竞价],");        resultMake.setZcFukuanType("G02");      }      if (!ZcMakeCheckRuleBySX.limtAgeyCode.equals(ageyCode)) {        // 代理机构应该是采购中心        resInfo.append("[代理机构]应委托[采购中心],");        resultMake.setAgency(ZcMakeCheckRuleBySX.limtAgeyCode);      }    } else if (itemSum.compareTo(limtItemMaxSum) >= 0) {      titleInfo.append("{采购金额在50万（包含）以上的}");      //50万（包含）以上      if (!"1".equals(sequence)) {        // 采购组织形式 应该是  集中采购        resInfo.append("[采购组织形式]应采取[集中采购],");        resultMake.setZcMakeSequence("1");      }      if (!"Z01".equals(fukuanType)) {        // 采购类型 应该是 项目采购        resInfo.append("[采购类型]应采取[项目采购],");        resultMake.setZcFukuanType("Z01");      }      if (!"1".equals(pifuMode)) {        // 采购类型 应该是 协议采购        resInfo.append("[采购方式]应采取[公开招标],");        resultMake.setZcPifuCgfs("1");      }      if (!ZcMakeCheckRuleBySX.limtAgeyCode.equals(ageyCode)) {        // 代理机构应该是采购中心        resInfo.append("[代理机构]应委托[采购中心],");        resultMake.setAgency(ZcMakeCheckRuleBySX.limtAgeyCode);      }    }    if (resInfo.length() > 0) {      titleInfo.append(resInfo.substring(0, resInfo.length() - 1));      resultMap.put("resInfo", titleInfo.toString());      resultMap.put("resMake", resultMake);    } else {      resultMap.put("resInfo", resInfo.toString());      resultMap.put("resMake", null);    }    return resultMap;  }}