package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PrpCguaranty generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcguaranty")
public class PrpCguaranty implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** SerialNo */
	private PrpCguarantyId id;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 险种代码 */
	private String riskCode;
	/** 担保方式 */
	private String guaranteeType;
	/** 质押方式 */
	private String inpawnType;
	/** 抵(质)押合同号 */
	private String mortgageNo;
	/** 权人类别 */
	private String obligeeType;
	/** 抵押（出质）人名称 */
	private String warrantorName;
	/** 抵押（质）权人 */
	private String guarantyObligee;
	/** 担保物名称 */
	private String guarantyName;
	/** 车型 */
	private String model;
	/** 担保物计量单位 */
	private String unit;
	/** 数量 */
	private Integer quantity;
	/** 担保物所有权属 */
	private String possessor;
	/** 担保物所在处所 */
	private String guarantyAddress;
	/** 担保物保管人 */
	private String guarantyKeeper;
	/** 产权证书号 */
	private String propCertifNo;
	/** 担保物评估价值 */
	private BigDecimal guarantyAssessment;
	/** 已经为其他债权设定额度 */
	private BigDecimal otherRating;
	/** 质押物质量状况 */
	private String inpawnQuality;
	/** 质押物帐面原值 */
	private BigDecimal originalValue;
	/** 质押物净值 */
	private BigDecimal netValue;
	/** 评估人 */
	private String valuator;
	/** 权利有效期 */
	private Date rightValidPeriod;
	/** 提货或兑现期 */
	private Date encashDate;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCguaranty() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "proposalNo", column = @Column(name = "proposalno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpCguarantyId getId() {
		return this.id;
	}

	public void setId(PrpCguarantyId id) {
		this.id = id;
	}

	/**       
	 * 投保单号码
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proposalno", nullable = false, insertable = false, updatable = false)
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

	@Column(name = "guaranteetype", nullable = false)
	public String getGuaranteeType() {
		return this.guaranteeType;
	}

	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}

	/**       
	 * 质押方式
	 */

	@Column(name = "inpawntype")
	public String getInpawnType() {
		return this.inpawnType;
	}

	public void setInpawnType(String inpawnType) {
		this.inpawnType = inpawnType;
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
	 * 权人类别
	 */

	@Column(name = "obligeetype")
	public String getObligeeType() {
		return this.obligeeType;
	}

	public void setObligeeType(String obligeeType) {
		this.obligeeType = obligeeType;
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
	 * 抵押（质）权人
	 */

	@Column(name = "guarantyobligee")
	public String getGuarantyObligee() {
		return this.guarantyObligee;
	}

	public void setGuarantyObligee(String guarantyObligee) {
		this.guarantyObligee = guarantyObligee;
	}

	/**       
	 * 担保物名称
	 */

	@Column(name = "guarantyname")
	public String getGuarantyName() {
		return this.guarantyName;
	}

	public void setGuarantyName(String guarantyName) {
		this.guarantyName = guarantyName;
	}

	/**       
	 * 车型
	 */

	@Column(name = "model")
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	/**       
	 * 担保物计量单位
	 */

	@Column(name = "unit")
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**       
	 * 数量
	 */

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**       
	 * 担保物所有权属
	 */

	@Column(name = "possessor")
	public String getPossessor() {
		return this.possessor;
	}

	public void setPossessor(String possessor) {
		this.possessor = possessor;
	}

	/**       
	 * 担保物所在处所
	 */

	@Column(name = "guarantyaddress")
	public String getGuarantyAddress() {
		return this.guarantyAddress;
	}

	public void setGuarantyAddress(String guarantyAddress) {
		this.guarantyAddress = guarantyAddress;
	}

	/**       
	 * 担保物保管人
	 */

	@Column(name = "guarantykeeper")
	public String getGuarantyKeeper() {
		return this.guarantyKeeper;
	}

	public void setGuarantyKeeper(String guarantyKeeper) {
		this.guarantyKeeper = guarantyKeeper;
	}

	/**       
	 * 产权证书号
	 */

	@Column(name = "propcertifno")
	public String getPropCertifNo() {
		return this.propCertifNo;
	}

	public void setPropCertifNo(String propCertifNo) {
		this.propCertifNo = propCertifNo;
	}

	/**       
	 * 担保物评估价值
	 */

	@Column(name = "guarantyassessment")
	public BigDecimal getGuarantyAssessment() {
		return this.guarantyAssessment;
	}

	public void setGuarantyAssessment(BigDecimal guarantyAssessment) {
		this.guarantyAssessment = guarantyAssessment;
	}

	/**       
	 * 已经为其他债权设定额度
	 */

	@Column(name = "otherrating")
	public BigDecimal getOtherRating() {
		return this.otherRating;
	}

	public void setOtherRating(BigDecimal otherRating) {
		this.otherRating = otherRating;
	}

	/**       
	 * 质押物质量状况
	 */

	@Column(name = "inpawnquality")
	public String getInpawnQuality() {
		return this.inpawnQuality;
	}

	public void setInpawnQuality(String inpawnQuality) {
		this.inpawnQuality = inpawnQuality;
	}

	/**       
	 * 质押物帐面原值
	 */

	@Column(name = "originalvalue")
	public BigDecimal getOriginalValue() {
		return this.originalValue;
	}

	public void setOriginalValue(BigDecimal originalValue) {
		this.originalValue = originalValue;
	}

	/**       
	 * 质押物净值
	 */

	@Column(name = "netvalue")
	public BigDecimal getNetValue() {
		return this.netValue;
	}

	public void setNetValue(BigDecimal netValue) {
		this.netValue = netValue;
	}

	/**       
	 * 评估人
	 */

	@Column(name = "valuator")
	public String getValuator() {
		return this.valuator;
	}

	public void setValuator(String valuator) {
		this.valuator = valuator;
	}

	/**       
	 * 权利有效期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "rightvalidperiod")
	public Date getRightValidPeriod() {
		return this.rightValidPeriod;
	}

	public void setRightValidPeriod(Date rightValidPeriod) {
		this.rightValidPeriod = rightValidPeriod;
	}

	/**       
	 * 提货或兑现期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "encashdate")
	public Date getEncashDate() {
		return this.encashDate;
	}

	public void setEncashDate(Date encashDate) {
		this.encashDate = encashDate;
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

}
