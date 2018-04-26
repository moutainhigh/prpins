package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpPprofitFactorId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpPprofitFactorId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String applyNo;
	private String profitCode;
	private Integer serialNo;
	private String conditionCode;

	public PrpPprofitFactorId() {
	}

	@Column(name = "applyno", nullable = false)
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	@Column(name = "profitcode", nullable = false)
	public String getProfitCode() {
		return this.profitCode;
	}

	public void setProfitCode(String profitCode) {
		this.profitCode = profitCode;
	}

	@Column(name = "serialno", nullable = false)
	public Integer getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "conditioncode", nullable = false)
	public String getConditionCode() {
		return this.conditionCode;
	}

	public void setConditionCode(String conditionCode) {
		this.conditionCode = conditionCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpPprofitFactorId))
			return false;
		PrpPprofitFactorId castOther = (PrpPprofitFactorId) other;

		return ((this.getApplyNo() == castOther.getApplyNo()) || (this
				.getApplyNo() != null
				&& castOther.getApplyNo() != null && this.getApplyNo().equals(
				castOther.getApplyNo())))
				&& ((this.getProfitCode() == castOther.getProfitCode()) || (this
						.getProfitCode() != null
						&& castOther.getProfitCode() != null && this
						.getProfitCode().equals(castOther.getProfitCode())))
				&& ((this.getSerialNo() == castOther.getSerialNo()) || (this
						.getSerialNo() != null
						&& castOther.getSerialNo() != null && this
						.getSerialNo().equals(castOther.getSerialNo())))
				&& ((this.getConditionCode() == castOther.getConditionCode()) || (this
						.getConditionCode() != null
						&& castOther.getConditionCode() != null && this
						.getConditionCode()
						.equals(castOther.getConditionCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getApplyNo() == null ? 0 : this.getApplyNo().hashCode());
		result = 37
				* result
				+ (getProfitCode() == null ? 0 : this.getProfitCode()
						.hashCode());
		result = 37 * result
				+ (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		result = 37
				* result
				+ (getConditionCode() == null ? 0 : this.getConditionCode()
						.hashCode());
		return result;
	}

}
