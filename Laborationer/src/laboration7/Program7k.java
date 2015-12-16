package laboration7;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Program7k extends JButton implements ActionListener {
	
	public Program7k(){
		super("Program7k");
		addActionListener(this);
		setPreferredSize(new Dimension(200,75));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	      double price;
	      double fromCustomer;
	      double back;
	      
	      boolean member;
	        
	      price = Double.parseDouble( JOptionPane.showInputDialog("What is the total price?") );
	      fromCustomer = Double.parseDouble( JOptionPane.showInputDialog("Cash received") );
	      
	      // medlem får värdet true vid klick på 'Ja', och false vid klick på 'Nej' / stängning av dialog
	      member = JOptionPane.showConfirmDialog( null, "Is the customer a Member?", "Member", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION;

	      if(price >= 5000 && price < 10000){
	    	  price *= 0.95;	    		  
	      } else if (price >= 10000){
	    	  price *= 0.9;
	      }
	      // om medlem så ska nytt pris beräknas här: price = 0.9 * price; // 10% rabatt
	      if(member){
	    	  price *= 0.9;
	      }
	      back = fromCustomer-price;
	      JOptionPane.showMessageDialog( null, "Cash back: $" + back);
		
	}

}
