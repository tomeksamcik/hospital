package com.sqli.hopital;

import java.util.Set;

public abstract class HealthStatus {

	private String code;

	/**
	 * Transitions to the given health state based on cures
	 * 
	 * @param cures
	 *            Cures applied
	 * @return Health status to be transitioned to
	 */
	public abstract HealthStatus transition(Set<Cure> cures);

	public HealthStatus(String code) {
		this.code = code;
	}

	protected Boolean isParacetamolCase(Set<Cure> cures) {
		Boolean paracetamol = false;
		Boolean killsWithParacetamol = false;
		for (Cure cure : cures) {
			if (cure.isParacetamol()) {
				paracetamol = true;
			}
			if (cure.killsWithParacetamol()) {
				killsWithParacetamol = true;
			}
		}
		return paracetamol && killsWithParacetamol;
	}

	@Override
	public String toString() {
		return code;
	}

}
