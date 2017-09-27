package exercise_chpater10;

import java.util.Scanner;

public class TestLoan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input annualInterestRate:");
		double annualInterestRate = input.nextDouble();
		System.out.println("input numbers of years:");
		int numbersOfYears = input.nextInt();
		System.out.println("input loan amount:");
		double loanAmount = input.nextDouble();
		
		Loan myLoan = new Loan(annualInterestRate, numbersOfYears, loanAmount);
		
		System.out.println("The loan was created on " 
				+ myLoan.getLoanDate());
		System.out.println("The monthly Payment is " 
				+ myLoan.getMounthlyPayment());
		System.out.println("The total Payment is " 
				+ myLoan.getTotalPayment());
		
	}

}

class Loan {
	
	private double annualInterestRate;
	private int numbersOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan(){
		this(2.5, 1, 1000);
	}
	
	public Loan(double annualInterestRate, int numbersOfYears, 
			double loanAmount) {
		
		this.annualInterestRate = annualInterestRate;
		this.numbersOfYears = numbersOfYears;
		this.loanAmount = loanAmount;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterstRate) {
		this.annualInterestRate = annualInterstRate;
	}
	
	public int getNumbersOfYears() {
		return numbersOfYears;
	}
	
	public void setNumbersOfYears(int numbersOfYears) {
		this.numbersOfYears = numbersOfYears;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public double getMounthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 
				(1 / Math.pow(1 + monthlyInterestRate, numbersOfYears * 12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment() {
		double totalPayment = getMounthlyPayment() * numbersOfYears * 12;
		return totalPayment;
	}
	
	public java.util.Date getLoanDate(){
		return loanDate;
	}
}
