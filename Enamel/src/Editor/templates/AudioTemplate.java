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
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JTextField;

public class AudioTemplate extends JPanel {
	protected final Box verticalBox = Box.createVerticalBox();
	protected final JLabel lblwavFile = new JLabel(".wav File:");
	protected final JTextField txtNoAudioFile = new JTextField("No Audio File Loaded!");
	protected final Box horizontalBox = Box.createHorizontalBox();
	protected final JButton btnOpenAudioFile = new JButton("Open Audio File...");
	protected final JButton btnRecordAudioFile = new JButton("Record Audio File...");
	protected final JButton btnPreviewAudioFile = new JButton("Preview Audio File...");
	protected final Component horizontalGlue = Box.createHorizontalGlue();
	protected final JButton btnClearAudioFile = new JButton("Clear Audio File");

	public AudioTemplate() {
		this("No Audio File Loaded!");
	}
	private void initGUI(String line) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		txtNoAudioFile.setText(line);
		add(verticalBox);
		verticalBox.add(lblwavFile);
		txtNoAudioFile.setEditable(false);
		verticalBox.add(txtNoAudioFile);
		txtNoAudioFile.setColumns(10);
		horizontalBox.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		verticalBox.add(horizontalBox);
		
		horizontalBox.add(btnOpenAudioFile);
		
		horizontalBox.add(btnRecordAudioFile);
		
		horizontalBox.add(btnPreviewAudioFile);
		
		horizontalBox.add(horizontalGlue);
		
		horizontalBox.add(btnClearAudioFile);
		
		//accessiblity
		btnOpenAudioFile.getAccessibleContext().setAccessibleDescription("The open audio file button opens an audio file. Button 1 of 4");
		btnRecordAudioFile.getAccessibleContext().setAccessibleDescription("The record audio button lets you record your own audio file. Button 2 of 4 ");
		btnPreviewAudioFile.getAccessibleContext().setAccessibleDescription("The preview audio button lets you preview the audio you just selected. Button 3 of 4");
		btnClearAudioFile.getAccessibleContext().setAccessibleDescription("The clear audio button clears the audio file you just selected");
	}

	public AudioTemplate(String line) {
		super();
		initGUI(line);
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
