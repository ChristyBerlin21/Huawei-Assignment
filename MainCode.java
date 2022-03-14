package BankLoan ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String args[])
   {
	   ArrayList<User> users=new ArrayList<>();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter your Name : ");
	   String user_name=sc.nextLine();
	   System.out.println("Select the Bank : ");
	   Bank.bank_name();
	   String Bank_Name=Bank.banks.get(sc.nextInt()-1);
	   System.out.println("Select Loan Type : ");
	   Loan.printloan_type();
	   String Loan_Name=Loan.loantypes.get(sc.nextInt()-1);
	   boolean gold_loan=false;
	   double grams=0;
	   //If the Loan type is Gold get in Grams
	   if(Loan_Name=="Gold Loan")
	   {
		   gold_loan=true;
		   System.out.println("Enter number of grams");
		   grams=sc.nextDouble();
	   }
	   System.out.println("Enter the amount required : ");
	   double amount=sc.nextDouble();
	   double arr[]=getIntrestRepayMonth(amount);
	   User user = new User(user_name, bank_name, Loan_Name, amount,  grams,arr[0],arr[1],gold_loan);
	   user.toString();
	   users.add(user);
	   System.out.println(user);
	    
	}  
   public static double[] getIntrestRepayMonth(double amount)
   {
	   
	   double arr1[]=new double[2];
    
	   if(amount<10000)
	   {
		   arr1[0]=3;
		   arr1[1]=amount*.01;
	   }
	   else
	   {
		   arr1[0]=5;
		   arr1[1]=amount*.03;
	   }
	   return arr1;
    }
	   
}