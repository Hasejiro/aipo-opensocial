/*
 * Aipo is a groupware program developed by Aimluck,Inc.
 * Copyright (C) 2004-2011 Aimluck,Inc.
 * http://www.aipo.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aipo.orm.model.portlet.auto;

/** Class _EipTTodo was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTTodo extends org.apache.cayenne.CayenneDataObject {

    public static final String ADDON_SCHEDULE_FLG_PROPERTY = "addonScheduleFlg";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String END_DATE_PROPERTY = "endDate";
    public static final String NOTE_PROPERTY = "note";
    public static final String PRIORITY_PROPERTY = "priority";
    public static final String PUBLIC_FLAG_PROPERTY = "publicFlag";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String STATE_PROPERTY = "state";
    public static final String TODO_NAME_PROPERTY = "todoName";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String EIP_TTODO_CATEGORY_PROPERTY = "eipTTodoCategory";
    public static final String TURBINE_USER_PROPERTY = "turbineUser";

    public static final String TODO_ID_PK_COLUMN = "TODO_ID";

    public void setAddonScheduleFlg(String addonScheduleFlg) {
        writeProperty("addonScheduleFlg", addonScheduleFlg);
    }
    public String getAddonScheduleFlg() {
        return (String)readProperty("addonScheduleFlg");
    }
    
    
    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setEndDate(java.util.Date endDate) {
        writeProperty("endDate", endDate);
    }
    public java.util.Date getEndDate() {
        return (java.util.Date)readProperty("endDate");
    }
    
    
    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }
    
    
    public void setPriority(Short priority) {
        writeProperty("priority", priority);
    }
    public Short getPriority() {
        return (Short)readProperty("priority");
    }
    
    
    public void setPublicFlag(String publicFlag) {
        writeProperty("publicFlag", publicFlag);
    }
    public String getPublicFlag() {
        return (String)readProperty("publicFlag");
    }
    
    
    public void setStartDate(java.util.Date startDate) {
        writeProperty("startDate", startDate);
    }
    public java.util.Date getStartDate() {
        return (java.util.Date)readProperty("startDate");
    }
    
    
    public void setState(Short state) {
        writeProperty("state", state);
    }
    public Short getState() {
        return (Short)readProperty("state");
    }
    
    
    public void setTodoName(String todoName) {
        writeProperty("todoName", todoName);
    }
    public String getTodoName() {
        return (String)readProperty("todoName");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }
    
    
    public void setEipTTodoCategory(com.aipo.orm.model.portlet.EipTTodoCategory eipTTodoCategory) {
        setToOneTarget("eipTTodoCategory", eipTTodoCategory, true);
    }

    public com.aipo.orm.model.portlet.EipTTodoCategory getEipTTodoCategory() {
        return (com.aipo.orm.model.portlet.EipTTodoCategory)readProperty("eipTTodoCategory");
    } 
    
    
    public void setTurbineUser(com.aipo.orm.model.security.TurbineUser turbineUser) {
        setToOneTarget("turbineUser", turbineUser, true);
    }

    public com.aipo.orm.model.security.TurbineUser getTurbineUser() {
        return (com.aipo.orm.model.security.TurbineUser)readProperty("turbineUser");
    } 
    
    
}
