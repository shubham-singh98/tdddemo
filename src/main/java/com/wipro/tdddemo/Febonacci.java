package com.wipro.tdddemo;

public class Febonacci {

	public Integer compute(int j) {
		if ( j == 0 ) {
			return 0;
		}
		if ( j == 1) {
			return 1;
		}
		return compute(j-1) + compute(j-2);
	}

}
