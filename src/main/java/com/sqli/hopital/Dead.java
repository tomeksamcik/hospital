package com.sqli.hopital;

import java.util.Set;

public class Dead extends HealthStatus {

	public Dead() {
		super("X");
	}

	@Override
	public HealthStatus transtition(Set<Cure> cures) {
		return this;
	}

}
