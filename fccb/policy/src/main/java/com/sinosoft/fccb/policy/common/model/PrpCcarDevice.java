package com.sinosoft.fccb.policy.common.model;

// Generated 2010-4-1 9:33:00 by Hibernate Tools 3.2.0.b9-sinosoft1.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PrpCcarDevice generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpccardevice")
public class PrpCcarDevice implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** SerialNo */
	private PrpCcarDeviceId id;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 险种代码 */
	private String riskCode;
	/** 设备名称 */
	private String deviceName;
	/** 币别 */
	private String currency;
	/** 数量 */
	private Integer quantity;
	/** 新件购置价 */
	private BigDecimal purchasePrice;
	/** 实际价值 */
	private BigDecimal actualValue;
	/** 购置日期 */
	private Date buyDate;
	/** 备注 */
	private String remark;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCcarDevice() {
	}

	/**       
	 * SerialNo
	 */
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "proposalNo", column = @Column(name = "proposalno", nullable = false)),
			@AttributeOverride(name = "itemNo", column = @Column(name = "itemno", nullable = false)),
			@AttributeOverride(name = "serialNo", column = @Column(name = "serialno", nullable = false)) })
	public PrpCcarDeviceId getId() {
		return this.id;
	}

	public void setId(PrpCcarDeviceId id) {
		this.id = id;
	}

	/**       
	 * 投保单号码
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proposalno", nullable = false, insertable = false, updatable = false)
	public PrpCmain getPrpCmain() {
		return this.prpCmain;
	}

	public void setPrpCmain(PrpCmain prpCmain) {
		this.prpCmain = prpCmain;
	}

	/**       
	 * 险种代码
	 */

	@Column(name = "riskcode", nullable = false)
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	/**       
	 * 设备名称
	 */

	@Column(name = "devicename")
	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	/**       
	 * 币别
	 */

	@Column(name = "currency", nullable = false)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**       
	 * 数量
	 */

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**       
	 * 新件购置价
	 */

	@Column(name = "purchaseprice")
	public BigDecimal getPurchasePrice() {
		return this.purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**       
	 * 实际价值
	 */

	@Column(name = "actualvalue")
	public BigDecimal getActualValue() {
		return this.actualValue;
	}

	public void setActualValue(BigDecimal actualValue) {
		this.actualValue = actualValue;
	}

	/**       
	 * 购置日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "buydate")
	public Date getBuyDate() {
		return this.buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	/**       
	 * 备注
	 */

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**       
	 * 短信转存后是否删除标记
	 */

	@Column(name = "flag")
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**       
	 * 插入时间
	 */

	@Column(name = "inserttimeforhis", insertable = false, updatable = false)
	public Date getInsertTimeForHis() {
		return this.insertTimeForHis;
	}

	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}

	/**       
	 * 更新时间
	 */

	@Column(name = "operatetimeforhis", insertable = false)
	public Date getOperateTimeForHis() {
		return this.operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}

}
