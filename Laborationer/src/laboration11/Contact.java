package laboration11;

import javax.swing.JOptionPane;

public class Contact {
	private String name;
	private String phone;
	private String mobile;
	private String eMail;

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setEmail(String email) {
		this.eMail = email;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getMobile() {
		return mobile;
	}

	public String getEmail() {
		return eMail;
	}
	
	public String toString(){
		return name + " " + phone + " " + mobile + " " + eMail;
	}

}
