package com.huize.qixin.api.resp.order;

import com.huize.qixin.api.resp.*;

public class OrderStatisticsResp extends BaseResp
{
    private String fileUrl;
    
    public String getFileUrl() {
        return this.fileUrl;
    }
    
    public void setFileUrl(final String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
