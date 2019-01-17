package chat.resources.controller;
//controlador
import java.util.ArrayList;
import chat.resources.model.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MessageManager {    
	private ArrayList<Message> messages;
	private int messageID;
	
//	constructor
	public MessageManager(){
		this.messages = new ArrayList<Message>();
		this.messageID = 0;
	}
	//methods
	@RequestMapping(value="/messages", method=RequestMethod.POST)
	public void creatMessage(@RequestParam(value="message", defaultValue="No Message sent") String message) {
		Message messageObj = new Message(this.messageID, message);
		this.messages.add(messageObj);
		this.messageID++;
	}
	
	@RequestMapping(value="/messages", method=RequestMethod.GET)
	public ArrayList<String> getMessages(){
		ArrayList<String> result = new ArrayList<String>();
		// for each
		for(Message message: this.messages) {
			result.add(message.getMessage());
		}
		result.add("testing");
		return result;
	}
//	to delete all messages
	@RequestMapping(value="/messages", method=RequestMethod.DELETE)
	public boolean deleteAllMessages(){
		this.messages = null;
		this.messages = new ArrayList<Message>();
		
		return this.messages.isEmpty();
		
	}
}
