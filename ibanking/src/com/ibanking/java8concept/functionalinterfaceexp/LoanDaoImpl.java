package com.ibanking.java8concept.functionalinterfaceexp;

public class LoanDaoImpl {
	
	
	void createLoan(LoanType loanType, LoanPojo loanPojo){
		
		loanType.createLoan(loanPojo);
		
	}

}
