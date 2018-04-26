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
 * Prppagent generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppagent")
public class PrpPagent implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 立案/预赔/实赔/结案号 */
	private PrpPagentId id;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	private String agreementNo;
	private String roleType;
	/** RoleName */
	private String roleName;
	/** 币别 */
	private String currency;
	private BigDecimal costRate;
	private BigDecimal costFee;
	/** 手续费变化量 */
	private BigDecimal chgCostFee;	
	/** 备注 */
	private String remark;
	/** 标志字段 */
	private String flag;
	private Date insertTimeForHis;
	private Date operateTimeForHis;

	public PrpPagent() {
	}

	/**       
	 * 立案/预赔/实赔/结案号
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno")),
			@AttributeOverride(name = "rolecode", column = @Column(name = "rolecode")),
			@AttributeOverride(name = "payNo", column = @Column(name = "payno")) })
	public PrpPagentId getId() {
		return this.id;
	}

	public void setId(PrpPagentId id) {
		this.id = id;
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

	@Column(name = "agreementno")
	public String getAgreementNo() {
		return this.agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	@Column(name = "roletype")
	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	/**       
	 * RoleName
	 */

	@Column(name = "rolename")
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	@Column(name = "costrate")
	public BigDecimal getCostRate() {
		return this.costRate;
	}

	public void setCostRate(BigDecimal costRate) {
		this.costRate = costRate;
	}

	@Column(name = "costfee")
	public BigDecimal getCostFee() {
		return this.costFee;
	}

	public void setCostFee(BigDecimal costFee) {
		this.costFee = costFee;
	}
	
	@Column(name = "chgcostFee")
	public BigDecimal getChgCostFee() {
		return this.chgCostFee;
	}

	public void setChgCostFee(BigDecimal chgCostFee) {
		this.chgCostFee = chgCostFee;
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


}
