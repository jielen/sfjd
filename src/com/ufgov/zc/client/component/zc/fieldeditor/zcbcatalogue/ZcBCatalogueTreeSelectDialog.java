package com.ufgov.zc.client.component.zc.fieldeditor.zcbcatalogue;import java.awt.Dialog;import java.util.ArrayList;import java.util.HashMap;import java.util.List;import java.util.Map;import javax.swing.tree.DefaultMutableTreeNode;import javax.swing.tree.DefaultTreeModel;import com.ufgov.zc.client.common.LangTransMeta;import com.ufgov.zc.client.common.ServiceFactory;import com.ufgov.zc.client.common.WorkEnv;import com.ufgov.zc.client.component.JButtonTextField;import com.ufgov.zc.client.component.JTreeSelectDialog;import com.ufgov.zc.client.component.zc.fieldeditor.ForeignEntityDataCache;import com.ufgov.zc.client.component.zc.fieldeditor.TextFieldEditor;import com.ufgov.zc.common.system.RequestMeta;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.zc.model.TreeNodeValueObject;import com.ufgov.zc.common.zc.model.ZcBCatalogue;import com.ufgov.zc.common.zc.model.ZcBCatalogueExample;import com.ufgov.zc.common.zc.publish.IForeignEntityDelegate;public class ZcBCatalogueTreeSelectDialog extends JTreeSelectDialog {  protected TextFieldEditor triggerFieldName;  protected boolean selectedTailFlag = false;  protected boolean isXYCatalogue = false;  private ZcBCatalogueExample example = null;  public ZcBCatalogueTreeSelectDialog(Dialog dialog, boolean modal, JButtonTextField triggerField) {    super(dialog, modal, triggerField);    this.triggerFieldName = triggerFieldName;  }  public ZcBCatalogueTreeSelectDialog(Dialog dialog, boolean modal, JButtonTextField triggerField, boolean selectedTailFlag) {    super(dialog, modal, triggerField, selectedTailFlag);    this.triggerFieldName = triggerFieldName;    this.selectedTailFlag = selectedTailFlag;  }  public ZcBCatalogueTreeSelectDialog(Dialog dialog, boolean modal, JButtonTextField triggerField, boolean selectedTailFlag, boolean isXYCatalogue) {    super(dialog, modal, triggerField, selectedTailFlag);    this.triggerFieldName = triggerFieldName;    this.selectedTailFlag = selectedTailFlag;    this.isXYCatalogue = isXYCatalogue;  }  public ZcBCatalogueTreeSelectDialog(Dialog dialog, boolean modal, JButtonTextField triggerField, boolean selectedTailFlag,  ZcBCatalogueExample example) {    super(dialog, modal, triggerField);    this.triggerFieldName = triggerFieldName;    this.selectedTailFlag = selectedTailFlag;    this.example = example;  }  private static final long serialVersionUID = -4407933154954926841L;  public void initTitle() {    LangTransMeta.init("ZC%");    this.setTitle(LangTransMeta.translate("ZC_B_CATALOGUE"));  }  public void initDataBufferList() {    IForeignEntityDelegate delegate = (IForeignEntityDelegate) ServiceFactory.create(IForeignEntityDelegate.class, "foreignEntityServiceDelegate");    RequestMeta requestMeta = WorkEnv.getInstance().getRequestMeta();    ElementConditionDto dto = new ElementConditionDto();    dto.setZcText0(String.valueOf(requestMeta.getSvNd()));    if (isXYCatalogue) {      dataBufferList = (List) ForeignEntityDataCache.getDataMap().get(ForeignEntityDataCache.CACHE_ZC_B_CATALOGUE_XYCATALOGUE);    } else {      dataBufferList = (List) ForeignEntityDataCache.getDataMap().get(ForeignEntityDataCache.CACHE_ZC_B_CATALOGUE);    }    if (dataBufferList != null && dataBufferList.size() > 0) {    } else {      if (isXYCatalogue) {        dataBufferList = delegate.getZcBXYCatalogue(dto, requestMeta);        ForeignEntityDataCache.setData(ForeignEntityDataCache.CACHE_ZC_B_CATALOGUE_XYCATALOGUE, dataBufferList);      } else {        dataBufferList = delegate.getZcBCatalogue(dto, requestMeta);        ForeignEntityDataCache.setData(ForeignEntityDataCache.CACHE_ZC_B_CATALOGUE, dataBufferList);      }    }    for (int i = 0; i < dataBufferList.size(); i++) {      ZcBCatalogue rowData = (ZcBCatalogue) dataBufferList.get(i);      this.triggerField.dataMap.put(rowData.getZcCatalogueCode(), rowData);    }    this.triggerField.filteredDataList = dataBufferList;    initSelectTree();  }  private List genTreeData() {    List filteredList = dataBufferList;    Map map = new HashMap();    for (Object o : filteredList) {      ZcBCatalogue cpy = (ZcBCatalogue) o;      map.put(cpy.getCode(), cpy);    }    List rootZcBCatalogueList = new ArrayList();    List childrenZcBCatalogueList = new ArrayList();    for (Object o : filteredList) {      TreeNodeValueObject cpy = (TreeNodeValueObject) o;      if (map.get(cpy.getParentCode()) == null) {        rootZcBCatalogueList.add(cpy);      } else {        childrenZcBCatalogueList.add(cpy);      }    }    Map childrenMap = new HashMap();    for (int i = 0; i < childrenZcBCatalogueList.size(); i++) {      TreeNodeValueObject child = (TreeNodeValueObject) childrenZcBCatalogueList.get(i);      List childrenList = (List) childrenMap.get(child.getParentCode());      if (childrenList != null) {        childrenList.add(child);      } else {        List tempList = new ArrayList();        tempList.add(child);        childrenMap.put(child.getParentCode(), tempList);      }    }    for (int i = 0; i < rootZcBCatalogueList.size(); i++) {      ZcBCatalogue company = (ZcBCatalogue) rootZcBCatalogueList.get(i);      this.setZcBCatalogueChildren(company, childrenMap);    }    return rootZcBCatalogueList;  }  protected void initSelectTree() {    DefaultMutableTreeNode root = new DefaultMutableTreeNode("采购品目");    this.triggerField.filteredDataList = dataBufferList;//this.genFilterDataList()    List companyTreeList = genTreeData();    treeNodeMap.clear();    for (Object o : companyTreeList) {      TreeNodeValueObject nodeValueObj = (TreeNodeValueObject) o;      DefaultMutableTreeNode node = new DefaultMutableTreeNode(nodeValueObj);      root.add(node);      treeNodeMap.put(nodeValueObj, node);      this.setChildNode(nodeValueObj, node);    }    this.getSelectTree().setModel(new DefaultTreeModel(root));  }  private void setZcBCatalogueChildren(ZcBCatalogue company, Map childrenMap) {    List childrenList = (List) childrenMap.get(company.getCode());    if (childrenList != null) {      company.setChildrenList(childrenList);      for (int i = 0; i < childrenList.size(); i++) {        ZcBCatalogue c = (ZcBCatalogue) childrenList.get(i);        setZcBCatalogueChildren(c, childrenMap);      }    }  }  private void setChildNode(TreeNodeValueObject nodeValueObj, DefaultMutableTreeNode node) {    if (nodeValueObj.getChildrenList().size() > 0) {      for (Object o : nodeValueObj.getChildrenList()) {        TreeNodeValueObject c = (TreeNodeValueObject) o;        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(c);        node.add(childNode);        treeNodeMap.put(c, childNode);        setChildNode(c, childNode);      }    }  }  //@Override  //  public void doOK() {  //  //    DefaultMutableTreeNode node = (DefaultMutableTreeNode) selectTree.getLastSelectedPathComponent();  //  //    int selected = selectTree.getSelectionCount();  //  //    if (selected == 0) {  //      JOptionPane.showMessageDialog(self, "请选择数据!", "提示", JOptionPane.INFORMATION_MESSAGE);  //      return;  //    } else if (selected > 1) {  //      JOptionPane.showMessageDialog(self, "只能选择一条数据！", "提示", JOptionPane.INFORMATION_MESSAGE);  //      return;  //    }  //  //    if (node.getUserObject() instanceof String) {  //      return;  //    }  //  //    if (node.getChildCount() > 0 && this.selectedTailFlag) {  //      JOptionPane.showMessageDialog(null, "请选择末级节点数据.", "提示", JOptionPane.INFORMATION_MESSAGE);  //      return;  //    }  //    triggerField.setValue(node.getUserObject());  //    closeDialog();  //  }}