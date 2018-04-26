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
 * PrpCopyCoins generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcopycoins")
public class PrpCopyCoins implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 币别 */
	private PrpCopyCoinsId id;
	/** 批单申请号 */
	private PrpCopyMain prpCopyMain;
	/** 保单号 */
	private String policyNo;
	/** 主保单号码 */
	private String mainPolicyNo;
	/** 共保人机构代码 */
	private String coinsCode;
	/** 共保人名称 */
	private String coinsName;
	/** 共保类型 */
	private String coinsType;
	/** 共保份额 */
	private BigDecimal coinsRate;
	/** 分额保额 */
	private BigDecimal coinsAmount;
	/** 分额保费 */
	private BigDecimal coinsPremium;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 共保身份 */
	private String coIdentity;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	
	//RZHANGT2013032801_01 联保方案改造，新增字段 add by zhoujin 20130809 begin
	/**主投保单号码*/
	private String mainProposalNo;
   
	/**从联方投保单号码*/
	private String subProposalNo;
	
	/**从联方批单申请号*/
	private String subApplyNo;
	
	/**主批单申请号*/
	private String  mainApplyNo;
	
	/**主批单号码*/
	private String mainEndorseNo;
	
	/**支付手续费方式  [1]是否代从联方支手续费 [2]是否代共保方收支保费 [3]是否代共保方支手续费 [4]是否代开他方发票*/
	private String payType;
	
	/**归属业务员*/
	private String handler1Code;	
	
	/**归属业务员统一工号*/
	private String handler1Code_uni;
	
	/**经办人*/
	private String handlerCode;
	
	/**经办人统一工号*/
	private String handlerCode_uni;
	
	/**操作员代码*/
	private String operatorCode;
	
	/**业务性质*/
	private String businessNature;
	
	/**渠道码*/
	private String agentCode;
	
	/**银行代码*/
	private String basicBankCode;
	
	/**银行名称*/
	private String basicBankName;
	
	/**银行区域代码*/
	private String recBankAreaCode;
	
	/**银行区域名称*/
	private String recBankAreaName;
	
	/**开户行代码*/
	private String bankCode;
	
	/**开户行名称*/
	private String bankName;
   
	/**银行帐号*/
	private String accountNo;
	
	/**银行帐号名称*/
	private String accountName;
	
	/**联行号*/
	private String cnaps;	
	
	/**证件类型*/
	private String identifyType;
	
	/**证件号码*/
	private String identifyNo;
	
	/**电话*/
	private String telephone;
	
	/**公私标志*/
	private String isPrivate;
	
	/**用途*/
	private String purpose;
	
	/**卡折标志*/
	private String cardType;
	
	/**是否发送短信*/
	private String sendSms;
	
	/**是否发送邮件*/
	private String sendMail;	
	
	/**支付ID*/
	private String payeeInfoid;
	
	/**邮箱地址*/
	private String mailAddr;
	
	/**支付方式*/
	private String paymodeflag;
	
	/**联保方类型*/
	private String comType;
	//RZHANGT2013032801_01 联保方案改造，新增字段 add by zhoujin 20130809 end
	
	//ZIS从联自动流程 add by zhangpengfei
	/**资源分配码*/
	private String resourceCode;
	
	/**标志*/
	private String coinsExtraFlag;

	public PrpCopyCoins() {
	}

	/**       
	 * 币别
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)),
			@AttributeOverride(name = "currency", column = @Column(name = "currency", nullable = false)) })
	public PrpCopyCoinsId getId() {
		return this.id;
	}

	public void setId(PrpCopyCoinsId id) {
		this.id = id;
	}

	/**       
	 * 批单申请号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", nullable = false, insertable = false, updatable = false)
	public PrpCopyMain getPrpCopyMain() {
		return this.prpCopyMain;
	}

	public void setPrpCopyMain(PrpCopyMain prpCopyMain) {
		this.prpCopyMain = prpCopyMain;
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
	 * 主保单号码
	 */

	@Column(name = "mainpolicyno", nullable = false)
	public String getMainPolicyNo() {
		return this.mainPolicyNo;
	}

	public void setMainPolicyNo(String mainPolicyNo) {
		this.mainPolicyNo = mainPolicyNo;
	}

	/**       
	 * 共保人机构代码
	 */

	@Column(name = "coinscode")
	public String getCoinsCode() {
		return this.coinsCode;
	}

	public void setCoinsCode(String coinsCode) {
		this.coinsCode = coinsCode;
	}

	/**       
	 * 共保人名称
	 */

	@Column(name = "coinsname", nullable = false)
	public String getCoinsName() {
		return this.coinsName;
	}

	public void setCoinsName(String coinsName) {
		this.coinsName = coinsName;
	}

	/**       
	 * 共保类型
	 */

	@Column(name = "coinstype", nullable = false)
	public String getCoinsType() {
		return this.coinsType;
	}

	public void setCoinsType(String coinsType) {
		this.coinsType = coinsType;
	}

	/**       
	 * 共保份额
	 */

	@Column(name = "coinsrate")
	public BigDecimal getCoinsRate() {
		return this.coinsRate;
	}

	public void setCoinsRate(BigDecimal coinsRate) {
		this.coinsRate = coinsRate;
	}

	/**       
	 * 分额保额
	 */

	@Column(name = "coinsamount")
	public BigDecimal getCoinsAmount() {
		return this.coinsAmount;
	}

	public void setCoinsAmount(BigDecimal coinsAmount) {
		this.coinsAmount = coinsAmount;
	}

	/**       
	 * 分额保费
	 */

	@Column(name = "coinspremium")
	public BigDecimal getCoinsPremium() {
		return this.coinsPremium;
	}

	public void setCoinsPremium(BigDecimal coinsPremium) {
		this.coinsPremium = coinsPremium;
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
	 * 共保身份 
	 */

	@Column(name = "coIdentity")
	public String getCoIdentity() {
		return this.coIdentity;
	}

	public void setCoIdentity(String coIdentity) {
		this.coIdentity = coIdentity;
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

	public String getMainProposalNo() {
		return mainProposalNo;
	}

	public void setMainProposalNo(String mainProposalNo) {
		this.mainProposalNo = mainProposalNo;
	}

	public String getSubProposalNo() {
		return subProposalNo;
	}

	public void setSubProposalNo(String subProposalNo) {
		this.subProposalNo = subProposalNo;
	}

	public String getMainApplyNo() {
		return mainApplyNo;
	}

	public void setMainApplyNo(String mainApplyNo) {
		this.mainApplyNo = mainApplyNo;
	}

	public String getMainEndorseNo() {
		return mainEndorseNo;
	}

	public void setMainEndorseNo(String mainEndorseNo) {
		this.mainEndorseNo = mainEndorseNo;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getHandler1Code() {
		return handler1Code;
	}

	public void setHandler1Code(String handler1Code) {
		this.handler1Code = handler1Code;
	}

	public String getHandlerCode() {
		return handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	public String getOperatorCode() {
		return operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public String getBusinessNature() {
		return businessNature;
	}

	public void setBusinessNature(String businessNature) {
		this.businessNature = businessNature;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getBasicBankCode() {
		return basicBankCode;
	}

	public void setBasicBankCode(String basicBankCode) {
		this.basicBankCode = basicBankCode;
	}

	public String getBasicBankName() {
		return basicBankName;
	}

	public void setBasicBankName(String basicBankName) {
		this.basicBankName = basicBankName;
	}

	public String getRecBankAreaCode() {
		return recBankAreaCode;
	}

	public void setRecBankAreaCode(String recBankAreaCode) {
		this.recBankAreaCode = recBankAreaCode;
	}

	public String getRecBankAreaName() {
		return recBankAreaName;
	}

	public void setRecBankAreaName(String recBankAreaName) {
		this.recBankAreaName = recBankAreaName;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCnaps() {
		return cnaps;
	}

	public void setCnaps(String cnaps) {
		this.cnaps = cnaps;
	}

	public String getIdentifyType() {
		return identifyType;
	}

	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	public String getIdentifyNo() {
		return identifyNo;
	}

	public void setIdentifyNo(String identifyNo) {
		this.identifyNo = identifyNo;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(String isPrivate) {
		this.isPrivate = isPrivate;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getSendSms() {
		return sendSms;
	}

	public void setSendSms(String sendSms) {
		this.sendSms = sendSms;
	}

	public String getSendMail() {
		return sendMail;
	}

	public void setSendMail(String sendMail) {
		this.sendMail = sendMail;
	}

	public String getPayeeInfoid() {
		return payeeInfoid;
	}

	public void setPayeeInfoid(String payeeInfoid) {
		this.payeeInfoid = payeeInfoid;
	}

	public String getMailAddr() {
		return mailAddr;
	}

	public void setMailAddr(String mailAddr) {
		this.mailAddr = mailAddr;
	}

	public String getPaymodeflag() {
		return paymodeflag;
	}

	public void setPaymodeflag(String paymodeflag) {
		this.paymodeflag = paymodeflag;
	}

	public String getComType() {
		return comType;
	}

	public void setComType(String comType) {
		this.comType = comType;
	}

	public String getSubApplyNo() {
		return subApplyNo;
	}

	public void setSubApplyNo(String subApplyNo) {
		this.subApplyNo = subApplyNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}

	public String getCoinsExtraFlag() {
		return coinsExtraFlag;
	}

	public void setCoinsExtraFlag(String coinsExtraFlag) {
		this.coinsExtraFlag = coinsExtraFlag;
	}

	@Column(name = "handler1code_uni")
	public String getHandler1Code_uni() {
		return handler1Code_uni;
	}

	public void setHandler1Code_uni(String handler1CodeUni) {
		handler1Code_uni = handler1CodeUni;
	}

	@Column(name = "handlercode_uni")
	public String getHandlerCode_uni() {
		return handlerCode_uni;
	}

	public void setHandlerCode_uni(String handlerCodeUni) {
		handlerCode_uni = handlerCodeUni;
	}


}
