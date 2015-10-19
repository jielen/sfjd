package com.ufgov.zc.server.zc.dao.ibatis;import java.util.HashMap;import java.util.List;import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;import com.ufgov.zc.common.system.RequestMeta;import com.ufgov.zc.common.system.constants.NumLimConstants;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.system.model.AsFile;import com.ufgov.zc.common.zc.model.ZcXmcgHt;import com.ufgov.zc.common.zc.model.ZcXmcgHtExample;import com.ufgov.zc.server.system.util.NumLimUtil;import com.ufgov.zc.server.zc.dao.IZcXmcgHtDao;public class ZcXmcgHtDao extends SqlMapClientDaoSupport implements IZcXmcgHtDao {  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public ZcXmcgHtDao() {    super();  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public int countByExample(ZcXmcgHtExample example) {    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("ZC_XMCG_HT.ibatorgenerated_countByExample", example);    return count.intValue();  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public int deleteByExample(ZcXmcgHtExample example) {    int rows = getSqlMapClientTemplate().delete("ZC_XMCG_HT.ibatorgenerated_deleteByExample", example);    return rows;  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public int deleteByPrimaryKey(String zcHtCode) {    ZcXmcgHt key = new ZcXmcgHt();    key.setZcHtCode(zcHtCode);    int rows = getSqlMapClientTemplate().delete("ZC_XMCG_HT.ibatorgenerated_deleteByPrimaryKey", key);    return rows;  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public void insert(ZcXmcgHt record) {    getSqlMapClientTemplate().insert("ZC_XMCG_HT.ibatorgenerated_insert", record);  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public void insertSelective(ZcXmcgHt record) {    getSqlMapClientTemplate().insert("ZC_XMCG_HT.ibatorgenerated_insertSelective", record);  }  public ZcXmcgHt getOrgAny(ZcXmcgHt record) {    return (ZcXmcgHt) getSqlMapClientTemplate().queryForObject("ZC_XMCG_HT.getAngOrg", record);  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public List selectByExample(ZcXmcgHtExample example) {    List list = getSqlMapClientTemplate().queryForList("ZC_XMCG_HT.ibatorgenerated_selectByExample", example);    return list;  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public List selectListByExample(ElementConditionDto dto, RequestMeta meta) {    dto.setNumLimitStr(NumLimUtil.getInstance().getNumLimCondByCoType(dto.getWfcompoId(), NumLimConstants.FWATCH));    List list = getSqlMapClientTemplate().queryForList("ZC_XMCG_HT.ibatorgenerated_selectListByExample", dto);    return list;  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public ZcXmcgHt selectByPrimaryKey(String zcHtCode) {    ZcXmcgHt key = new ZcXmcgHt();    key.setZcHtCode(zcHtCode);    ZcXmcgHt record = (ZcXmcgHt) getSqlMapClientTemplate().queryForObject("ZC_XMCG_HT.ibatorgenerated_selectByPrimaryKey", key);    return record;  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public int updateByExampleSelective(ZcXmcgHt record, ZcXmcgHtExample example) {    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);    int rows = getSqlMapClientTemplate().update("ZC_XMCG_HT.ibatorgenerated_updateByExampleSelective", parms);    return rows;  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public int updateByExample(ZcXmcgHt record, ZcXmcgHtExample example) {    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);    int rows = getSqlMapClientTemplate().update("ZC_XMCG_HT.ibatorgenerated_updateByExample", parms);    return rows;  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public int updateByPrimaryKeySelective(ZcXmcgHt record) {    int rows = getSqlMapClientTemplate().update("ZC_XMCG_HT.ibatorgenerated_updateByPrimaryKeySelective", record);    return rows;  }  /**   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  public int updateByPrimaryKey(ZcXmcgHt record) {    int rows = getSqlMapClientTemplate().update("ZC_XMCG_HT.ibatorgenerated_updateByPrimaryKey", record);    return rows;  }  /**   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table ZC_XMCG_HT   * @ibatorgenerated  Thu Apr 29 16:50:54 CST 2010   */  private static class UpdateByExampleParms extends ZcXmcgHtExample {    private Object record;    public UpdateByExampleParms(Object record, ZcXmcgHtExample example) {      super(example);      this.record = record;    }    public Object getRecord() {      return record;    }  }  public AsFile getContractDefaultTemplateContent() {    // TODO Auto-generated method stub    return (AsFile) this.getSqlMapClientTemplate().queryForObject("ZC_XMCG_HT.getContractDefaultTemplateContent");  }  public AsFile getContractTemplateContent(String wordFileId) {    // TODO Auto-generated method stub    return (AsFile) this.getSqlMapClientTemplate().queryForObject("ZC_XMCG_HT.getContractTemplateContent", wordFileId);  }  public String getCompaneyName(String zcCoCode) {    // TODO Auto-generated method stub    return (String) this.getSqlMapClientTemplate().queryForObject("ZC_XMCG_HT.getCompaneyName", zcCoCode);  }  public String getOptionValById(String string) {    // TODO Auto-generated method stub    return (String) this.getSqlMapClientTemplate().queryForObject("ZC_XMCG_HT.getOptionValById", string);  }  public String getCaiGouChuFuZeRenNameForXieYi(HashMap para) {    // TODO Auto-generated method stub    return (String) this.getSqlMapClientTemplate().queryForObject("ZC_XMCG_HT.getCaiGouChuFuZeRenNameForXieYi", para);  }  public String getCaiGouChuFuZeRenNameForXmcg(HashMap para) {    // TODO Auto-generated method stub    return (String) this.getSqlMapClientTemplate().queryForObject("ZC_XMCG_HT.getCaiGouChuFuZeRenNameForXmcg", para);  }  public String getCgzxzrUserId(HashMap para) {    // TODO Auto-generated method stub    return (String) this.getSqlMapClientTemplate().queryForObject("ZC_XMCG_HT.getCgzxzrUserId", para);  }}