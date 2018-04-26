package com.sinosoft.fccb.policy.common.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrpCitemKindZYId generated by Tools.Don't edit.
 */
@Embeddable
public class PrpCitemKindZYId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	/** 报价单号 */
	private String quoteNo;
	/** 序号 */
	private Integer orderNum;
	
	@Column(name = "quoteno", nullable = false)
	public String getQuoteNo() {
		return quoteNo;
	}
	public void setQuoteNo(String quoteNo) {
		this.quoteNo = quoteNo;
	}
	@Column(name = "ordernum", nullable = false)
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((orderNum == null) ? 0 : orderNum.hashCode());
		result = prime * result + ((quoteNo == null) ? 0 : quoteNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrpCitemKindZYId other = (PrpCitemKindZYId) obj;
		if (orderNum == null) {
			if (other.orderNum != null)
				return false;
		} else if (!orderNum.equals(other.orderNum))
			return false;
		if (quoteNo == null) {
			if (other.quoteNo != null)
				return false;
		} else if (!quoteNo.equals(other.quoteNo))
			return false;
		return true;
	}
}
