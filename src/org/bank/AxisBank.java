package org.bank;

public class AxisBank extends BankInfo{
	
	private void deposit() {
		System.out.println("Bank and ATM");
	}

	public static void main(String[] args) {
		
		AxisBank ax = new AxisBank();
		
		ax.deposit();
		ax.fixed();
		ax.savings();
	}
}

