package Editor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Editor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editor window = new Editor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Editor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//The JFileChooser Implementation
		JButton openScenarioBtn = new JButton("Open Scenario");
		openScenarioBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(new File("./FactoryScenarios/"));
				int returnVal = fc.showOpenDialog(openScenarioBtn);
			}
		});
		
		openScenarioBtn.setBackground(Color.ORANGE);
		panel.add(openScenarioBtn);
		
		JButton createScenarioBtn = new JButton("Create Scenario");
		createScenarioBtn.setBackground(Color.ORANGE);
		panel.add(createScenarioBtn);
		
		JButton playScenarioBtn = new JButton("Play Scenario");
		playScenarioBtn.setBackground(Color.ORANGE);
		panel.add(playScenarioBtn);
		
		// The Help Button that opens up the GitHub repo
		JButton helpBtn = new JButton("Help");
		helpBtn.setForeground(new Color(0, 0, 0));
		helpBtn.setBackground(Color.ORANGE);
		helpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    try {
				        Desktop.getDesktop().browse(new URL("https://github.com/marlinla/Treasure-Box-Braille").toURI());
				    } catch (Exception ex) {
				        ex.printStackTrace();
				    }
			}
		});
		panel.add(helpBtn);
		
		frame.setBounds(100, 100, 650, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
