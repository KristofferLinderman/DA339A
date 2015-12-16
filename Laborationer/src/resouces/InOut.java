package resouces;

import javax.swing.JOptionPane;

public class InOut {
	
	static public int readInt(){
		return readInt("Enter a whole number");
	}
	
	public static int readInt(String txt){
		boolean numberInput = false;
		int input;
		do{
			try{
				input = Integer.parseInt(JOptionPane.showInputDialog(txt));
				numberInput = true;
				return input;
			} catch(NumberFormatException numbEx){
				
			}
			
		}while(numberInput == false);
		
		return 0;
	}
	static public double readDouble(){
		return readDouble("Mata in ett decimaltal");
	}
	
	static public double readDouble(String txt){
		boolean numberInput = false;
		double input;
		do{
			try{
				input = Double.parseDouble(JOptionPane.showInputDialog(txt));
				numberInput = true;
				return input;
			} catch(NumberFormatException numbEx){
//				System.out.println("Write a number plss...");
			} catch(NullPointerException nullEx){
				System.out.println("At least write something...!!");
			}
			
		}while(numberInput == false);
		
		return 0;
	}

	public static void main(String[] args) {
		InOut io = new InOut();
//		int nbr = io.readInt();
//		int nbr = io.readInt( "Mata in ett tal utan decimaler" );
//		System.out.println("Inmatat tal: " + nbr);
		
//		double tal = io.readDouble("Mata in ett tal som är mindre än 10.0");
		double tal = InOut.readDouble();
		System.out.println("Inmatat tal: " + tal);
	}

}
