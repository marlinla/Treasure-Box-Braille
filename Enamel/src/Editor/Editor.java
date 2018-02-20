package Editor;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import enamel.ScenarioParser;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;

public class Editor {

	private JFrame frame;
	private JOptionPane noFileChosenPopUp; // The small frame that opens up when there is no file chosen
	private File openScenarioFile = null; // The File that gets chosen by the open Scenario Button
	private boolean validScenarioFile;
	// The Initialization of the ribbons
	JPanel ribbonFile = new JPanel(); // File Ribbon
	JPanel ribbonEdit = new JPanel(); // Edit Ribbon
	JPanel panelHeader = new JPanel(); // The main panel that holds the top most buttons
	JLabel labelSelectedFile = new JLabel(); // The selected file label that shows what file you selected

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
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setTitle("The Authoring App");
		frame.setBounds(100, 100, 650, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// This is the header panel that holds the buttons on top of the application
		panelHeader.setBackground(Color.WHITE);
		panelHeader.setBounds(0, 0, 634, 26);
		frame.getContentPane().add(panelHeader);
		panelHeader.setLayout(null);

		// The File Button
		JButton btnFile = new JButton("File");

		// Changes the color of the File button on mouse hover
		btnFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setOnMouseEnteredColor(btnFile);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setOnMouseExitColor(btnFile);
			}
		});

		// This is where the ribbon for the File button opens up
		btnFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ribbonFile.removeAll(); // remove all the components inside of the ribbon
				frame.remove(ribbonEdit); // removes existing ribbons first

				ribbonFile.setBackground(SystemColor.activeCaption);
				ribbonFile.setBounds(0, 26, 634, 36);
				frame.getContentPane().add(ribbonFile);

				addFileRibbonComponents(ribbonFile); // adds all the components to the file ribbon
			}
		});

		btnFile.setBorderPainted(false);
		btnFile.setBackground(Color.WHITE);
		btnFile.setBounds(0, 0, 65, 26);
		panelHeader.add(btnFile);
		// ##########################File Button Ends#########################//

		// The Edit button on the main panel
		JButton btnEdit = new JButton("Edit");

		// Changes the color of the Edit button on mouse hover
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setOnMouseEnteredColor(btnEdit);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setOnMouseExitColor(btnEdit);
			}
		});

		btnEdit.addActionListener(new ActionListener() {
			// This is where the ribbon for the edit button opens up
			public void actionPerformed(ActionEvent e) {
				ribbonEdit.removeAll(); // remove all the components inside of the ribbon
				frame.remove(ribbonFile); // Removes existing ribbons first

				ribbonEdit.setBackground(SystemColor.activeCaption);
				ribbonEdit.setBounds(0, 26, 634, 36);
				frame.getContentPane().add(ribbonEdit);

				addEditRibbonComponents(ribbonEdit); // adds all the components to the Edit ribbon

			}
		});

		btnEdit.setBorderPainted(false);
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBounds(64, 0, 65, 26);
		panelHeader.add(btnEdit);
		// ########################Edit Button Ends###########################//

		// The Help Button
		JButton btnHelp = new JButton("Help");

		// Changes the color of the help button on Help hover
		btnHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setOnMouseEnteredColor(btnHelp);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setOnMouseExitColor(btnHelp);
			}
		});

		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Clicking on the Help button opens up the User Manual on the github repository
				try {
					Desktop.getDesktop().browse(new URL("https://github.com/marlinla/Treasure-Box-Braille").toURI());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		btnHelp.setBorderPainted(false);
		btnHelp.setBackground(Color.WHITE);
		btnHelp.setBounds(128, 0, 65, 26);
		panelHeader.add(btnHelp);
		
		frame.setFocusTraversalPolicy(new FocusTraversalOnArray(
				new Component[] { frame.getContentPane(), panelHeader, btnFile, btnEdit, btnHelp }));
	}

	/**
	 * Adds the components necessary to the File ribbon in the main panel header
	 * 
	 * @param ribbonFile
	 *            the File Ribbon
	 */
	private void addFileRibbonComponents(JPanel ribbonFile) {
		// This is the Open Scenario Button inside of the file ribbon
		JButton btnOpenScenario = new JButton("Open Scenario");
		btnOpenScenario.addActionListener(new ActionListener() {
			// Clicking on the file opens up the JFileChooser
			public void actionPerformed(ActionEvent e) {
				openTheScenarioFile(btnOpenScenario);
			}
		});
		btnOpenScenario.setBackground(Color.ORANGE);
		ribbonFile.add(btnOpenScenario);

		// This is the Create Scenario Button inside of the file ribbon
		JButton btnCreateScenario = new JButton("Create Scenario");
		btnCreateScenario.setBackground(Color.ORANGE);
		ribbonFile.add(btnCreateScenario);

		// This is the Play Scenario Button inside of the file ribbon
		JButton btnPlayScenario = new JButton("Play Scenario");
		btnPlayScenario.addActionListener(new ActionListener() {
			// Clicking on the play scenario starts playing the file that was chosen
			public void actionPerformed(ActionEvent e) {
				playScenario();
			}
		});
		btnPlayScenario.setBackground(Color.ORANGE);
		ribbonFile.add(btnPlayScenario);

		// Revalidating and Repainting so it shows up
		ribbonFile.revalidate();
		ribbonFile.repaint();
	}

	/**
	 * Adds the components necessary to the Edit ribbon in the main panel header
	 * 
	 * @param ribbonEdit
	 *            the Edit Ribbon
	 */
	private void addEditRibbonComponents(JPanel ribbonEdit) {
		JButton btnNewButton = new JButton("Edit Scenario");
		btnNewButton.setBackground(Color.ORANGE);
		ribbonEdit.add(btnNewButton);

		ribbonEdit.revalidate();
		ribbonEdit.repaint();
	}

	/**
	 * Sets the color of the JButton to orange and its text to white on mouse hover
	 * 
	 * @param btn
	 */
	private void setOnMouseEnteredColor(JButton btn) {
		btn.setForeground(Color.WHITE);
		btn.setBackground(Color.ORANGE);
	}

	/**
	 * Sets the color of the JButton to white and its text to black on mouse hover
	 * exit
	 * 
	 * @param btn
	 */
	private void setOnMouseExitColor(JButton btn) {
		btn.setBackground(Color.WHITE);
		btn.setForeground(Color.BLACK);
	}

	/**
	 * This is the file chooser implementation of the openScenarioButton in the file
	 * ribbon. It opens up the sound player after choosing an appropriate scenario
	 * file
	 * 
	 * @param btn
	 */
	private void openTheScenarioFile(JButton btn) {
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File("FactoryScenarios/"));
		int returnVal = fc.showOpenDialog(btn);

		if (returnVal == fc.APPROVE_OPTION) {
			openScenarioFile = fc.getSelectedFile();
			createFileDisplayer(panelHeader, openScenarioFile);
		}
	}
	
	/**
	 * Creates the file displayer that shows what file the user selected and also adds 
	 * a remove button to remove the current selection
	 * @param panelHeader
	 * 					the panel to add the JLabel and Remove button to
	 * @param file
	 * 				the file to add to the displayer
	 */
	private void createFileDisplayer(JPanel panelHeader, File file) {
		// Remove existing file displayers first
		panelHeader.remove(labelSelectedFile);
		// The JLabel to hold the selected file
		labelSelectedFile.setText("Selected File:  '" + file.getName() + "'  ");
		labelSelectedFile.setHorizontalAlignment(SwingConstants.RIGHT);
		labelSelectedFile.setBounds(338, 0, 216, 26);
		panelHeader.add(labelSelectedFile);
		// The button that removes the current file chosen
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Remove the components
				panelHeader.remove(labelSelectedFile);
				panelHeader.remove(btnRemove);
				openScenarioFile = null;
				
				panelHeader.revalidate();
				panelHeader.repaint();
			}
		});
		btnRemove.setBackground(Color.RED);
		btnRemove.setForeground(Color.WHITE);
		btnRemove.setBounds(554, 0, 80, 26);
		panelHeader.add(btnRemove);

		panelHeader.revalidate();
		panelHeader.repaint();
	}

	/**
	 * Plays the scenario file that was chosen through the open scenario button and
	 * handles errors when there is no file chosen or if the file is not valid
	 */
	private void playScenario() {
		// Checks if the user has selected a file or not
		if (openScenarioFile == null) {
			noFileChosenPopUp = new JOptionPane();
			noFileChosenPopUp.setBounds(300, 300, 250, 125);
			noFileChosenPopUp.showMessageDialog(frame, "No scenario file chosen. Please select"
					+ " a scenario file by clicking on the open scenario button or create a new scenario to play",
					"Error", JOptionPane.ERROR_MESSAGE);
			noFileChosenPopUp.setVisible(true);
			return;
		}

		isScenarioFile(); // Checks if it is a scenarioFile

		if (!validScenarioFile) {
			noFileChosenPopUp = new JOptionPane();
			noFileChosenPopUp.setBounds(300, 300, 250, 125);
			noFileChosenPopUp.showMessageDialog(frame,
					"'" + openScenarioFile.getName() + "'"
							+ " is an invalid scenario File. Please select a valid scenario file.",
					"Error", JOptionPane.ERROR_MESSAGE);
			noFileChosenPopUp.setVisible(true);
			return;
		}
		// This is where the file gets passed into the sound player
		Thread starterCodeThread = new Thread("Starter Code Thread") {
			public void run() {
				String scenarioFile = openScenarioFile.getAbsolutePath();
				ScenarioParser s = new ScenarioParser(true);
				s.setScenarioFile(scenarioFile);
			}
		};
		starterCodeThread.start();
	}

	/**
	 * Checks if the scenarioFile that is chosen is valid or not
	 */
	private void isScenarioFile() {
		validScenarioFile = false;
		String nameOfFile = openScenarioFile.getName();
		Path path = FileSystems.getDefault().getPath(nameOfFile);
		try {
			String fileType = Files.probeContentType(path);
			String fileExt = fileType.substring(fileType.lastIndexOf("/") + 1); // Get the extension of the file

			// Checks if its a text file
			if (fileExt.equals("plain")) {
				scenarioFileValidator();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Checks if the the first 2 lines have the words 'Cell' and 'Button" and from
	 * there it determines whether or not its a valid scenarioFile
	 * 
	 * @throws FileNotFoundException
	 */
	private void scenarioFileValidator() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(openScenarioFile));

		try {
			String Cell = br.readLine();
			String firstWord = Cell.split(" ")[0]; // The first word
			String Button = br.readLine();
			String secondWord = Button.split(" ")[0]; // The second word
			// Checks if the first 2 lines have the words 'cell' and 'button' in them
			if (firstWord.equals("Cell") && secondWord.equals("Button")) {
				validScenarioFile = true;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
