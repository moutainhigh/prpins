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
 * PrpPration generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppration")
public class PrpPration implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 投保方式代码 */
	private PrpPrationId id;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 批单号 */
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	/** 投保方式名称 */
	private String modeName;
	/** 产品配置方案代码 */
	private String planCode;
//	/** 方案名称 */
//	private String rationName;
	/** SerialNo */
	private Integer serialNo;
	/** 旅行计划 */
	private String itinerary;
	/** 性别 */
	private String sex;
	/** 年龄 */
	private Integer age;
	/** 个人职业代码 */
	private String occupationCode;
	/** 职称 */
	private String jobTitle;
	/** 数量 */
	private Integer quantity;
	/** 方案份数 */
	private Integer rationCount;
	/** 分类使用的折扣 */
	private BigDecimal groupDiscount;
	/** 关系人角色标志 */
	private String insuredFlag;
	/** 国家代码 */
	private String countryCode;
	/** 病房等级 */
	private String sickRoomLevel;
	/** 旅行返回地点 */
	private String journeyBack;
	/** 旅行目的地 */
	private String journeyEnd;
	/** 旅行出发地点 */
	private String journeyStart;
	/** 备注 */
	private String remark;
	/** 是否允许修改 */
	private String updateFlag;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpPration() {
	}

	/**       
	 * 投保方式代码
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno")),
			@AttributeOverride(name = "modeCode", column = @Column(name = "modecode")) })
	public PrpPrationId getId() {
		return this.id;
	}

	public void setId(PrpPrationId id) {
		this.id = id;
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

	@Column(name = "policyno")
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	/**       
	 * 投保方式名称
	 */

	@Column(name = "modename")
	public String getModeName() {
		return this.modeName;
	}

	public void setModeName(String modeName) {
		this.modeName = modeName;
	}

	/**       
	 * 产品配置方案代码
	 */

	@Column(name = "plancode")
	public String getPlanCode() {
		return this.planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

//	/**       
//	 * 方案名称
//	 */
//
//	@Column(name = "rationname")
//	public String getRationName() {
//		return this.rationName;
//	}
//
//	public void setRationName(String rationName) {
//		this.rationName = rationName;
//	}

	/**       
	 * SerialNo
	 */

	@Column(name = "serialno")
	public Integer getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	/**       
	 * 旅行计划
	 */

	@Column(name = "itinerary")
	public String getItinerary() {
		return this.itinerary;
	}

	public void setItinerary(String itinerary) {
		this.itinerary = itinerary;
	}

	/**       
	 * 性别
	 */

	@Column(name = "sex")
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	/**       
	 * 年龄
	 */

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	/**       
	 * 个人职业代码
	 */

	@Column(name = "occupationcode")
	public String getOccupationCode() {
		return this.occupationCode;
	}

	public void setOccupationCode(String occupationCode) {
		this.occupationCode = occupationCode;
	}

	/**       
	 * 职称
	 */

	@Column(name = "jobtitle")
	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
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
	 * 方案份数
	 */

	@Column(name = "rationcount")
	public Integer getRationCount() {
		return this.rationCount;
	}

	public void setRationCount(Integer rationCount) {
		this.rationCount = rationCount;
	}

	/**       
	 * 分类使用的折扣
	 */

	@Column(name = "groupdiscount")
	public BigDecimal getGroupDiscount() {
		return this.groupDiscount;
	}

	public void setGroupDiscount(BigDecimal groupDiscount) {
		this.groupDiscount = groupDiscount;
	}

	/**       
	 * 关系人角色标志
	 */

	@Column(name = "insuredflag")
	public String getInsuredFlag() {
		return this.insuredFlag;
	}

	public void setInsuredFlag(String insuredFlag) {
		this.insuredFlag = insuredFlag;
	}

	/**       
	 * 国家代码
	 */

	@Column(name = "countrycode")
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**       
	 * 病房等级
	 */

	@Column(name = "sickroomlevel")
	public String getSickRoomLevel() {
		return this.sickRoomLevel;
	}

	public void setSickRoomLevel(String sickRoomLevel) {
		this.sickRoomLevel = sickRoomLevel;
	}

	/**       
	 * 旅行返回地点
	 */

	@Column(name = "journeyback")
	public String getJourneyBack() {
		return this.journeyBack;
	}

	public void setJourneyBack(String journeyBack) {
		this.journeyBack = journeyBack;
	}

	/**       
	 * 旅行目的地
	 */

	@Column(name = "journeyend")
	public String getJourneyEnd() {
		return this.journeyEnd;
	}

	public void setJourneyEnd(String journeyEnd) {
		this.journeyEnd = journeyEnd;
	}

	/**       
	 * 旅行出发地点
	 */

	@Column(name = "journeystart")
	public String getJourneyStart() {
		return this.journeyStart;
	}

	public void setJourneyStart(String journeyStart) {
		this.journeyStart = journeyStart;
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
	 * 是否允许修改
	 */

	@Column(name = "updateflag")	
	public String getUpdateFlag() {
		return updateFlag;
	}
    
	public void setUpdateFlag(String updateFlag) {
		this.updateFlag = updateFlag;
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

}
