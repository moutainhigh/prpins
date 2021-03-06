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
 * PrpCcarShipTax generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpccarshiptax")
public class PrpCcarShipTax implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 投保单号码 */
	private PrpCcarShipTaxId id;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 险种代码 */
	private String riskCode;
	/** 车牌号码 */
	private String licenseNo;
	/** 车牌种类 */
	private String licenseType;
	/** 车牌底色代码 */
	private String licenseColorCode;
	/** 车型 */
	private String model;
	/** 车辆种类代码 */
	private String carKindCode;
	/** EngineNo */
	private String engineNo;
	/** VIN号 */
	private String vinNo;
	/** 车架号 */
	private String frameNo;
	/** 初登日期 */
	private Date enrollDate;
	/** 座位数 */
	private BigDecimal seatCount;
	/** 整备质量 */
	private BigDecimal carLotEquQuality;
	/** 纳税人代码 */
	private String taxPayerCode;
	/** 纳税人名称 */
	private String taxPayerName;
	/** 纳税人性质 */
	private String taxPayerNature;
	/** 纳税人身份证号码 */
	private String taxPayerIdentNo;
	/** 纳税人识别号 */
	private String taxPayerNumber;
	/** 纳税类型 */
	private String taxType;
	/** 纳税说明 */
	private String taxExplanation;
	/** 减免税原因 */
	private String taxAbateReason;
	/** 减免税方案 */
	private String taxAbateType;
	/** 减免税金额 */
	private BigDecimal taxAbateAmount;
	/** 开具税务机关代码 */
	private String taxComCode;
	/** 开具税务机关名称 */
	private String taxComName;
	/** 完税凭证号/减免税证明号 */
	private String dutyPaidProofNo;
	/** 完税证明号 */
	private String taxPrintProofNo;
	/** 税目代码 */
	private String taxItemCode;
	/** 税目名称 */
	private String taxItemName;
	/** 计税标准 */
	private String baseTaxation;
	/** 计税单位 */
	private String taxUnit;
	/** 年单位税额 */
	private BigDecimal taxUnitAmount;
	/** 前次缴税年度 */
	private String prePayTaxYear;
	/** 前次交强险终保日期 */
	private Date prePolicyEndDate;
	/** 币别 */
	private String currency;
	/** 本年应缴税额 */
	private BigDecimal thisPayTax;
	/** 本年缴费起始日期 */
	private Date payStartDate;
	/** 本年缴费终止日期 */
	private Date payEndDate;
	/** 往年补缴税额 */
	private BigDecimal prePayTax;
	/** 滞纳金 */
	private BigDecimal delayPayTax;
	/** 滞纳金起始日期 */
	private Date delayStartDate;
	/** 滞纳金终止日期 */
	private Date delayEndDate;
	/** 总缴付税额 */
	private BigDecimal sumPayTax;
	/** 纳税申报日期 */
	private Date leviedDate;
	/** 扩展字段1(字符) */
	private String extendChar1;
	/** 扩展字段2(字符) */
	private String extendChar2;
	/** 扩展字段1(数字) */
	private BigDecimal extendNum1;
	/** 扩展字段2(数字) */
	private BigDecimal extendNum2;
	/** 备注 */
	private String remark;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 车船税标志 */
	private String taxRelifFlag;
	/** 计算方式 */
	private String calculateMode;
	/** TaxAbateRate */
	private BigDecimal taxAbateRate;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCcarShipTax() {
	}

	/**       
	 * 投保单号码
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "itemNo", column = @Column(name = "itemno", nullable = false)),
			@AttributeOverride(name = "proposalNo", column = @Column(name = "proposalno", nullable = false)) })
	public PrpCcarShipTaxId getId() {
		return this.id;
	}

	public void setId(PrpCcarShipTaxId id) {
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
	 * 车牌号码
	 */

	@Column(name = "licenseno")
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	/**       
	 * 车牌种类
	 */

	@Column(name = "licensetype")
	public String getLicenseType() {
		return this.licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	/**       
	 * 车牌底色代码
	 */

	@Column(name = "licensecolorcode")
	public String getLicenseColorCode() {
		return this.licenseColorCode;
	}

	public void setLicenseColorCode(String licenseColorCode) {
		this.licenseColorCode = licenseColorCode;
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
	 * 车辆种类代码
	 */

	@Column(name = "carkindcode")
	public String getCarKindCode() {
		return this.carKindCode;
	}

	public void setCarKindCode(String carKindCode) {
		this.carKindCode = carKindCode;
	}

	/**       
	 * EngineNo
	 */

	@Column(name = "engineno")
	public String getEngineNo() {
		return this.engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	/**       
	 * VIN号
	 */

	@Column(name = "vinno")
	public String getVinNo() {
		return this.vinNo;
	}

	public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}

	/**       
	 * 车架号
	 */

	@Column(name = "frameno")
	public String getFrameNo() {
		return this.frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	/**       
	 * 初登日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "enrolldate")
	public Date getEnrollDate() {
		return this.enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	/**       
	 * 座位数
	 */

	@Column(name = "seatcount")
	public BigDecimal getSeatCount() {
		return this.seatCount;
	}

	public void setSeatCount(BigDecimal seatCount) {
		this.seatCount = seatCount;
	}

	/**       
	 * 整备质量
	 */

	@Column(name = "carloteququality")
	public BigDecimal getCarLotEquQuality() {
		return this.carLotEquQuality;
	}

	public void setCarLotEquQuality(BigDecimal carLotEquQuality) {
		this.carLotEquQuality = carLotEquQuality;
	}

	/**       
	 * 纳税人代码
	 */

	@Column(name = "taxpayercode")
	public String getTaxPayerCode() {
		return this.taxPayerCode;
	}

	public void setTaxPayerCode(String taxPayerCode) {
		this.taxPayerCode = taxPayerCode;
	}

	/**       
	 * 纳税人名称
	 */

	@Column(name = "taxpayername")
	public String getTaxPayerName() {
		return this.taxPayerName;
	}

	public void setTaxPayerName(String taxPayerName) {
		this.taxPayerName = taxPayerName;
	}

	/**       
	 * 纳税人性质
	 */

	@Column(name = "taxpayernature")
	public String getTaxPayerNature() {
		return this.taxPayerNature;
	}

	public void setTaxPayerNature(String taxPayerNature) {
		this.taxPayerNature = taxPayerNature;
	}

	/**       
	 * 纳税人身份证号码
	 */

	@Column(name = "taxpayeridentno")
	public String getTaxPayerIdentNo() {
		return this.taxPayerIdentNo;
	}

	public void setTaxPayerIdentNo(String taxPayerIdentNo) {
		this.taxPayerIdentNo = taxPayerIdentNo;
	}

	/**       
	 * 纳税人识别号
	 */

	@Column(name = "taxpayernumber")
	public String getTaxPayerNumber() {
		return this.taxPayerNumber;
	}

	public void setTaxPayerNumber(String taxPayerNumber) {
		this.taxPayerNumber = taxPayerNumber;
	}

	/**       
	 * 纳税类型
	 */

	@Column(name = "taxtype")
	public String getTaxType() {
		return this.taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	/**       
	 * 纳税说明
	 */

	@Column(name = "taxexplanation")
	public String getTaxExplanation() {
		return this.taxExplanation;
	}

	public void setTaxExplanation(String taxExplanation) {
		this.taxExplanation = taxExplanation;
	}

	/**       
	 * 减免税原因
	 */

	@Column(name = "taxabatereason")
	public String getTaxAbateReason() {
		return this.taxAbateReason;
	}

	public void setTaxAbateReason(String taxAbateReason) {
		this.taxAbateReason = taxAbateReason;
	}

	/**       
	 * 减免税方案
	 */

	@Column(name = "taxabatetype")
	public String getTaxAbateType() {
		return this.taxAbateType;
	}

	public void setTaxAbateType(String taxAbateType) {
		this.taxAbateType = taxAbateType;
	}

	/**       
	 * 减免税金额
	 */

	@Column(name = "taxabateamount")
	public BigDecimal getTaxAbateAmount() {
		return this.taxAbateAmount;
	}

	public void setTaxAbateAmount(BigDecimal taxAbateAmount) {
		this.taxAbateAmount = taxAbateAmount;
	}

	/**       
	 * 开具税务机关代码
	 */

	@Column(name = "taxcomcode")
	public String getTaxComCode() {
		return this.taxComCode;
	}

	public void setTaxComCode(String taxComCode) {
		this.taxComCode = taxComCode;
	}

	/**       
	 * 开具税务机关名称
	 */

	@Column(name = "taxcomname")
	public String getTaxComName() {
		return this.taxComName;
	}

	public void setTaxComName(String taxComName) {
		this.taxComName = taxComName;
	}

	/**       
	 * 完税凭证号/减免税证明号
	 */

	@Column(name = "dutypaidproofno")
	public String getDutyPaidProofNo() {
		return this.dutyPaidProofNo;
	}

	public void setDutyPaidProofNo(String dutyPaidProofNo) {
		this.dutyPaidProofNo = dutyPaidProofNo;
	}

	/**       
	 * 完税证明号
	 */

	@Column(name = "taxprintproofno")
	public String getTaxPrintProofNo() {
		return this.taxPrintProofNo;
	}

	public void setTaxPrintProofNo(String taxPrintProofNo) {
		this.taxPrintProofNo = taxPrintProofNo;
	}

	/**       
	 * 税目代码
	 */

	@Column(name = "taxitemcode")
	public String getTaxItemCode() {
		return this.taxItemCode;
	}

	public void setTaxItemCode(String taxItemCode) {
		this.taxItemCode = taxItemCode;
	}

	/**       
	 * 税目名称
	 */

	@Column(name = "taxitemname")
	public String getTaxItemName() {
		return this.taxItemName;
	}

	public void setTaxItemName(String taxItemName) {
		this.taxItemName = taxItemName;
	}

	/**       
	 * 计税标准
	 */

	@Column(name = "basetaxation")
	public String getBaseTaxation() {
		return this.baseTaxation;
	}

	public void setBaseTaxation(String baseTaxation) {
		this.baseTaxation = baseTaxation;
	}

	/**       
	 * 计税单位
	 */

	@Column(name = "taxunit")
	public String getTaxUnit() {
		return this.taxUnit;
	}

	public void setTaxUnit(String taxUnit) {
		this.taxUnit = taxUnit;
	}

	/**       
	 * 年单位税额
	 */

	@Column(name = "taxunitamount")
	public BigDecimal getTaxUnitAmount() {
		return this.taxUnitAmount;
	}

	public void setTaxUnitAmount(BigDecimal taxUnitAmount) {
		this.taxUnitAmount = taxUnitAmount;
	}

	/**       
	 * 前次缴税年度
	 */

	@Column(name = "prepaytaxyear")
	public String getPrePayTaxYear() {
		return this.prePayTaxYear;
	}

	public void setPrePayTaxYear(String prePayTaxYear) {
		this.prePayTaxYear = prePayTaxYear;
	}

	/**       
	 * 前次交强险终保日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "prepolicyenddate")
	public Date getPrePolicyEndDate() {
		return this.prePolicyEndDate;
	}

	public void setPrePolicyEndDate(Date prePolicyEndDate) {
		this.prePolicyEndDate = prePolicyEndDate;
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
	 * 本年应缴税额
	 */

	@Column(name = "thispaytax")
	public BigDecimal getThisPayTax() {
		return this.thisPayTax;
	}

	public void setThisPayTax(BigDecimal thisPayTax) {
		this.thisPayTax = thisPayTax;
	}

	/**       
	 * 本年缴费起始日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "paystartdate")
	public Date getPayStartDate() {
		return this.payStartDate;
	}

	public void setPayStartDate(Date payStartDate) {
		this.payStartDate = payStartDate;
	}

	/**       
	 * 本年缴费终止日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "payenddate")
	public Date getPayEndDate() {
		return this.payEndDate;
	}

	public void setPayEndDate(Date payEndDate) {
		this.payEndDate = payEndDate;
	}

	/**       
	 * 往年补缴税额
	 */

	@Column(name = "prepaytax")
	public BigDecimal getPrePayTax() {
		return this.prePayTax;
	}

	public void setPrePayTax(BigDecimal prePayTax) {
		this.prePayTax = prePayTax;
	}

	/**       
	 * 滞纳金
	 */

	@Column(name = "delaypaytax")
	public BigDecimal getDelayPayTax() {
		return this.delayPayTax;
	}

	public void setDelayPayTax(BigDecimal delayPayTax) {
		this.delayPayTax = delayPayTax;
	}

	/**       
	 * 滞纳金起始日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "delaystartdate")
	public Date getDelayStartDate() {
		return this.delayStartDate;
	}

	public void setDelayStartDate(Date delayStartDate) {
		this.delayStartDate = delayStartDate;
	}

	/**       
	 * 滞纳金终止日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "delayenddate")
	public Date getDelayEndDate() {
		return this.delayEndDate;
	}

	public void setDelayEndDate(Date delayEndDate) {
		this.delayEndDate = delayEndDate;
	}

	/**       
	 * 总缴付税额
	 */

	@Column(name = "sumpaytax")
	public BigDecimal getSumPayTax() {
		return this.sumPayTax;
	}

	public void setSumPayTax(BigDecimal sumPayTax) {
		this.sumPayTax = sumPayTax;
	}

	/**       
	 * 纳税申报日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "levieddate")
	public Date getLeviedDate() {
		return this.leviedDate;
	}

	public void setLeviedDate(Date leviedDate) {
		this.leviedDate = leviedDate;
	}

	/**       
	 * 扩展字段1(字符)
	 */

	@Column(name = "extendchar1")
	public String getExtendChar1() {
		return this.extendChar1;
	}

	public void setExtendChar1(String extendChar1) {
		this.extendChar1 = extendChar1;
	}

	/**       
	 * 扩展字段2(字符)
	 */

	@Column(name = "extendchar2")
	public String getExtendChar2() {
		return this.extendChar2;
	}

	public void setExtendChar2(String extendChar2) {
		this.extendChar2 = extendChar2;
	}

	/**       
	 * 扩展字段1(数字)
	 */

	@Column(name = "extendnum1")
	public BigDecimal getExtendNum1() {
		return this.extendNum1;
	}

	public void setExtendNum1(BigDecimal extendNum1) {
		this.extendNum1 = extendNum1;
	}

	/**       
	 * 扩展字段2(数字)
	 */

	@Column(name = "extendnum2")
	public BigDecimal getExtendNum2() {
		return this.extendNum2;
	}

	public void setExtendNum2(BigDecimal extendNum2) {
		this.extendNum2 = extendNum2;
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
	 * 车船税标志
	 */

	@Column(name = "taxrelifflag")
	public String getTaxRelifFlag() {
		return this.taxRelifFlag;
	}

	public void setTaxRelifFlag(String taxRelifFlag) {
		this.taxRelifFlag = taxRelifFlag;
	}

	/**       
	 * 计算方式
	 */

	@Column(name = "calculatemode")
	public String getCalculateMode() {
		return this.calculateMode;
	}

	public void setCalculateMode(String calculateMode) {
		this.calculateMode = calculateMode;
	}

	/**       
	 * TaxAbateRate
	 */

	@Column(name = "taxabaterate")
	public BigDecimal getTaxAbateRate() {
		return this.taxAbateRate;
	}

	public void setTaxAbateRate(BigDecimal taxAbateRate) {
		this.taxAbateRate = taxAbateRate;
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
