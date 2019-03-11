package com.ssongman.model;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
	
	public List<Contact> getContactList() {
		List<Contact> listContact = new ArrayList();

		listContact.add(new Contact("song","song@b.c","korea"));
		listContact.add(new Contact("kim","kim@b.c","korea"));
		listContact.add(new Contact("lee","lee@b.c","korea"));
		listContact.add(new Contact("park","park@b.c","korea"));
		
		return listContact;
	}

}
