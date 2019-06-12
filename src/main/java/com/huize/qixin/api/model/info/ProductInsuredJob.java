package com.huize.qixin.api.model.info;

public class ProductInsuredJob
{
    private Long id;
    private String name;
    private Long parentId;
    private String level;
    private String isInsure;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public Long getParentId() {
        return this.parentId;
    }
    
    public void setParentId(final Long parentId) {
        this.parentId = parentId;
    }
    
    public String getIsInsure() {
        return this.isInsure;
    }
    
    public void setIsInsure(final String isInsure) {
        this.isInsure = isInsure;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(final String level) {
        this.level = level;
    }
}
