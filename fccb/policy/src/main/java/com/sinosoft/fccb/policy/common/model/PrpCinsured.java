package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PrpCinsured generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcinsured")
public class PrpCinsured implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** SerialNo */
	private PrpCinsuredId id;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 险种代码 */
	private String riskCode;
	/** 语种 */
	private String language;
	/** 关系人类型 */
	private String insuredType;
	/** 关系人代码 */
	private String insuredCode;
	/** InsuredName */
	private String insuredName;
	/** 关系人英文名称 */
	private String insuredEName;
	/** 车型别名 */
	private String aliasName;
	/** 关系人地址 */
	private String insuredAddress;
	/** 关系人性质 */
	private String insuredNature;
	/** 关系人角色标志 */
	private String insuredFlag;
	/** 单位性质 */
	private String unitType;
	/** 打印附加名称 */
	private String appendPrintName;
	/** 是被保险人的 */
	private String insuredIdentity;
	/** 关联人序号 */
	private Integer relateSerialNo;
	/** 证件类型 */
	private String identifyType;
	/** 身份证号 */
	private String identifyNumber;
	/** 统一社会信用代码 */
	private String unifiedSocialCreditCode;
	/** 资信等级 */
	private String creditLevel;
	/** 占用性质代码 */
	private String possessNature;
	/** 行业代码 */
	private String businessSource;
	/** 所有制代码 */
	private String businessSort;
	/** 个人职业代码 */
	private String occupationCode;
	/** 个人学历代码 */
	private String educationCode;
	/** 开户银行 */
	private String bank;
	/** 帐户名 */
	private String accountName;
	/** Account */
	private String account;
	/** 联系人名称 */
	private String linkerName;
	/** 通讯地址 */
	private String postAddress;
	/** 邮政编码 */
	private String postCode;
	/** 电话 */
	private String phoneNumber;
	/** 传真号码 */
	private String faxNumber;
	/** 移动电话 */
	private String mobile;
	/** 网址 */
	private String netAddress;
	/** 电子邮件 */
	private String email;
	/** 责任起期 */
	private Date startDate;
	/** 责任止期 */
	private Date endDate;
	/** 受益人标志 */
	private String benefitFlag;
	/** 受益份额 */
	private BigDecimal benefitRate;
	/** 驾驶证号码 */
	private String drivingLicenseNo;
	/** 是否固定驾驶员标志 */
	private String changelessFlag;
	/** 性别 */
	private String sex;
	/** 年龄 */
	private Integer age;
	/** 婚姻状况 */
	private String marriage;
	/** 单位或地址 */
	private String driverAddress;
	/** 是否有违章扣分 */
	private Integer peccancy;
	/** 初次领证日期 */
	private Date acceptLicenseDate;
	/** 领驾驶证年数 */
	private Integer receiveLicenseYear;
	/** 驾龄 */
	private Integer drivingYears;
	/** 近两年肇事次数 */
	private Integer causeTroubleTimes;
	/** 颁证机关 */
	private String awardLicenseOrgan;
	/** 准驾车型 */
	private String drivingCarType;
	/** 国家代码 */
	private String countryCode;	
	/** 版本号 */
	private BigDecimal versionNo;	
	/** 审核状态 */
	private String auditstatus;		
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	private List<PrpCinsuredNature> prpCinsuredNatures = new ArrayList<PrpCinsuredNature>(
			0);
	private List<PrpCinsuredArtif> prpCinsuredArtifs = new ArrayList<PrpCinsuredArtif>(
			0);
	private List<PrpCinsuredCreditInvest> prpCinsuredCreditInvests = new ArrayList<PrpCinsuredCreditInvest>();

	public PrpCinsured() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "proposalNo", column = @Column(name = "proposalno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpCinsuredId getId() {
		return this.id;
	}

	public void setId(PrpCinsuredId id) {
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
	 * 语种
	 */

	@Column(name = "language")
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	/**       
	 * 关系人类型
	 */

	@Column(name = "insuredtype")
	public String getInsuredType() {
		return this.insuredType;
	}

	public void setInsuredType(String insuredType) {
		this.insuredType = insuredType;
	}

	/**       
	 * 关系人代码
	 */

	@Column(name = "insuredcode")
	public String getInsuredCode() {
		return this.insuredCode;
	}

	public void setInsuredCode(String insuredCode) {
		this.insuredCode = insuredCode;
	}

	/**       
	 * InsuredName
	 */

	@Column(name = "insuredname")
	public String getInsuredName() {
		return this.insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	/**       
	 * 关系人英文名称
	 */

	@Column(name = "insuredename")
	public String getInsuredEName() {
		return this.insuredEName;
	}

	public void setInsuredEName(String insuredEName) {
		this.insuredEName = insuredEName;
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
	 * 关系人地址
	 */

	@Column(name = "insuredaddress")
	public String getInsuredAddress() {
		return this.insuredAddress;
	}

	public void setInsuredAddress(String insuredAddress) {
		this.insuredAddress = insuredAddress;
	}

	/**       
	 * 关系人性质
	 */

	@Column(name = "insurednature")
	public String getInsuredNature() {
		return this.insuredNature;
	}

	public void setInsuredNature(String insuredNature) {
		this.insuredNature = insuredNature;
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
	 * 单位性质
	 */

	@Column(name = "unittype")
	public String getUnitType() {
		return this.unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	/**       
	 * 打印附加名称
	 */

	@Column(name = "appendprintname")
	public String getAppendPrintName() {
		return this.appendPrintName;
	}

	public void setAppendPrintName(String appendPrintName) {
		this.appendPrintName = appendPrintName;
	}

	/**       
	 * 是被保险人的
	 */

	@Column(name = "insuredidentity")
	public String getInsuredIdentity() {
		return this.insuredIdentity;
	}

	public void setInsuredIdentity(String insuredIdentity) {
		this.insuredIdentity = insuredIdentity;
	}

	/**       
	 * 关联人序号
	 */

	@Column(name = "relateserialno")
	public Integer getRelateSerialNo() {
		return this.relateSerialNo;
	}

	public void setRelateSerialNo(Integer relateSerialNo) {
		this.relateSerialNo = relateSerialNo;
	}

	/**       
	 * 证件类型
	 */

	@Column(name = "identifytype")
	public String getIdentifyType() {
		return this.identifyType;
	}

	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	/**       
	 * 身份证号
	 */

	@Column(name = "identifynumber")
	public String getIdentifyNumber() {
		return this.identifyNumber;
	}

	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
	}

	/**       
	 * 资信等级
	 */

	@Column(name = "creditlevel")
	public String getCreditLevel() {
		return this.creditLevel;
	}

	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}

	/**       
	 * 占用性质代码
	 */

	@Column(name = "possessnature")
	public String getPossessNature() {
		return this.possessNature;
	}

	public void setPossessNature(String possessNature) {
		this.possessNature = possessNature;
	}

	/**       
	 * 行业代码
	 */

	@Column(name = "businesssource")
	public String getBusinessSource() {
		return this.businessSource;
	}

	public void setBusinessSource(String businessSource) {
		this.businessSource = businessSource;
	}

	/**       
	 * 所有制代码
	 */

	@Column(name = "businesssort")
	public String getBusinessSort() {
		return this.businessSort;
	}

	public void setBusinessSort(String businessSort) {
		this.businessSort = businessSort;
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
	 * 个人学历代码
	 */

	@Column(name = "educationcode")
	public String getEducationCode() {
		return this.educationCode;
	}

	public void setEducationCode(String educationCode) {
		this.educationCode = educationCode;
	}

	/**       
	 * 开户银行
	 */

	@Column(name = "bank")
	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	/**       
	 * 帐户名
	 */

	@Column(name = "accountname")
	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**       
	 * Account
	 */

	@Column(name = "account")
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	/**       
	 * 联系人名称
	 */

	@Column(name = "linkername")
	public String getLinkerName() {
		return this.linkerName;
	}

	public void setLinkerName(String linkerName) {
		this.linkerName = linkerName;
	}

	/**       
	 * 通讯地址
	 */

	@Column(name = "postaddress")
	public String getPostAddress() {
		return this.postAddress;
	}

	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
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
	 * 传真号码
	 */

	@Column(name = "faxnumber")
	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	/**       
	 * 移动电话
	 */

	@Column(name = "mobile")
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**       
	 * 网址
	 */

	@Column(name = "netaddress")
	public String getNetAddress() {
		return this.netAddress;
	}

	public void setNetAddress(String netAddress) {
		this.netAddress = netAddress;
	}

	/**       
	 * 电子邮件
	 */

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**       
	 * 责任起期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "startdate")
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**       
	 * 责任止期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "enddate")
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	/**       
	 * 受益人标志
	 */

	@Column(name = "benefitflag")
	public String getBenefitFlag() {
		return this.benefitFlag;
	}

	public void setBenefitFlag(String benefitFlag) {
		this.benefitFlag = benefitFlag;
	}

	/**       
	 * 受益份额
	 */

	@Column(name = "benefitrate")
	public BigDecimal getBenefitRate() {
		return this.benefitRate;
	}

	public void setBenefitRate(BigDecimal benefitRate) {
		this.benefitRate = benefitRate;
	}

	/**       
	 * 驾驶证号码
	 */

	@Column(name = "drivinglicenseno")
	public String getDrivingLicenseNo() {
		return this.drivingLicenseNo;
	}

	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	/**       
	 * 是否固定驾驶员标志
	 */

	@Column(name = "changelessflag")
	public String getChangelessFlag() {
		return this.changelessFlag;
	}

	public void setChangelessFlag(String changelessFlag) {
		this.changelessFlag = changelessFlag;
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
	 * 婚姻状况
	 */

	@Column(name = "marriage")
	public String getMarriage() {
		return this.marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	/**       
	 * 单位或地址
	 */

	@Column(name = "driveraddress")
	public String getDriverAddress() {
		return this.driverAddress;
	}

	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}

	/**       
	 * 是否有违章扣分
	 */

	@Column(name = "peccancy")
	public Integer getPeccancy() {
		return this.peccancy;
	}

	public void setPeccancy(Integer peccancy) {
		this.peccancy = peccancy;
	}

	/**       
	 * 初次领证日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "acceptlicensedate")
	public Date getAcceptLicenseDate() {
		return this.acceptLicenseDate;
	}

	public void setAcceptLicenseDate(Date acceptLicenseDate) {
		this.acceptLicenseDate = acceptLicenseDate;
	}

	/**       
	 * 领驾驶证年数
	 */

	@Column(name = "receivelicenseyear")
	public Integer getReceiveLicenseYear() {
		return this.receiveLicenseYear;
	}

	public void setReceiveLicenseYear(Integer receiveLicenseYear) {
		this.receiveLicenseYear = receiveLicenseYear;
	}

	/**       
	 * 驾龄
	 */

	@Column(name = "drivingyears")
	public Integer getDrivingYears() {
		return this.drivingYears;
	}

	public void setDrivingYears(Integer drivingYears) {
		this.drivingYears = drivingYears;
	}

	/**       
	 * 近两年肇事次数
	 */

	@Column(name = "causetroubletimes")
	public Integer getCauseTroubleTimes() {
		return this.causeTroubleTimes;
	}

	public void setCauseTroubleTimes(Integer causeTroubleTimes) {
		this.causeTroubleTimes = causeTroubleTimes;
	}

	/**       
	 * 颁证机关
	 */

	@Column(name = "awardlicenseorgan")
	public String getAwardLicenseOrgan() {
		return this.awardLicenseOrgan;
	}

	public void setAwardLicenseOrgan(String awardLicenseOrgan) {
		this.awardLicenseOrgan = awardLicenseOrgan;
	}

	/**       
	 * 准驾车型
	 */

	@Column(name = "drivingcartype")
	public String getDrivingCarType() {
		return this.drivingCarType;
	}

	public void setDrivingCarType(String drivingCarType) {
		this.drivingCarType = drivingCarType;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prpCinsured")
	public List<PrpCinsuredNature> getPrpCinsuredNatures() {
		return this.prpCinsuredNatures;
	}

	public void setPrpCinsuredNatures(List<PrpCinsuredNature> prpCinsuredNatures) {
		this.prpCinsuredNatures = prpCinsuredNatures;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prpCinsured")
	public List<PrpCinsuredArtif> getPrpCinsuredArtifs() {
		return this.prpCinsuredArtifs;
	}

	public void setPrpCinsuredArtifs(List<PrpCinsuredArtif> prpCinsuredArtifs) {
		this.prpCinsuredArtifs = prpCinsuredArtifs;
	}
	/** 版本号 */
	@Column(name = "versionno")
	public BigDecimal getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(BigDecimal versionNo) {
		this.versionNo = versionNo;
	}
	/** 审核状态 */
	@Column(name = "auditstatus")
	public String getAuditstatus() {
		return auditstatus;
	}

	public void setAuditstatus(String auditstatus) {
		this.auditstatus = auditstatus;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prpCinsured")
	public List<PrpCinsuredCreditInvest> getPrpCinsuredCreditInvests() {
		return prpCinsuredCreditInvests;
	}

	public void setPrpCinsuredCreditInvests(
			List<PrpCinsuredCreditInvest> prpCinsuredCreditInvests) {
		this.prpCinsuredCreditInvests = prpCinsuredCreditInvests;
	}
	
	/**       
	 * 统一社会信用代码
	 */
	
	@Column(name = "unifiedSocialCreditCode")
	public String getUnifiedSocialCreditCode() {
		return unifiedSocialCreditCode;
	}

	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}
}
