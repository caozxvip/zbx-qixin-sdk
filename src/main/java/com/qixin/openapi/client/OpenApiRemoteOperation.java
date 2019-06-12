package com.qixin.openapi.client;

import com.qixin.openapi.model.common.*;
import com.huize.qixin.api.resp.trial.*;
import com.huize.qixin.api.req.trial.*;
import com.huize.qixin.api.req.health.*;
import com.huize.qixin.api.resp.health.*;
import com.huize.qixin.api.req.insure.*;
import com.huize.qixin.api.resp.insure.*;
import com.huize.qixin.api.req.pay.*;
import com.huize.qixin.api.resp.pay.*;
import com.huize.qixin.api.req.order.*;
import com.huize.qixin.api.req.policy.*;
import com.huize.qixin.api.resp.policy.*;
import com.huize.qixin.api.req.surrender.*;
import com.huize.qixin.api.resp.surrender.*;
import com.huize.qixin.api.req.product.*;
import com.huize.qixin.api.resp.product.*;
import com.huize.qixin.api.req.*;
import com.huize.qixin.api.resp.order.*;

public interface OpenApiRemoteOperation
{
    CommonResult<ProductListResp> productList(final ProductListReq p0);
    
    CommonResult<ProductDetailResp> productDetail(final ProductDetailReq p0);
    
    CommonResult<ProductInsureAttrResp> productInsuredAttr(final ProductInsureAttrReq p0);
    
    CommonResult<ProductInsuredAreaResp> productInsuredArea(final ProductInsuredAreaReq p0);
    
    CommonResult<ProductInsuredJobResp> productInsuredJob(final ProductInsuredJobReq p0);
    
    CommonResult<ProductDestinationResp> productDestination(final ProductDestinationReq p0);
    
    CommonResult<BankAddressResp> bankAddress(final BankAddressReq p0);
    
    CommonResult<PropertyAddressResp> propertyAddress(final PropertyAddressReq p0);
    
    CommonResult<SimpleTrialResp> simpleTrial(final SimpleTrialReq p0);
    
    CommonResult<TrialResp> defaultTrial(final DefaultTrialReq p0);
    
    CommonResult<TrialResp> orderTrial(final TrialReq p0);
    
    CommonResult<HealthStatementResp> healthStatement(final HealthStatementReq p0);
    
    CommonResult<SubmitHealthStateResp> submitHealthState(final SubmitHealthStateReq p0);
    
    CommonResult<InsureResp> simpleInsure(final InsureReq p0);
    
    CommonResult<InsureResp> insure(final InsureReq p0);
    
    CommonResult<LocalPayResp> localPay(final LocalPayReq p0);
    
    CommonResult<OnlinePayResp> onlinePay(final OnlinePayReq p0);
    
    CommonResult<AppPayResp> appPay(final AppPayReq p0);
    
    CommonResult<OrderDetailResp> orderDetail(final OrderDetailReq p0);
    
    CommonResult<PolicyUrlResp> downloadUrl(final PolicyUrlReq p0);
    
    CommonResult<SurrenderPolicyResp> surrenderPolicy(final SurrenderPolicyReq p0);
    
    CommonResult<BranchBankAddressResp> branchBankAddress(final BranchBankAddressReq p0);
    
    CommonResult<SummaryOrderResp> summaryOrder(final PageReq p0);
}
