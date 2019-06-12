package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MaterialItem
{
    private Integer fileItemId;
    private String fileItemName;
    private List<AuditFileInfo> files;
    private Byte auditStatus;
    private String auditOpinion;
    private Date auditTime;
    private String infoDescription;
    private String blankInfoName;
    private String blankInfoUrl;
    private String sampleInfoName;
    private String sampleInfoUrl;
    
    public Integer getFileItemId() {
        return this.fileItemId;
    }
    
    public void setFileItemId(final Integer fileItemId) {
        this.fileItemId = fileItemId;
    }
    
    public String getFileItemName() {
        return this.fileItemName;
    }
    
    public void setFileItemName(final String fileItemName) {
        this.fileItemName = fileItemName;
    }
    
    public List<AuditFileInfo> getFiles() {
        return this.files;
    }
    
    public void setFiles(final List<AuditFileInfo> files) {
        this.files = files;
    }
    
    public Byte getAuditStatus() {
        return this.auditStatus;
    }
    
    public void setAuditStatus(final Byte auditStatus) {
        this.auditStatus = auditStatus;
    }
    
    public String getAuditOpinion() {
        return this.auditOpinion;
    }
    
    public void setAuditOpinion(final String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }
    
    public Date getAuditTime() {
        return this.auditTime;
    }
    
    public void setAuditTime(final Date auditTime) {
        this.auditTime = auditTime;
    }
    
    public String getInfoDescription() {
        return this.infoDescription;
    }
    
    public void setInfoDescription(final String infoDescription) {
        this.infoDescription = infoDescription;
    }
    
    public String getBlankInfoName() {
        return this.blankInfoName;
    }
    
    public void setBlankInfoName(final String blankInfoName) {
        this.blankInfoName = blankInfoName;
    }
    
    public String getBlankInfoUrl() {
        return this.blankInfoUrl;
    }
    
    public void setBlankInfoUrl(final String blankInfoUrl) {
        this.blankInfoUrl = blankInfoUrl;
    }
    
    public String getSampleInfoName() {
        return this.sampleInfoName;
    }
    
    public void setSampleInfoName(final String sampleInfoName) {
        this.sampleInfoName = sampleInfoName;
    }
    
    public String getSampleInfoUrl() {
        return this.sampleInfoUrl;
    }
    
    public void setSampleInfoUrl(final String sampleInfoUrl) {
        this.sampleInfoUrl = sampleInfoUrl;
    }
}
