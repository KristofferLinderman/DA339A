package laboration21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TitleTest extends JPanel {

	public TitleTest(){
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(400,200));
		Title titel1 = new Title("Black n Red", Font.BOLD, 24, Color.BLACK, Color.RED);
		Title titel2 = new Title("Blue n yellow", Font.PLAIN, 22, Color.BLUE, Color.YELLOW);
		Title titel3 = new Title("White n green", Font.ITALIC, 18, Color.WHITE, Color.GREEN);
		
		add(titel1,BorderLayout.NORTH);
		add(titel2,BorderLayout.CENTER);
		add(titel3,BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new TitleTest());
		frame.setVisible(true);
		frame.pack();
	}
}
