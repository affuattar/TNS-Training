package interfacedemo;

public class BankDemo {

	public static void main(String[] args) {
		 
		 SavingAccount s1=new SavingAccount("Zeel", "Pune", 12345, 17500);
		 
//		 s1.deposit(26000);
//		 System.out.println(s1);
//		 
//		 s1.withdraw(30000);
//		 System.out.println(s1);
		 
		 
		 s1.withdraw(10000);
		 System.out.println(s1);

	}

}