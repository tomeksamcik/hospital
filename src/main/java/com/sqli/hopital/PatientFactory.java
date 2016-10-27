package com.sqli.hopital;

public class PatientFactory {

	public static Patient getPatient(String status) {
		if (status.equals("H")) {
			return new Patient(new Healthy());
		} else if (status.equals("F")) {
			return new Patient(new Fever());
		} else if (status.equals("D")) {
			return new Patient(new Diabetes());
		} else if (status.equals("T")) {
			return new Patient(new Tuberculosis());
		}
		return new Patient(new Healthy());
	}

}
