package ch07_3_polymorphism_ex;

	class Cake {
		public void sweet() {System.out.println("Cake.sweet()");}
	}	
	class CheeseCake extends Cake {
		public void milky() {System.out.println("CheeseCake.milky()");}
	}
	class StrawberryCheeseCake extends CheeseCake {
		public void sour() {System.out.println("StrawberryCheeseCake.sour()");}
	}
	public class CakeControlCode {
		public static void main(String [] args) {
			// "StrawberryCheeseCake instance is CheeCake's instance and so does Cake...
			Cake cake1 = new StrawberryCheeseCake();
			CheeseCake cake2= new StrawberryCheeseCake();
		}
	}