package Today28Feb;
interface BankAccount{
	void deposit();
	void withdraw();
}
class CheckingAccount implements BankAccount{

	@Override
	public void deposit() {
		System.out.println("##### Money Deposit in Your Account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("You Withdrawal ### Amount of Money");
		
	}
	
}
public class InterfaceEg2 {
public static void main(String[] args) {
	CheckingAccount obj = new CheckingAccount();
	obj.deposit();
	obj.withdraw();
}
}
