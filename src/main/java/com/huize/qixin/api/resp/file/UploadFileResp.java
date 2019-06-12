package com.huize.qixin.api.resp.file;

import com.huize.qixin.api.resp.*;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UploadFileResp extends BaseResp
{
    private Integer fileType;
    private Long fileId;
    private String fileUrl;
    private String fileName;
    
    public Integer getFileType() {
        return this.fileType;
    }
    
    public void setFileType(final Integer fileType) {
        this.fileType = fileType;
    }
    
    public Long getFileId() {
        return this.fileId;
    }
    
    public void setFileId(final Long fileId) {
        this.fileId = fileId;
    }
    
    public String getFileUrl() {
        return this.fileUrl;
    }
    
    public void setFileUrl(final String fileUrl) {
        this.fileUrl = fileUrl;
    }
    
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }
}
