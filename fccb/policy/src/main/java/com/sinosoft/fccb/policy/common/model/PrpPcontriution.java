package com.sinosoft.fccb.policy.common.model;

// Generated 2012-3-7 17:56:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import java.util.Date;
import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 * PrpPcontriution generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppcontriution")
public class PrpPcontriution implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** SerialNo */
	private PrpPcontriutionId id;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 批单号 */
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 类型 待定 */
	private String contribType;
	/** 人员代码 */
	private String contribCode;
	/** 集团统一人员编码 */
	private String contribCode_uni;
	/** 人员名称 */
	private String contribName;
	/** 客户序号 */
	private Integer insuredNo;
	/** 标的序号 */
	private Integer itemKindNo;
	/** 贡献比例 */
	private BigDecimal contribPercent;
	/** 贡献保费 */
	private BigDecimal contribPremium;
	/** 备注 */
	private String remark;
	/** 标志字段 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpPcontriution() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "proposalNo", column = @Column(name = "proposalno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpPcontriutionId getId() {
		return this.id;
	}

	public void setId(PrpPcontriutionId id) {
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
	 * 类型 1.专干 2.兼干 3.协保员
	 */

	@Column(name = "contribType")
	public String getContribType() {
		return this.contribType;
	}

	public void setContribType(String contribType) {
		this.contribType = contribType;
	}

	/**       
	 * 人员代码
	 */

	@Column(name = "contribCode")
	public String getContribCode() {
		return this.contribCode;
	}

	public void setContribCode(String contribCode) {
		this.contribCode = contribCode;
	}

	/**       
	 * 人员名称
	 */

	@Column(name = "contribName")
	@Basic(fetch = FetchType.LAZY)
	@Type(type = "org.springframework.orm.hibernate3.support.ClobStringType")
	public String getContribName() {
		return this.contribName;
	}

	public void setContribName(String contribName) {
		this.contribName = contribName;
	}

	/**       
	 * 客户序号
	 */

	@Column(name = "insuredNo")
	public Integer getInsuredNo() {
		return this.insuredNo;
	}

	public void setInsuredNo(Integer insuredNo) {
		this.insuredNo = insuredNo;
	}

	/**       
	 * 标的序号
	 */

	@Column(name = "itemKindNo")
	public Integer getItemKindNo() {
		return this.itemKindNo;
	}

	public void setItemKindNo(Integer itemKindNo) {
		this.itemKindNo = itemKindNo;
	}
	
	/**       
	 * 贡献比例
	 */

	@Column(name = "contribPercent")
	public BigDecimal getContribPercent() {
		return this.contribPercent;
	}

	public void setContribPercent(BigDecimal contribPercent) {
		this.contribPercent = contribPercent;
	}
	
	/**       
	 * 贡献保费
	 */

	@Column(name = "contribPremium")
	public BigDecimal getContribPremium() {
		return this.contribPremium;
	}

	public void setContribPremium(BigDecimal contribPremium) {
		this.contribPremium = contribPremium;
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

	/** 
	 * 集团统一人员编码 
	 */
	@Column(name = "contribCode_uni")
	public String getContribCode_uni() {
		return contribCode_uni;
	}

	public void setContribCode_uni(String contribCode_uni) {
		this.contribCode_uni = contribCode_uni;
	}

}
