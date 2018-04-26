package com.sinosoft.fccb.policy.common.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpPclauseConfineId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpPclauseConfineId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String applyNo;
	private Integer clauseno;

	public PrpPclauseConfineId() {
	}

	@Column(name = "applyno")
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	@Column(name = "clauseno")
	public Integer getClauseno() {
		return this.clauseno;
	}

	public void setClauseno(Integer clauseno) {
		this.clauseno = clauseno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpPclauseConfineId))
			return false;
		PrpPclauseConfineId castOther = (PrpPclauseConfineId) other;

		return ((this.getApplyNo() == castOther.getApplyNo()) || (this
				.getApplyNo() != null
				&& castOther.getApplyNo() != null && this.getApplyNo().equals(
				castOther.getApplyNo())))
				&& ((this.getClauseno() == castOther.getClauseno()) || (this
						.getClauseno() != null
						&& castOther.getClauseno() != null && this
						.getClauseno().equals(castOther.getClauseno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getApplyNo() == null ? 0 : this.getApplyNo().hashCode());
		result = 37 * result
				+ (getClauseno() == null ? 0 : this.getClauseno().hashCode());
		return result;
	}

}
