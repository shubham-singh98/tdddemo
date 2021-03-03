package com.wipro.tdddemo;

import java.security.InvalidParameterException;

public class WiproMath {

	public Number add(Number i, Number j) {
		if (i == null || j == null) {
			throw new InvalidParameterException(" Both the parameters should not be null");
		}
		return i.doubleValue() + j.doubleValue();
	}

	public Number substract(Number i, Number j) {
		if (i == null || j == null) {
			throw new InvalidParameterException(" Both the parameters should not be null");
		}
		return i.doubleValue() - j.doubleValue();
	}

	public Number mult(Number i, Number j) {
		if (i == null || j == null) {
			throw new InvalidParameterException(" Both the parameters should not be null");
		}

		return i.doubleValue() * j.doubleValue();
	}

}
