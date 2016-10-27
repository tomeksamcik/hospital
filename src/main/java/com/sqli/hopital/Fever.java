package com.sqli.hopital;

import java.util.Set;

public class Fever extends HealthStatus {

	public Fever() {
		super("F");
	}

	@Override
	public HealthStatus transtition(Set<Cure> cures) {
		if (isParacetamolCase(cures)) {
			return new Dead();
		}
		for (Cure cure : cures) {
			if (cure.helpsFever()) {
				return new Healthy();
			}
		}
		return this;
	}

}
