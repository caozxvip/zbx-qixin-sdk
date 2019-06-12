package com.huize.qixin.api.req.file;

import com.huize.qixin.api.req.*;
import com.huize.qixin.api.model.info.*;

public class UploadFileReq extends BaseReq
{
    private Integer fileType;
    private FileInfo fileInfo;
    
    public Integer getFileType() {
        return this.fileType;
    }
    
    public void setFileType(final Integer fileType) {
        this.fileType = fileType;
    }
    
    public FileInfo getFileInfo() {
        return this.fileInfo;
    }
    
    public void setFileInfo(final FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
}
