package laboration16;

import java.awt.*;
import javax.swing.*;

// LabelPanel
public class LabelPanel extends JPanel {
	private JLabel lblColor;

	public LabelPanel() {
		setPreferredSize(new Dimension(300,300));
		lblColor = new JLabel();
		setLayout(new BorderLayout());
		lblColor.setOpaque(true);
		add(lblColor, BorderLayout.CENTER);
	}

	public void setColor(Color color) {
		lblColor.setBackground(color);
	}
}