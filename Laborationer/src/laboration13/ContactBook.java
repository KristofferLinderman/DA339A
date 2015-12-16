package laboration13;

import java.util.ArrayList;

public class ContactBook {
	private ArrayList<Contact> contactList;

	public ContactBook() {
		contactList = new ArrayList<Contact>();
	}

	/**
	 * Adds a contact to the contact book.
	 * 
	 * @param contact
	 *            - the contact to be added
	 * @return true if the contact didn't exist else false
	 */
	public boolean addContact(Contact contact) {

		if (!contactList.contains(contact)) {
			contactList.add(contact);
			return true;
		}

		return false;
	}

	/**
	 * Removes contact based on name
	 * 
	 * @param name
	 *            - the name of the contact to be removed
	 * @return true if the contact existed and was removed else false
	 */
	public boolean removeContact(String name) {
		for (Contact contact : contactList) {
			if (contact.getName().equals(name)) {
				contactList.remove(contact);
				return true;
			}
		}
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Contact contact : contactList) {
			sb.append(contact.getName() + "\n");
		}

		return sb.toString();
	}
	
	public Contact findContactNumbers(String name){
		for(Contact contact : contactList){
			if(contact.getName().equals(name)){
				return contact;
			}
		}
		return null;
	}

}
