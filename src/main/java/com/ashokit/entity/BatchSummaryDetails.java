package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BATCH_SUMMARY")
public class BatchSummaryDetails {

	@Id
	@Column(name="SUMMARY_ID")
	private Integer summaryId;
	
	@Column(name="BATCH_NAME")
	private String batch_name;
	
	@Column(name="FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount;
	
	@Column(name="SUCCESS_TRIGGER_COUNT")
	private Integer successTriggerCount;
	
	@Column(name="TOTAL_TRIGGER_PROCESSED")
	private Integer totalTriggerProcessed;

	public Integer getSummaryId() {
		return summaryId;
	}

	public void setSummaryId(Integer summaryId) {
		this.summaryId = summaryId;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public Integer getFailureTriggerCount() {
		return failureTriggerCount;
	}

	public void setFailureTriggerCount(Integer failureTriggerCount) {
		this.failureTriggerCount = failureTriggerCount;
	}

	public Integer getSuccessTriggerCount() {
		return successTriggerCount;
	}

	public void setSuccessTriggerCount(Integer successTriggerCount) {
		this.successTriggerCount = successTriggerCount;
	}

	public Integer getTotalTriggerProcessed() {
		return totalTriggerProcessed;
	}

	public void setTotalTriggerProcessed(Integer totalTriggerProcessed) {
		this.totalTriggerProcessed = totalTriggerProcessed;
	}

	@Override
	public String toString() {
		return "BatchSummaryDetails [summaryId=" + summaryId + ", batch_name=" + batch_name + ", failureTriggerCount="
				+ failureTriggerCount + ", successTriggerCount=" + successTriggerCount + ", totalTriggerProcessed="
				+ totalTriggerProcessed + "]";
	}
	
	
}