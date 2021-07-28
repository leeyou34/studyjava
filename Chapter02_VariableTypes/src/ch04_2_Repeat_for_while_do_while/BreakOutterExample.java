package ch04_2_Repeat_for_while_do_while;

	public class BreakOutterExample {
		public static void main(String[] args) {
			Outter: for(char upper='A'; upper<='Z'; upper++){ // for upper variable, which is char type and equal to 'A', upper variable should be equal or smaller than Z. also there is incrase on variable. 
				for(char lower='a'; lower<='z'; lower++) { // for lower variable, which is char type and ~~~. the lower variable is on increase.
					System.out.println(upper + "-" + lower); // following code must be done for in this local section.
					if(lower == 'g') { // if variable lower is equal(meets) letter g, following code must be done.
					break Outter; // break the Outter that is mentioned.
					}
				}
		}
	}
}
