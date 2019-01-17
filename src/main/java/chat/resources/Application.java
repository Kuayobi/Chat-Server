package chat.resources;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import chat.resources.controller.MessageManager;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
//		MessageManager messageManager = new MessageManager();
//		messageManager.creatMessage("Primer mensaje");
//		messageManager.creatMessage("Segundo mensaje");
//		ArrayList<String> messages = messageManager.getMessages();
//		
//		for(String message :messages) {
//			System.out.println(message);
//		}
//		
//		messageManager.deleteAllMessages();
//		System.out.println(messageManager.getMessages().isEmpty());

		        SpringApplication.run(Application.class, args);
		}
	}


