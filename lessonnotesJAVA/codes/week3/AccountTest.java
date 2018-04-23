import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account myAccount = new Account("Ayşe", 100.0);
		System.out.println("Initial name is: "+ myAccount.getName()/*+ "the balance "+ myAccount.balance* (pulic olmalı yani*/);
	
		System.out.print("Please enter the name: ");
		String theName = input.nextLine();

		myAccount.setName(theName);

		System.out.println("Now my name is "+ myAccount.getName()+ "and balance is "+ myAccount.getBalance());

		Account newAccount = new Account("Batın", 10000.0);

		System.out.println("Now my name is "+ newAccount.getName()+ "and balance is "+ newAccount.getBalance());
		
		newAccount.setBalance(0);

		System.out.println("Now my name is "+ newAccount.getName()+ "and balance is "+ newAccount.getBalance());
	}
}