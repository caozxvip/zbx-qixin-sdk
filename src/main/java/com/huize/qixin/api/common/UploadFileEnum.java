package com.huize.qixin.api.common;

public enum UploadFileEnum
{
    SIGNATURE(Integer.valueOf(1), "签名文件", "png"), 
    LOAN(Integer.valueOf(2), "贷款合同", "");
    
    private Integer type;
    private String desc;
    private String limitType;
    
    private UploadFileEnum(final Integer _type, final String _desc, final String _limitType) {
        this.type = _type;
        this.desc = _desc;
        this.limitType = _limitType;
    }
    
    public static UploadFileEnum getByType(final Integer type) {
        if (null == type) {
            return null;
        }
        final UploadFileEnum[] values2;
        final UploadFileEnum[] values = values2 = values();
        for (final UploadFileEnum uploadFileEnum : values2) {
            if (uploadFileEnum.type == (int)type) {
                return uploadFileEnum;
            }
        }
        return null;
    }
    
    public Integer getType() {
        return this.type;
    }
    
    public void setType(final Integer type) {
        this.type = type;
    }
    
    public String getDesc() {
        return this.desc;
    }
    
    public void setDesc(final String desc) {
        this.desc = desc;
    }
    
    public String getLimitType() {
        return this.limitType;
    }
    
    public void setLimitType(final String limitType) {
        this.limitType = limitType;
    }
}
