package ch09_2_anonymous_2;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//substitute for field inital value
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("Calling the phone.");
		}
	};
	
	Window() {
		button1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("Sending the message.");
			}
		});
	}
}
