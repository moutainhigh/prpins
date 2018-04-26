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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PrpCopyItemOil generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcopyitem_oil")
public class PrpCopyItemOil implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 标的序号 */
	private PrpCopyItemOilId id;
	/** 标的序号 */
	private PrpCopyItem prpCopyItem;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 标的项目类别代码 */
	private String itemCode;
	/** 闻讯项目名称 */
	private String wellName;
	/** 货物类型 */
	private String wellLocation;
	/** 平台种类 */
	private String wellKind;
	/** 移位/拖航 */
	private String wellType;
	/** 移位/拖航的距离 */
	private BigDecimal moveDistance;
	/** 海域水深 */
	private BigDecimal wellDepth;
	/** 钻井周期 */
	private BigDecimal wellPeriod;
	/** 设计寿命 */
	private Integer designLife;
	/** 已使用年限 */
	private Integer usedYear;
	/** 有无自航能力 */
	private String stratumPress;
	/** 预测地层温度 */
	private String stratumTemperature;
	/** 预测地层流体 */
	private String stratumLiquid;
	/** 有效证件 */
	private String borerModel;
	/** 建造年份 */
	private Date buildYear;
	/** 建造时间 */
	private Date buildDate;
	/** 作业起始时间 */
	private Date taskStartDate;
	/** 作业终止时间 */
	private Date taskEndDate;
	/** 平台用途 */
	private String equipmentType;
	/** 最大油气处理能力 */
	private BigDecimal equipmentPress;
	/** 起运地 */
	private String startSiteName;
	/** 目的地 */
	private String endSiteName;
	/** 长度 */
	private BigDecimal distance1;
	/** 总吨 */
	private BigDecimal distance2;
	/** 币别 */
	private String currency;
	/** 最大下水金额 */
	private BigDecimal distance3;
	/** 船级社 */
	private String othCondition;
	/** 邮政编码 */
	private String postCode;
	/** 备注 */
	private String remark;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCopyItemOil() {
	}

	/**       
	 * 标的序号
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "itemNo", column = @Column(name = "itemno", nullable = false)) })
	public PrpCopyItemOilId getId() {
		return this.id;
	}

	public void setId(PrpCopyItemOilId id) {
		this.id = id;
	}

	/**       
	 * 标的序号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "applyno", referencedColumnName = "applyno", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "itemno", referencedColumnName = "itemno", nullable = false, insertable = false, updatable = false) })
	public PrpCopyItem getPrpCopyItem() {
		return this.prpCopyItem;
	}

	public void setPrpCopyItem(PrpCopyItem prpCopyItem) {
		this.prpCopyItem = prpCopyItem;
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
	 * 标的项目类别代码
	 */

	@Column(name = "itemcode")
	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**       
	 * 闻讯项目名称
	 */

	@Column(name = "wellname")
	public String getWellName() {
		return this.wellName;
	}

	public void setWellName(String wellName) {
		this.wellName = wellName;
	}

	/**       
	 * 货物类型
	 */

	@Column(name = "welllocation")
	public String getWellLocation() {
		return this.wellLocation;
	}

	public void setWellLocation(String wellLocation) {
		this.wellLocation = wellLocation;
	}

	/**       
	 * 平台种类
	 */

	@Column(name = "wellkind")
	public String getWellKind() {
		return this.wellKind;
	}

	public void setWellKind(String wellKind) {
		this.wellKind = wellKind;
	}

	/**       
	 * 移位/拖航
	 */

	@Column(name = "welltype")
	public String getWellType() {
		return this.wellType;
	}

	public void setWellType(String wellType) {
		this.wellType = wellType;
	}

	/**       
	 * 移位/拖航的距离
	 */

	@Column(name = "movedistance")
	public BigDecimal getMoveDistance() {
		return this.moveDistance;
	}

	public void setMoveDistance(BigDecimal moveDistance) {
		this.moveDistance = moveDistance;
	}

	/**       
	 * 海域水深
	 */

	@Column(name = "welldepth")
	public BigDecimal getWellDepth() {
		return this.wellDepth;
	}

	public void setWellDepth(BigDecimal wellDepth) {
		this.wellDepth = wellDepth;
	}

	/**       
	 * 钻井周期
	 */

	@Column(name = "wellperiod")
	public BigDecimal getWellPeriod() {
		return this.wellPeriod;
	}

	public void setWellPeriod(BigDecimal wellPeriod) {
		this.wellPeriod = wellPeriod;
	}

	/**       
	 * 设计寿命
	 */

	@Column(name = "designlife")
	public Integer getDesignLife() {
		return this.designLife;
	}

	public void setDesignLife(Integer designLife) {
		this.designLife = designLife;
	}

	/**       
	 * 已使用年限
	 */

	@Column(name = "usedyear")
	public Integer getUsedYear() {
		return this.usedYear;
	}

	public void setUsedYear(Integer usedYear) {
		this.usedYear = usedYear;
	}

	/**       
	 * 有无自航能力
	 */

	@Column(name = "stratumpress")
	public String getStratumPress() {
		return this.stratumPress;
	}

	public void setStratumPress(String stratumPress) {
		this.stratumPress = stratumPress;
	}

	/**       
	 * 预测地层温度
	 */

	@Column(name = "stratumtemperature")
	public String getStratumTemperature() {
		return this.stratumTemperature;
	}

	public void setStratumTemperature(String stratumTemperature) {
		this.stratumTemperature = stratumTemperature;
	}

	/**       
	 * 预测地层流体
	 */

	@Column(name = "stratumliquid")
	public String getStratumLiquid() {
		return this.stratumLiquid;
	}

	public void setStratumLiquid(String stratumLiquid) {
		this.stratumLiquid = stratumLiquid;
	}

	/**       
	 * 有效证件
	 */

	@Column(name = "borermodel")
	public String getBorerModel() {
		return this.borerModel;
	}

	public void setBorerModel(String borerModel) {
		this.borerModel = borerModel;
	}

	/**       
	 * 建造年份
	 */

	@Column(name = "buildyear")
	public Date getBuildYear() {
		return this.buildYear;
	}

	public void setBuildYear(Date buildYear) {
		this.buildYear = buildYear;
	}

	/**       
	 * 建造时间
	 */

	@Column(name = "builddate")
	public Date getBuildDate() {
		return this.buildDate;
	}

	public void setBuildDate(Date buildDate) {
		this.buildDate = buildDate;
	}

	/**       
	 * 作业起始时间
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "taskstartdate")
	public Date getTaskStartDate() {
		return this.taskStartDate;
	}

	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}

	/**       
	 * 作业终止时间
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "taskenddate")
	public Date getTaskEndDate() {
		return this.taskEndDate;
	}

	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	/**       
	 * 平台用途
	 */

	@Column(name = "equipmenttype")
	public String getEquipmentType() {
		return this.equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	/**       
	 * 最大油气处理能力
	 */

	@Column(name = "equipmentpress")
	public BigDecimal getEquipmentPress() {
		return this.equipmentPress;
	}

	public void setEquipmentPress(BigDecimal equipmentPress) {
		this.equipmentPress = equipmentPress;
	}

	/**       
	 * 起运地
	 */

	@Column(name = "startsitename")
	public String getStartSiteName() {
		return this.startSiteName;
	}

	public void setStartSiteName(String startSiteName) {
		this.startSiteName = startSiteName;
	}

	/**       
	 * 目的地
	 */

	@Column(name = "endsitename")
	public String getEndSiteName() {
		return this.endSiteName;
	}

	public void setEndSiteName(String endSiteName) {
		this.endSiteName = endSiteName;
	}

	/**       
	 * 长度
	 */

	@Column(name = "distance1")
	public BigDecimal getDistance1() {
		return this.distance1;
	}

	public void setDistance1(BigDecimal distance1) {
		this.distance1 = distance1;
	}

	/**       
	 * 总吨
	 */

	@Column(name = "distance2")
	public BigDecimal getDistance2() {
		return this.distance2;
	}

	public void setDistance2(BigDecimal distance2) {
		this.distance2 = distance2;
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
	 * 最大下水金额
	 */

	@Column(name = "distance3")
	public BigDecimal getDistance3() {
		return this.distance3;
	}

	public void setDistance3(BigDecimal distance3) {
		this.distance3 = distance3;
	}

	/**       
	 * 船级社
	 */

	@Column(name = "othcondition")
	public String getOthCondition() {
		return this.othCondition;
	}

	public void setOthCondition(String othCondition) {
		this.othCondition = othCondition;
	}

	/**       
	 * 邮政编码
	 */

	@Column(name = "postcode")
	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
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

}
