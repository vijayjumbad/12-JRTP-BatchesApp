package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BATCH_RUN_DTLS")
public class BatchRunDetails {

	@Id
	@Column(name="BATCH_RUN_SEQ")
	private Integer batchRunSeq;
	
	@Column(name="BATCH_NAME")
	private String batchName;
	
	@Column(name="BATCH_RUN_STATUS")
	private String batchRunStatus;
	
	@Column(name="END_DATE")
	private Date endDate;
	
	@Column(name="START_DATE")
	private Date startDate;
	
	@Column(name="INSTANCE_NUM")
	private Integer instanceNum;

	public Integer getBatchRunSeq() {
		return batchRunSeq;
	}

	public void setBatchRunSeq(Integer batchRunSeq) {
		this.batchRunSeq = batchRunSeq;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchRunStatus() {
		return batchRunStatus;
	}

	public void setBatchRunStatus(String batchRunStatus) {
		this.batchRunStatus = batchRunStatus;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getInstanceNum() {
		return instanceNum;
	}

	public void setInstanceNum(Integer instanceNum) {
		this.instanceNum = instanceNum;
	}

	@Override
	public String toString() {
		return "BatchRunDetails [batchRunSeq=" + batchRunSeq + ", batchName=" + batchName + ", batchRunStatus="
				+ batchRunStatus + ", endDate=" + endDate + ", startDate=" + startDate + ", instanceNum=" + instanceNum
				+ "]";
	}
	
}
