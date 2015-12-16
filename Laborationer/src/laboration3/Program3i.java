package laboration3;

import javax.swing.JOptionPane;

public class Program3i {
	
	public void hundredYears(){
		
		String name = JOptionPane.showInputDialog(null,"Enter your name");
		int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
		int currentYear = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter current year"));
		
		int hundredYears = currentYear-age+100;
		
		System.out.println(name + ", you will be 100 years old the year " + hundredYears);
	}
	
	public static void main(String[] args) {
		Program3i prog = new Program3i();
		
		prog.hundredYears();
	}

}
