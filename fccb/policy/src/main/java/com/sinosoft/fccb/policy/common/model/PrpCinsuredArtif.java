package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

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
 * PrpCinsuredArtif generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcinsuredartif")
public class PrpCinsuredArtif implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** SerialNo */
	private PrpCinsuredArtifId id;
	/** SerialNo */
	private PrpCinsured prpCinsured;
	/** 关系人角色标志 */
	private String insuredFlag;
	/** 法人代表 */
	private String leaderName;
	/** 法人代表身份证号 */
	private String leaderId;
	/** 法人代表手机号码 */
	private String leaderMobile;
	/** 法人代表单位电话 */
	private String leaderUnitPhone;
	/** 单位地址 */
	private String unitAddress;
	/** 电话 */
	private String phoneNumber;
	/** 邮政编码 */
	private String postCode;
	/** 营业执照 */
	private String businessCode;
	/** 税务登记号码 */
	private String revenueRegistNo;
	/** 经销车型 */
	private String carType;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCinsuredArtif() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "proposalNo", column = @Column(name = "proposalno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpCinsuredArtifId getId() {
		return this.id;
	}

	public void setId(PrpCinsuredArtifId id) {
		this.id = id;
	}

	/**       
	 * SerialNo
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "proposalno", referencedColumnName = "proposalno", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "serialno", referencedColumnName = "serialno", nullable = false, insertable = false, updatable = false) })
	public PrpCinsured getPrpCinsured() {
		return this.prpCinsured;
	}

	public void setPrpCinsured(PrpCinsured prpCinsured) {
		this.prpCinsured = prpCinsured;
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
	 * 法人代表
	 */

	@Column(name = "leadername")
	public String getLeaderName() {
		return this.leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	/**       
	 * 法人代表身份证号
	 */

	@Column(name = "leaderid")
	public String getLeaderId() {
		return this.leaderId;
	}

	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}

	/**       
	 * 法人代表手机号码
	 */

	@Column(name = "leadermobile")
	public String getLeaderMobile() {
		return this.leaderMobile;
	}

	public void setLeaderMobile(String leaderMobile) {
		this.leaderMobile = leaderMobile;
	}

	/**       
	 * 法人代表单位电话
	 */

	@Column(name = "leaderunitphone")
	public String getLeaderUnitPhone() {
		return this.leaderUnitPhone;
	}

	public void setLeaderUnitPhone(String leaderUnitPhone) {
		this.leaderUnitPhone = leaderUnitPhone;
	}

	/**       
	 * 单位地址
	 */

	@Column(name = "unitaddress")
	public String getUnitAddress() {
		return this.unitAddress;
	}

	public void setUnitAddress(String unitAddress) {
		this.unitAddress = unitAddress;
	}

	/**       
	 * 电话
	 */

	@Column(name = "phonenumber")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	 * 营业执照
	 */

	@Column(name = "businesscode")
	public String getBusinessCode() {
		return this.businessCode;
	}

	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	/**       
	 * 税务登记号码
	 */

	@Column(name = "revenueregistno")
	public String getRevenueRegistNo() {
		return this.revenueRegistNo;
	}

	public void setRevenueRegistNo(String revenueRegistNo) {
		this.revenueRegistNo = revenueRegistNo;
	}

	/**       
	 * 经销车型
	 */

	@Column(name = "cartype")
	public String getCarType() {
		return this.carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
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
