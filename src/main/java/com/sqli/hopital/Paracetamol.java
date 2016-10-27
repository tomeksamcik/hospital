package com.sqli.hopital;

public class Paracetamol implements Cure {

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
		return false;
	}

	public Boolean isParacetamol() {
		return true;
	}

}
