/**   
* @(#) project: zc_xa
* @(#) file: IZcBdZbpcServiceDelegate.java
* Copyright 2010 UFGOV, Inc. All rights reserved.
* UFGOV PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* 
*/
package com.ufgov.zc.common.zc.publish;
import java.sql.SQLException;
public interface IZcEmExpertServiceDelegate extends Publishable {
  public List getEmExpertList(ElementConditionDto dto, RequestMeta meta) throws SQLException;
  public EmExpert selectByPrimaryKey(String zcPrimKey, RequestMeta requestMeta) throws SQLException;
  public void deleteByPrimaryKey(String zcPrimKey, RequestMeta requestMeta) throws SQLException;

  public EmExpert updateByPrimaryKey(EmExpert bean, RequestMeta meta) throws SQLException;

}