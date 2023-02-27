package Today27Feb;
abstract class Bankaccount1 {
	int accountnumber=4546463; 
	int balance=4500;
	abstract  void deposit(); 
		abstract void withdraw(); 
}
class checkingAccount extends Bankaccount1 {
	void deposit() {
		int deposit=1000;
		System.out.println("case deposit:" +" "+ (balance + deposit) );
	}
	void withdraw() {
		int withdraw=5000;
		System.out.println("case withdraw:"+" " + (balance-withdraw) );
	}
public class BankAccount {
	public static void main(String[] args) {
		Bankaccount1 obj=new checkingAccount();
		
		 obj.withdraw();
		 obj.deposit();
	}
}
}