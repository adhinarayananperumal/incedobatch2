package com.ibanking.java8concept.functionalinterfaceexp;

public class LoanProcessorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loan loan = new GoldLoanImpl();
		loan.createLoan();

		Loan loanLanb = () -> {
			// create loan by loan GL
			System.out.println("GL1234567");
			return "GL1234567";
		};

		loanLanb.createLoan();
		
		
		Loan loanLanbhl = () -> {
			
			// create loan PL
			System.out.println("GLyruryrur34");
			return "GLyruryrur34";
		};
		
		loanLanbhl.createLoan();
		
		
		LoanDaoImpl loanDaoImpl = new LoanDaoImpl();
		
		LoanPojo loanPojo = new LoanPojo();
		loanPojo.setCustomerName("ram");
		loanPojo.setGender("f");
		
		LoanType loanTypes = (loanPojoObj) -> {
			
				if(loanPojoObj.getGender().equals("m")) {
					int intrestRATE=9;
				}else {
					int intrestRATE=7;
				}
		
			return loanPojo;
					
		};
		
		loanDaoImpl.createLoan(loanTypes, loanPojo);
		
		
		
		
		
		LoanPojo loanPojo1 = new LoanPojo();
		loanPojo1.setCustomerName("ram");
		loanPojo1.setGender("sc");
		
		LoanType loanTypes1 = (loanPojoObj1) -> {
			
			if(loanPojoObj1.getLoanAmount() < 3000000){
			
				if(loanPojoObj1.getGender().equals("m")) {
					int intrestRATE=9;
				}else {
					int intrestRATE=7;
				}
			}
			return loanPojo;
					
		};
		
		loanDaoImpl.createLoan(loanTypes1, loanPojo1);
		
		
		
		
		
		
		
		
		
		
		
	
		
		


	}

}
