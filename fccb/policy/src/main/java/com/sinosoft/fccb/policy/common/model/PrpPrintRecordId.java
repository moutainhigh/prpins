package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpPrintRecordId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpPrintRecordId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String certiNo;
	private String certiType;
	private Integer serialNo;

	public PrpPrintRecordId() {
	}

	@Column(name = "certino", nullable = false)
	public String getCertiNo() {
		return this.certiNo;
	}

	public void setCertiNo(String certiNo) {
		this.certiNo = certiNo;
	}

	@Column(name = "certitype", nullable = false)
	public String getCertiType() {
		return this.certiType;
	}

	public void setCertiType(String certiType) {
		this.certiType = certiType;
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
		if (!(other instanceof PrpPrintRecordId))
			return false;
		PrpPrintRecordId castOther = (PrpPrintRecordId) other;

		return ((this.getCertiNo() == castOther.getCertiNo()) || (this
				.getCertiNo() != null
				&& castOther.getCertiNo() != null && this.getCertiNo().equals(
				castOther.getCertiNo())))
				&& ((this.getCertiType() == castOther.getCertiType()) || (this
						.getCertiType() != null
						&& castOther.getCertiType() != null && this
						.getCertiType().equals(castOther.getCertiType())))
				&& ((this.getSerialNo() == castOther.getSerialNo()) || (this
						.getSerialNo() != null
						&& castOther.getSerialNo() != null && this
						.getSerialNo().equals(castOther.getSerialNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCertiNo() == null ? 0 : this.getCertiNo().hashCode());
		result = 37 * result
				+ (getCertiType() == null ? 0 : this.getCertiType().hashCode());
		result = 37 * result
				+ (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		return result;
	}

}
