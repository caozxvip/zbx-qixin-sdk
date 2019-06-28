package com.huize.qixin.api.req.audit;

import com.huize.qixin.api.model.info.FileInfo;
import com.huize.qixin.api.req.BaseReq;

public class SubmitSignatureReq extends BaseReq
{
    private FileInfo fileInfo;
    
    public FileInfo getFileInfo() {
        return this.fileInfo;
    }
    
    public void setFileInfo(final FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
}
