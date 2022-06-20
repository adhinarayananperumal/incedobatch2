package com.ibanking.java8concept.functionalinterfaceexp;

@FunctionalInterface
public interface Loan {
	
	String createLoan();

	default int generateLoanId() {
		int loanid = 34;
		System.out.println("wtweyetew1234");
		return loanid;
	}

}
