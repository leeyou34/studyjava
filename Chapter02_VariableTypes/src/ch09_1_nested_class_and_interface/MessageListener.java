package ch09_1_nested_class_and_interface;

	public class MessageListener implements Button.OnClickListener {
		@Override
		public void onClick() {
			System.out.println("Sending the message.");
		}
}
