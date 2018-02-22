package Editor;

import java.awt.LayoutManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import Editor.templates.KeyPhraseTemplate;

public class PanelEditor extends JPanel {

	public static List<KeyPhraseTemplate> listTemplates = new ArrayList<>();
	public static File scenarioFile;

	public PanelEditor(File file) throws FileNotFoundException {
		super();
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		//scan scenario files and test if they load
		Scanner scenario = new Scanner(file);
		this.scenarioFile = file;
		while (scenario.hasNextLine()) {
			KeyPhraseTemplate temp = new KeyPhraseTemplate(scenario.nextLine() +"\n");
			listTemplates.add(temp);
			this.add(temp);
		}
	}

	public PanelEditor(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public PanelEditor(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public PanelEditor(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}
	
	public void recreate() {
		this.removeAll();
		for (KeyPhraseTemplate kpt : listTemplates) {
			this.add(kpt);
		}
		this.revalidate();
		this.repaint();
	}
}
