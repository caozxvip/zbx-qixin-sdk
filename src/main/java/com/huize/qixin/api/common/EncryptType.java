package com.huize.qixin.api.common;

public enum EncryptType
{
    INSURE_NUM(1, "\u6295\u4fdd\u5355\u53f7");
    
    private int index;
    private String desc;
    
    private EncryptType(final int index_, final String desc_) {
        this.index = index_;
        this.desc = desc_;
    }
    
    public static boolean isContains(final Integer type) {
        if (null == type) {
            return false;
        }
        final EncryptType[] values2;
        final EncryptType[] values = values2 = values();
        for (final EncryptType value : values2) {
            if (value.index == type) {
                return true;
            }
        }
        return false;
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public void setIndex(final int index) {
        this.index = index;
    }
    
    public String getDesc() {
        return this.desc;
    }
    
    public void setDesc(final String desc) {
        this.desc = desc;
    }
}
