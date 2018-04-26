package com.sinosoft.fccb.policy.common.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Prpcopycommissiondetail generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcopycommissiondetail")
public class PrpCopyCommissionDetail implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 顺序号 */
	private PrpCopyCommissionDetailId id;
	/** 批单申请号 */
	private PrpCopyMain prpCopyMain;
	/** 保单号 */
	private String policyNo;
	private String agreementNo;
	private String customerGroupCode;
	private String costType;
	/** 立案/预赔/实赔/结案号 */
	private Integer payNo;
	/** 险种代码 */
	private String riskCode;
	/** 条款编码 */
	private String clauseCode;
	/** 险别代码 */
	private String kindCode;
	/** 总保费 */
	private BigDecimal sumPremium;
	private BigDecimal costRate;
	private BigDecimal costRateUpper;
	private String adjustFlag;
	private String upperFlag;
	private BigDecimal auditRate;
	/** 医疗审核标志 */
	private String auditFlag;
	/** 共保份额 */
	private BigDecimal coinsRate;
	private String coinsDeduct;
	/** 币别 */
	private String currency;
	private BigDecimal costFee;
	/** 配置项代码 */
	private String configCode;
	/** 是否分期 */
	private String amortizeFlag;
	/** 跟单维度 */
	private String clauseKindFlag;
	/** 备注 */
	private String remark;
	/** 标志字段 */
	private String flag;
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	//RYANGQH2012122802 费用跟单录入时，增加职称佣金的录入项 add by zhangzemin 2013-05-08 start
	private BigDecimal levelRate;
	private BigDecimal levelMaxRate;
	//RYANGQH2012122802 费用跟单录入时，增加职称佣金的录入项 add by zhangzemin 2013-05-08 end
	//201606273-007 营改增项目_佣金管理系统改造需求 mod by hanc 20160704 begin
	//是否净保费提佣金标识
	private String isNetFlag;

	public PrpCopyCommissionDetail() {
	}

	/**       
	 * 顺序号
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno")),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno")) })
	public PrpCopyCommissionDetailId getId() {
		return this.id;
	}

	public void setId(PrpCopyCommissionDetailId id) {
		this.id = id;
	}
	/**       
	 * 批单申请号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", unique = true, nullable = false, insertable = false, updatable = false)
	public PrpCopyMain getPrpCopyMain() {
		return this.prpCopyMain;
	}

	public void setPrpCopyMain(PrpCopyMain prpCopyMain) {
		this.prpCopyMain = prpCopyMain;
	}
	/**       
	 * 保单号
	 */

	@Column(name = "policyno")
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "agreementno")
	public String getAgreementNo() {
		return this.agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	@Column(name = "customergroupcode")
	public String getCustomerGroupCode() {
		return this.customerGroupCode;
	}

	public void setCustomerGroupCode(String customerGroupCode) {
		this.customerGroupCode = customerGroupCode;
	}

	@Column(name = "costtype")
	public String getCostType() {
		return this.costType;
	}

	public void setCostType(String costType) {
		this.costType = costType;
	}

	/**       
	 * 立案/预赔/实赔/结案号
	 */

	@Column(name = "payno")
	public Integer getPayNo() {
		return this.payNo;
	}

	public void setPayNo(Integer payNo) {
		this.payNo = payNo;
	}

	/**       
	 * 险种代码
	 */

	@Column(name = "riskcode")
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	/**       
	 * 条款编码
	 */

	@Column(name = "clausecode")
	public String getClauseCode() {
		return this.clauseCode;
	}

	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}

	/**       
	 * 险别代码
	 */

	@Column(name = "kindcode")
	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}
	
	/**       
	 * 总保费
	 */
	@Column(name = "SUMPREMIUM")
	public BigDecimal getSumPremium() {
		if(sumPremium==null)
		{
			sumPremium = BigDecimal.ZERO;
		}
		return this.sumPremium;
	}

	public void setSumPremium(BigDecimal sumPremium) {
		this.sumPremium = sumPremium;
	}
	
	@Column(name = "costrate")
	public BigDecimal getCostRate() {
		return this.costRate;
	}

	public void setCostRate(BigDecimal costRate) {
		this.costRate = costRate;
	}

	@Column(name = "costrateupper")
	public BigDecimal getCostRateUpper() {
		return this.costRateUpper;
	}

	public void setCostRateUpper(BigDecimal costRateUpper) {
		this.costRateUpper = costRateUpper;
	}

	@Column(name = "adjustflag")
	public String getAdjustFlag() {
		return this.adjustFlag;
	}

	public void setAdjustFlag(String adjustFlag) {
		this.adjustFlag = adjustFlag;
	}

	@Column(name = "upperflag")
	public String getUpperFlag() {
		return this.upperFlag;
	}

	public void setUpperFlag(String upperFlag) {
		this.upperFlag = upperFlag;
	}

	@Column(name = "auditrate")
	public BigDecimal getAuditRate() {
		return this.auditRate;
	}

	public void setAuditRate(BigDecimal auditRate) {
		this.auditRate = auditRate;
	}

	/**       
	 * 医疗审核标志
	 */

	@Column(name = "auditflag")
	public String getAuditFlag() {
		return this.auditFlag;
	}

	public void setAuditFlag(String auditFlag) {
		this.auditFlag = auditFlag;
	}

	/**       
	 * 共保份额
	 */

	@Column(name = "coinsrate")
	public BigDecimal getCoinsRate() {
		return this.coinsRate;
	}

	public void setCoinsRate(BigDecimal coinsRate) {
		this.coinsRate = coinsRate;
	}

	@Column(name = "coinsdeduct")
	public String getCoinsDeduct() {
		return this.coinsDeduct;
	}

	public void setCoinsDeduct(String coinsDeduct) {
		this.coinsDeduct = coinsDeduct;
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

	@Column(name = "costfee")
	public BigDecimal getCostFee() {
		return this.costFee;
	}

	public void setCostFee(BigDecimal costFee) {
		this.costFee = costFee;
	}

	/**       
	 * 配置项代码
	 */

	@Column(name = "configcode")
	public String getConfigCode() {
		return this.configCode;
	}

	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}
	@Column(name = "amortizeflag")
	public String getAmortizeFlag() {
		return amortizeFlag;
	}

	public void setAmortizeFlag(String amortizeFlag) {
		this.amortizeFlag = amortizeFlag;
	}
	@Column(name = "clausekindflag")
	public String getClauseKindFlag() {
		return clauseKindFlag;
	}

	public void setClauseKindFlag(String clauseKindFlag) {
		this.clauseKindFlag = clauseKindFlag;
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
	 * 标志字段
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
	/*
	 * 职级佣金比例
	 */
	@Column(name = "levelrate")
	public BigDecimal getLevelRate() {
		return levelRate;
	}

	public void setLevelRate(BigDecimal levelRate) {
		this.levelRate = levelRate;
	}
	/*
	 * 职级佣金比例上限
	 */
	@Column(name = "levelmaxrate")
	public BigDecimal getLevelMaxRate() {
		return levelMaxRate;
	}

	public void setLevelMaxRate(BigDecimal levelMaxRate) {
		this.levelMaxRate = levelMaxRate;
	}

	@Column(name = "isnetflag")
	public String getIsNetFlag() {
		return isNetFlag;
	}

	public void setIsNetFlag(String isNetFlag) {
		this.isNetFlag = isNetFlag;
	}

}
