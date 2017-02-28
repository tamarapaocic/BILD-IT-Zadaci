package zadaci_28_02_2017;

import java.util.Date;

public class Zadatak4 {

		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated;
		
		Zadatak4() {
			id = 0; 
			balance = 0;
			annualInterestRate = 0;
			
		}
		
		Zadatak4 (int newId,int newBalance){
			id = newId;
			balance = newBalance;
			dateCreated = new Date();
		}
		
		public void setId(int newId){
			id = newId;
		}
		
		public void setBalance(int newBalance){
			balance = newBalance;
		}
		
		public void setAnnualInterest(double newAnnualInterest){
			annualInterestRate = newAnnualInterest;
		}
		
		public int getId(){
			return id;
		}
		
		public double getBalance(){
			return balance;
		}
		
		public double getAnnualInterestRate(){
			return annualInterestRate;
		}
		
		public Date getDate(){
			return dateCreated;
		}
		
		public double getMonthlyInterestRate(){
			return annualInterestRate / 12;
		}
		public double getMonthlyInterest() {
			return balance * (getMonthlyInterestRate() / 100);
		}
		public void withdraw(double amount){
	    balance -= amount;		
		}
		
		public void deposit(double amount){
			balance += amount;
			
		}
	}

