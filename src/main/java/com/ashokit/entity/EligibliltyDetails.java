package com.ashokit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ELIGIBILITY_DETAILS")
public class EligibliltyDetails implements Serializable {

	
	private static final long serialVersionUID = -5280941795964284339L;
	
	@Id
	@Column(name="ED_TRACE_ID")
	private Integer edTraceId;
	
	@Column(name="BENEFIT_AMT")
	private Double benefitAmt;
	
	@Column(name="CASE_NUM")
	private Integer caseNum;
	
	@Column(name="CREATE_DT")
	private Date createDate;
	
	@Column(name="UPDATE_DT")
	private Date updateDate;
	
	@Column(name="DENAIL_REASON")
	private String denailReason;
	
	@Column(name="PLAN_START_DT")
	private Date planStartDate;
	
	@Column(name="PLAN_END_DT")
	private Date planEndDate;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	@Column(name="PLAN_STATUS")
	private String planStatus;

	public Integer getEdTraceId() {
		return edTraceId;
	}

	public void setEdTraceId(Integer edTraceId) {
		this.edTraceId = edTraceId;
	}

	public Double getBenefitAmt() {
		return benefitAmt;
	}

	public void setBenefitAmt(Double benefitAmt) {
		this.benefitAmt = benefitAmt;
	}

	public Integer getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Integer caseNum) {
		this.caseNum = caseNum;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDenailReason() {
		return denailReason;
	}

	public void setDenailReason(String denailReason) {
		this.denailReason = denailReason;
	}

	public Date getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(Date planStartDate) {
		this.planStartDate = planStartDate;
	}

	public Date getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EligibliltyDetails [edTraceId=" + edTraceId + ", benefitAmt=" + benefitAmt + ", caseNum=" + caseNum
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + ", denailReason=" + denailReason
				+ ", planStartDate=" + planStartDate + ", planEndDate=" + planEndDate + ", planName=" + planName
				+ ", planStatus=" + planStatus + "]";
	}
	

}
