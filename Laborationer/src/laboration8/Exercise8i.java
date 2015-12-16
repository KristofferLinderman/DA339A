package laboration8;

import javax.swing.JOptionPane;

public class Exercise8i {
	public static void main(String[] args) {
		Exercise8i e8i = new Exercise8i();
		e8i.chopper();
	}
	
	public void chopper(){
		String userInput = JOptionPane.showInputDialog("Write your text that you want chopped up");
		
		for(int i = 0; i < userInput.length(); i++){
			System.out.println(userInput.charAt(i));
		}
	}

}
