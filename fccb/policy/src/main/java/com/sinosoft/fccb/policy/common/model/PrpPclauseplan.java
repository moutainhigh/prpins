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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Prpcplan generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppclauseplan")
public class PrpPclauseplan implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 顺序号 */
	private PrpPclauseplanId id;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 保单号 */
	private String policyNo;
	/** 批单号 */
	private String endorseNo;
	/** 条款责任序号 */
	private Integer itemKindNo;
	private String payReason;
	private String clauseCode;
	private String kindCode;
	private String itemCode;
	/** 币别 */
	private String currency;
	private BigDecimal planFee;
	/** 标志字段 */
	private String flag;
	/** 营业税保费变化量*/
    private BigDecimal chgBusTaxPremium;
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	private String ext1;
	private String ext2;
	private String ext3;
	/** 税额 */
	private BigDecimal taxFee;
	public PrpPclauseplan() {
	}

	/**       
	 * 顺序号
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyno", column = @Column(name = "applyno")),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno")) })
	public PrpPclauseplanId getId() {
		return id;
	}

	public void setId(PrpPclauseplanId id) {
		this.id = id;
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
		return this.endorseNo;
	}

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", nullable = false, insertable = false, updatable = false)
	public PrpPhead getPrpPhead() {
		return prpPhead;
	}

	public void setPrpPhead(PrpPhead prpPhead) {
		this.prpPhead = prpPhead;
	}
	
	/**       
	 * 立案/预赔/实赔/结案号
	 */

	@Column(name = "itemKindNo")
	public Integer getItemKindNo() {
		return itemKindNo;
	}

	public void setItemKindNo(Integer itemKindNo) {
		this.itemKindNo = itemKindNo;
	}

	@Column(name = "payreason")
	public String getPayReason() {
		return this.payReason;
	}

	public void setPayReason(String payreason) {
		this.payReason = payreason;
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
	
	@Column(name = "planfee")
	public BigDecimal getPlanFee() {
		return this.planFee;
	}

	public void setPlanFee(BigDecimal planfee) {
		this.planFee = planfee;
	}

	/**       
	 * 标志字段
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

	@Column(name = "clauseCode")
	public String getClauseCode() {
		return clauseCode;
	}

	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}

	@Column(name = "kindCode")
	public String getKindCode() {
		return kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	@Column(name = "itemCode")
	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	@Column(name = "ext1")
	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	@Column(name = "ext2")
	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

	@Column(name = "ext3")
	public String getExt3() {
		return ext3;
	}

	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}
	/**       
	 * 税额
	 */
	
	@Column(name = "taxFee")
	public BigDecimal getTaxFee() {
		return taxFee;
	}

	public void setTaxFee(BigDecimal taxFee) {
		this.taxFee = taxFee;
	}
	@Column(name = "chgbustaxpremium")
	public BigDecimal getChgBusTaxPremium() {
		return chgBusTaxPremium;
	}

	public void setChgBusTaxPremium(BigDecimal chgBusTaxPremium) {
		this.chgBusTaxPremium = chgBusTaxPremium;
	}
	
}
