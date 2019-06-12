package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuditFileInfo extends FileInfo
{
    private int fileItemId;
    
    public int getFileItemId() {
        return this.fileItemId;
    }
    
    public void setFileItemId(final int fileItemId) {
        this.fileItemId = fileItemId;
    }
}
