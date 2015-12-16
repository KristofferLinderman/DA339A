package granskning;
/**
SSPUserInput.java

Skapad i syfte för Programmeringsuppgift3
@Author Anton Hellbe
 */
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class SSPUserInput extends JLabel {
	
	// Samtliga instansvariabler vi behöver
	
	private SSPController cont;
	private JButton btnStone = new JButton("Sten");
	private JButton btnSiccsor = new JButton("Sax");
	private JButton btnBag = new JButton("Påse");
	private JButton btnNewGame = new JButton("Nytt spel");
	private JButton btnExit = new JButton("Avsluta spel");
	
	
	/**
	 * 
	 * Konstruktor där vi ritar alla knappar i fönstret
	 */
	public SSPUserInput(SSPController cont) {
		
		this.cont = cont;
		ButtonListener button = new ButtonListener();
		btnStone.addActionListener(button);
		btnSiccsor.addActionListener(button);
		btnBag.addActionListener(button);
		btnExit.addActionListener(button);
		btnNewGame.addActionListener(button);
		setPreferredSize(new Dimension(400, 200));
		btnStone.setBounds(50, 20, 80, 50);
		btnSiccsor.setBounds(160, 20, 80, 50);
		btnBag.setBounds(270, 20, 80, 50);
		btnExit.setBounds(50, 140, 300, 50);
		btnNewGame.setBounds(50, 80, 300, 50);

		add(btnStone);
		add(btnSiccsor);
		add(btnBag);
		add(btnNewGame);
		add(btnExit);
	}
	
	/**
	 * 
	 * Vår listener för användarens knapptryck, samt metoder som kommer utföras vid varje knapptryck
	 * Vad metoderna gör kommenteras i Controllerklassen.
	 */
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 0 sten 1 Sax 2 påse
		
			if (e.getSource() == btnStone) {
				cont.setPlayerChoice(0); // Sätter spelarens val till 0
				cont.newChoice();
				cont.updateStatus();
			}
			if (e.getSource() == btnSiccsor) {
				cont.setPlayerChoice(1); // Sätter spelarens val till 1
				cont.newChoice();
				cont.updateStatus();
			}
			if (e.getSource() == btnBag) {
				cont.setPlayerChoice(2); // Sätter spelarens val till 2
				cont.newChoice();
				cont.updateStatus();
			}
			if (e.getSource() == btnNewGame) {
				// Kör metoden newGame i Controllern och Enablar knapparna igen så man kan spela på nytt
				cont.newGame();
				btnStone.setEnabled(true);
				btnSiccsor.setEnabled(true);
				btnBag.setEnabled(true);
			}
			if (e.getSource() == btnExit) {
				cont.finish();
			}
			// Kontrollerar efter varje knapptryck om någon nått 3 vinster
			if(cont.getCpuWon() == 3 || cont.getPlayerWon() == 3 ) {
				btnStone.setEnabled(false);
				btnSiccsor.setEnabled(false);
				btnBag.setEnabled(false);
			}

		}
		

	}
}
