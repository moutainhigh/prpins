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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PrpCopyProfit generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcopyprofit")
public class PrpCopyProfit implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 优惠折扣类型 */
	private PrpCopyProfitId id;
	/** 序号 */
	private PrpCopyItemKind prpCopyItemKind;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 险别代码 */
	private String kindCode;
	/** 币别 */
	private String currency;
	/** 折扣率 */
	private BigDecimal discount;
	/** 优惠（折扣）金额 */
	private BigDecimal totalProfit;
	/** 是否冲减保费 */
	private String minusFlag;
	/** 经办人代码 */
	private String handlerCode;
	/** 复核人代码 */
	private String approverCode;
	/** 操作员代码 */
	private String operatorCode;
	/** 输入日期 */
	private Date inputDate;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	private List<PrpCopyProfitDetail> prpCopyProfitDetails = new ArrayList<PrpCopyProfitDetail>(
			0);

	public PrpCopyProfit() {
	}

	/**       
	 * 优惠折扣类型
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "itemKindNo", column = @Column(name = "itemkindno", nullable = false)),
			@AttributeOverride(name = "profitType", column = @Column(name = "profittype", nullable = false)) })
	public PrpCopyProfitId getId() {
		return this.id;
	}

	public void setId(PrpCopyProfitId id) {
		this.id = id;
	}

	/**       
	 * 序号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "applyno", referencedColumnName = "applyno", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "itemkindno", referencedColumnName = "itemkindno", nullable = false, insertable = false, updatable = false) })
	public PrpCopyItemKind getPrpCopyItemKind() {
		return this.prpCopyItemKind;
	}

	public void setPrpCopyItemKind(PrpCopyItemKind prpCopyItemKind) {
		this.prpCopyItemKind = prpCopyItemKind;
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
	 * 险别代码
	 */

	@Column(name = "kindcode", nullable = false)
	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	/**       
	 * 币别
	 */

	@Column(name = "currency", nullable = false)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**       
	 * 折扣率
	 */

	@Column(name = "discount")
	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	/**       
	 * 优惠（折扣）金额
	 */

	@Column(name = "totalprofit")
	public BigDecimal getTotalProfit() {
		return this.totalProfit;
	}

	public void setTotalProfit(BigDecimal totalProfit) {
		this.totalProfit = totalProfit;
	}

	/**       
	 * 是否冲减保费
	 */

	@Column(name = "minusflag")
	public String getMinusFlag() {
		return this.minusFlag;
	}

	public void setMinusFlag(String minusFlag) {
		this.minusFlag = minusFlag;
	}

	/**       
	 * 经办人代码
	 */

	@Column(name = "handlercode", nullable = false)
	public String getHandlerCode() {
		return this.handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	/**       
	 * 复核人代码
	 */

	@Column(name = "approvercode")
	public String getApproverCode() {
		return this.approverCode;
	}

	public void setApproverCode(String approverCode) {
		this.approverCode = approverCode;
	}

	/**       
	 * 操作员代码
	 */

	@Column(name = "operatorcode", nullable = false)
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	/**       
	 * 输入日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "inputdate", nullable = false)
	public Date getInputDate() {
		return this.inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "prpCopyProfit")
	public List<PrpCopyProfitDetail> getPrpCopyProfitDetails() {
		return this.prpCopyProfitDetails;
	}

	public void setPrpCopyProfitDetails(
			List<PrpCopyProfitDetail> prpCopyProfitDetails) {
		this.prpCopyProfitDetails = prpCopyProfitDetails;
	}

}
