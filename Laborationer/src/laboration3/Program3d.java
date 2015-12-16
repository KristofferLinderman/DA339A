package laboration3;

import javax.swing.*;

public class Program3d {
	public void nameAndJava() {
		String str1 = "födelsedag";
		String str2 = "gratulationer ";
		String str3 = "på ";
		String str4 = "Hjärtliga ";
		String str5 = "!";
		int age = Integer.parseInt(JOptionPane
				.showInputDialog("Ange din ålder"));
		String res = str4 +  str2 + str3 +" din " + age + ":e " + str1 + str5;

		JOptionPane.showMessageDialog(null, res);
	}
}
