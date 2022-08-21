import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactService() {
		ContactService contactService = new ContactService();
		Contact contact  = new Contact("123", "Branden", "McCusker", "7574096105", "Pittsfield, NH 03263");
		contactService.addContact(contact);
		assertTrue(contactService.updateContactFirstName("123", "Mark"));
		assertTrue(contactService.updateContactLastName("123", "Pitana"));
		assertTrue(contactService.updateContactNumber("123", "1234567890"));
		assertTrue(contactService.updateContactAddress("123", "Xrcain City, XN 57898"));
		Contact contact2  = new Contact("456", "Isaac", "Paul", "8987876767", "Yomoho City, XN 36475");
		assertTrue(contactService.addContact(contact2));
		contactService.displayAllContacts();
		assertTrue(contactService.deleteContact("123"));
		contactService.displayAllContacts();
		//testing complete
	}

}
