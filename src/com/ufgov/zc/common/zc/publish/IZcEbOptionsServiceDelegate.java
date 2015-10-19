package com.ufgov.zc.common.zc.publish;import java.util.List;import com.ufgov.zc.common.system.Publishable;import com.ufgov.zc.common.system.RequestMeta;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.zc.model.ZcEbOptions;public interface IZcEbOptionsServiceDelegate extends Publishable {  public List getZcEbProtocolList(ElementConditionDto dto, RequestMeta meta);  public String getZcEbFileId(ElementConditionDto dto, RequestMeta meta);  public ZcEbOptions save(ZcEbOptions zcEbOptions, RequestMeta requestMeta);  public void update(ZcEbOptions zcEbOptions, RequestMeta requestMeta);  public void delete(String protCode, RequestMeta requestMeta);  public int isExistsFileCode(ElementConditionDto dto, RequestMeta requestMeta);  public String getFileCode(ElementConditionDto dto, RequestMeta requestMeta);}