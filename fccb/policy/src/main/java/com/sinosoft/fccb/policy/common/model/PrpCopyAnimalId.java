package com.sinosoft.fccb.policy.common.model;

// Generated 2013-1-4 17:17:07 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpCopyAnimalId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpCopyAnimalId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String applyNo;
	private Integer serialNo;

	public PrpCopyAnimalId() {
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
		if (!(other instanceof PrpCopyAnimalId))
			return false;
		PrpCopyAnimalId castOther = (PrpCopyAnimalId) other;

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
