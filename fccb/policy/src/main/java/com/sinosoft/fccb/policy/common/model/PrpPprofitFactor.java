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
 * PrpPprofitFactor generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppprofitfactor")
public class PrpPprofitFactor implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 优惠折扣代码 */
	private PrpPprofitFactorId id;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 保单号 */
	private String policyNo;
	/** 费率 */
	private BigDecimal rate;
	/** 险种代码 */
	private String riskCode;
	/** 优惠折扣名称 */
	private String profitName;
	/** 条件描述 */
	private String condition;
	/** 优惠折扣标准比率上限(%) */
	private BigDecimal upperRate;
	/** 优惠折扣标准比率下限(%) */
	private BigDecimal lowerRate;
	/** 批单号 */
	private String endorseNo;
	/** 该条件是否选中标志 */
	private String chooseFlag;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpPprofitFactor() {
	}

	/**       
	 * 优惠折扣代码
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "profitCode", column = @Column(name = "profitcode", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)),
			@AttributeOverride(name = "conditionCode", column = @Column(name = "conditioncode", nullable = false)) })
	public PrpPprofitFactorId getId() {
		return this.id;
	}

	public void setId(PrpPprofitFactorId id) {
		this.id = id;
	}

	/**       
	 * 批单申请号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", nullable = false, insertable = false, updatable = false)
	public PrpPhead getPrpPhead() {
		return this.prpPhead;
	}

	public void setPrpPhead(PrpPhead prpPhead) {
		this.prpPhead = prpPhead;
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
	 * 费率
	 */

	@Column(name = "rate")
	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
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
	 * 优惠折扣名称
	 */

	@Column(name = "profitname")
	public String getProfitName() {
		return this.profitName;
	}

	public void setProfitName(String profitName) {
		this.profitName = profitName;
	}

	/**       
	 * 条件描述
	 */

	@Column(name = "condition")
	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**       
	 * 优惠折扣标准比率上限(%)
	 */

	@Column(name = "upperrate")
	public BigDecimal getUpperRate() {
		return this.upperRate;
	}

	public void setUpperRate(BigDecimal upperRate) {
		this.upperRate = upperRate;
	}

	/**       
	 * 优惠折扣标准比率下限(%)
	 */

	@Column(name = "lowerrate")
	public BigDecimal getLowerRate() {
		return this.lowerRate;
	}

	public void setLowerRate(BigDecimal lowerRate) {
		this.lowerRate = lowerRate;
	}

	/**       
	 * 批单号
	 */

	@Column(name = "endorseno")
	public String getEndorseNo() {
		return this.endorseNo;
	}

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}

	/**       
	 * 该条件是否选中标志
	 */

	@Column(name = "chooseflag")
	public String getChooseFlag() {
		return this.chooseFlag;
	}

	public void setChooseFlag(String chooseFlag) {
		this.chooseFlag = chooseFlag;
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
