package com.archway.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archway.challenge.dao.PatientRepository;
import com.archway.challenge.entity.Patient;


@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	// add patient to database
	public Patient addPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	// get all patient from database
	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
	}



}
