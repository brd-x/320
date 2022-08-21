public class Contact
{
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address)
	{
		if (contactID.length() <= 10 && contactID != null) this.contactID = contactID;
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setAddress(address);
	}

	public void setFirstName(String firstName)
	{
		if (firstName.length() <= 10 && firstName != null) this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		if (lastName.length() <= 10 && lastName != null) this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		if (phoneNumber.length() == 10 && phoneNumber != null) this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address)
	{
		if (address.length() <= 30 && address != null) this.address = address;
	}

	public String getContactID()
	{
		return contactID;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public String getAddress()
	{
		return address;
	}

	@Override
	public String toString()
	{
		return "ID: " + contactID + "\nFirst Name: " + firstName + "\nLast Name: " + lastName
				+ "\nPhone Number: " + phoneNumber + "\nAddress: " + address;
	}
}
