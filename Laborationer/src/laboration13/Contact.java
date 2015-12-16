package laboration13;

public class Contact {
	private String name;
	private PhoneNumber phoneNumber;

	/**
	 * Create a new contact
	 * @param name - the name of the contact
	 * @param home - the home number
	 * @param work - the work number
	 * @param mobile - the mobile number
	 */
	public Contact(String name, String home, String work, String mobile) {
		this.name = name;
		phoneNumber = new PhoneNumber(home, work, mobile);

	}

	public static void main(String[] args) {
		Contact contact = new Contact("Eva Bok", "040-123456", "040- 333333",
				"0705223344");
		System.out.println("Namn: " + contact.getName() + "\n"
				+ "Telefonnummer: " + contact.getHome() + ", "
				+ contact.getWork() + ", " + contact.getMobile());
		
		System.out.println("--------------------------------");
		
		System.out.println(contact.toString());
		
		System.out.println("--------------------------------");
		
		contact.setHome("040-999999");
		contact.setWork("0415-22222");
		contact.setMobile("0776192837");
		System.out.println(contact.toString());
	}

	public String getMobile() {
		return phoneNumber.getMobile();
	}

	public String getWork() {
		return phoneNumber.getWork();
	}

	public String getHome() {
		return phoneNumber.getHome();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHome(String home) {
		phoneNumber.setHome(home);
	}

	public void setWork(String work) {
		phoneNumber.setWork(work);
	}

	public void setMobile(String mobile) {
		phoneNumber.setMobile(mobile);
	}

	public String toString() {
		String info = "Contact: " + name + "\nHome: " + phoneNumber.getHome()
				+ "\nWork: " + phoneNumber.getWork() + "\nMobile: "
				+ phoneNumber.getMobile();
		return info;
	}

}