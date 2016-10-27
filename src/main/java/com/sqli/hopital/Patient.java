package com.sqli.hopital;

import java.util.HashSet;
import java.util.Set;

public class Patient {

	private HealthStatus healthStatus = new Healthy();

	private Set<Cure> cures = new HashSet<Cure>();

	public Patient(HealthStatus healthStatus) {
		this.healthStatus = healthStatus;
	}

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

	public void wait40Days() {
		setHealthStatus(healthStatus.transtition(cures));
	}

	public void cureWith(Cure cure) {
		cures.add(cure);
	}

	public void setHealthStatus(HealthStatus healthStatus) {
		this.healthStatus = healthStatus;
	}

	@Override
	public String toString() {
		return healthStatus.toString();
	}

}
