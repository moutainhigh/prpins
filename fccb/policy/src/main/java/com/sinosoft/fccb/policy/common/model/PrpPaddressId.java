package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpPaddressId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpPaddressId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String applyNo;
	private Integer addressNo;

	public PrpPaddressId() {
	}

	@Column(name = "applyno", nullable = false)
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	@Column(name = "addressno", nullable = false)
	public Integer getAddressNo() {
		return this.addressNo;
	}

	public void setAddressNo(Integer addressNo) {
		this.addressNo = addressNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpPaddressId))
			return false;
		PrpPaddressId castOther = (PrpPaddressId) other;

		return ((this.getApplyNo() == castOther.getApplyNo()) || (this
				.getApplyNo() != null
				&& castOther.getApplyNo() != null && this.getApplyNo().equals(
				castOther.getApplyNo())))
				&& ((this.getAddressNo() == castOther.getAddressNo()) || (this
						.getAddressNo() != null
						&& castOther.getAddressNo() != null && this
						.getAddressNo().equals(castOther.getAddressNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getApplyNo() == null ? 0 : this.getApplyNo().hashCode());
		result = 37 * result
				+ (getAddressNo() == null ? 0 : this.getAddressNo().hashCode());
		return result;
	}

}
