package com.mipresupuesto.personalbudget.controller.response;

import java.util.ArrayList;
import java.util.List;

import com.mipresupuesto.personalbudget.controller.response.dto.Message;

public class Response<D> {

	private List<D> data;
	private List<Message> messages; // donde me mando los datos y poder manipular

	public void response() {
		

	}

	public void addMessage(final Message message) {

	}

	public List<Message> getMessages() {
		if (messages == null) {
			this.messages = new ArrayList<>();

		}
		return messages;
	}

	public final List<D> getData() {
		if (data == null) {
			this.data = new ArrayList<>();
		}
		return data;
	}
	
	public final void setData(List<D> data ) {
		if(data==null) {
			this.data = new ArrayList<>();
		}else {
			this.data = data;
		}
	}
}
