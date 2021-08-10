package ch09_1_nested_class_and_interface;

	public class CallListener implements Button.OnClickListener {
		@Override
		public void onClick() {
			System.out.println("Calling the phone.");
		}
}
