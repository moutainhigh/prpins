package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-15 19:32:16 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpCopyExtendInfoId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpCopyExtendInfoId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String applyNo;
	private String extendType;
	private Integer serialNo;
	private String columnCode;

	public PrpCopyExtendInfoId() {
	}

	@Column(name = "applyno", nullable = false)
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	@Column(name = "extendtype", nullable = false)
	public String getExtendType() {
		return this.extendType;
	}

	public void setExtendType(String extendType) {
		this.extendType = extendType;
	}

	@Column(name = "serialno", nullable = false)
	public Integer getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "columncode", nullable = false)
	public String getColumnCode() {
		return this.columnCode;
	}

	public void setColumnCode(String columnCode) {
		this.columnCode = columnCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrpCopyExtendInfoId))
			return false;
		PrpCopyExtendInfoId castOther = (PrpCopyExtendInfoId) other;

		return ((this.getApplyNo() == castOther.getApplyNo()) || (this
				.getApplyNo() != null
				&& castOther.getApplyNo() != null && this.getApplyNo().equals(
				castOther.getApplyNo())))
				&& ((this.getExtendType() == castOther.getExtendType()) || (this
						.getExtendType() != null
						&& castOther.getExtendType() != null && this
						.getExtendType().equals(castOther.getExtendType())))
				&& ((this.getSerialNo() == castOther.getSerialNo()) || (this
						.getSerialNo() != null
						&& castOther.getSerialNo() != null && this
						.getSerialNo().equals(castOther.getSerialNo())))
				&& ((this.getColumnCode() == castOther.getColumnCode()) || (this
						.getColumnCode() != null
						&& castOther.getColumnCode() != null && this
						.getColumnCode().equals(castOther.getColumnCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getApplyNo() == null ? 0 : this.getApplyNo().hashCode());
		result = 37
				* result
				+ (getExtendType() == null ? 0 : this.getExtendType()
						.hashCode());
		result = 37 * result
				+ (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		result = 37
				* result
				+ (getColumnCode() == null ? 0 : this.getColumnCode()
						.hashCode());
		return result;
	}

}
