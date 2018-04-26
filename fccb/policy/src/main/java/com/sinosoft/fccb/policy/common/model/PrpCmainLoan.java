package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PrpCmainLoan generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcmain_loan")
public class PrpCmainLoan implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 投保单号码 */
	private String proposalNo;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 险种代码 */
	private String riskCode;
	/** 担保方式 */
	private String guaranteeType;
	/** 抵押/质押物品名称 */
	private String guaranteeName;
	/** 抵押物价值 */
	private BigDecimal mortgageValue;
	/** 抵(质)押合同号 */
	private String mortgageNo;
	/** 抵押登记日期 */
	private Date mortgageDate;
	/** 担保人代码 */
	private String warrantorCode;
	/** 抵押（出质）人名称 */
	private String warrantorName;
	/** 贷款相关号1 */
	private String loanNo1;
	/** 贷款相关号2 */
	private String loanNo2;
	/** 期房标志 */
	private String installmentFlag;
	/** 期房交付日期 */
	private Date deliverDate;
	/** 房地产开发商名称 */
	private String landAgent;
	/** 贷款相关号3 */
	private String loanNo3;
	/** 贷款相关号4 */
	private String loanNo4;
	/** 贷款相关号5 */
	private String loanNo5;
	/** 贷款合同号 */
	private String loanContractNo;
	/** 保额确定方式编码 */
	private String loanWay;
	/** 贷款性质代码 */
	private String loanNature;
	/** 贷款方式（车贷） */
	private String loanType;
	/** 贷款银行代码 */
	private String loanBankCode;
	/** 贷款银行名称 */
	private String loanBankName;
	/** 贷款用途 */
	private String loanUsage;
	/** 贷款期限开始日期 */
	private Date loanStartDate;
	/** 贷款期限终止日期 */
	private Date loanEndDate;
	/** 贷款年限 */
	private Integer loanYear;
	/** 初装金额 */
	private BigDecimal planAmount;
	/** 单位保险金额 */
	private BigDecimal unitAmount;
	/** 首付比例 */
	private BigDecimal firstRate;
	/** 首期付款金额 */
	private BigDecimal firstPaid;
	/** 币别 */
	private String currency;
	/** 贷款金额 */
	private BigDecimal loanAmount;
	/** 贷款利率/本息 */
	private BigDecimal loanRate;
	/** 还款方式 */
	private String repaidType;
	/** 约定付款期数 */
	private Integer paidTimes;
	/** 每期还款金额 */
	private BigDecimal perRepaidAmount;
	/**RYANGQH2014032602_04:调整prpCmain_Loan表结构，新增字段存储新增字段 add by sungq 20140521 begin*/
	/** 首付比例 */
	private BigDecimal newFirstRate;	
	/** 被保险人自担责任比例 */
	private BigDecimal ownLiabRatio;
	/** 第三方承担责任比例 */
	private BigDecimal otherLiabRatio;
	/** 责任保证金 */
	private BigDecimal recognizance;
	/** 预留字段1 */
	private String preChar1;
	/** 预留字段2 */
	private String preChar2;
	/** 预留字段3 */
	private String preChar3;
	/** 预留字段4 */
	private String preChar4;
	/**RYANGQH2014032602_04:调整prpCmain_Loan表结构，新增字段存储新增字段 add by sungq 20140521 end*/
	/** 备注 */
	private String remark;	
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCmainLoan() {
	}

	/**       
	 * 投保单号码
	 */
	@Id
	@Column(name = "proposalno", unique = true, nullable = false)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	/**       
	 * 投保单号码
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proposalno", unique = true, nullable = false, insertable = false, updatable = false)
	public PrpCmain getPrpCmain() {
		return this.prpCmain;
	}

	public void setPrpCmain(PrpCmain prpCmain) {
		this.prpCmain = prpCmain;
	}

	/**       
	 * 险种代码
	 */

	@Column(name = "riskcode", nullable = false)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	/**       
	 * 担保方式
	 */

	@Column(name = "guaranteetype")
	public String getGuaranteeType() {
		return this.guaranteeType;
	}

	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}

	/**       
	 * 抵押/质押物品名称
	 */

	@Column(name = "guaranteename")
	public String getGuaranteeName() {
		return this.guaranteeName;
	}

	public void setGuaranteeName(String guaranteeName) {
		this.guaranteeName = guaranteeName;
	}

	/**       
	 * 抵押物价值
	 */

	@Column(name = "mortgagevalue")
	public BigDecimal getMortgageValue() {
		return this.mortgageValue;
	}

	public void setMortgageValue(BigDecimal mortgageValue) {
		this.mortgageValue = mortgageValue;
	}

	/**       
	 * 抵(质)押合同号
	 */

	@Column(name = "mortgageno")
	public String getMortgageNo() {
		return this.mortgageNo;
	}

	public void setMortgageNo(String mortgageNo) {
		this.mortgageNo = mortgageNo;
	}

	/**       
	 * 抵押登记日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "mortgagedate")
	public Date getMortgageDate() {
		return this.mortgageDate;
	}

	public void setMortgageDate(Date mortgageDate) {
		this.mortgageDate = mortgageDate;
	}

	/**       
	 * 担保人代码
	 */

	@Column(name = "warrantorcode")
	public String getWarrantorCode() {
		return this.warrantorCode;
	}

	public void setWarrantorCode(String warrantorCode) {
		this.warrantorCode = warrantorCode;
	}

	/**       
	 * 抵押（出质）人名称
	 */

	@Column(name = "warrantorname")
	public String getWarrantorName() {
		return this.warrantorName;
	}

	public void setWarrantorName(String warrantorName) {
		this.warrantorName = warrantorName;
	}

	/**       
	 * 贷款相关号1
	 */

	@Column(name = "loanno1")
	public String getLoanNo1() {
		return this.loanNo1;
	}

	public void setLoanNo1(String loanNo1) {
		this.loanNo1 = loanNo1;
	}

	/**       
	 * 贷款相关号2
	 */

	@Column(name = "loanno2")
	public String getLoanNo2() {
		return this.loanNo2;
	}

	public void setLoanNo2(String loanNo2) {
		this.loanNo2 = loanNo2;
	}

	/**       
	 * 期房标志
	 */

	@Column(name = "installmentflag")
	public String getInstallmentFlag() {
		return this.installmentFlag;
	}

	public void setInstallmentFlag(String installmentFlag) {
		this.installmentFlag = installmentFlag;
	}

	/**       
	 * 期房交付日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "deliverdate")
	public Date getDeliverDate() {
		return this.deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	/**       
	 * 房地产开发商名称
	 */

	@Column(name = "landagent")
	public String getLandAgent() {
		return this.landAgent;
	}

	public void setLandAgent(String landAgent) {
		this.landAgent = landAgent;
	}

	/**       
	 * 贷款相关号3
	 */

	@Column(name = "loanno3")
	public String getLoanNo3() {
		return this.loanNo3;
	}

	public void setLoanNo3(String loanNo3) {
		this.loanNo3 = loanNo3;
	}

	/**       
	 * 贷款相关号4
	 */

	@Column(name = "loanno4")
	public String getLoanNo4() {
		return this.loanNo4;
	}

	public void setLoanNo4(String loanNo4) {
		this.loanNo4 = loanNo4;
	}

	/**       
	 * 贷款相关号5
	 */

	@Column(name = "loanno5")
	public String getLoanNo5() {
		return this.loanNo5;
	}

	public void setLoanNo5(String loanNo5) {
		this.loanNo5 = loanNo5;
	}

	/**       
	 * 贷款合同号
	 */

	@Column(name = "loancontractno")
	public String getLoanContractNo() {
		return this.loanContractNo;
	}

	public void setLoanContractNo(String loanContractNo) {
		this.loanContractNo = loanContractNo;
	}

	/**       
	 * 保额确定方式编码
	 */

	@Column(name = "loanway")
	public String getLoanWay() {
		return this.loanWay;
	}

	public void setLoanWay(String loanWay) {
		this.loanWay = loanWay;
	}

	/**       
	 * 贷款性质代码
	 */

	@Column(name = "loannature")
	public String getLoanNature() {
		return this.loanNature;
	}

	public void setLoanNature(String loanNature) {
		this.loanNature = loanNature;
	}

	/**       
	 * 贷款方式（车贷）
	 */

	@Column(name = "loantype")
	public String getLoanType() {
		return this.loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	/**       
	 * 贷款银行代码
	 */

	@Column(name = "loanbankcode")
	public String getLoanBankCode() {
		return this.loanBankCode;
	}

	public void setLoanBankCode(String loanBankCode) {
		this.loanBankCode = loanBankCode;
	}

	/**       
	 * 贷款银行名称
	 */

	@Column(name = "loanbankname")
	public String getLoanBankName() {
		return this.loanBankName;
	}

	public void setLoanBankName(String loanBankName) {
		this.loanBankName = loanBankName;
	}

	/**       
	 * 贷款用途
	 */

	@Column(name = "loanusage")
	public String getLoanUsage() {
		return this.loanUsage;
	}

	public void setLoanUsage(String loanUsage) {
		this.loanUsage = loanUsage;
	}

	/**       
	 * 贷款期限开始日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "loanstartdate")
	public Date getLoanStartDate() {
		return this.loanStartDate;
	}

	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	/**       
	 * 贷款期限终止日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "loanenddate")
	public Date getLoanEndDate() {
		return this.loanEndDate;
	}

	public void setLoanEndDate(Date loanEndDate) {
		this.loanEndDate = loanEndDate;
	}

	/**       
	 * 贷款年限
	 */

	@Column(name = "loanyear")
	public Integer getLoanYear() {
		return this.loanYear;
	}

	public void setLoanYear(Integer loanYear) {
		this.loanYear = loanYear;
	}

	/**       
	 * 初装金额
	 */

	@Column(name = "planamount")
	public BigDecimal getPlanAmount() {
		return this.planAmount;
	}

	public void setPlanAmount(BigDecimal planAmount) {
		this.planAmount = planAmount;
	}

	/**       
	 * 单位保险金额
	 */

	@Column(name = "unitamount")
	public BigDecimal getUnitAmount() {
		return this.unitAmount;
	}

	public void setUnitAmount(BigDecimal unitAmount) {
		this.unitAmount = unitAmount;
	}

	/**       
	 * 首付比例
	 */

	@Column(name = "firstrate")
	public BigDecimal getFirstRate() {
		return this.firstRate;
	}

	public void setFirstRate(BigDecimal firstRate) {
		this.firstRate = firstRate;
	}

	/**       
	 * 首期付款金额
	 */

	@Column(name = "firstpaid")
	public BigDecimal getFirstPaid() {
		return this.firstPaid;
	}

	public void setFirstPaid(BigDecimal firstPaid) {
		this.firstPaid = firstPaid;
	}

	/**       
	 * 币别
	 */

	@Column(name = "currency")
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**       
	 * 贷款金额
	 */

	@Column(name = "loanamount")
	public BigDecimal getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**       
	 * 贷款利率/本息
	 */

	@Column(name = "loanrate")
	public BigDecimal getLoanRate() {
		return this.loanRate;
	}

	public void setLoanRate(BigDecimal loanRate) {
		this.loanRate = loanRate;
	}

	/**       
	 * 还款方式
	 */

	@Column(name = "repaidtype")
	public String getRepaidType() {
		return this.repaidType;
	}

	public void setRepaidType(String repaidType) {
		this.repaidType = repaidType;
	}

	/**       
	 * 约定付款期数
	 */

	@Column(name = "paidtimes")
	public Integer getPaidTimes() {
		return this.paidTimes;
	}

	public void setPaidTimes(Integer paidTimes) {
		this.paidTimes = paidTimes;
	}

	/**       
	 * 每期还款金额
	 */

	@Column(name = "perrepaidamount")
	public BigDecimal getPerRepaidAmount() {
		return this.perRepaidAmount;
	}

	public void setPerRepaidAmount(BigDecimal perRepaidAmount) {
		this.perRepaidAmount = perRepaidAmount;
	}

	/**       
	 * 备注
	 */

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**       
	 * 短信转存后是否删除标记
	 */

	@Column(name = "flag")
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**       
	 * 插入时间
	 */

	@Column(name = "inserttimeforhis", insertable = false, updatable = false)
	public Date getInsertTimeForHis() {
		return this.insertTimeForHis;
	}

	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}

	/**       
	 * 更新时间
	 */

	@Column(name = "operatetimeforhis", insertable = false)
	public Date getOperateTimeForHis() {
		return this.operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}

	/**
	 * 被保险人自担责任比例
	 */
	 
	@Column(name = "ownliabratio")
	public BigDecimal getOwnLiabRatio() {
		return ownLiabRatio;
	}

	public void setOwnLiabRatio(BigDecimal ownLiabRatio) {
		this.ownLiabRatio = ownLiabRatio;
	}

	/**
	 * 第三方承担责任比例
	 */
	 
	@Column(name = "otherliabratio")
	public BigDecimal getOtherLiabRatio() {
		return otherLiabRatio;
	}

	public void setOtherLiabRatio(BigDecimal otherLiabRatio) {
		this.otherLiabRatio = otherLiabRatio;
	}

	/**
	 * 预留字段1
	 */
	 
	@Column(name = "prechar1")
	public String getPreChar1() {
		return preChar1;
	}

	public void setPreChar1(String preChar1) {
		this.preChar1 = preChar1;
	}

	/**
	 * 预留字段2
	 */
	 
	@Column(name = "prechar2")
	public String getPreChar2() {
		return preChar2;
	}

	public void setPreChar2(String preChar2) {
		this.preChar2 = preChar2;
	}

	/**
	 * 预留字段3
	 */
	 
	@Column(name = "prechar3")
	public String getPreChar3() {
		return preChar3;
	}

	public void setPreChar3(String preChar3) {
		this.preChar3 = preChar3;
	}

	/**
	 * 预留字段4
	 */
	 
	@Column(name = "prechar4")
	public String getPreChar4() {
		return preChar4;
	}

	public void setPreChar4(String preChar4) {
		this.preChar4 = preChar4;
	}

	/**
	 * 首付比例
	 */
	 
	@Column(name = "newfirstrate")
	public BigDecimal getNewFirstRate() {
		return newFirstRate;
	}

	public void setNewFirstRate(BigDecimal newFirstRate) {
		this.newFirstRate = newFirstRate;
	}

	/**
	 * 责任保证金
	 */
	 
	@Column(name = "recognizance")
	public BigDecimal getRecognizance() {
		return recognizance;
	}

	public void setRecognizance(BigDecimal recognizance) {
		this.recognizance = recognizance;
	}

}
