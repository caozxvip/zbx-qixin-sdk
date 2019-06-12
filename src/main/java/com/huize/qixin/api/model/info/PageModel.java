package com.huize.qixin.api.model.info;

import java.util.*;

public class PageModel<T>
{
    private Integer pageIndex;
    private Integer pageSize;
    private Integer pageNums;
    private Integer total;
    private List<T> data;
    
    public Integer getPageIndex() {
        return this.pageIndex;
    }
    
    public void setPageIndex(final Integer pageIndex) {
        this.pageIndex = pageIndex;
    }
    
    public Integer getPageSize() {
        return this.pageSize;
    }
    
    public void setPageSize(final Integer pageSize) {
        this.pageSize = pageSize;
    }
    
    public Integer getPageNums() {
        return this.pageNums;
    }
    
    public void setPageNums(final Integer pageNums) {
        this.pageNums = pageNums;
    }
    
    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(final Integer total) {
        this.total = total;
    }
    
    public List<T> getData() {
        return this.data;
    }
    
    public void setData(final List<T> data) {
        this.data = data;
    }
}
