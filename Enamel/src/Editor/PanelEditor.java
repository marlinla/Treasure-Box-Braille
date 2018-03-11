package Editor;

import java.awt.Component;
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

	public static List<Object> listTemplates = new ArrayList<Object>();

	public PanelEditor(File file) throws FileNotFoundException {
		super();
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		//scan scenario files and test if they load
		Scanner scenario = new Scanner(file);
		while (scenario.hasNextLine()) {
			Object temp = new KeyPhraseTemplate(scenario.nextLine() +"\n");
			listTemplates.add(temp);
			this.add((Component) temp);
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
		for (Object kpt : listTemplates) {
			this.add((Component) kpt);
		}
		this.revalidate();
		this.repaint();
	}
}
