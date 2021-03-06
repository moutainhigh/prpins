package com.sinosoft.fccb.policy.common.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "prppinsuredcatalist")
public class PrpPinsuredCataList implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	/** SerialNo */
	private PrpPinsuredCataListId id;
	private String policyNo;
	private String endorseNo;
	/** 汇交单小保单号 */
	private String subPolicyNo;
	/** 关系人代码 */
	private String insuredCode;
	/** 人员中文名称 */
	private String insuredCName;
	/** 关系人英文名称 */
	private String insuredEName;
	/** 关系人地址 */
	private String insuredAddress;
	/** 关系人性质 */
	private String insuredNature;
	/** 关系人角色标志 */
	private String insuredFlag;
	/** 是被保险人的 */
	private String insuredIdentity;
	/** 关联人序号 */
	private Integer relateSerialNo;
	/** 证件类型 */
	private String identifyType;
	/** 身份证号 */
	private String identifyNumber;
	/** 资信等级 */
	private String creditLevel;
	/** 性别 */
	private String sex;
	/** 年龄 */
	private Integer age;
	/** 出生日期 */
	private Date birthday;
	/** 健康状况 */
	private String health;
	/** 个人职业代码 */
	private String occupationCode;
	/** 职业分类 */
	private String occupationType;
	/** 任职种类 */
	private String dutyType;
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
	/** 户口所在地 */
	private String boigonAddress;
	/** 社会保障号 */
	private String socialSecurityNo;
	/** 是否退休(Y/N) */
	private String retirementFlag;
	/** 受益人标志 */
	private String benefitFlag;
	/** 受益份额 */
	private BigDecimal benefitRate;
	/** 起运日期 */
	private Date startDate;
	/** 生效终止日期 */
	private Date endDate;
	/** 行业代码 */
	private String businessSource ;
	/** 所有制代码 */
	private String businessSort;
	/** 字符型预留字段1 */
	private String preChar1;
	/** 字符型预留字段2 */
	private String preChar2;
	/** 单位 */
	private String unit;
	/** 数量 */
	private BigDecimal quantity;
	/** 单位保额 */
	private BigDecimal unitAmount;
	/** 保额 */
	private BigDecimal amount;
	
	private BigDecimal chgamount;
	/** 费率 */
	private BigDecimal rate;
	/** 保费 */
	private BigDecimal premium;
	private BigDecimal chgPremium;
	//销售费
	private BigDecimal salesFee;
	private BigDecimal chgSalesFee;
	/** 地理位置 */
//	private String raiseAddress;
	/** 备注 */
	private String remark;
	/** 短信转存后是否删除标记 */
	private String flag;
	private String itemFlag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	/** 分组组别号 */
	private Integer groupNo;

	
	
	public PrpPinsuredCataList() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyNo", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpPinsuredCataListId getId() {
		return this.id;
	}

	public void setId(PrpPinsuredCataListId id) {
		this.id = id;
	}

	/**       
	 * 投保单号码
	 */
	
  
	/**       
	 * 汇交单小保单号
	 */

	@Column(name = "subpolicyno")
	public String getSubPolicyNo() {
		return subPolicyNo;
	}

	public void setSubPolicyNo(String subPolicyNo) {
		this.subPolicyNo = subPolicyNo;
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
	 * 人员中文名称
	 */

	@Column(name = "insuredcname")
	public String getInsuredCName() {
		return this.insuredCName;
	}

	public void setInsuredCName(String insuredCName) {
		this.insuredCName = insuredCName;
	}
	@Column(name = "itemflag")
	public String getItemFlag() {
		return itemFlag;
	}

	public void setItemFlag(String itemFlag) {
		this.itemFlag = itemFlag;
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
	 * 出生日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday")
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**       
	 * 健康状况
	 */

	@Column(name = "health")
	public String getHealth() {
		return this.health;
	}

	public void setHealth(String health) {
		this.health = health;
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
	 * 职业分类
	 */

	@Column(name = "occupationtype")
	public String getOccupationType() {
		return this.occupationType;
	}

	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}

	/**       
	 * 任职种类
	 */

	@Column(name = "dutytype")
	public String getDutyType() {
		return this.dutyType;
	}

	public void setDutyType(String dutyType) {
		this.dutyType = dutyType;
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
	 * 户口所在地
	 */

	@Column(name = "boigonaddress")
	public String getBoigonAddress() {
		return this.boigonAddress;
	}

	public void setBoigonAddress(String boigonAddress) {
		this.boigonAddress = boigonAddress;
	}

	/**       
	 * 社会保障号
	 */

	@Column(name = "socialsecurityno")
	public String getSocialSecurityNo() {
		return this.socialSecurityNo;
	}

	public void setSocialSecurityNo(String socialSecurityNo) {
		this.socialSecurityNo = socialSecurityNo;
	}

	/**       
	 * 是否退休(Y/N)
	 */

	@Column(name = "retirementflag")
	public String getRetirementFlag() {
		return this.retirementFlag;
	}

	public void setRetirementFlag(String retirementFlag) {
		this.retirementFlag = retirementFlag;
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
	 * 起运日期
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
	 * 生效终止日期
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
	 * 行业代码
	 */
	@Column(name = "businesssort")
	public String getBusinessSort() {
		return businessSort;
	}

	public void setBusinessSort(String businessSort) {
		this.businessSort = businessSort;
	}

	/**       
	 * 所有制代码
	 */
	@Column(name = "businesssource")
	public String getBusinessSource() {
		return businessSource;
	}

	public void setBusinessSource(String businessSource) {
		this.businessSource = businessSource;
	}

	/**       
	 * 字符型预留字段1
	 */

	@Column(name = "prechar1")
	public String getPreChar1() {
		return this.preChar1;
	}

	public void setPreChar1(String preChar1) {
		this.preChar1 = preChar1;
	}

	/**       
	 * 字符型预留字段2
	 */

	@Column(name = "prechar2")
	public String getPreChar2() {
		return this.preChar2;
	}

	public void setPreChar2(String preChar2) {
		this.preChar2 = preChar2;
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
	 * 组别号
	 */

	@Column(name = "groupno")
	public Integer getGroupNo() {
		return groupNo;
	}

	public void setGroupNo(Integer groupNo) {
		this.groupNo = groupNo;
	}
	
	/**       
	 * 单位
	 */

	@Column(name = "unit")
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	/**       
	 * 数量
	 */

	@Column(name = "quantity")
	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	/**       
	 * 单位保额
	 */

	@Column(name = "unitAmount")
	public BigDecimal getUnitAmount() {
		return unitAmount;
	}

	public void setUnitAmount(BigDecimal unitAmount) {
		this.unitAmount = unitAmount;
	}
	
	/**       
	 * 保额
	 */

	@Column(name = "amount")
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	/**       
	 * 费率
	 */

	@Column(name = "rate")
	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	
	/**       
	 * 保费
	 */

	@Column(name = "premium")
	public BigDecimal getPremium() {
		return premium;
	}
	
	public void setPremium(BigDecimal premium) {
		this.premium = premium;
	}
	
	
	/**       
	 * 备注
	 */

	@Column(name = "remark")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Column(name = "policyno")
	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	@Column(name = "endorseno")
	public String getEndorseNo() {
		return endorseNo;
	}

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}
	@Column(name = "chgamount")
	public BigDecimal getChgamount() {
		return chgamount;
	}

	public void setChgamount(BigDecimal chgamount) {
		this.chgamount = chgamount;
	}
	@Column(name = "chgpremium")
	public BigDecimal getChgPremium() {
		return chgPremium;
	}

	public void setChgPremium(BigDecimal chgPremium) {
		this.chgPremium = chgPremium;
	}
	@Column(name = "salesfee")
	public BigDecimal getSalesFee() {
		return salesFee;
	}

	public void setSalesFee(BigDecimal salesFee) {
		this.salesFee = salesFee;
	}
	@Column(name = "chgsalesfee")
	public BigDecimal getChgSalesFee() {
		return chgSalesFee;
	}

	public void setChgSalesFee(BigDecimal chgSalesFee) {
		this.chgSalesFee = chgSalesFee;
	}


}
