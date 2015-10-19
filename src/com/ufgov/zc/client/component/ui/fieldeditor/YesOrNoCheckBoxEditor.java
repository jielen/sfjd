package com.ufgov.zc.client.component.ui.fieldeditor;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import javax.swing.JCheckBox;import javax.swing.JComponent;import com.ufgov.zc.common.cp.model.CpApply;public class YesOrNoCheckBoxEditor extends AbstractFieldEditor {  private static final long serialVersionUID = -5102125612416797835L;  private JCheckBox editCheck;  public YesOrNoCheckBoxEditor(String name) {    super(name);  }  public YesOrNoCheckBoxEditor(String name, boolean isEnabled) {    super(name);    editCheck.setEnabled(isEnabled);  }  protected JComponent createEditorComponent() {    editCheck = new JCheckBox();    editCheck.addActionListener(new ActionListener() {      public void actionPerformed(ActionEvent e) {        syncObject();      }    });    return editCheck;  }  /**   * 同步到对象   */  private void syncObject() {    if (getEditObject() instanceof CpApply) {      CpApply bill = (CpApply) getEditObject();      if (bill != null) {        boolean value = editCheck.isSelected();        bill.setIsCounterSign(value == true ? "1" : "0");      }    }    this.fireEditSynced();  }  public Object getValue() {    return editCheck.isSelected();  }  public void setValue(Object value) {    if (value == null) {      editCheck.setSelected(false);    } else if (value instanceof CpApply) {      CpApply bill = (CpApply) value;      if (bill.getIsCounterSign().equals("1")) {        editCheck.setSelected(true);      } else {        editCheck.setSelected(false);      }    }  }  @Override  public void setFieldEditorCode() {    // TODO Auto-generated method stub  }}