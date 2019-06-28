package com.qixin.openapi.client;

import com.huize.qixin.api.resp.order.SummaryOrderResp;
import com.huize.qixin.api.req.PageReq;
import com.huize.qixin.api.resp.product.BranchBankAddressResp;
import com.huize.qixin.api.req.product.BranchBankAddressReq;
import com.huize.qixin.api.resp.surrender.SurrenderPolicyResp;
import com.huize.qixin.api.req.surrender.SurrenderPolicyReq;
import com.huize.qixin.api.resp.policy.PolicyUrlResp;
import com.huize.qixin.api.req.policy.PolicyUrlReq;
import com.huize.qixin.api.resp.order.OrderDetailResp;
import com.huize.qixin.api.req.order.OrderDetailReq;
import com.huize.qixin.api.resp.pay.AppPayResp;
import com.huize.qixin.api.req.pay.AppPayReq;
import com.huize.qixin.api.resp.pay.OnlinePayResp;
import com.huize.qixin.api.req.pay.OnlinePayReq;
import com.huize.qixin.api.resp.pay.LocalPayResp;
import com.huize.qixin.api.req.pay.LocalPayReq;
import com.huize.qixin.api.resp.insure.InsureResp;
import com.huize.qixin.api.req.insure.InsureReq;
import com.huize.qixin.api.resp.health.SubmitHealthStateResp;
import com.huize.qixin.api.req.health.SubmitHealthStateReq;
import com.huize.qixin.api.resp.health.HealthStatementResp;
import com.huize.qixin.api.req.health.HealthStatementReq;
import com.huize.qixin.api.req.trial.TrialReq;
import com.huize.qixin.api.resp.trial.TrialResp;
import com.huize.qixin.api.req.trial.DefaultTrialReq;
import com.huize.qixin.api.resp.trial.SimpleTrialResp;
import com.huize.qixin.api.req.trial.SimpleTrialReq;
import com.huize.qixin.api.resp.product.PropertyAddressResp;
import com.huize.qixin.api.req.product.PropertyAddressReq;
import com.huize.qixin.api.resp.product.BankAddressResp;
import com.huize.qixin.api.req.product.BankAddressReq;
import com.huize.qixin.api.resp.product.ProductDestinationResp;
import com.huize.qixin.api.req.product.ProductDestinationReq;
import com.huize.qixin.api.resp.product.ProductInsuredJobResp;
import com.huize.qixin.api.req.product.ProductInsuredJobReq;
import com.huize.qixin.api.resp.product.ProductInsuredAreaResp;
import com.huize.qixin.api.req.product.ProductInsuredAreaReq;
import com.huize.qixin.api.resp.product.ProductInsureAttrResp;
import com.huize.qixin.api.req.product.ProductInsureAttrReq;
import com.huize.qixin.api.resp.product.ProductDetailResp;
import com.huize.qixin.api.req.product.ProductDetailReq;
import com.huize.qixin.api.resp.product.ProductListResp;
import com.qixin.openapi.model.common.CommonResult;
import com.huize.qixin.api.req.product.ProductListReq;

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
