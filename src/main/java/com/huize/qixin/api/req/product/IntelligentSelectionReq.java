package com.huize.qixin.api.req.product;

import com.huize.qixin.api.req.*;
import java.util.*;

public class IntelligentSelectionReq extends BaseReq
{
    private String insurantDateLimit;
    private Map<String, List<String>> searchMap;
    private List<String> sort;
    
    public String getInsurantDateLimit() {
        return this.insurantDateLimit;
    }
    
    public void setInsurantDateLimit(final String insurantDateLimit) {
        this.insurantDateLimit = insurantDateLimit;
    }
    
    public Map<String, List<String>> getSearchMap() {
        return this.searchMap;
    }
    
    public void setSearchMap(final Map<String, List<String>> searchMap) {
        this.searchMap = searchMap;
    }
    
    public List<String> getSort() {
        return this.sort;
    }
    
    public void setSort(final List<String> sort) {
        this.sort = sort;
    }
}
