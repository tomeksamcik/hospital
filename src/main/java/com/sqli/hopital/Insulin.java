package com.sqli.hopital;

public class Insulin implements Cure {

	public Boolean helpsDiabetes() {
		return true;
	}

	public Boolean helpsFever() {
		return false;
	}

	public Boolean helpsTuberculosis() {
		return false;
	}

	public Boolean killsWithParacetamol() {
		return false;
	}

}
