package com.huize.qixin.api.model.info;

public class ProductFeature
{
    private Byte dataType;
    private String content;
    private String pic;
    
    public Byte getDataType() {
        return this.dataType;
    }
    
    public void setDataType(final Byte dataType) {
        this.dataType = dataType;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void setContent(final String content) {
        this.content = content;
    }
    
    public String getPic() {
        return this.pic;
    }
    
    public void setPic(final String pic) {
        this.pic = pic;
    }
}
