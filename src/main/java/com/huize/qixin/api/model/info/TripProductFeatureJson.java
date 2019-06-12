package com.huize.qixin.api.model.info;

public class TripProductFeatureJson
{
    private boolean likeSearch;
    private int dataType;
    private String content;
    
    public boolean isLikeSearch() {
        return this.likeSearch;
    }
    
    public void setLikeSearch(final boolean likeSearch) {
        this.likeSearch = likeSearch;
    }
    
    public int getDataType() {
        return this.dataType;
    }
    
    public void setDataType(final int dataType) {
        this.dataType = dataType;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void setContent(final String content) {
        this.content = content;
    }
}
