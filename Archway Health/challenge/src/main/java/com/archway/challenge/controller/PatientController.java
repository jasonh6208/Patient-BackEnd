package com.archway.challenge.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.archway.challenge.entity.Patient;
import com.archway.challenge.service.PatientService;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;

	// Get all records
	@GetMapping("/list")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}

	// Create a new record
	@PostMapping("/save")
	public Patient addPatient(@Valid @RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}

}
