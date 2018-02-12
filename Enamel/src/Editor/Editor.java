package Editor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class Editor {

	private JFrame frame;
	private JTextField textField;

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
		frame.setTitle("The Authoring App");
		
		// The panel to add the buttons
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.desktop));
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
		
		openScenarioBtn.setBackground(Color.WHITE);
		panel.add(openScenarioBtn);
		
		JButton createScenarioBtn = new JButton("New Scenario");
		createScenarioBtn.setBackground(Color.WHITE);
		panel.add(createScenarioBtn);
		
		JButton playScenarioBtn = new JButton("Play Scenario");
		playScenarioBtn.setBackground(Color.WHITE);
		panel.add(playScenarioBtn);
		
		// The Help Button that opens up the GitHub repo
		JButton helpBtn = new JButton("Help");
		helpBtn.setForeground(new Color(0, 0, 0));
		helpBtn.setBackground(Color.WHITE);
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
		
		//welcome panel 
		JPanel panelWelcome = new JPanel();
		panelWelcome.setBackground(Color.PINK);
		frame.getContentPane().add(panelWelcome, BorderLayout.CENTER);
		panelWelcome.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome to the Authoring App! Click one of the buttons above to start.");
		welcomeLabel.setForeground(new Color(0, 0, 0));
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		welcomeLabel.setBounds(0, 0, 634, 40);
		panelWelcome.add(welcomeLabel);
		
		
		try {
			testScenarioScanning(panelWelcome);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		JPanel panelFooter = new JPanel();
		frame.getContentPane().add(panelFooter, BorderLayout.SOUTH);
		
		
		frame.setBounds(100, 100, 650, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//editor panel
		
		
		
	}

	private JLabel testScenarioScanning(JPanel panel) throws FileNotFoundException {
		JLabel textLabel = new JLabel();
		textLabel.setBounds(10, 76, 614, 71);
		panel.add(textLabel);
		//read from scenario 1
		
		Scanner scenario_1 = new Scanner(new File("/Enamel/FactoryScenarios/Scenario_1.txt"));
		while (scenario_1.hasNextLine()) {
			scenario_1.nextLine();
			textLabel.
		}
		
	}
}
