package com.ufgov.zc.client.component.ui.conditionitem;import javax.swing.JComponent;import com.ufgov.zc.client.component.element.ManageForBiXJTableSelectField;import com.ufgov.zc.client.component.event.ValueChangeEvent;import com.ufgov.zc.client.component.event.ValueChangeListener;import com.ufgov.zc.common.commonbiz.model.Manage;public class ManageForBiXJTableSelectFieldConditionItem extends AbstractSearchConditionItem {  public ManageForBiXJTableSelectFieldConditionItem(String displayName) {    init(displayName);  }  private ManageForBiXJTableSelectField manageTableSelectField;  @Override  protected JComponent createEditorComponent() {    if (manageTableSelectField == null) {      manageTableSelectField = new ManageForBiXJTableSelectField(20);      manageTableSelectField.addValueChangeListener(new ValueChangeListener() {        public void valueChanged(ValueChangeEvent e) {          fireSearch();          fireValueChanged();        }      });    }    return manageTableSelectField;  }  @Override  public void setValue(Object value) {    manageTableSelectField.setManage((Manage) value);  }  @Override  public Object getValue() {    return manageTableSelectField.getManage();  }}