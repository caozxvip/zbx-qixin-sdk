package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FileInfo
{
    private String url;
    private String name;
    
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(final String url) {
        this.url = url;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
}
