//Author Name: Branden McCusker

//Date: Jul 17 2022

//Course ID: CS320

//Description: ContactTest - Contains JUnits for testing Contact

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact  = new Contact("123", "Branden", "McCusker", "7574096105", "Pittsfield, NH 03263");
		assertTrue(contact.getContactID().equals("123"));
		assertTrue(contact.getFirstName().equals("Branden"));
		assertTrue(contact.getLastName().equals("McCusker"));
		assertTrue(contact.getPhoneNumber().equals("7574096105"));
		assertTrue(contact.getAddress().equals("Pittsfield, NH 03263"));
		//testing complete
	}

}
