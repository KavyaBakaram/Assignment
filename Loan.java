import java.util.Scanner;

class Loan
	void givesLoan()
	{
		System.out.println("Bank gives Loan to Customer");
	}
}
class CropLoan extends Loan 
{
	void takesLoan() 
	{ 
		System.out.println("Former takes the Crop Loan");
	}
	void doSurgery() 
	{ 
		System.out.println("Surgeon: doing surgery...");
	}
}
class EducLoan extends Loan
{
	
	void takesLoan() 
	{
		System.out.println("Students takes the Education Loan");
	}
	
}
class goldLoan 
{
	void doLoan()
	{
		System.out.println(" Government Emp takes gold Loan");
	}
}
class Bank
{
	static Loan getLoan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Choice of Loan");
		System.out.println("1. Loan ");
		System.out.println("2. Crop Loan");
		System.out.println("3. Educ Loan");
		System.out.println("4. gold Loan");`	
		int choice = scan.nextInt();
		Doctor d = null;
		switch(choice) {
			case 1: d = new Loan(); break;  
			case 2: d = new CropLoan(); break;
			case 3: d = new EducLoan(); break;
			case 3: d = new goldLoan(); break;
		}
		return d;
	}
}
public class BankTest {
	public static void main(String[] args) {
		Loan d = Bank.getLoan(); 
		
		if(d instanceof otherLoan) { 
			System.out.println("d is taking otherLoan");
		}
		else if(d instanceof CropLoan) { 
			System.out.println("d is taking CropLoan");
		}
		else if (d instanceof goldLOan) {
			System.out.println("d is Taking gold Loan");
		}
		
	}
}
