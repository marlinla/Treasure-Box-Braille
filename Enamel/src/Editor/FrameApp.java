package Editor;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FrameApp extends JFrame {

	public static void main(String[] args) throws FileNotFoundException {
		//set up a frame to test scanning
		JFrame frame = new JFrame();
		//JPanel panel = new JPanel();
		//frame.getContentPane().add(panel);
		frame.setBounds(0, 0, 1024, 1024);
		//panel.setBackground(new Color(120, 0, 0));
		frame.setVisible(true);
		//panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		//scan scenario files and test if they load
		PanelEditor pe = new PanelEditor(new File("./FactoryScenarios/Scenario_1.txt"));
		frame.getContentPane().add(pe);
		frame.revalidate();
		frame.repaint();
//		Scanner scenario = new Scanner());
//		while (scenario.hasNextLine()) {
//			KeyPhraseTemplate temp = new KeyPhraseTemplate(scenario.nextLine() +"\n");
//			panel.add(temp);
//		}
//		panel.revalidate();
//		panel.repaint();
	}
}
