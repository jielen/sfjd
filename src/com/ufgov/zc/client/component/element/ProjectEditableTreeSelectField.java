package com.ufgov.zc.client.component.element;import java.awt.BorderLayout;import java.awt.Dialog;import java.awt.event.WindowAdapter;import java.awt.event.WindowEvent;import javax.swing.JFrame;import javax.swing.JPanel;import com.ufgov.zc.client.common.AsOptionMeta;import com.ufgov.zc.client.component.JButtonTextField;import com.ufgov.zc.common.commonbiz.model.Company;import com.ufgov.zc.common.commonbiz.model.Project;import com.ufgov.zc.common.system.util.LevelControlUtil;public class ProjectEditableTreeSelectField extends JButtonTextField {  private Company company = null;  public Company getCompany() {    return company;  }  public void setCompany(Company company) {    this.company = company;  }  public void handleClick(JButtonTextField jButtonTextField) {    await();    selectDialog.setVisible(true);  }  private void init() {    this.elementCode = "PROJECT_CODE";    selectDialog = new ProjectEditableTreeSelectDialog(owner, true, this);  }  public void setValue(Object value) {    this.value = value;    if (value != null) {      Project data = (Project) value;      this.setText(data.getName());      this.setToolTipText("[" + data.getCode() + "]" + data.getName());    } else {      this.setText("");      this.setToolTipText(null);    }    this.fireValueChanged();  }  public void setProject(Project value) {    this.setValue(value);  }  public Project getProject() {    return (Project) this.getValue();  }  public ProjectEditableTreeSelectField() {    this(20);  }  public ProjectEditableTreeSelectField(int col) {    super(col);    this.init();  }  public ProjectEditableTreeSelectField(int col, String compoId) {    super(col);    this.compoId = compoId;    this.init();  }  public ProjectEditableTreeSelectField(int col, Dialog owner) {    super(col);    this.owner = owner;    this.init();  }  public void setCtrlLevelNum(int ctrlLevelNum) {    super.setCtrlLevelNum(ctrlLevelNum);    this.ctrlLen = LevelControlUtil    .getCtrLength(AsOptionMeta.getOptVal("OPT_PD_PROJECT_LEVEL"), ctrlLevelNum);  }  public static void main(String[] args) {    JFrame f = new JFrame();    ProjectEditableTreeSelectField textField = new ProjectEditableTreeSelectField(20, "DP_EDIT");    //		textField.setValueByCode("000101");    //		textField.setEditable(false);    //		textField.setEnabled(false);    //		textField.setEnabled(true);    //		textField.setCtrlLevelNum(1);    //		textField.setLevelCtrl(true);    //		textField.setRandomEdit(false);    //		textField.setPrefix("0001");    Company company = new Company();    company.setCode("01060001");    //		textField.setCompany(company);    JPanel panel = new JPanel();    panel.add(textField);    f.getContentPane().add(panel, BorderLayout.NORTH);    // f.pack();    // SwingUtilities.updateComponentTreeUI(panel);    f.setSize(400, 300);    f.setLocationRelativeTo(null);    f.setVisible(true);    f.addWindowListener(new WindowAdapter() {      public void windowClosing(WindowEvent e) {        System.exit(0);      }    });  }}