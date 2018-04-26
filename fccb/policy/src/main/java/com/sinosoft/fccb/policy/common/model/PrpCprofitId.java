package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpCprofitId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpCprofitId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String proposalNo;
	private Integer itemKindNo;
	private String profitType;

	public PrpCprofitId() {
	}

	@Column(name = "proposalno", nullable = false)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	@Column(name = "itemkindno", nullable = false)
	public Integer getItemKindNo() {
		return this.itemKindNo;
	}

	public void setItemKindNo(Integer itemKindNo) {
		this.itemKindNo = itemKindNo;
	}

	@Column(name = "profittype", nullable = false)
	public String getProfitType() {
		return this.profitType;
	}

	public void setProfitType(String profitType) {
		this.profitType = profitType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpCprofitId))
			return false;
		PrpCprofitId castOther = (PrpCprofitId) other;

		return ((this.getProposalNo() == castOther.getProposalNo()) || (this
				.getProposalNo() != null
				&& castOther.getProposalNo() != null && this.getProposalNo()
				.equals(castOther.getProposalNo())))
				&& ((this.getItemKindNo() == castOther.getItemKindNo()) || (this
						.getItemKindNo() != null
						&& castOther.getItemKindNo() != null && this
						.getItemKindNo().equals(castOther.getItemKindNo())))
				&& ((this.getProfitType() == castOther.getProfitType()) || (this
						.getProfitType() != null
						&& castOther.getProfitType() != null && this
						.getProfitType().equals(castOther.getProfitType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProposalNo() == null ? 0 : this.getProposalNo()
						.hashCode());
		result = 37
				* result
				+ (getItemKindNo() == null ? 0 : this.getItemKindNo()
						.hashCode());
		result = 37
				* result
				+ (getProfitType() == null ? 0 : this.getProfitType()
						.hashCode());
		return result;
	}

}
