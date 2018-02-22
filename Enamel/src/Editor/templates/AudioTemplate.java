package Editor.templates;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import Editor.PanelEditor;

public class AudioTemplate extends KeyPhraseTemplate {

	public AudioTemplate() {
		this("Line Text");
	}

	public AudioTemplate(String line) {
		super(line, "Audio Template");
		//initGUI(line, "Audio Template");
	}



	public AudioTemplate(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public AudioTemplate(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public AudioTemplate(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	protected static JTextArea createJTextArea(String text, Font font, float alignmentX, float alignmentY,
			boolean enabled) {
		JTextArea textArea = new JTextArea(text);
		textArea.setFont(font);
		textArea.setAlignmentX(alignmentX);
		textArea.setAlignmentY(alignmentY);
		textArea.setEnabled(false);

		return textArea;
	}
}
