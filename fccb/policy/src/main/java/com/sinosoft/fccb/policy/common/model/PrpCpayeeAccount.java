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
 * PrpCpayeeAccount generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcpayeeaccount")
public class PrpCpayeeAccount implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 顺序号 */
	private PrpCpayeeAccountId id;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 期次 */
	private Integer payNo;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 开户行代码 */
	private String bankCode;
	/** 开户行名称 */
	private String bankName;
	/** 付款银行 */
	private String paybank;
	/** 付款帐号 */
	private String paybankaccount;
	/** 银行帐号 */
	private String accountNo;
	/** 帐户名 */
	private String accountName;
	/** 领款人类型 */
	private String accountType;
	/** 领款人代码 */
	private String accountCode;
	/** 银行代码 */
	private String basicBankCode;
	/** 银行名称 */
	private String basicBankName;
	/** 银行区域代码 */
	private String recBankAreaCode;
	/** 银行区域名称 */
	private String recBankAreaName;
	/** 证件类型 */
	private String identifyType;
	/** 证件号码 */
	private String identifyNo;
	/** 电话 */
	private String telephone;
	/** 公私标志 */
	private String isPrivate;
	/** 卡折标志 */
	private String cardType;
	/** 联行号 */
	private String cnaps;
	/** 加急标志 */
	private String isFast;
	/** 支付ID */
	private String payeeInfoid;
	/** 是否发送短信 */
	private String sendSms;
	/** 是否发送邮件 */
	private String sendMail;
	/** 邮箱地址 */
	private String mailAddr;
	/** 支付币种代码 */
	private String currency;
	/** 支付方式 **/
	private String paymodeflag;
	/** 用途 **/
	private String purpose;
	/**RYANGQH2013052101 保费批退时支付币种与保单的实收币种保持一致 startby xupp 20130819*/
	/** 实退币种 **/
	private String currency1;
	/** 实退金额 **/
	private BigDecimal truePaySumFee;
	/** 兑换率 **/
	private BigDecimal rate;
	/** 效力状态 **/
	private String validStatus;
	/** 支付方式 */
	private String payType;
	/** 支付金额 */
	private BigDecimal paySumFee;
	/** 支付日期 */
	private Date payDate;
	/** 密钥版本 */
	private String md5Version;
	/** MD5校验码 */
	private String md5Data;
	/** 操作员代码 */
	private String operatorCode;
	/** 扩展字段1 */
	private String preChar1;
	/** 扩展字段2 */
	private String preChar2;
	/** 短信转存后是否删除标记 */
	private String flag;

	public PrpCpayeeAccount() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "proposalNo", column = @Column(name = "proposalno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpCpayeeAccountId getId() {
		return this.id;
	}

	public void setId(PrpCpayeeAccountId id) {
		this.id = id;
	}

	/**       
	 * 投保单号
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
	 * 期次
	 */
	@Column(name = "payno")
	public Integer getPayNo() {
		return this.payNo;
	}

	public void setPayNo(Integer payNo) {
		this.payNo = payNo;
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
	 * 开户行代码
	 */

	@Column(name = "bankcode")
	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	/**       
	 * 开户行名称
	 */

	@Column(name = "bankname")
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**       
	 * 银行帐号
	 */

	@Column(name = "accountno")
	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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
	 * 领款人类型
	 */
	
	@Column(name = "accounttype")
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * 领款人代码
	 */
	
	@Column(name = "accountcode")
	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	/**
	 * 银行代码
	 */
	
	@Column(name = "basicbankcode")
	public String getBasicBankCode() {
		return basicBankCode;
	}

	public void setBasicBankCode(String basicBankCode) {
		this.basicBankCode = basicBankCode;
	}

	/**
	 * 银行名称
	 */
	
	@Column(name = "basicbankname")
	public String getBasicBankName() {
		return basicBankName;
	}

	public void setBasicBankName(String basicBankName) {
		this.basicBankName = basicBankName;
	}
	
	/** 
	 * 银行区域代码 
	 */
	
	@Column(name = "recbankareacode")
	public String getRecBankAreaCode() {
		return this.recBankAreaCode;
	}
	
	public void setRecBankAreaCode(String recBankAreaCode) {
		this.recBankAreaCode = recBankAreaCode;
	}
	
	/** 
	 * 银行区域名称 
	 */
	
	@Column(name = "recbankareaname")
	public String getRecBankAreaName() {
		return this.recBankAreaName;
	}
	
	public void setRecBankAreaName(String recBankAreaName) {
		this.recBankAreaName = recBankAreaName;
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
	 * 证件号码 
	 */
	
	@Column(name = "identifyno")
	public String getIdentifyNo() {
		return this.identifyNo;
	}
	
	public void setIdentifyNo(String identifyNo) {
		this.identifyNo = identifyNo;
	}
	
	/** 
	 * 电话 
	 */
	
	@Column(name = "telephone")
	public String getTelephone() {
		return this.telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/** 
	 * 公私标志 
	 */
	
	@Column(name = "isprivate")
	public String getIsPrivate() {
		return this.isPrivate;
	}
	
	public void setIsPrivate(String isPrivate) {
		this.isPrivate = isPrivate;
	}
	
	/** 
	 * 卡折标志 
	 */
	
	@Column(name = "cardtype")
	public String getCardType() {
		return this.cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	/** 
	 * 联行号 
	 */
	
	@Column(name = "cnaps")
	public String getCnaps() {
		return this.cnaps;
	}
	
	public void setCnaps(String cnaps) {
		this.cnaps = cnaps;
	}
	
	/** 
	 * 加急标志
	 */
	
	@Column(name = "isfast")
	public String getIsFast() {
		return this.isFast;
	}
	
	public void setIsFast(String isFast) {
		this.isFast = isFast;
	}
	
	/** 
	 * 支付ID 
	 */
	
	@Column(name = "payeeinfoid")
	public String getPayeeInfoid() {
		return this.payeeInfoid;
	}
	
	public void setPayeeInfoid(String payeeInfoid) {
		this.payeeInfoid = payeeInfoid;
	}
	
	/** 
	 * 是否发送短信 
	 */
	
	@Column(name = "sendsms")
	public String getSendSms() {
		return this.sendSms;
	}
	
	public void setSendSms(String sendSms) {
		this.sendSms = sendSms;
	}
	
	/** 
	 * 是否发送邮件 
	 */
	
	@Column(name = "sendmail")
	public String getSendMail() {
		return this.sendMail;
	}
	
	public void setSendMail(String sendMail) {
		this.sendMail = sendMail;
	}
	
	/** 
	 * 邮箱地址 
	 */
	
	@Column(name = "mailaddr")
	public String getMailAddr() {
		return this.mailAddr;
	}
	
	public void setMailAddr(String mailAddr) {
		this.mailAddr = mailAddr;
	}
	
	/** 
	 * 支付币种代码 
	 */
	
	@Column(name = "currency")
	public String getCurrency() {
		return this.currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * 支付方式
	 */
	
	@Column(name = "paymodeflag")
	public String getPaymodeflag() {
		return paymodeflag;
	}
	
	public void setPaymodeflag(String paymodeflag) {
		this.paymodeflag = paymodeflag;
	}
	
	/** 
	 * 用途 
	 */
	
	@Column(name = "purpose")
	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	/** 
	 * 实退币别 
	 */
	
	@Column(name = "currency1")
	public String getCurrency1() {
		return currency1;
	}

	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	/** 
	 * 实退金额 
	 */
	
	@Column(name = "truePaySumFee")
	public BigDecimal getTruePaySumFee() {
		return truePaySumFee;
	}

	public void setTruePaySumFee(BigDecimal truePaySumFee) {
		this.truePaySumFee = truePaySumFee;
	}

	/** 
	 * 兑换率 
	 */
	
	@Column(name = "rate")
	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	/** 
	 * 效力状态
	 */
	
	@Column(name = "validstatus", nullable = false)
	public String getValidStatus() {
		return validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
	
	/**       
	 * 支付方式
	 */

	@Column(name = "paytype")
	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	/**       
	 * 支付金额
	 */

	@Column(name = "paysumfee")
	public BigDecimal getPaySumFee() {
		return this.paySumFee;
	}

	public void setPaySumFee(BigDecimal paySumFee) {
		this.paySumFee = paySumFee;
	}

	/**       
	 * 支付日期
	 */
	
	@Temporal(TemporalType.DATE)
	@Column(name = "paydate")
	public Date getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	/**       
	 * 操作员代码
	 */

	@Column(name = "operatorcode")
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	/**       
	 * 扩展字段1
	 */
	
	@Column(name = "prechar1")
	public String getPreChar1() {
		return preChar1;
	}

	public void setPreChar1(String preChar1) {
		this.preChar1 = preChar1;
	}
	
	/**       
	 * 扩展字段2
	 */
	
	@Column(name = "prechar2")
	public String getPreChar2() {
		return preChar2;
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
	 * 密钥版本 
	 */
	@Column(name = "md5version")
	public String getMd5Version() {
		return md5Version;
	}

	public void setMd5Version(String md5Version) {
		this.md5Version = md5Version;
	}

	/** 
	 * MD5校验码
	 */
	@Column(name = "md5data")
	public String getMd5Data() {
		return md5Data;
	}

	public void setMd5Data(String md5Data) {
		this.md5Data = md5Data;
	}

	public String getPaybank() {
		return paybank;
	}

	public void setPaybank(String paybank) {
		this.paybank = paybank;
	}

	public String getPaybankaccount() {
		return paybankaccount;
	}

	public void setPaybankaccount(String paybankaccount) {
		this.paybankaccount = paybankaccount;
	}
	
}
