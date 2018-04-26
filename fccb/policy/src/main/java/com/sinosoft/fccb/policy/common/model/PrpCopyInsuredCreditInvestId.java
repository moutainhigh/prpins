package com.sinosoft.fccb.policy.common.model;

import javax.persistence.Column;

public class PrpCopyInsuredCreditInvestId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String applyNo;
	private Integer serialNo;

	public PrpCopyInsuredCreditInvestId() {
	}

	@Column(name = "applyno", nullable = false)
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	@Column(name = "serialno", nullable = false)
	public Integer getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpCopyInsuredCreditInvestId))
			return false;
		PrpCopyInsuredCreditInvestId castOther = (PrpCopyInsuredCreditInvestId) other;

		return ((this.getApplyNo() == castOther.getApplyNo()) || (this
				.getApplyNo() != null
				&& castOther.getApplyNo() != null && this.getApplyNo().equals(
				castOther.getApplyNo())))
				&& ((this.getSerialNo() == castOther.getSerialNo()) || (this
						.getSerialNo() != null
						&& castOther.getSerialNo() != null && this
						.getSerialNo().equals(castOther.getSerialNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getApplyNo() == null ? 0 : this.getApplyNo().hashCode());
		result = 37 * result
				+ (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		return result;
	}
}