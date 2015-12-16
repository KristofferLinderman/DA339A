package granskning;

/**
SSPViewer.java

Skapad i syfte för Programmeringsuppgift3
@Author Anton Hellbe
 */
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class SSPViewer extends JLabel {
	
	//Instansvariabler
	
	private JLabel lblWinner = new JLabel("Först till 3 Vinner!");
	private JLabel lblHuman = new JLabel("Human");
	private JLabel lblComputer = new JLabel("Computer");
	private JLabel lblScorePlayer = new JLabel("0");
	private JLabel lblScoreCpu = new JLabel("0");
	private JLabel lblChoice = new JLabel(" ");
	private JLabel lblChoice2 = new JLabel(" ");
	private String cpuChoice;
	private String playerChoice;
	private int cpuWon;
	private int playerWon;
	private String roundWinner;
	
	/**
	 * Konstruktor som målar upp viewer fönstret
	 */
	public SSPViewer() {
	
	setPreferredSize(new Dimension(300,250));
	Font font = new Font("Sanserif", Font.BOLD, 18);
	Font font2 = new Font("Sanserif", Font.BOLD, 16);
	lblWinner.setBounds(50, 20, 200,50);
	lblHuman.setBounds(50,60,70,100);
	lblScorePlayer.setBounds(70,110, 40, 40);
	lblScoreCpu.setBounds(170,110,40,40);
	lblComputer.setBounds(150,60,90,100);
	lblChoice.setBounds(50,130,70,50);
	lblChoice2.setBounds(150,130,70,50);
	lblHuman.setFont(font2);
	lblComputer.setFont(font2);
	lblWinner.setFont(font);
	lblScorePlayer.setFont(font2);
	lblScoreCpu.setFont(font2);
	lblChoice.setFont(font2);
	lblChoice2.setFont(font2);
	add(lblScorePlayer);
	add(lblScoreCpu);
	add(lblChoice);
	add(lblChoice2);
	add(lblWinner);
	add(lblHuman);
	add(lblComputer);
	
	}
	// setter som vi använder i controllern för att bestämma vad användaren har valt
	public void setPlayerChoice(String s) {
		this.playerChoice = s;
	}
	//setter som vi använder i controllern för att bestämma vad datorn har använt.
	public void setCpuChoice(String t) {
		this.cpuChoice = t;
	}
	// Om någon av spelarna nått 3 vinster så kallar vi på denna settern för att uppdatera text med
	// vem som har vunnit
	public void setRoundWinner(String x) {
		this.roundWinner = x;
	}
	// Set för antal vinster (Dator)
	public void setcpuWon(int i) {
		this.cpuWon=i;
	}
	// Set för antal vinster (Spelare)
	public void setPlayerWon(int x) {
		this.playerWon=x;
	}
	/**
	 * Metod som gör om Score (int) till String och sedan uppdaterar viewern med vinsterna
	 */
	public void updateScore() {
		String res = Integer.toString(this.cpuWon);
		lblScoreCpu.setText(res);
		
		String res2 = Integer.toString(this.playerWon);
		lblScorePlayer.setText(res2);
	}
	/**
	 * Metod som uppdaterar vad båda spelarna har valt (Sten, sax eller påse)
	 */
	public void updateChoice() {
	lblChoice.setText(this.playerChoice);
	lblChoice2.setText(this.cpuChoice);
	}
	
	/**
	 * Metod som används för att visa vem vinnaren är när någon har nått 3 vinster.
	 */
	public void updateWinner() {
		lblWinner.setText(this.roundWinner);
	}
	


}
