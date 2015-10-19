package com.ufgov.zc.server.zc.service;import java.sql.SQLException;import java.util.List;import com.ufgov.zc.common.system.RequestMeta;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.zc.model.ZcBMerchandise;public interface IZcBMerchandiseService {  public List getMerchandiseList(ElementConditionDto dto, RequestMeta meta) throws SQLException;  public ZcBMerchandise selectByPrimaryKey(String zcPrimKey, RequestMeta requestMeta) throws SQLException;  public void deleteByPrimaryKey(String zcPrimKey, RequestMeta requestMeta) throws SQLException;  public ZcBMerchandise updateByPrimaryKey(ZcBMerchandise bean, RequestMeta meta) throws SQLException;    public void deleteMerchandise(ZcBMerchandise merchandise, RequestMeta meta) throws Exception;}