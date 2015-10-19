package com.ufgov.zc.client.component.ui.fieldeditor;import javax.swing.JComponent;import com.ufgov.zc.client.component.element.OriginTableSelectField;import com.ufgov.zc.client.component.event.ValueChangeEvent;import com.ufgov.zc.client.component.event.ValueChangeListener;import com.ufgov.zc.common.commonbiz.model.BaseBill;import com.ufgov.zc.common.commonbiz.model.Origin;public class OriginTableSelectFieldEditor extends AbstractFieldEditor {  /**   *    */  private static final long serialVersionUID = -7677429808342983951L;  private OriginTableSelectField editField;  public OriginTableSelectFieldEditor(String name) {    super(name);  }  public OriginTableSelectFieldEditor(String name, boolean isEnabled) {    super(name);    editField.setEnabled(isEnabled);    editField.setEditable(isEnabled);  }  protected JComponent createEditorComponent() {    editField = new OriginTableSelectField();    editField.addValueChangeListener(new ValueChangeListener() {      public void valueChanged(ValueChangeEvent e) {        syncEditObject();      }    });    return editField;  }  /**   * 同步到对象   */  protected void syncEditObject() {    if (getEditObject() instanceof BaseBill) {      BaseBill bill = (BaseBill) getEditObject();      if (bill != null) {        Origin Origin = editField.getOrigin();        bill.setOriginCode(Origin == null ? null : Origin.getCode());      }    }    this.fireEditSynced();  }  public Object getValue() {    return editField.getOrigin();  }  public void setValue(Object value) {    if (value == null) {      editField.setValue(null);    } else if (value instanceof BaseBill) {      BaseBill bill = (BaseBill) value;      editField.setValueByCode(bill.getOriginCode());    }  }  public void setFieldEditorCode() {    this.FieldEditorCode = FieldEditorCodeConstants.ORIGIN_CODE;  }}