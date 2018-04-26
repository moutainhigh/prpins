package com.sinosoft.fccb.policy.common.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PrpPmainCoeff generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prppmain_coeff")
public class PrpPmainCoeff implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 批单申请号 */
	private String applyNo;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 批单号 */
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	/** 险种代码 */
	private String riskCode;
	/** 车损车型系数 */
	private BigDecimal coefficient1;
	/** 盗抢车型系数 */
	private BigDecimal coefficient2;
	/** 其他车型系数 */
	private BigDecimal coefficient3;
	/** 系数4 */
	private BigDecimal coefficient4;
	/** 系数5 */
	private BigDecimal coefficient5;
	/** 系数6 */
	private BigDecimal coefficient6;
	/** 备注 */
	private String remark;
	/** 短信转存后是否删除标记 */
	private String flag;

	public PrpPmainCoeff() {
	}

	/**       
	 * 批单申请号
	 */
	@Id
	@Column(name = "applyno")
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	/**       
	 * 批单申请号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", unique = true, nullable = false, insertable = false, updatable = false)
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

	@Column(name = "riskcode")
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	/**       
	 * 车损车型系数
	 */

	@Column(name = "coefficient1")
	public BigDecimal getCoefficient1() {
		return this.coefficient1;
	}

	public void setCoefficient1(BigDecimal coefficient1) {
		this.coefficient1 = coefficient1;
	}

	/**       
	 * 盗抢车型系数
	 */

	@Column(name = "coefficient2")
	public BigDecimal getCoefficient2() {
		return this.coefficient2;
	}

	public void setCoefficient2(BigDecimal coefficient2) {
		this.coefficient2 = coefficient2;
	}

	/**       
	 * 其他车型系数
	 */

	@Column(name = "coefficient3")
	public BigDecimal getCoefficient3() {
		return this.coefficient3;
	}

	public void setCoefficient3(BigDecimal coefficient3) {
		this.coefficient3 = coefficient3;
	}

	/**       
	 * 系数4
	 */

	@Column(name = "coefficient4")
	public BigDecimal getCoefficient4() {
		return this.coefficient4;
	}

	public void setCoefficient4(BigDecimal coefficient4) {
		this.coefficient4 = coefficient4;
	}

	/**       
	 * 系数5
	 */

	@Column(name = "coefficient5")
	public BigDecimal getCoefficient5() {
		return this.coefficient5;
	}

	public void setCoefficient5(BigDecimal coefficient5) {
		this.coefficient5 = coefficient5;
	}

	/**       
	 * 系数6
	 */

	@Column(name = "coefficient6")
	public BigDecimal getCoefficient6() {
		return this.coefficient6;
	}

	public void setCoefficient6(BigDecimal coefficient6) {
		this.coefficient6 = coefficient6;
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
	 * 短信转存后是否删除标记
	 */

	@Column(name = "flag")
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}
