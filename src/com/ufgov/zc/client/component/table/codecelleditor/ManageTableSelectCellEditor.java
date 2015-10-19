package com.ufgov.zc.client.component.table.codecelleditor;import java.awt.Component;import javax.swing.JTable;import javax.swing.table.TableCellEditor;import com.ufgov.zc.client.component.element.ManageTableSelectField;import com.ufgov.zc.client.component.table.GkAbstractCellEditor;import com.ufgov.zc.common.commonbiz.model.Manage;public class ManageTableSelectCellEditor extends GkAbstractCellEditor implements TableCellEditor {  private static final long serialVersionUID = -1014964575090820890L;  private ManageTableSelectField editorComponent = new ManageTableSelectField();  public ManageTableSelectCellEditor() {  }  public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,  int column) {    editorComponent.setValueByCode((String) value);    return editorComponent;  }  public Object getCellEditorValue() {    String code = null;    Manage value = editorComponent.getManage();    if (value != null) {      code = value.getCode();    }    return code;  }}