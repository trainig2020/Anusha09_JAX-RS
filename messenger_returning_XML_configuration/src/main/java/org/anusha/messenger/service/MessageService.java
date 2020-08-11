package org.anusha.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.anusha.messenger.model.Message;

public class MessageService {
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "HELLO WORLD!!", "ANUSHA");
		Message m2 = new Message(2L, "HELLO HI!!", "ANUSHA");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
