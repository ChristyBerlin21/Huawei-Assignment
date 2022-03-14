package BankLoan ;

import java.util.ArrayList;

public class Loan {
    private String loan_type;
    private double amount;
    private double gold_amount;
    
    static ArrayList<String> loantypes=new ArrayList<>();
    static {
    	loantypes.add("Gold Loan");
    	loantypes.add("Educational Loan");
    	loantypes.add("Housing Loan");
    	loantypes.add("Personal Loan");
    }
    
	public Loan(String loan_type, double amount, double gold_amount) {
		super();
		this.loan_type = loan_type;
		this.amount = amount;
		this.gold_amount = gold_amount;
	}
	public Loan(String loan_type, double amount) {
		super();
		this.loan_type = loan_type;
		this.amount = amount;
	}
    public static void printLoanType()
    {
    	for(int i=0;i<loan_types.size();i++)
		{
			System.out.println(i+1+") "+loantypes.get(i));
		}
    }
}