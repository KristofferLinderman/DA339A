package laboration13;

public class PhoneNumber {

	private String home;
	private String work;
	private String mobile;

	public PhoneNumber(String home, String work, String mobile) {
		this.home = home;
		this.work = work;
		this.mobile = mobile;
	}

	public static void main(String[] args) {
		PhoneNumber phone = new PhoneNumber("0413-11111", "040-123456","0735191919");
		System.out.println(phone.getHome() + ", " + phone.getWork() + ", "+ phone.getMobile());
		System.out.println("------------------------");
		System.out.println(phone.toString());
		System.out.println("------------------------");
		phone.setHome("040-222222");
		phone.setWork("");
		phone.setMobile("0707657654");
		System.out.println(phone.toString());
	}

	public String toString() {
		String numbers = "Home: " + home + "\nWork: " + work + "\nMobile: "
				+ mobile;
		return numbers;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getMobile() {
		return mobile;
	}

	public String getWork() {
		return work;
	}

	public String getHome() {
		return home;
	}
}
