package com.huize.qixin.api.model.info;

public class BeneficiaryInfo extends PeopleInfo
{
    private int serial;
    private int proportion;
    private int relationId;
    
    public int getSerial() {
        return this.serial;
    }
    
    public void setSerial(final int serial) {
        this.serial = serial;
    }
    
    public int getProportion() {
        return this.proportion;
    }
    
    public void setProportion(final int proportion) {
        this.proportion = proportion;
    }
    
    public int getRelationId() {
        return this.relationId;
    }
    
    public void setRelationId(final int relationId) {
        this.relationId = relationId;
    }
}
