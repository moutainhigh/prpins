package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpCcarShipTaxId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpCcarShipTaxId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer itemNo;
	private String proposalNo;

	public PrpCcarShipTaxId() {
	}

	@Column(name = "itemno", nullable = false)
	public Integer getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}

	@Column(name = "proposalno", nullable = false)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpCcarShipTaxId))
			return false;
		PrpCcarShipTaxId castOther = (PrpCcarShipTaxId) other;

		return ((this.getItemNo() == castOther.getItemNo()) || (this
				.getItemNo() != null
				&& castOther.getItemNo() != null && this.getItemNo().equals(
				castOther.getItemNo())))
				&& ((this.getProposalNo() == castOther.getProposalNo()) || (this
						.getProposalNo() != null
						&& castOther.getProposalNo() != null && this
						.getProposalNo().equals(castOther.getProposalNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getItemNo() == null ? 0 : this.getItemNo().hashCode());
		result = 37
				* result
				+ (getProposalNo() == null ? 0 : this.getProposalNo()
						.hashCode());
		return result;
	}

}
