/*
 EXPERIMENT - 10
 25-09-2024
 WEDNESDAY
*/

package oopj24csb45;
import java.util.Scanner;
class InsufficientAmountException extends Exception {
	private String message;
	InsufficientAmountException(String msg){
		message=msg;
	}
	public String getMessage() {
		return message;
	}
}
class InvalidAmountException extends Exception{
	private String message;
	InvalidAmountException(String msg){
		message=msg;
	}
	public String getMessage() {
		return message;
	}
}
class MyCustomBank{
	Scanner sc=new Scanner(System.in);
	public String accNo;
	public String accType;
	public String name;
	public long balance;
	void OpenAccount() {
		System.out.print("Enter Account No: ");
		accNo=sc.next();
		System.out.print("Enter Account Type: ");
		accType=sc.next();
		System.out.print("Enter Name: ");
		name=sc.next();
		System.out.print("Enter Balance: ");
		balance=sc.nextLong();
		System.out.println("Account created successfully");
	}
	public void ShowAccount() {
		System.out.println("Name of account holder: "+name);
		System.out.println("Account no: "+accNo);
		System.out.println("Account Type: "+accType);
		System.out.println("Balance: "+balance);
	}
	public void SearchAccount() {
		System.out.println("Enter account no. you want to search: ");
		String accNo1=sc.next();
		if(accNo1.equals(accNo)) {
			System.out.println("Name of account holder: "+name);
			System.out.println("Account no: "+accNo);
			System.out.println("Account Type: "+accType);
			System.out.println("Balance: "+balance);
		}
		else{
			System.out.println("invlaid account no");
		}
	}
	public void DepositAmount () {
		System.out.print("Enter the amount you want to deposit: ");
		long deposit=sc.nextInt();
		try {
			if(deposit<=0) {
				throw new InvalidAmountException("Invalid amount; amount must be greater than 0");
			}
			else {
				balance+=deposit;
				System.out.println("Deposit Successful! New balance: "+balance);
			}
		}catch(InvalidAmountException e) {
			System.out.print(e.getMessage());
		}
	}
	public void Withdraw() {
		System.out.print("Enter the amount you want to withdraw: ");
		long withdraw=sc.nextInt();
		try {
			if(withdraw<=0 || withdraw >balance) {
				throw new InsufficientAmountException("Invalid amount; the withdrawal amount should be btw 0 and "+balance);
			}
			else {
				balance-=withdraw;
				System.out.println("withdrawal Successful! New balance: "+balance);
			}
		}catch(InsufficientAmountException e) {
			System.out.print(e.getMessage());
		}
	}
}
public class CustomBank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyCustomBank b=new MyCustomBank();
		do {
			System.out.println("\n****Banking System Application****");
			
			System.out.println("1. OPEN ACCOUNT");
			System.out.println("2. SHOW ACCOUNT");
			System.out.println("3. SEARCH ACCOUNT");
			System.out.println("4. DEPOSIT AMOUNT");
			System.out.println("5. WITHDRAW AMOUNT");
			System.out.println("6. EXIT\n");
			
			System.out.println("Enter the choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				b.OpenAccount();
				break;
			case 2:
				b.ShowAccount();
				break;
			case 3:
				b.SearchAccount();
				break;
			case 4:
				b.DepositAmount();
				break;
			case 5:
				b.Withdraw();
				break;
			case 6:
				System.out.println("Thank you for using the banking system. See you soon!\n"
						+ "\n"
						+ "*********************************\n"
						+ "    Thank You :) Visit again\n"
						+ "***********************************");
				return;
			default:
				System.out.print("Invlaid choice");
				break;
			}
		}while(true);

	}

}