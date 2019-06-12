package com.huize.qixin.api.req;

public class PageReq extends BaseReq
{
    private int pageIndex;
    private int pageSize;
    
    public int getPageIndex() {
        return this.pageIndex;
    }
    
    public void setPageIndex(final int pageIndex) {
        this.pageIndex = pageIndex;
    }
    
    public int getPageSize() {
        return this.pageSize;
    }
    
    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;
    }
}
