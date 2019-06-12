package com.huize.qixin.api.req.audit;

import com.huize.qixin.api.req.*;
import com.huize.qixin.api.model.info.*;

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
