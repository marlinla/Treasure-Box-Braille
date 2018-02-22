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

<<<<<<< HEAD
	private static int templateCounter;

	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source text "Key Phrase Template"
	 */
	private static JLabel createJLabel(String text) {
		JLabel label = new JLabel(text);
		return label;
	}

=======
>>>>>>> branch 'master' of https://github.com/marlinla/Treasure-Box-Braille
	private List<JTextField> textFieldList = new ArrayList<>();
	private final ButtonGroup rightButtonGroup = new ButtonGroup();
	private int templateID;
	private static int templateCounter;

<<<<<<< HEAD
	protected void initGUI(String line, String template) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

		JButton btnMoveUp = new JButton("Move Up");
		btnMoveUp.setPreferredSize(new Dimension(150, 40));
		btnMoveUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rightButtonGroup.add(btnMoveUp);

		JButton btnMoveDown = new JButton("Move Down");
		rightButtonGroup.add(btnMoveDown);

		JButton btnInsert = new JButton("Insert Below");
		rightButtonGroup.add(btnInsert);
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnInsertAbove = new JButton("Insert Above");
		rightButtonGroup.add(btnInsertAbove);

		JLabel lblKeyPhraseTemplate = createJLabel(template);

		JTextArea lblTextLine = KeyPhraseTemplate.createJTextArea(line, new Font("Monospaced", Font.PLAIN, 24),
				CENTER_ALIGNMENT, CENTER_ALIGNMENT, true);
		// lblTextLine.setEnabled(false);

		JButton btnDelete = new JButton("Delete");
		rightButtonGroup.add(btnDelete);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(lblKeyPhraseTemplate)
						.addComponent(lblTextLine, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnMoveDown, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnInsertAbove, 0, 0, Short.MAX_VALUE)
						.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
						.addComponent(btnInsert, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(btnMoveUp, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addContainerGap()
										.addComponent(lblKeyPhraseTemplate).addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblTextLine, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup().addGap(37)
										.addComponent(btnMoveUp, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnInsertAbove, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnInsert,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnMoveDown, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(2).addGap(38)));
		setLayout(groupLayout);
	}

	public KeyPhraseTemplate() {
		this("Text Line");
	}

	public KeyPhraseTemplate(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public KeyPhraseTemplate(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public KeyPhraseTemplate(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public KeyPhraseTemplate(String line) {
		this(line, "Key Phrase Template");

	}

	public KeyPhraseTemplate(String line, String template) {

		templateID = templateCounter++;
		this.initGUI(line, template);
		
	}

	public int getID() {
		return this.templateID;
=======
	public KeyPhraseTemplate() {
		this("Text Line");
>>>>>>> branch 'master' of https://github.com/marlinla/Treasure-Box-Braille
	}

	public String getText(int index) {
		return textFieldList.get(index).getText();
	}

	public void setText(int index, String text) {
		textFieldList.get(index).setText(text);
	}

<<<<<<< HEAD
=======
	public int getID() {
		return this.templateID;
	}

	public KeyPhraseTemplate(String line) {
		templateID = templateCounter++;
		setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

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

		JLabel lblKeyPhraseTemplate = createJLabel("Key Phrase Template");

		JTextArea lblTextLine = new JTextArea(line);
		lblTextLine.setFont(new Font("Monospaced", Font.PLAIN, 24));
		lblTextLine.setAlignmentX(CENTER_ALIGNMENT);
		lblTextLine.setAlignmentY(CENTER_ALIGNMENT);

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
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(lblKeyPhraseTemplate)
						.addComponent(lblTextLine, GroupLayout.PREFERRED_SIZE, 587, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnMoveDown, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnInsertAbove, 0, 0, Short.MAX_VALUE)
						.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
						.addComponent(btnInsertBelow, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnMoveUp, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addContainerGap()
								.addComponent(lblKeyPhraseTemplate).addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblTextLine, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup().addGap(37)
								.addComponent(btnMoveUp, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnInsertAbove, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnInsertBelow, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnMoveDown, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE).addGap(2)))
				.addGap(38)));
		setLayout(groupLayout);
		// TODO Auto-generated constructor stub

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

>>>>>>> branch 'master' of https://github.com/marlinla/Treasure-Box-Braille
	/**
	 * @wbp.factory
<<<<<<< HEAD
	 * @wbp.factory.parameter.source text line
	 * @wbp.factory.parameter.source font new java.awt.Font("Monospaced",
	 *                               java.awt.Font.PLAIN, 24)
	 * @wbp.factory.parameter.source alignmentX CENTER_ALIGNMENT
	 * @wbp.factory.parameter.source alignmentY CENTER_ALIGNMENT
=======
	 * @wbp.factory.parameter.source text "Key Phrase Template"
>>>>>>> branch 'master' of https://github.com/marlinla/Treasure-Box-Braille
	 */
<<<<<<< HEAD
	protected static JTextArea createJTextArea(String text, Font font, float alignmentX, float alignmentY,
			boolean enabled) {
		JTextArea textArea = new JTextArea(text);
		textArea.setFont(font);
		textArea.setAlignmentX(alignmentX);
		textArea.setAlignmentY(alignmentY);
		textArea.setEnabled(enabled);

		// System.out.println("this method is used");
		return textArea;
=======
	private static JLabel createJLabel(String text) {
		JLabel label = new JLabel(text);
		return label;
>>>>>>> branch 'master' of https://github.com/marlinla/Treasure-Box-Braille
	}
}
