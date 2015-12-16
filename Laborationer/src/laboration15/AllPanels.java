package laboration15;

import java.awt.Dimension;

import javax.swing.JPanel;

public class AllPanels extends JPanel {
	private CalcPanel calcPanel = new CalcPanel();
	private FCConverterPanel tempPanel = new FCConverterPanel();
	private ColorPanel colorPanel = new ColorPanel();
	private TransportPanel transportPanel = new TransportPanel();

	public AllPanels() {
		setPreferredSize(new Dimension(600,500));
		
		add(calcPanel);
		add(tempPanel);
		add(colorPanel);
		add(transportPanel);
	
	}

}
