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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PrpCopyProfitDetail generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcopyprofitdetail")
public class PrpCopyProfitDetail implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** SerialNo */
	private PrpCopyProfitDetailId id;
	/** 优惠折扣类型 */
	private PrpCopyProfit prpCopyProfit;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 期次 */
	private Integer profitPeriod;
	/** 险别代码 */
	private String kindCode;
	/** 险别名称 */
	private String kindName;
	/** 优惠折扣名称 */
	private String profitName;
	/** 优惠折扣代码 */
	private String conditionCode;
	/** 条件描述 */
	private String condition;
	/** 条件具体值 */
	private BigDecimal fieldvalue;
	/** 优惠折扣标准比率上限 */
	private BigDecimal profitRateMax;
	/** 优惠折扣标准比率下限 */
	private BigDecimal profitRateMin;
	/** 实际优惠折扣比率 */
	private BigDecimal profitRate;
	/** 该条件是否选中标志 */
	private String chooseFlag;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCopyProfitDetail() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "itemKindNo", column = @Column(name = "itemkindno", nullable = false)),
			@AttributeOverride(name = "profitType", column = @Column(name = "profittype", nullable = false)),
			@AttributeOverride(name = "profitCode", column = @Column(name = "profitcode", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpCopyProfitDetailId getId() {
		return this.id;
	}

	public void setId(PrpCopyProfitDetailId id) {
		this.id = id;
	}

	/**       
	 * 优惠折扣类型
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "applyno", referencedColumnName="applyno", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "itemkindno", referencedColumnName="itemkindno", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "profittype", referencedColumnName="profittype", nullable = false, insertable = false, updatable = false) })
	public PrpCopyProfit getPrpCopyProfit() {
		return this.prpCopyProfit;
	}

	public void setPrpCopyProfit(PrpCopyProfit prpCopyProfit) {
		this.prpCopyProfit = prpCopyProfit;
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
	 * 期次
	 */

	@Column(name = "profitperiod", nullable = false)
	public Integer getProfitPeriod() {
		return this.profitPeriod;
	}

	public void setProfitPeriod(Integer profitPeriod) {
		this.profitPeriod = profitPeriod;
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
	 * 险别名称
	 */

	@Column(name = "kindname")
	public String getKindName() {
		return this.kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
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
	 * 优惠折扣代码
	 */

	@Column(name = "conditioncode", nullable = false)
	public String getConditionCode() {
		return this.conditionCode;
	}

	public void setConditionCode(String conditionCode) {
		this.conditionCode = conditionCode;
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
	 * 条件具体值
	 */

	@Column(name = "fieldvalue")
	public BigDecimal getFieldvalue() {
		return this.fieldvalue;
	}

	public void setFieldvalue(BigDecimal fieldvalue) {
		this.fieldvalue = fieldvalue;
	}

	/**       
	 * 优惠折扣标准比率上限
	 */

	@Column(name = "profitratemax")
	public BigDecimal getProfitRateMax() {
		return this.profitRateMax;
	}

	public void setProfitRateMax(BigDecimal profitRateMax) {
		this.profitRateMax = profitRateMax;
	}

	/**       
	 * 优惠折扣标准比率下限
	 */

	@Column(name = "profitratemin")
	public BigDecimal getProfitRateMin() {
		return this.profitRateMin;
	}

	public void setProfitRateMin(BigDecimal profitRateMin) {
		this.profitRateMin = profitRateMin;
	}

	/**       
	 * 实际优惠折扣比率
	 */

	@Column(name = "profitrate")
	public BigDecimal getProfitRate() {
		return this.profitRate;
	}

	public void setProfitRate(BigDecimal profitRate) {
		this.profitRate = profitRate;
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
