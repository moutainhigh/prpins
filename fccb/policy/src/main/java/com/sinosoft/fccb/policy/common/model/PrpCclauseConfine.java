package com.sinosoft.fccb.policy.common.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

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

/**
 * PrpCclauseConfine generated by Tools.Don't edit.
 */
@Entity
@Table(name = "prpcclauseconfine")
public class PrpCclauseConfine implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private PrpCclauseConfineId id;
	/** 投保单号码 */
	private PrpCmain prpCmain;
	/** 险种代码 */
	private String riskCode;
	/** 险种名称 */
	private String riskName;
	/** 条款编码 */
	private String clauseCode;
	/** 条款名称 */
	private String clauseName;
	/** 短信转存后是否删除标记 */
	private String flag;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public PrpCclauseConfine() {
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "proposalNo", column = @Column(name = "proposalno")),
			@AttributeOverride(name = "clauseno", column = @Column(name = "clauseno")) })
	public PrpCclauseConfineId getId() {
		return this.id;
	}

	public void setId(PrpCclauseConfineId id) {
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

	@Column(name = "riskcode")
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	/**       
	 * 险种名称
	 */

	@Column(name = "riskname")
	public String getRiskName() {
		return this.riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	/**       
	 * 条款编码
	 */

	@Column(name = "clausecode")
	public String getClauseCode() {
		return this.clauseCode;
	}

	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}

	/**       
	 * 条款名称
	 */

	@Column(name = "clausename")
	public String getClauseName() {
		return this.clauseName;
	}

	public void setClauseName(String clauseName) {
		this.clauseName = clauseName;
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
