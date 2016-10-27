package com.sqli.hopital;

import java.util.HashSet;
import java.util.Set;

public class Patient {

	private HealthStatus healthStatus = new Healthy();

	private Set<Cure> cures = new HashSet<Cure>();

	public Patient(HealthStatus healthStatus) {
		this.healthStatus = healthStatus;
	}

	public void wait40Days() {
		healthStatus = healthStatus.transition(cures);
	}

	public void cureWith(Cure cure) {
		cures.add(cure);
	}

	@Override
	public String toString() {
		return healthStatus.toString();
	}

}
