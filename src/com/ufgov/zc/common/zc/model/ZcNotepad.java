package com.ufgov.zc.common.zc.model;

import java.io.Serializable;
import java.util.Date;

public class ZcNotepad extends ZcBaseBill implements Serializable {

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.NOTEPAD_ID
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private int notepadId;

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.TITLE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private String title;

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.CONTENT
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private String content;

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.EDIT_USER_ID
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private String editUserId;

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.EDIT_USER_NAME
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private String editUserName;

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.EDIT_DATE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private Date editDate;

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.ENTRUST_CODE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private String entrustCode;

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.ENTRUST_NAME
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private String entrustName;

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.ORG_CODE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private String orgCode;

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.CO_CODE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private String coCode;

  /**
   * This field was generated by Abator for iBATIS. This field corresponds to the database column ZC_NOTEPAD.YEAR
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  private String year;
  private String snCode;

  public String getSnCode() {
    return snCode;
  }

  public void setSnCode(String snCode) {
    this.snCode = snCode;
  }

  public int getNotepadId() {
    return notepadId;
  }

  public void setNotepadId(int notepadId) {
    this.notepadId = notepadId;
  }

  /**
   * This method was generated by Abator for iBATIS. This method returns the value of the database column ZC_NOTEPAD.TITLE
   * @return  the value of ZC_NOTEPAD.TITLE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public String getTitle() {
    return title;
  }

  /**
   * This method was generated by Abator for iBATIS. This method sets the value of the database column ZC_NOTEPAD.TITLE
   * @param title  the value for ZC_NOTEPAD.TITLE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * This method was generated by Abator for iBATIS. This method returns the value of the database column ZC_NOTEPAD.CONTENT
   * @return  the value of ZC_NOTEPAD.CONTENT
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public String getContent() {
    return content;
  }

  /**
   * This method was generated by Abator for iBATIS. This method sets the value of the database column ZC_NOTEPAD.CONTENT
   * @param content  the value for ZC_NOTEPAD.CONTENT
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * This method was generated by Abator for iBATIS. This method returns the value of the database column ZC_NOTEPAD.EDIT_USER_ID
   * @return  the value of ZC_NOTEPAD.EDIT_USER_ID
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public String getEditUserId() {
    return editUserId;
  }

  /**
   * This method was generated by Abator for iBATIS. This method sets the value of the database column ZC_NOTEPAD.EDIT_USER_ID
   * @param editUserId  the value for ZC_NOTEPAD.EDIT_USER_ID
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public void setEditUserId(String editUserId) {
    this.editUserId = editUserId;
  }

  /**
   * This method was generated by Abator for iBATIS. This method returns the value of the database column ZC_NOTEPAD.EDIT_USER_NAME
   * @return  the value of ZC_NOTEPAD.EDIT_USER_NAME
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public String getEditUserName() {
    return editUserName;
  }

  /**
   * This method was generated by Abator for iBATIS. This method sets the value of the database column ZC_NOTEPAD.EDIT_USER_NAME
   * @param editUserName  the value for ZC_NOTEPAD.EDIT_USER_NAME
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public void setEditUserName(String editUserName) {
    this.editUserName = editUserName;
  }

  /**
   * This method was generated by Abator for iBATIS. This method returns the value of the database column ZC_NOTEPAD.EDIT_DATE
   * @return  the value of ZC_NOTEPAD.EDIT_DATE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public Date getEditDate() {
    return editDate;
  }

  /**
   * This method was generated by Abator for iBATIS. This method sets the value of the database column ZC_NOTEPAD.EDIT_DATE
   * @param editDate  the value for ZC_NOTEPAD.EDIT_DATE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public void setEditDate(Date editDate) {
    this.editDate = editDate;
  }

  /**
   * This method was generated by Abator for iBATIS. This method returns the value of the database column ZC_NOTEPAD.ENTRUST_CODE
   * @return  the value of ZC_NOTEPAD.ENTRUST_CODE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public String getEntrustCode() {
    return entrustCode;
  }

  /**
   * This method was generated by Abator for iBATIS. This method sets the value of the database column ZC_NOTEPAD.ENTRUST_CODE
   * @param entrustCode  the value for ZC_NOTEPAD.ENTRUST_CODE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public void setEntrustCode(String entrustCode) {
    this.entrustCode = entrustCode;
  }

  /**
   * This method was generated by Abator for iBATIS. This method returns the value of the database column ZC_NOTEPAD.ENTRUST_NAME
   * @return  the value of ZC_NOTEPAD.ENTRUST_NAME
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public String getEntrustName() {
    return entrustName;
  }

  /**
   * This method was generated by Abator for iBATIS. This method sets the value of the database column ZC_NOTEPAD.ENTRUST_NAME
   * @param entrustName  the value for ZC_NOTEPAD.ENTRUST_NAME
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public void setEntrustName(String entrustName) {
    this.entrustName = entrustName;
  }

  /**
   * This method was generated by Abator for iBATIS. This method returns the value of the database column ZC_NOTEPAD.ORG_CODE
   * @return  the value of ZC_NOTEPAD.ORG_CODE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public String getOrgCode() {
    return orgCode;
  }

  /**
   * This method was generated by Abator for iBATIS. This method sets the value of the database column ZC_NOTEPAD.ORG_CODE
   * @param orgCode  the value for ZC_NOTEPAD.ORG_CODE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public void setOrgCode(String orgCode) {
    this.orgCode = orgCode;
  }

  /**
   * This method was generated by Abator for iBATIS. This method returns the value of the database column ZC_NOTEPAD.CO_CODE
   * @return  the value of ZC_NOTEPAD.CO_CODE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public String getCoCode() {
    return coCode;
  }

  /**
   * This method was generated by Abator for iBATIS. This method sets the value of the database column ZC_NOTEPAD.CO_CODE
   * @param coCode  the value for ZC_NOTEPAD.CO_CODE
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public void setCoCode(String coCode) {
    this.coCode = coCode;
  }

  /**
   * This method was generated by Abator for iBATIS. This method returns the value of the database column ZC_NOTEPAD.YEAR
   * @return  the value of ZC_NOTEPAD.YEAR
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public String getYear() {
    return year;
  }

  /**
   * This method was generated by Abator for iBATIS. This method sets the value of the database column ZC_NOTEPAD.YEAR
   * @param year  the value for ZC_NOTEPAD.YEAR
   * @abatorgenerated  Tue Sep 11 06:02:21 GMT 2012
   */
  public void setYear(String year) {
    this.year = year;
  }
}