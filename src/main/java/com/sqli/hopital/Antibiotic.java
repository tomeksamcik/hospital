package com.sqli.hopital;

public class Antibiotic implements Cure {

	public Boolean helpsDiabetes() {
		return false;
	}

	public Boolean helpsFever() {
		return false;
	}

	public Boolean helpsTuberculosis() {
		return true;
	}

	public Boolean killsWithParacetamol() {
		return false;
	}

}
