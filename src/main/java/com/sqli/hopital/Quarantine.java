package com.sqli.hopital;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Quarantine {

	private List<Patient> patients = new ArrayList<Patient>();

	public Quarantine(String subjects) {
		for (String subject : subjects.split(",")) {
			Patient patient = Patient.getPatient(subject);
			patients.add(patient);
		}
	}

	public void aspirin() {
		for (Patient patient : patients) {
			patient.cureWith(new Aspirin());
		}
	}

	public void antibiotic() {
		for (Patient patient : patients) {
			patient.cureWith(new Antibiotic());
		}
	}

	public void insulin() {
		for (Patient patient : patients) {
			patient.cureWith(new Insulin());
		}
	}

	public void paracetamol() {
		for (Patient patient : patients) {
			patient.cureWith(new Paracetamol());
		}
	}

	public void wait40Days() {
		for (Patient patient : patients) {
			patient.wait40Days();
		}
	}

	public String report() {
		Map<String, List<Patient>> map = new LinkedHashMap<String, List<Patient>>();
		for (String code : new String[] { "F", "H", "D", "T", "X" }) {
			map.put(code, new ArrayList<Patient>());
		}
		for (Patient patient : patients) {
			map.get(patient.toString()).add(patient);
		}
		StringBuilder report = new StringBuilder();
		for (String code : map.keySet()) {
			report.append(code + ":" + map.get(code).size() + " ");
		}
		return report.toString().trim();
	}
}
