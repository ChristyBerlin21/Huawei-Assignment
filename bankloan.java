package BankLoan ;
import java.util.ArrayList;

public class Bank {
	
	static ArrayList<String> banks=new ArrayList<>();
	static{
		banks.add("State Bank of India");
		banks.add("Bank of Canada");
		banks.add("Indian Overseas Bank");
		banks.add("Sberbank of Russia");
		banks.add("DBS Bank");
		banks.add("Bank Of America Corp");
	}
	private String bank_name;
	private String loan_type;
	private String user_name;
	private double loan_amount;
	
	public Bank(String bank_name, String loan_type, String user_name, double loan_amount) {
		super();
		this.bank_name = bank_name;
		loan_type = loan_type;
		this.user_name = user_name;
		this.loan_amount = loan_amount;
	}
	public boolean addBank(String name) {
		if(!banks.contains(name))
		{
			banks.add(name);
			return true;
		}
		return false;
	}
	public static void bank_name()
	{
		
		for(int i=0;i<banks.size();i++)
		{
			System.out.println(i+1+") "+banks.get(i));
		}
	}
}