package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpChandlerId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpChandlerId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String proposalNo;
	private String handlerCode;

	public PrpChandlerId() {
	}

	@Column(name = "proposalno", nullable = false)
	public String getProposalNo() {
		return this.proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	@Column(name = "handlercode", nullable = false)
	public String getHandlerCode() {
		return this.handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpChandlerId))
			return false;
		PrpChandlerId castOther = (PrpChandlerId) other;

		return ((this.getProposalNo() == castOther.getProposalNo()) || (this
				.getProposalNo() != null
				&& castOther.getProposalNo() != null && this.getProposalNo()
				.equals(castOther.getProposalNo())))
				&& ((this.getHandlerCode() == castOther.getHandlerCode()) || (this
						.getHandlerCode() != null
						&& castOther.getHandlerCode() != null && this
						.getHandlerCode().equals(castOther.getHandlerCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProposalNo() == null ? 0 : this.getProposalNo()
						.hashCode());
		result = 37
				* result
				+ (getHandlerCode() == null ? 0 : this.getHandlerCode()
						.hashCode());
		return result;
	}

}
