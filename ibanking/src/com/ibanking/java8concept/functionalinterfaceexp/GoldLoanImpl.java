package com.ibanking.java8concept.functionalinterfaceexp;

import java.util.Random;

public class GoldLoanImpl implements Loan {

	@Override
	public String createLoan() {

		Random rd = new Random();
		int loanId = rd.nextInt();
		System.out.println("loanId...................." + loanId);
		return String.valueOf(loanId);

	}

}
