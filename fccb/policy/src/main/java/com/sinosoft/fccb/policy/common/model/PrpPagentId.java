package com.sinosoft.fccb.policy.common.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrppagentId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpPagentId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String applyNo;
	private String roleCode;
	private Integer payNo;
	private Integer serialNo;

	public PrpPagentId() {
	}

	@Column(name = "applyno")
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	@Column(name = "rolecode")
	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@Column(name = "payno")
	public Integer getPayNo() {
		return this.payNo;
	}

	public void setPayNo(Integer payNo) {
		this.payNo = payNo;
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
		if (!(other instanceof PrpPagentId))
			return false;
		PrpPagentId castOther = (PrpPagentId) other;

		return ((this.getApplyNo() == castOther.getApplyNo()) || (this
				.getApplyNo() != null
				&& castOther.getApplyNo() != null && this.getApplyNo().equals(
				castOther.getApplyNo())))
				&& ((this.getRoleCode() == castOther.getRoleCode()) || (this
						.getRoleCode() != null
						&& castOther.getRoleCode() != null && this
						.getRoleCode().equals(castOther.getRoleCode())))
				&& ((this.getPayNo() == castOther.getPayNo()) || (this
						.getPayNo() != null
						&& castOther.getPayNo() != null && this.getPayNo()
						.equals(castOther.getPayNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getApplyNo() == null ? 0 : this.getApplyNo().hashCode());
		result = 37 * result
				+ (getRoleCode() == null ? 0 : this.getRoleCode().hashCode());
		result = 37 * result
				+ (getPayNo() == null ? 0 : this.getPayNo().hashCode());
		return result;
	}

}
