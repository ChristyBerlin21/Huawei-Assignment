package BankLoan ;

public class User 
{
   private String user_name;
   private  String bank_name;
   private String loan_type;
   private double loan_amount;
   private double gold_amount;
   private double intrest_amount;
   private double repay_value;
   private boolean isGold_Loan;
   public User(String user_name,String bank_name, String loan_type, double loan_amount, double gold_amount, double intrest_amount,double repay_value,boolean isGold_Loan) 
   {
	super();
	this.user_name = user_name;
	this.bank_name = bank_name;
	loan_type = loan_Type;
	this.loan_amount = loan_amount;
	this.gold_amount = gold_amount;
	this.intrest_amount	= intrest_amount;
	this.repay_value=repay_value;
	this.isGold_Loan=isGold_Loan;
   }
   @Override
   public String toString() 
   {
   if(!isGoldLoan)
	return "User Name=" + user_name + ", Bank Name=" + bank_name + ", Loan Type=" + loan_type + ", Loan Amount="
			+ loan_amount + " , Intrest=" + intrest_amount ;
	
	return "User Name=" + user_name + ", Bank Name=" + bank_name + ", Loan Type=" + loan_type + ", Loan Amount="
	+ loan_amount + ", Gold in Grams=" + gold_amount + ", Intrest value=" + intrest_amount ;
   }
}