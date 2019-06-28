package com.huize.qixin.api.resp.yizt;

import com.huize.qixin.api.model.info.YztAccountStatement;
import java.util.List;
import com.huize.qixin.api.resp.BaseResp;

public class YztAccountStatementResp extends BaseResp
{
    private List<YztAccountStatement> yztAccountStatements;
    
    public List<YztAccountStatement> getYztAccountStatements() {
        return this.yztAccountStatements;
    }
    
    public void setYztAccountStatements(final List<YztAccountStatement> yztAccountStatements) {
        this.yztAccountStatements = yztAccountStatements;
    }
}
