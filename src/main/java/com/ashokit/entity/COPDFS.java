package com.ashokit.entity;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CO_PDFS")
public class COPDFS {
	@Id
	@Column(name="CO_PDF_ID")
private  Integer coPdfId;
	
	@Column(name="PLAN_STATUS")
private String planStatus;
	
	@Column(name="CASE_NUMBER")
private Integer caseNumber;
	
	@Column(name="PDF_DOCUMENT")
private File pdf;
	
	@Column(name="PLAN_NAME")
private String planName;

	public Integer getCoPdfId() {
		return coPdfId;
	}

	public void setCoPdfId(Integer coPdfId) {
		this.coPdfId = coPdfId;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Integer getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
	}

	public File getPdf() {
		return pdf;
	}

	public void setPdf(File pdf) {
		this.pdf = pdf;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	@Override
	public String toString() {
		return "CO_PDFS [coPdfId=" + coPdfId + ", planStatus=" + planStatus + ", caseNumber=" + caseNumber + ", pdf="
				+ pdf + ", planName=" + planName + "]";
	}
	
	
}