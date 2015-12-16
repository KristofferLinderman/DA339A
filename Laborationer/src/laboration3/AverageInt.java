package laboration3;

import javax.swing.*;

public class AverageInt {
	
	public void avg(){
	int i = Integer.parseInt(JOptionPane.showInputDialog("First number please"));
	int ii = Integer.parseInt(JOptionPane.showInputDialog("Second number please"));
	int iii = Integer.parseInt(JOptionPane.showInputDialog("Third number please"));
	
	System.out.println((double)(i+ii+iii)/3);
	}
	
	public static void main(String[] args) {
		
		AverageInt avg = new AverageInt();
		avg.avg();
	
	}
}
