package com.ashokit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CO_TRIGGERS")
public class CoTriggers implements Serializable {

	
	private static final long serialVersionUID = -3128624627092122258L;
	
	@Column(name="TRG_ID")
	@Id
	private Integer trgId;
	
	@Column(name="CASE_NUM")
	private Integer caseNo;
	
	@Column(name="CREATE_DT")
	private Date createdDate;
	
	@Column(name="UPDATE_DT")
	private Date updatedDate;
	
	@Column(name="TRG_STATUS")
	private String trgStatus;

	public Integer getTrgId() {
		return trgId;
	}

	public void setTrgId(Integer trgId) {
		this.trgId = trgId;
	}

	public Integer getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(Integer caseNo) {
		this.caseNo = caseNo;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getTrgStatus() {
		return trgStatus;
	}

	public void setTrgStatus(String trgStatus) {
		this.trgStatus = trgStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CoTriggers [trgId=" + trgId + ", caseNo=" + caseNo + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", trgStatus=" + trgStatus + "]";
	}

	
}