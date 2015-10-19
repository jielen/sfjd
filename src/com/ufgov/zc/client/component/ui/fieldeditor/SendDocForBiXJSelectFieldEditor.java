package com.ufgov.zc.client.component.ui.fieldeditor;import javax.swing.JComponent;import com.ufgov.zc.client.component.element.SendDocTableSelectField;import com.ufgov.zc.client.component.event.ValueChangeEvent;import com.ufgov.zc.client.component.event.ValueChangeListener;import com.ufgov.zc.common.bi.model.BcDetail;import com.ufgov.zc.common.commonbiz.model.SendDoc;public class SendDocForBiXJSelectFieldEditor extends AbstractFieldEditor {  private static final long serialVersionUID = 5213352408490580699L;  private SendDocTableSelectField editField;  private String type;  public SendDocForBiXJSelectFieldEditor(String name) {    super(name);  }  public SendDocForBiXJSelectFieldEditor(String name, String type) {    super(name);    this.type = type;  }  public SendDocForBiXJSelectFieldEditor(String name, boolean isEnabled) {    super(name);    editField.setEnabled(isEnabled);    editField.setEditable(isEnabled);  }  protected JComponent createEditorComponent() {    editField = new SendDocTableSelectField(25);    editField.addValueChangeListener(new ValueChangeListener() {      public void valueChanged(ValueChangeEvent e) {        syncEditObject();      }    });    return editField;  }  /**   * 同步到对象   */  protected void syncEditObject() {    if (getEditObject() instanceof BcDetail) {      BcDetail bcDetail = (BcDetail) getEditObject();      if (bcDetail != null) {        SendDoc value = editField.getSendDoc();        if (type.equals("NDRC_SENDDOC_CODE")) {          bcDetail.setNdrcSenddocCode(value == null ? null : value.getCode());        } else if (type.equals("ARMY_SENDDOC_CODE"))          bcDetail.setArmySenddocCode(value == null ? null : value.getCode());      }    }    this.fireEditSynced();  }  public Object getValue() {    return editField.getSendDoc();  }  public void setValue(Object value) {    if (value == null) {      editField.setValue(null);    } else if (value instanceof BcDetail) {      BcDetail bcDetail = (BcDetail) value;      if (type.equals("NDRC_SENDDOC_CODE")) {        editField.setValueByCode(bcDetail.getNdrcSenddocCode());      } else if (type.equals("ARMY_SENDDOC_CODE")) {        editField.setValueByCode(bcDetail.getArmySenddocCode());      }    }  }  @Override  public void setFieldEditorCode() {    // TODO Auto-generated method stub  }}