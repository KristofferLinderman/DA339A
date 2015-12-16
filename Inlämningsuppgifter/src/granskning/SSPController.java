package granskning;
/**
SSPController.java

Skapad i syfte för Programmeringsuppgift3
@Author Anton Hellbe
 */

public class SSPController {

	// Instansvariabler som vi behöver
	private SSPPlayer computerPlayer;
	private SSPViewer viewer;
	private int playerChoice;
	private int cpuChoice;
	private int cpuWon = 0;
	private int playerWon = 0;

	// Konstruktor där vi skapar sammanbanded med computerPlayer och Viewer
	public SSPController(SSPPlayer computerPlayer, SSPViewer viewer) {
		this.computerPlayer = computerPlayer;
		this.viewer = viewer;
	}
	
	// set metod för spelarens val, denna kallas på när vi trycker på en knapp, och sätter
	// spelarens val till 0, 1 eller 2.
	public void setPlayerChoice(int i) {
		this.playerChoice = i;
	}
	// getMetod för vinster för datorn som används för att kontrollera hur många vinster vi har
	public int getCpuWon() {
		return this.cpuWon;
	}
	// Samma som ovan fast för spelaren
	public int getPlayerWon() {
		return this.playerWon;
	}
	
	/**
	 *  New Game, anropas när spelaren trycker på "New Game", sätter score till 0 och updaterar viewern
	 */
	public void newGame() {
		this.cpuWon = 0;
		this.playerWon = 0;
		viewer.updateScore();
	}
	/**
	 * newChoice är det som utför spelet, här hämtar vi båda valen och jamför sedan dem.
	 * Sist så kollar vi om antingen datorn eller spelaren har nått 3 vinster, isåfall skrivs det ut.
	 */
	public void newChoice() {
		viewer.setRoundWinner("Först till 3 Vinner!");
		
		cpuChoice = computerPlayer.newChoice();
		if (playerChoice == cpuChoice) {

		} else if (this.playerChoice == 0 && this.cpuChoice == 1) {
			this.playerWon++;
		} else if (this.playerChoice == 0 && this.cpuChoice == 2) {
			this.cpuWon++;
		} else if (this.playerChoice == 1 && this.cpuChoice == 2) {
			this.playerWon++;
		} else if (this.playerChoice == 1 && this.cpuChoice == 0) {
			this.cpuWon++;
		} else if (this.playerChoice == 2 && this.cpuChoice == 0) {
			this.playerWon++;
		} else if (this.playerChoice == 2 && this.cpuChoice == 1) {
			this.cpuWon++;
		}
		if (this.cpuWon >= 3) {
			viewer.setRoundWinner("Datorn vann!");
		} 
		else if (this.playerWon >= 3) {
			viewer.setRoundWinner("Du vann!");
		}
		viewer.setcpuWon(this.cpuWon);
		viewer.setPlayerWon(this.playerWon);
	}
	
	/**
	 * updateStatus använder vi för att uppdatera all information i viewern.
	 * Först kontrollerar vi vad dator och spelare har valt då 0 representerar sten / 1 sax / 2 påse.
	 * Sen kör vi 3 metoder från viewerklassen som förklaras där.
	 */

	public void updateStatus() {
		if (this.playerChoice == 0) {
			viewer.setPlayerChoice("STEN");
		}
		if (this.playerChoice == 1) {
			viewer.setPlayerChoice("SAX");
		}
		if (this.playerChoice == 2) {
			viewer.setPlayerChoice("PÅSE");
		}
		if (this.cpuChoice == 0) {
			viewer.setCpuChoice("STEN");
		}
		if (this.cpuChoice == 1) {
			viewer.setCpuChoice("SAX");
		}
		if (this.cpuChoice == 2) {
			viewer.setCpuChoice("PÅSE");
		}
		viewer.updateChoice();
		viewer.updateScore();
		viewer.updateWinner();
	}

	// Denna metoden kallas på när man trycker på "Avsluta"
	public void finish() {
		System.exit(0);
	}

}
