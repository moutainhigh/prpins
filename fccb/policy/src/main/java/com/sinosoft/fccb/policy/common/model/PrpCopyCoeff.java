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

/**
 * PrpCopyCoeff generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcopycoeff")
public class PrpCopyCoeff implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** SerialNo */
	private PrpCopyCoeffId id;
	/** 批单申请号 */
	private PrpCopyMain prpCopyMain;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 对应类型 */
	private String corresType;
	/** 对应条件 */
	private String corresCode;
	/** 系数期数 */
	private Integer coeffPeriod;
	/** 系数代码 */
	private String coeffCode;
	/** 系数名称 */
	private String coeffName;
	/** 选项代码 */
	private String optionCode;
	/** 选择描述 */
	private String optionDesc;
	/** 默认系数 */
	private BigDecimal coefficient;
	/** 币别 */
	private String currency;
	/** 单位标志 */
	private Integer unitFlag;
	/** 系数保费 */
	private BigDecimal coeffPremium;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCopyCoeff() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpCopyCoeffId getId() {
		return this.id;
	}

	public void setId(PrpCopyCoeffId id) {
		this.id = id;
	}

	/**       
	 * 批单申请号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", nullable = false, insertable = false, updatable = false)
	public PrpCopyMain getPrpCopyMain() {
		return this.prpCopyMain;
	}

	public void setPrpCopyMain(PrpCopyMain prpCopyMain) {
		this.prpCopyMain = prpCopyMain;
	}

	/**       
	 * 保单号
	 */

	@Column(name = "policyno", nullable = false)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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
	 * 对应类型
	 */

	@Column(name = "correstype")
	public String getCorresType() {
		return this.corresType;
	}

	public void setCorresType(String corresType) {
		this.corresType = corresType;
	}

	/**       
	 * 对应条件
	 */

	@Column(name = "correscode")
	public String getCorresCode() {
		return this.corresCode;
	}

	public void setCorresCode(String corresCode) {
		this.corresCode = corresCode;
	}

	/**       
	 * 系数期数
	 */

	@Column(name = "coeffperiod", nullable = false)
	public Integer getCoeffPeriod() {
		return this.coeffPeriod;
	}

	public void setCoeffPeriod(Integer coeffPeriod) {
		this.coeffPeriod = coeffPeriod;
	}

	/**       
	 * 系数代码
	 */

	@Column(name = "coeffcode", nullable = false)
	public String getCoeffCode() {
		return this.coeffCode;
	}

	public void setCoeffCode(String coeffCode) {
		this.coeffCode = coeffCode;
	}

	/**       
	 * 系数名称
	 */

	@Column(name = "coeffname")
	public String getCoeffName() {
		return this.coeffName;
	}

	public void setCoeffName(String coeffName) {
		this.coeffName = coeffName;
	}

	/**       
	 * 选项代码
	 */

	@Column(name = "optioncode")
	public String getOptionCode() {
		return this.optionCode;
	}

	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	/**       
	 * 选择描述
	 */

	@Column(name = "optiondesc")
	public String getOptionDesc() {
		return this.optionDesc;
	}

	public void setOptionDesc(String optionDesc) {
		this.optionDesc = optionDesc;
	}

	/**       
	 * 默认系数
	 */

	@Column(name = "coefficient")
	public BigDecimal getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(BigDecimal coefficient) {
		this.coefficient = coefficient;
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
	 * 系数保费
	 */

	@Column(name = "coeffpremium")
	public BigDecimal getCoeffPremium() {
		return this.coeffPremium;
	}

	public void setCoeffPremium(BigDecimal coeffPremium) {
		this.coeffPremium = coeffPremium;
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
	 * 单位标志
	 */
	@Column(name = "unitFlag")
	public Integer getUnitFlag() {
		return unitFlag;
	}

	public void setUnitFlag(Integer unitFlag) {
		this.unitFlag = unitFlag;
	}
}
