package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpPprofitDetailId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpPprofitDetailId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String applyNo;
	private Integer itemKindNo;
	private String profitType;
	private String profitCode;
	private Integer serialNo;

	public PrpPprofitDetailId() {
	}

	@Column(name = "applyno", nullable = false)
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpPprofitDetailId))
			return false;
		PrpPprofitDetailId castOther = (PrpPprofitDetailId) other;

		return ((this.getApplyNo() == castOther.getApplyNo()) || (this
				.getApplyNo() != null
				&& castOther.getApplyNo() != null && this.getApplyNo().equals(
				castOther.getApplyNo())))
				&& ((this.getItemKindNo() == castOther.getItemKindNo()) || (this
						.getItemKindNo() != null
						&& castOther.getItemKindNo() != null && this
						.getItemKindNo().equals(castOther.getItemKindNo())))
				&& ((this.getProfitType() == castOther.getProfitType()) || (this
						.getProfitType() != null
						&& castOther.getProfitType() != null && this
						.getProfitType().equals(castOther.getProfitType())))
				&& ((this.getProfitCode() == castOther.getProfitCode()) || (this
						.getProfitCode() != null
						&& castOther.getProfitCode() != null && this
						.getProfitCode().equals(castOther.getProfitCode())))
				&& ((this.getSerialNo() == castOther.getSerialNo()) || (this
						.getSerialNo() != null
						&& castOther.getSerialNo() != null && this
						.getSerialNo().equals(castOther.getSerialNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getApplyNo() == null ? 0 : this.getApplyNo().hashCode());
		result = 37
				* result
				+ (getItemKindNo() == null ? 0 : this.getItemKindNo()
						.hashCode());
		result = 37
				* result
				+ (getProfitType() == null ? 0 : this.getProfitType()
						.hashCode());
		result = 37
				* result
				+ (getProfitCode() == null ? 0 : this.getProfitCode()
						.hashCode());
		result = 37 * result
				+ (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		return result;
	}

}
