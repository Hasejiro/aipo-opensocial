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

import java.util.List;

/** Class _EipTWorkflowRequest was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTWorkflowRequest extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String NOTE_PROPERTY = "note";
    public static final String PARENT_ID_PROPERTY = "parentId";
    public static final String PRICE_PROPERTY = "price";
    public static final String PRIORITY_PROPERTY = "priority";
    public static final String PROGRESS_PROPERTY = "progress";
    public static final String REQUEST_NAME_PROPERTY = "requestName";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String EIP_TWORKFLOW_CATEGORY_PROPERTY = "eipTWorkflowCategory";
    public static final String EIP_TWORKFLOW_FILE_PROPERTY = "eipTWorkflowFile";
    public static final String EIP_TWORKFLOW_REQUEST_MAP_PROPERTY = "eipTWorkflowRequestMap";
    public static final String EIP_TWORKFLOW_ROUTE_PROPERTY = "eipTWorkflowRoute";

    public static final String REQUEST_ID_PK_COLUMN = "REQUEST_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }
    
    
    public void setParentId(Integer parentId) {
        writeProperty("parentId", parentId);
    }
    public Integer getParentId() {
        return (Integer)readProperty("parentId");
    }
    
    
    public void setPrice(Long price) {
        writeProperty("price", price);
    }
    public Long getPrice() {
        return (Long)readProperty("price");
    }
    
    
    public void setPriority(Short priority) {
        writeProperty("priority", priority);
    }
    public Short getPriority() {
        return (Short)readProperty("priority");
    }
    
    
    public void setProgress(String progress) {
        writeProperty("progress", progress);
    }
    public String getProgress() {
        return (String)readProperty("progress");
    }
    
    
    public void setRequestName(String requestName) {
        writeProperty("requestName", requestName);
    }
    public String getRequestName() {
        return (String)readProperty("requestName");
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
    
    
    public void setEipTWorkflowCategory(com.aipo.orm.model.portlet.EipTWorkflowCategory eipTWorkflowCategory) {
        setToOneTarget("eipTWorkflowCategory", eipTWorkflowCategory, true);
    }

    public com.aipo.orm.model.portlet.EipTWorkflowCategory getEipTWorkflowCategory() {
        return (com.aipo.orm.model.portlet.EipTWorkflowCategory)readProperty("eipTWorkflowCategory");
    } 
    
    
    public void addToEipTWorkflowFile(com.aipo.orm.model.portlet.EipTWorkflowFile obj) {
        addToManyTarget("eipTWorkflowFile", obj, true);
    }
    public void removeFromEipTWorkflowFile(com.aipo.orm.model.portlet.EipTWorkflowFile obj) {
        removeToManyTarget("eipTWorkflowFile", obj, true);
    }
    public List getEipTWorkflowFile() {
        return (List)readProperty("eipTWorkflowFile");
    }
    
    
    public void addToEipTWorkflowRequestMap(com.aipo.orm.model.portlet.EipTWorkflowRequestMap obj) {
        addToManyTarget("eipTWorkflowRequestMap", obj, true);
    }
    public void removeFromEipTWorkflowRequestMap(com.aipo.orm.model.portlet.EipTWorkflowRequestMap obj) {
        removeToManyTarget("eipTWorkflowRequestMap", obj, true);
    }
    public List getEipTWorkflowRequestMap() {
        return (List)readProperty("eipTWorkflowRequestMap");
    }
    
    
    public void setEipTWorkflowRoute(com.aipo.orm.model.portlet.EipTWorkflowRoute eipTWorkflowRoute) {
        setToOneTarget("eipTWorkflowRoute", eipTWorkflowRoute, true);
    }

    public com.aipo.orm.model.portlet.EipTWorkflowRoute getEipTWorkflowRoute() {
        return (com.aipo.orm.model.portlet.EipTWorkflowRoute)readProperty("eipTWorkflowRoute");
    } 
    
    
}
