package Editor.templates;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;

import Editor.PanelEditor;

import java.awt.Color;

import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Font;

public class KeyPhraseTemplate extends JPanel {

	private static final String QUESTION_TEMPLATE = "QUESTION_TEMPLATE";
	private static final String AUDIO_TEMPLATE = "AUDIO_TEMPLATE";
	private static final String TEXT_TEMPLATE = "TEXT_TEMPLATE";

	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source text "Key Phrase Template"
	 */
	protected static JLabel createJLabel(String text) {
		JLabel label = new JLabel(text);
		return label;
	}

	protected List<JTextField> textFieldList = new ArrayList<>();
	protected final ButtonGroup rightButtonGroup = new ButtonGroup();
	protected int templateID;
	protected static int templateCounter;
	protected JPanel panel = new JPanel();

	protected void initGUI(String template, String ...line) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel = createJPanel(template, line);
		JButton btnMoveUp = new JButton("Move Up");
		btnMoveUp.setPreferredSize(new Dimension(150, 40));
		btnMoveUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KeyPhraseTemplate kpt = (KeyPhraseTemplate) btnMoveUp.getParent();
				PanelEditor pe = (PanelEditor) btnMoveUp.getParent().getParent();
				for (int i = 0; i < PanelEditor.listTemplates.size(); i++) {
					if (PanelEditor.listTemplates.get(i).equals(kpt)) {
						try {
							KeyPhraseTemplate tmp = PanelEditor.listTemplates.get(i);
							PanelEditor.listTemplates.set(i, PanelEditor.listTemplates.get(i - 1));
							PanelEditor.listTemplates.set(i - 1, tmp);
							pe.recreate();
							break;
						} catch (IndexOutOfBoundsException ex) {

						}
					}
				}
			}
		});
		rightButtonGroup.add(btnMoveUp);

		JButton btnMoveDown = new JButton("Move Down");
		btnMoveDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KeyPhraseTemplate kpt = (KeyPhraseTemplate) btnMoveUp.getParent();
				PanelEditor pe = (PanelEditor) btnMoveUp.getParent().getParent();
				for (int i = 0; i < PanelEditor.listTemplates.size(); i++) {
					if (PanelEditor.listTemplates.get(i).equals(kpt)) {
						try {
							KeyPhraseTemplate tmp = PanelEditor.listTemplates.get(i + 1);
							PanelEditor.listTemplates.set(i + 1, PanelEditor.listTemplates.get(i));
							PanelEditor.listTemplates.set(i, tmp);
							pe.recreate();
							break;
						} catch (IndexOutOfBoundsException ex) {

						}
					}
				}
			}
		});

		rightButtonGroup.add(btnMoveDown);

		JButton btnInsertBelow = new JButton("Insert Below");
		rightButtonGroup.add(btnInsertBelow);
		btnInsertBelow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KeyPhraseTemplate kpt = (KeyPhraseTemplate) btnMoveUp.getParent();
				int indexKpt = PanelEditor.listTemplates.indexOf(kpt) + 1;
				PanelEditor pe = (PanelEditor) btnMoveUp.getParent().getParent();
				KeyPhraseTemplate newKpt = new KeyPhraseTemplate();
				PanelEditor.listTemplates.add(indexKpt, newKpt);
				pe.recreate();
			}
		});

		JButton btnInsertAbove = new JButton("Insert Above");
		btnInsertAbove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KeyPhraseTemplate kpt = (KeyPhraseTemplate) btnMoveUp.getParent();
				int indexKpt = PanelEditor.listTemplates.indexOf(kpt);
				PanelEditor pe = (PanelEditor) btnMoveUp.getParent().getParent();
				KeyPhraseTemplate newKpt = new KeyPhraseTemplate();
				PanelEditor.listTemplates.add(indexKpt, newKpt);
				pe.recreate();
			}
		});

		rightButtonGroup.add(btnInsertAbove);

		JLabel lblKeyPhraseTemplate = createJLabel(template);
		// lblTextLine.setEnabled(false);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KeyPhraseTemplate kpt = (KeyPhraseTemplate) btnDelete.getParent();
				PanelEditor pe = (PanelEditor) btnDelete.getParent().getParent();
				for (KeyPhraseTemplate item : PanelEditor.listTemplates) {
					if (item.equals(kpt)) {
						PanelEditor.listTemplates.remove(item);
						pe.recreate();
						break;
					}
				}
			}
		});

		rightButtonGroup.add(btnDelete);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblKeyPhraseTemplate)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 475, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnInsertAbove, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnDelete, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnInsertBelow, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnMoveDown, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnMoveUp, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblKeyPhraseTemplate)
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnMoveUp, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnInsertAbove, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnInsertBelow, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnMoveDown, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
					.addGap(40))
		);
		
		setLayout(groupLayout);
		// TODO Auto-generated constructor stub

	}

	private JPanel createJPanel(String template, String[] line) {
		if (template.equals(AUDIO_TEMPLATE)) {
			return new AudioTemplate(line[0]);
		}
		else if (template.equals(QUESTION_TEMPLATE)) {
			return  new QuestionTemplate(line);
		}
		else {
			return new TextTemplate(line[0]);
		}
	}
	

	public KeyPhraseTemplate() {
		this("Default text");
	}

	public KeyPhraseTemplate(String line) {
		this("TextTemplate", line);

	}

	public KeyPhraseTemplate(String template, String ...line) {

		templateID = templateCounter++;
		this.initGUI(template, line);

	}

	public KeyPhraseTemplate(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public KeyPhraseTemplate(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public KeyPhraseTemplate(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source text line
	 * @wbp.factory.parameter.source font new java.awt.Font("Monospaced",
	 *                               java.awt.Font.PLAIN, 24)
	 * @wbp.factory.parameter.source alignmentX CENTER_ALIGNMENT
	 * @wbp.factory.parameter.source alignmentY CENTER_ALIGNMENT
	 */
	protected static JTextArea createJTextArea(String text, Font font, float alignmentX, float alignmentY,
			boolean enabled) {
		JTextArea textArea = new JTextArea(text);
		textArea.setFont(font);
		textArea.setAlignmentX(alignmentX);
		textArea.setAlignmentY(alignmentY);
		textArea.setEnabled(enabled);

		// System.out.println("this method is used");
		return textArea;
	}
}
