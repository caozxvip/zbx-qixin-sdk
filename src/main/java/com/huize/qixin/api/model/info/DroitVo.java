package com.huize.qixin.api.model.info;

public class DroitVo
{
    public String name;
    public String description;
    public String imgUrl;
    
    public DroitVo() {
    }
    
    public DroitVo(final String name, final String description, final String imgUrl) {
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public String getImgUrl() {
        return this.imgUrl;
    }
    
    public void setImgUrl(final String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
