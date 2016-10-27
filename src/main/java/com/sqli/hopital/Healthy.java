package com.sqli.hopital;

import java.util.Set;

public class Healthy extends HealthStatus {

	public Healthy() {
		super("H");
	}

	private Boolean isFeverCase(Set<Cure> cures) {
		Boolean antibiotic = false;
		Boolean insulin = false;
		for (Cure cure : cures) {
			if (cure.helpsTuberculosis()) {
				antibiotic = true;
			}
			if (cure.helpsDiabetes()) {
				insulin = true;
			}
		}
		return insulin && antibiotic;
	}

	@Override
	public HealthStatus transtition(Set<Cure> cures) {
		if (isParacetamolCase(cures)) {
			return new Dead();
		}
		if (isFeverCase(cures)) {
			return new Fever();
		}
		return this;
	}

}
