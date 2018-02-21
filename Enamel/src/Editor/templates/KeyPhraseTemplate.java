package Editor.templates;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.Color;

import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Font;

public class KeyPhraseTemplate extends JPanel {
	

	private List<JTextField> textFieldList = new ArrayList<>();
	private final ButtonGroup rightButtonGroup = new ButtonGroup();
	private int templateID;

	private static int templateCounter;

	public KeyPhraseTemplate() {
		this("Text Line");
	}

	public String getText(int index) {
		return textFieldList.get(index).getText();
	}

	public void setText(int index, String text) {
		textFieldList.get(index).setText(text);
	}

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
			}
		});
		rightButtonGroup.add(btnMoveUp);

		JButton btnMoveDown = new JButton("Move Down");
		btnMoveDown.setHorizontalAlignment(SwingConstants.LEFT);
		rightButtonGroup.add(btnMoveDown);

		JButton btnInsert = new JButton("Insert Below");
		rightButtonGroup.add(btnInsert);
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnInsertAbove = new JButton("Insert Above");
		rightButtonGroup.add(btnInsertAbove);

		JLabel lblKeyPhraseTemplate = createJLabel("Key Phrase Template");

		JTextArea lblTextLine = new JTextArea(line);
		lblTextLine.setFont(new Font("Monospaced", Font.PLAIN, 24));
		lblTextLine.setAlignmentX(CENTER_ALIGNMENT);
		lblTextLine.setAlignmentY(CENTER_ALIGNMENT);

		JButton btnDelete = new JButton("Delete");
		rightButtonGroup.add(btnDelete);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblKeyPhraseTemplate)
						.addComponent(lblTextLine, GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnDelete, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMoveUp, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnInsert)
								.addComponent(btnMoveDown, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnInsertAbove))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblKeyPhraseTemplate)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTextLine, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addComponent(btnMoveUp, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnInsertAbove, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnInsert, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnMoveDown, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
					.addGap(38))
		);
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

	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source text "Key Phrase Template"
	 */
	private static JLabel createJLabel(String text) {
		JLabel label = new JLabel(text);
		return label;
	}
}
