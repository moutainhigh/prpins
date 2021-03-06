package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PrpCmainConstruct generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcmain_construct")
public class PrpCmainConstruct implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 投保单号码 */
	private String proposalNo;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 险种代码 */
	private String riskCode;
	/** 工程名称 */
	private String constructName;
	/** 工程类别 */
	private String constructType;
	/** 工程地点 */
	private String constructAddress;
	/** 用途 */
	private String purpose;
	/** 数量 */
	private Integer quantity;
	/** 试车期 */
	private Integer testPeriod;
	/** 日期 */
	private Date setDate;
	/** 工程开始日期 */
	private Date startFixDate;
	/** 工程终止日期 */
	private Date endFixDate;
	/** 开始日期 */
	private Date startAddDate;
	/** 终止日期 */
	private Date endAddDate;
	/** 备注 */
	private String remark;
	//RYANGQH2013110101 增加新产品GHA mod by liusaisai begin 20131225 
	/** 工程保险合同费率*/
	private BigDecimal contractRate;
	/** 最大赔偿期间（月）*/
	private String payPeriod;
	/** 免赔期（天/月）*/
	private String abatement;
	/** 试车期（月）*/
	private String tryPeriod;
	/** 保证期（月）*/
	private String guaraPeriod;
	//RYANGQH2013110101 增加新产品GHA mod by liusaisai end 20131225 
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCmainConstruct() {
	}

	/**       
	 * 投保单号码
	 */
	@Id
	@Column(name = "proposalno", unique = true, nullable = false)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	/**       
	 * 投保单号码
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proposalno", unique = true, nullable = false, insertable = false, updatable = false)
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
	 * 工程名称
	 */

	@Column(name = "constructname")
	public String getConstructName() {
		return this.constructName;
	}

	public void setConstructName(String constructName) {
		this.constructName = constructName;
	}

	/**       
	 * 工程类别
	 */

	@Column(name = "constructtype")
	public String getConstructType() {
		return this.constructType;
	}

	public void setConstructType(String constructType) {
		this.constructType = constructType;
	}

	/**       
	 * 工程地点
	 */

	@Column(name = "constructaddress")
	public String getConstructAddress() {
		return this.constructAddress;
	}

	public void setConstructAddress(String constructAddress) {
		this.constructAddress = constructAddress;
	}

	/**       
	 * 用途
	 */

	@Column(name = "purpose")
	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
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
	 * 试车期
	 */

	@Column(name = "testperiod")
	public Integer getTestPeriod() {
		return this.testPeriod;
	}

	public void setTestPeriod(Integer testPeriod) {
		this.testPeriod = testPeriod;
	}

	/**       
	 * 日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "setdate")
	public Date getSetDate() {
		return this.setDate;
	}

	public void setSetDate(Date setDate) {
		this.setDate = setDate;
	}

	/**       
	 * 工程开始日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "startfixdate")
	public Date getStartFixDate() {
		return this.startFixDate;
	}

	public void setStartFixDate(Date startFixDate) {
		this.startFixDate = startFixDate;
	}

	/**       
	 * 工程终止日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "endfixdate")
	public Date getEndFixDate() {
		return this.endFixDate;
	}

	public void setEndFixDate(Date endFixDate) {
		this.endFixDate = endFixDate;
	}

	/**       
	 * 开始日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "startadddate")
	public Date getStartAddDate() {
		return this.startAddDate;
	}

	public void setStartAddDate(Date startAddDate) {
		this.startAddDate = startAddDate;
	}

	/**       
	 * 终止日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "endadddate")
	public Date getEndAddDate() {
		return this.endAddDate;
	}

	public void setEndAddDate(Date endAddDate) {
		this.endAddDate = endAddDate;
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
	 * 工程保险合同费率
	*/
	@Column(name = "contractrate")
	public BigDecimal getContractRate() {
		return contractRate;
	}

	public void setContractRate(BigDecimal contractRate) {
		this.contractRate = contractRate;
	}
	/**       
	 * 最大赔偿期间（月）
	*/
	@Column(name = "payperiod")
	public String getPayPeriod() {
		return payPeriod;
	}

	public void setPayPeriod(String payPeriod) {
		this.payPeriod = payPeriod;
	}
	/**       
	 * 免赔期（天/月）
	*/
	@Column(name = "abatement")
	public String getAbatement() {
		return abatement;
	}

	public void setAbatement(String abatement) {
		this.abatement = abatement;
	}
	/**       
	 * 试车期（月）
	*/
	@Column(name = "tryperiod")
	public String getTryPeriod() {
		return tryPeriod;
	}

	public void setTryPeriod(String tryPeriod) {
		this.tryPeriod = tryPeriod;
	}
	/**       
	 * 保证期（月）
	*/
	@Column(name = "guaraperiod")
	public String getGuaraPeriod() {
		return guaraPeriod;
	}

	public void setGuaraPeriod(String guaraPeriod) {
		this.guaraPeriod = guaraPeriod;
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
