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
 * PrpPitemDevice generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppitem_device")
public class PrpPitemDevice implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 标的序号 */
	private PrpPitemDeviceId id;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 批单号 */
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 设备编号 */
	private String deviceNo;
	/** 车型 */
	private String model;
	/** 制造厂商 */
	private String makeFactory;
	/** 制造年份 */
	private String makeYear;
	/** 燃料名称 */
	private String fuelName;
	/** 设计使用温度 */
	private BigDecimal preUseTemperature;
	/** 实际使用温度 */
	private BigDecimal realUseTemperature;
	/** 设计使用压力 */
	private BigDecimal preUsePressure;
	/** 实际使用压力 */
	private BigDecimal realUsePressure;
	/** 容量 */
	private BigDecimal capacity;
	/** 使用日期 */
	private Date useDate;
	/** 用途 */
	private String usage;
	/** 备注 */
	private String remark;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	/** 预留字段1 */
	private String preChar1;
	/** 预留字段2 */
	private String preChar2;
	/** 预留字段3 */
	private Date prpDate1;
	/** 预留字段4 */
	private Date prpDate2;

	public PrpPitemDevice() {
	}

	/**       
	 * 标的序号
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "itemNo", column = @Column(name = "itemno", nullable = false)) })
	public PrpPitemDeviceId getId() {
		return this.id;
	}

	public void setId(PrpPitemDeviceId id) {
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
	 * 设备编号
	 */

	@Column(name = "deviceno")
	public String getDeviceNo() {
		return this.deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
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
	 * 制造厂商
	 */

	@Column(name = "makefactory")
	public String getMakeFactory() {
		return this.makeFactory;
	}

	public void setMakeFactory(String makeFactory) {
		this.makeFactory = makeFactory;
	}

	/**       
	 * 制造年份
	 */

	@Column(name = "makeyear")
	public String getMakeYear() {
		return this.makeYear;
	}

	public void setMakeYear(String makeYear) {
		this.makeYear = makeYear;
	}

	/**       
	 * 燃料名称
	 */

	@Column(name = "fuelname")
	public String getFuelName() {
		return this.fuelName;
	}

	public void setFuelName(String fuelName) {
		this.fuelName = fuelName;
	}

	/**       
	 * 设计使用温度
	 */

	@Column(name = "preusetemperature")
	public BigDecimal getPreUseTemperature() {
		return this.preUseTemperature;
	}

	public void setPreUseTemperature(BigDecimal preUseTemperature) {
		this.preUseTemperature = preUseTemperature;
	}

	/**       
	 * 实际使用温度
	 */

	@Column(name = "realusetemperature")
	public BigDecimal getRealUseTemperature() {
		return this.realUseTemperature;
	}

	public void setRealUseTemperature(BigDecimal realUseTemperature) {
		this.realUseTemperature = realUseTemperature;
	}

	/**       
	 * 设计使用压力
	 */

	@Column(name = "preusepressure")
	public BigDecimal getPreUsePressure() {
		return this.preUsePressure;
	}

	public void setPreUsePressure(BigDecimal preUsePressure) {
		this.preUsePressure = preUsePressure;
	}

	/**       
	 * 实际使用压力
	 */

	@Column(name = "realusepressure")
	public BigDecimal getRealUsePressure() {
		return this.realUsePressure;
	}

	public void setRealUsePressure(BigDecimal realUsePressure) {
		this.realUsePressure = realUsePressure;
	}

	/**       
	 * 容量
	 */

	@Column(name = "capacity")
	public BigDecimal getCapacity() {
		return this.capacity;
	}

	public void setCapacity(BigDecimal capacity) {
		this.capacity = capacity;
	}

	/**       
	 * 使用日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "usedate")
	public Date getUseDate() {
		return this.useDate;
	}

	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}

	/**       
	 * 用途
	 */

	@Column(name = "usage")
	public String getUsage() {
		return this.usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
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
	@Column(name = "prpdate1")
	public Date getPrpDate1() {
		return prpDate1;
	}

	public void setPrpDate1(Date prpDate1) {
		this.prpDate1 = prpDate1;
	}

	/**       
	 * 预留字段4
	 */
	@Column(name = "prpdate2")
	public Date getPrpDate2() {
		return prpDate2;
	}

	public void setPrpDate2(Date prpDate2) {
		this.prpDate2 = prpDate2;
	}

}
