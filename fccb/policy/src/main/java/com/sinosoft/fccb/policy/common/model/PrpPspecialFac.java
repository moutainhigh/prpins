package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-16 19:00:02 by Hibernate Tools 3.2.0.b9-sinosoft1.1

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
 * PrpPspecialFac generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppspecialfac")
public class PrpPspecialFac implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 接受人序号 */
	private PrpPspecialFacId id;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 批单号 */
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	/** 接受人编码 */
	private String reinsCode;
	/** 接受人简称 */
	private String reinsName;
	/** 最终接受人编码 */
	private String freinsCode;
	/** 最终接受人简称 */
	private String freinsName;
	/** 结付人编码 */
	private String payCode;
	/** 结付人简称 */
	private String payName;
	/** 分保份额 */
	private BigDecimal shareRate;
	/** 手续费比例 */
	private BigDecimal commRate;
	/** 扣税比例 */
	private BigDecimal taxRate;
	/** 其他费用比例 */
	private BigDecimal othRate;
	/** 备注 */
	private String remark;
	/** 以净保费计算否 */
	private String netFlag;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpPspecialFac() {
	}

	/**       
	 * 接受人序号
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "applyNo", column = @Column(name = "applyno", nullable = false)),
			@AttributeOverride(name = "reinsNo", column = @Column(name = "reinsno", nullable = false)) })
	public PrpPspecialFacId getId() {
		return this.id;
	}

	public void setId(PrpPspecialFacId id) {
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
	 * 接受人编码
	 */

	@Column(name = "reinscode")
	public String getReinsCode() {
		return this.reinsCode;
	}

	public void setReinsCode(String reinsCode) {
		this.reinsCode = reinsCode;
	}

	/**       
	 * 接受人简称
	 */

	@Column(name = "reinsname")
	public String getReinsName() {
		return this.reinsName;
	}

	public void setReinsName(String reinsName) {
		this.reinsName = reinsName;
	}

	/**       
	 * 最终接受人编码
	 */

	@Column(name = "freinscode")
	public String getFreinsCode() {
		return this.freinsCode;
	}

	public void setFreinsCode(String freinsCode) {
		this.freinsCode = freinsCode;
	}

	/**       
	 * 最终接受人简称
	 */

	@Column(name = "freinsname")
	public String getFreinsName() {
		return this.freinsName;
	}

	public void setFreinsName(String freinsName) {
		this.freinsName = freinsName;
	}

	/**       
	 * 结付人编码
	 */

	@Column(name = "paycode")
	public String getPayCode() {
		return this.payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	/**       
	 * 结付人简称
	 */

	@Column(name = "payname")
	public String getPayName() {
		return this.payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	/**       
	 * 分保份额
	 */

	@Column(name = "sharerate")
	public BigDecimal getShareRate() {
		return this.shareRate;
	}

	public void setShareRate(BigDecimal shareRate) {
		this.shareRate = shareRate;
	}

	/**       
	 * 手续费比例
	 */

	@Column(name = "commrate")
	public BigDecimal getCommRate() {
		return this.commRate;
	}

	public void setCommRate(BigDecimal commRate) {
		this.commRate = commRate;
	}

	/**       
	 * 扣税比例
	 */

	@Column(name = "taxrate")
	public BigDecimal getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	/**       
	 * 其他费用比例
	 */

	@Column(name = "othrate")
	public BigDecimal getOthRate() {
		return this.othRate;
	}

	public void setOthRate(BigDecimal othRate) {
		this.othRate = othRate;
	}

	/**       
	 * 以净保费计算否
	 */

	@Column(name = "netflag")
	public String getNetFlag() {
		return this.netFlag;
	}

	public void setNetFlag(String netFlag) {
		this.netFlag = netFlag;
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
	/** 备注 */
	@Column(name = "remark")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
