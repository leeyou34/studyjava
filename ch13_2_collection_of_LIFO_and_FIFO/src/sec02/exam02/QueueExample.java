package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String [] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "Jefferson"));
		messageQueue.offer(new Message("sendSMS", "Thomas"));
		messageQueue.offer(new Message("sendkakaotalk", "Anderson"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println("Sending email to " + message.to);
				break;
			case "sensSMS":
				System.out.println("Sending SMS to " + message.to);
				break;
			case "sendKakaotalk":
				System.out.println("Sending kakaotalk to " + message.to);
				break;
			}
		}
		
	}
}
