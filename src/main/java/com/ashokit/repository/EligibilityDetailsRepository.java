package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.BatchRunDetails;
import com.ashokit.entity.BatchSummaryDetails;
import com.ashokit.entity.COPDFS;
import com.ashokit.entity.CoTriggers;
import com.ashokit.entity.EligibliltyDetails;

public interface EligibilityDetailsRepository extends JpaRepository<EligibliltyDetails, Serializable> {

}
