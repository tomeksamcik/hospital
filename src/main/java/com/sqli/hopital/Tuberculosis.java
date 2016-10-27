package com.sqli.hopital;

import java.util.Set;

public class Tuberculosis extends HealthStatus {

	public Tuberculosis() {
		super("T");
	}

	@Override
	public HealthStatus transition(Set<Cure> cures) {
		if (isParacetamolCase(cures)) {
			return new Dead();
		}
		for (Cure cure : cures) {
			if (cure.helpsTuberculosis()) {
				return new Healthy();
			}
		}
		return this;
	}

}
