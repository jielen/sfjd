package com.ufgov.zc.client.datacache;import java.util.ArrayList;import java.util.Collections;import java.util.HashMap;import java.util.List;import java.util.Map;import com.ufgov.zc.client.common.WorkEnv;import com.ufgov.zc.common.commonbiz.model.BankAccount;import com.ufgov.zc.common.system.RequestMeta;public class ClearBankAccountDataCache {  private static Map<String, Map> dataMap = new HashMap<String, Map>();  private static Map<String, List> dataListMap = new HashMap<String, List>();  public static List<BankAccount> getClearBankAccountList(String coCode) {    List dataList = dataListMap.get(coCode);    if (dataList == null) {      RequestMeta requestMeta = WorkEnv.getInstance().getRequestMeta();      int nd = WorkEnv.getInstance().getTransNd();      List<String> accoTypeList = new ArrayList<String>();      accoTypeList.add("01");      accoTypeList.add("06");      accoTypeList.add("07");      dataList = Collections.unmodifiableList(Util.baseDataServiceDelegate.getBankAccountByAccoType(nd,      coCode, accoTypeList, requestMeta));      dataListMap.put(coCode, dataList);      dataMap.put(coCode, createMap(dataList));    }    return dataList;  }  public static List<BankAccount> getClearBankAccountListByUserId(String userId) {    List dataList = dataListMap.get(userId);    if (dataList == null) {      RequestMeta requestMeta = WorkEnv.getInstance().getRequestMeta();      int nd = WorkEnv.getInstance().getTransNd();      List<String> accoTypeList = new ArrayList<String>();      accoTypeList.add("01");      accoTypeList.add("06");      accoTypeList.add("07");      dataList = Collections.unmodifiableList(Util.baseDataServiceDelegate.getBankAccountByUserId(nd,      userId, accoTypeList, requestMeta));      dataListMap.put(userId, dataList);      dataMap.put(userId, createMap(dataList));    }    return dataList;  }  private static Map<String, BankAccount> createMap(List dataList) {    Map<String, BankAccount> dataMap = new HashMap<String, BankAccount>();    for (Object o : dataList) {      BankAccount v = (BankAccount) o;      dataMap.put(v.getBankAccCode(), v);    }    return dataMap;  }  public static BankAccount getClearBankAccount(String coCode, String bankAcccode) {    getClearBankAccountList(coCode);    Map<String, BankAccount> value = (Map<String, BankAccount>) dataMap.get(coCode);    BankAccount bean = null;    if (value != null) {      bean = value.get(bankAcccode);    }    return bean;  }}