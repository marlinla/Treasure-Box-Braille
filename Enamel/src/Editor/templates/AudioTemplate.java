package Editor.templates;

import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JTextArea;

public class AudioTemplate extends KeyPhraseTemplate {

	public AudioTemplate() {
		this("Line Text");
	}

	public AudioTemplate(String line) {
		super(line, "Audio Template");
		// TODO Auto-generated constructor stub
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

	protected static JTextArea createJTextArea(String text, Font font, float alignmentX, float alignmentY, boolean enabled) {
		JTextArea textArea = new JTextArea(text);
		textArea.setFont(font);
		textArea.setAlignmentX(alignmentX);
		textArea.setAlignmentY(alignmentY);
		textArea.setEnabled(false);
		
		return textArea;
	}
}
