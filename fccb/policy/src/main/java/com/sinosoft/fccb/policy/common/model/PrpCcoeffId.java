package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpCcoeffId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpCcoeffId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String proposalNo;
	private Integer serialNo;

	public PrpCcoeffId() {
	}

	@Column(name = "proposalno", nullable = false)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
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
		if (!(other instanceof PrpCcoeffId))
			return false;
		PrpCcoeffId castOther = (PrpCcoeffId) other;

		return ((this.getProposalNo() == castOther.getProposalNo()) || (this
				.getProposalNo() != null
				&& castOther.getProposalNo() != null && this.getProposalNo()
				.equals(castOther.getProposalNo())))
				&& ((this.getSerialNo() == castOther.getSerialNo()) || (this
						.getSerialNo() != null
						&& castOther.getSerialNo() != null && this
						.getSerialNo().equals(castOther.getSerialNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProposalNo() == null ? 0 : this.getProposalNo()
						.hashCode());
		result = 37 * result
				+ (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		return result;
	}

}
