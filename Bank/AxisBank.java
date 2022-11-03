package org.Bank;

public class AxisBank extends BankInfo {
	public void deposite() {
		System.out.println("deposit"+"="+"5000");
	}
	public static void main(String[] args) {
		AxisBank bank= new AxisBank();
		bank.Saving();
		bank.fixed();
		bank.deposite();
	}
	

}
