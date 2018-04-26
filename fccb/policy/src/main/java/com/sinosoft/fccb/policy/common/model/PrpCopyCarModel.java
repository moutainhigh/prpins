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
 * PrpCopyCarModel generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcopycarmodel")
public class PrpCopyCarModel implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 标的序号 */
	private PrpCopyCarModelId id;
	/** 标的序号 */
	private PrpCopyItemCar prpCopyItemCar;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 车型编码 */
	private String vehicleID;
	/** 车型名称 */
	private String vehicleName;
	/** 车型别名 */
	private String aliasName;
	/** 快速查询码 */
	private String searchCode;
	/** 类型 */
	private String vehicleClass;
	/** 种类 */
	private String vehicleType;
	/** 品牌代码 */
	private String brandID;
	/** 品牌名称 */
	private String brandName;
	/** 车系代码 */
	private String familyID;
	/** 车系名称 */
	private String familyName;
	/** 生产厂商 */
	private String vehicleMaker;
	/** 额定载客人数 */
	private BigDecimal vehicleSeat;
	/** 整车质量 */
	private String vehicleWeight;
	/** 载重量 */
	private BigDecimal vehicleTonnage;
	/** 排气量 */
	private BigDecimal vehicleExhaust;
	/** 发动机型号 */
	private String engineType;
	/** 发动机功率 */
	private String enginePower;
	/** 变速器型号 */
	private String transmissionType;
	/** 是否有ABS */
	private String isabs;
	/** 是否有防盗装备 */
	private String isAlarm;
	/** 安全气囊数 */
	private BigDecimal airBagNums;
	/** 标准配置 */
	private String equipStandard;
	/** 选装配置 */
	private String equipOptional;
	/** 外形尺寸 */
	private String vehicleSize;
	/** 轴距 */
	private String wheelBase;
	/** 前轮距 */
	private String trackFront;
	/** 后轮距 */
	private String trackRear;
	/** 车辆价格 */
	private BigDecimal vehiclePrice;
	/** 风险说明 */
	private String dirRisk;
	/** 车损车型系数 */
	private BigDecimal quotietyDam;
	/** 车损险向上浮动比率 */
	private BigDecimal quotietyDamUF;
	/** 车损险向下浮动比率 */
	private BigDecimal quotietyDamDF;
	/** 盗抢险车型系数 */
	private BigDecimal quotietyLoss;
	/** 盗抢险向上浮动比率 */
	private BigDecimal quotietyLossUF;
	/** 盗抢险向下浮动比率 */
	private BigDecimal quotietyLossDF;
	/** 年款 */
	private String vehicleYear;
	/** 整备质量 */
	private BigDecimal vehicleQuality;
	/** 备注 */
	private String remark;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCopyCarModel() {
	}

	/**       
	 * 标的序号
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "itemNo", column = @Column(name = "itemno", nullable = false)) })
	public PrpCopyCarModelId getId() {
		return this.id;
	}

	public void setId(PrpCopyCarModelId id) {
		this.id = id;
	}

	/**       
	 * 标的序号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "applyno", referencedColumnName = "applyno", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "itemno", referencedColumnName = "itemno", nullable = false, insertable = false, updatable = false) })
	public PrpCopyItemCar getPrpCopyItemCar() {
		return this.prpCopyItemCar;
	}

	public void setPrpCopyItemCar(PrpCopyItemCar prpCopyItemCar) {
		this.prpCopyItemCar = prpCopyItemCar;
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
	 * 车型编码
	 */

	@Column(name = "vehicleid")
	public String getVehicleID() {
		return this.vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	/**       
	 * 车型名称
	 */

	@Column(name = "vehiclename")
	public String getVehicleName() {
		return this.vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	/**       
	 * 车型别名
	 */

	@Column(name = "aliasname")
	public String getAliasName() {
		return this.aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	/**       
	 * 快速查询码
	 */

	@Column(name = "searchcode")
	public String getSearchCode() {
		return this.searchCode;
	}

	public void setSearchCode(String searchCode) {
		this.searchCode = searchCode;
	}

	/**       
	 * 类型
	 */

	@Column(name = "vehicleclass")
	public String getVehicleClass() {
		return this.vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	/**       
	 * 种类
	 */

	@Column(name = "vehicletype")
	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**       
	 * 品牌代码
	 */

	@Column(name = "brandid")
	public String getBrandID() {
		return this.brandID;
	}

	public void setBrandID(String brandID) {
		this.brandID = brandID;
	}

	/**       
	 * 品牌名称
	 */

	@Column(name = "brandname")
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**       
	 * 车系代码
	 */

	@Column(name = "familyid")
	public String getFamilyID() {
		return this.familyID;
	}

	public void setFamilyID(String familyID) {
		this.familyID = familyID;
	}

	/**       
	 * 车系名称
	 */

	@Column(name = "familyname")
	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**       
	 * 生产厂商
	 */

	@Column(name = "vehiclemaker")
	public String getVehicleMaker() {
		return this.vehicleMaker;
	}

	public void setVehicleMaker(String vehicleMaker) {
		this.vehicleMaker = vehicleMaker;
	}

	/**       
	 * 额定载客人数
	 */

	@Column(name = "vehicleseat")
	public BigDecimal getVehicleSeat() {
		return this.vehicleSeat;
	}

	public void setVehicleSeat(BigDecimal vehicleSeat) {
		this.vehicleSeat = vehicleSeat;
	}

	/**       
	 * 整车质量
	 */

	@Column(name = "vehicleweight")
	public String getVehicleWeight() {
		return this.vehicleWeight;
	}

	public void setVehicleWeight(String vehicleWeight) {
		this.vehicleWeight = vehicleWeight;
	}

	/**       
	 * 载重量
	 */

	@Column(name = "vehicletonnage")
	public BigDecimal getVehicleTonnage() {
		return this.vehicleTonnage;
	}

	public void setVehicleTonnage(BigDecimal vehicleTonnage) {
		this.vehicleTonnage = vehicleTonnage;
	}

	/**       
	 * 排气量
	 */

	@Column(name = "vehicleexhaust")
	public BigDecimal getVehicleExhaust() {
		return this.vehicleExhaust;
	}

	public void setVehicleExhaust(BigDecimal vehicleExhaust) {
		this.vehicleExhaust = vehicleExhaust;
	}

	/**       
	 * 发动机型号
	 */

	@Column(name = "enginetype")
	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	/**       
	 * 发动机功率
	 */

	@Column(name = "enginepower")
	public String getEnginePower() {
		return this.enginePower;
	}

	public void setEnginePower(String enginePower) {
		this.enginePower = enginePower;
	}

	/**       
	 * 变速器型号
	 */

	@Column(name = "transmissiontype")
	public String getTransmissionType() {
		return this.transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	/**       
	 * 是否有ABS
	 */

	@Column(name = "isabs")
	public String getIsabs() {
		return this.isabs;
	}

	public void setIsabs(String isabs) {
		this.isabs = isabs;
	}

	/**       
	 * 是否有防盗装备
	 */

	@Column(name = "isalarm")
	public String getIsAlarm() {
		return this.isAlarm;
	}

	public void setIsAlarm(String isAlarm) {
		this.isAlarm = isAlarm;
	}

	/**       
	 * 安全气囊数
	 */

	@Column(name = "airbagnums")
	public BigDecimal getAirBagNums() {
		return this.airBagNums;
	}

	public void setAirBagNums(BigDecimal airBagNums) {
		this.airBagNums = airBagNums;
	}

	/**       
	 * 标准配置
	 */

	@Column(name = "equipstandard")
	public String getEquipStandard() {
		return this.equipStandard;
	}

	public void setEquipStandard(String equipStandard) {
		this.equipStandard = equipStandard;
	}

	/**       
	 * 选装配置
	 */

	@Column(name = "equipoptional")
	public String getEquipOptional() {
		return this.equipOptional;
	}

	public void setEquipOptional(String equipOptional) {
		this.equipOptional = equipOptional;
	}

	/**       
	 * 外形尺寸
	 */

	@Column(name = "vehiclesize")
	public String getVehicleSize() {
		return this.vehicleSize;
	}

	public void setVehicleSize(String vehicleSize) {
		this.vehicleSize = vehicleSize;
	}

	/**       
	 * 轴距
	 */

	@Column(name = "wheelbase")
	public String getWheelBase() {
		return this.wheelBase;
	}

	public void setWheelBase(String wheelBase) {
		this.wheelBase = wheelBase;
	}

	/**       
	 * 前轮距
	 */

	@Column(name = "trackfront")
	public String getTrackFront() {
		return this.trackFront;
	}

	public void setTrackFront(String trackFront) {
		this.trackFront = trackFront;
	}

	/**       
	 * 后轮距
	 */

	@Column(name = "trackrear")
	public String getTrackRear() {
		return this.trackRear;
	}

	public void setTrackRear(String trackRear) {
		this.trackRear = trackRear;
	}

	/**       
	 * 车辆价格
	 */

	@Column(name = "vehicleprice")
	public BigDecimal getVehiclePrice() {
		return this.vehiclePrice;
	}

	public void setVehiclePrice(BigDecimal vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}

	/**       
	 * 风险说明
	 */

	@Column(name = "dirrisk")
	public String getDirRisk() {
		return this.dirRisk;
	}

	public void setDirRisk(String dirRisk) {
		this.dirRisk = dirRisk;
	}

	/**       
	 * 车损车型系数
	 */

	@Column(name = "quotietydam")
	public BigDecimal getQuotietyDam() {
		return this.quotietyDam;
	}

	public void setQuotietyDam(BigDecimal quotietyDam) {
		this.quotietyDam = quotietyDam;
	}

	/**       
	 * 车损险向上浮动比率
	 */

	@Column(name = "quotietydamuf")
	public BigDecimal getQuotietyDamUF() {
		return this.quotietyDamUF;
	}

	public void setQuotietyDamUF(BigDecimal quotietyDamUF) {
		this.quotietyDamUF = quotietyDamUF;
	}

	/**       
	 * 车损险向下浮动比率
	 */

	@Column(name = "quotietydamdf")
	public BigDecimal getQuotietyDamDF() {
		return this.quotietyDamDF;
	}

	public void setQuotietyDamDF(BigDecimal quotietyDamDF) {
		this.quotietyDamDF = quotietyDamDF;
	}

	/**       
	 * 盗抢险车型系数
	 */

	@Column(name = "quotietyloss")
	public BigDecimal getQuotietyLoss() {
		return this.quotietyLoss;
	}

	public void setQuotietyLoss(BigDecimal quotietyLoss) {
		this.quotietyLoss = quotietyLoss;
	}

	/**       
	 * 盗抢险向上浮动比率
	 */

	@Column(name = "quotietylossuf")
	public BigDecimal getQuotietyLossUF() {
		return this.quotietyLossUF;
	}

	public void setQuotietyLossUF(BigDecimal quotietyLossUF) {
		this.quotietyLossUF = quotietyLossUF;
	}

	/**       
	 * 盗抢险向下浮动比率
	 */

	@Column(name = "quotietylossdf")
	public BigDecimal getQuotietyLossDF() {
		return this.quotietyLossDF;
	}

	public void setQuotietyLossDF(BigDecimal quotietyLossDF) {
		this.quotietyLossDF = quotietyLossDF;
	}

	/**       
	 * 年款
	 */

	@Column(name = "vehicleyear")
	public String getVehicleYear() {
		return this.vehicleYear;
	}

	public void setVehicleYear(String vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

	/**       
	 * 整备质量
	 */

	@Column(name = "vehiclequality")
	public BigDecimal getVehicleQuality() {
		return this.vehicleQuality;
	}

	public void setVehicleQuality(BigDecimal vehicleQuality) {
		this.vehicleQuality = vehicleQuality;
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
