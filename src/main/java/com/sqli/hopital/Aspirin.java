package com.sqli.hopital;

public class Aspirin implements Cure {

	public Boolean helpsDiabetes() {
		return false;
	}

	public Boolean helpsFever() {
		return true;
	}

	public Boolean helpsTuberculosis() {
		return false;
	}

	public Boolean killsWithParacetamol() {
		return true;
	}

}
