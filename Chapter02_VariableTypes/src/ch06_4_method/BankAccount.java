package ch06_4_method;

	public class BankAccount {
		//field
		String name;
		String number;
		int balance;
		
		//constructor
		
		public BankAccount(String name) {
			this(name, "123-456", 0);
		}
		
		public BankAccount(String name, String number) {
			this(name, number, 0);
		}
		
		public BankAccount(String name, String number, int balance) {
			this.name = name;
			this.number = number;
			this.balance = balance;
		}
}
