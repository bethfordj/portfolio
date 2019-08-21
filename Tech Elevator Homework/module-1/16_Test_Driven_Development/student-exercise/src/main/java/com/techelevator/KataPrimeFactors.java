package com.techelevator;

import java.util.ArrayList;
import java.util.List;


public class KataPrimeFactors {
	
	public  List<Integer> factorize(int n) {
		List<Integer> intList = new ArrayList<Integer>();
		int non2Prime = 3;
		
		if (n < 2) {
			return null;
		}
		if (n%2 == 0) {
			for (int i = 0; n%2 == 0; i++ ) {
					n = n / 2;
					intList.add(2);
				}
		}
		if (n > 1) {
			for (int i = 0; n > 1 ; i++ ) {
				if (n%non2Prime == 0) {
					for (int j = 0; n%non2Prime == 0; j++ ) {
						n = n / non2Prime;
						intList.add(non2Prime);
					}
				}
				non2Prime += 1;
			}
		}
		
		
		return intList;
	}
	
}
