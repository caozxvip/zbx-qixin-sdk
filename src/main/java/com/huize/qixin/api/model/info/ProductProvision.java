package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties({ "materialTypeId", "attachmentName" })
public class ProductProvision
{
    private Integer materialTypeId;
    private String title;
    private String attachmentUrl;
    private String attachmentName;
    private String content;
    
    public Integer getMaterialTypeId() {
        return this.materialTypeId;
    }
    
    public void setMaterialTypeId(final Integer materialTypeId) {
        this.materialTypeId = materialTypeId;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(final String title) {
        this.title = title;
    }
    
    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }
    
    public void setAttachmentUrl(final String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }
    
    public String getAttachmentName() {
        return this.attachmentName;
    }
    
    public void setAttachmentName(final String attachmentName) {
        this.attachmentName = attachmentName;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void setContent(final String content) {
        this.content = content;
    }
}
