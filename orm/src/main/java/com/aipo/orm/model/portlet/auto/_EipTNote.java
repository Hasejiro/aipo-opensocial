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

/** Class _EipTNote was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTNote extends org.apache.cayenne.CayenneDataObject {

    public static final String ACCEPT_DATE_PROPERTY = "acceptDate";
    public static final String ADD_DEST_TYPE_PROPERTY = "addDestType";
    public static final String CLIENT_NAME_PROPERTY = "clientName";
    public static final String COMPANY_NAME_PROPERTY = "companyName";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String CUSTOM_SUBJECT_PROPERTY = "customSubject";
    public static final String EMAIL_ADDRESS_PROPERTY = "emailAddress";
    public static final String MESSAGE_PROPERTY = "message";
    public static final String OWNER_ID_PROPERTY = "ownerId";
    public static final String SUBJECT_TYPE_PROPERTY = "subjectType";
    public static final String TELEPHONE_PROPERTY = "telephone";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String EIP_TNOTE_MAPS_PROPERTY = "eipTNoteMaps";

    public static final String NOTE_ID_PK_COLUMN = "NOTE_ID";

    public void setAcceptDate(java.util.Date acceptDate) {
        writeProperty("acceptDate", acceptDate);
    }
    public java.util.Date getAcceptDate() {
        return (java.util.Date)readProperty("acceptDate");
    }
    
    
    public void setAddDestType(String addDestType) {
        writeProperty("addDestType", addDestType);
    }
    public String getAddDestType() {
        return (String)readProperty("addDestType");
    }
    
    
    public void setClientName(String clientName) {
        writeProperty("clientName", clientName);
    }
    public String getClientName() {
        return (String)readProperty("clientName");
    }
    
    
    public void setCompanyName(String companyName) {
        writeProperty("companyName", companyName);
    }
    public String getCompanyName() {
        return (String)readProperty("companyName");
    }
    
    
    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setCustomSubject(String customSubject) {
        writeProperty("customSubject", customSubject);
    }
    public String getCustomSubject() {
        return (String)readProperty("customSubject");
    }
    
    
    public void setEmailAddress(String emailAddress) {
        writeProperty("emailAddress", emailAddress);
    }
    public String getEmailAddress() {
        return (String)readProperty("emailAddress");
    }
    
    
    public void setMessage(String message) {
        writeProperty("message", message);
    }
    public String getMessage() {
        return (String)readProperty("message");
    }
    
    
    public void setOwnerId(String ownerId) {
        writeProperty("ownerId", ownerId);
    }
    public String getOwnerId() {
        return (String)readProperty("ownerId");
    }
    
    
    public void setSubjectType(String subjectType) {
        writeProperty("subjectType", subjectType);
    }
    public String getSubjectType() {
        return (String)readProperty("subjectType");
    }
    
    
    public void setTelephone(String telephone) {
        writeProperty("telephone", telephone);
    }
    public String getTelephone() {
        return (String)readProperty("telephone");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void addToEipTNoteMaps(com.aipo.orm.model.portlet.EipTNoteMap obj) {
        addToManyTarget("eipTNoteMaps", obj, true);
    }
    public void removeFromEipTNoteMaps(com.aipo.orm.model.portlet.EipTNoteMap obj) {
        removeToManyTarget("eipTNoteMaps", obj, true);
    }
    public List getEipTNoteMaps() {
        return (List)readProperty("eipTNoteMaps");
    }
    
    
}
