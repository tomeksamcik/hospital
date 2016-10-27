package com.sqli.hopital;

import java.util.Set;

public class Diabetes extends HealthStatus {

	public Diabetes() {
		super("D");
	}

	@Override
	public HealthStatus transtition(Set<Cure> cures) {
		Boolean patientSurvives = false;
		for (Cure cure : cures) {
			if (cure.helpsDiabetes()) {
				patientSurvives = true;
			}
		}
		if (!patientSurvives || isParacetamolCase(cures)) {
			return new Dead();
		}
		return this;
	}

}
