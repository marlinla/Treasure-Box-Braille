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

public class KeyPhraseTemplate extends JPanel {
	private final ButtonGroup buttonTopRight = new ButtonGroup();
	private final ButtonGroup buttonBottomLeft = new ButtonGroup();
	private final ButtonGroup buttonBottomRight = new ButtonGroup();

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

		JLabel lblKeyPhraseTemplate = createJLabel("Key Phrase Template");

		JTextField lblTextLine = new JTextField(line);
		lblTextLine.setHorizontalAlignment(SwingConstants.LEFT);
		lblTextLine.setAlignmentX(CENTER_ALIGNMENT);
		lblTextLine.setAlignmentY(CENTER_ALIGNMENT);

		JButton btnDelete = new JButton("Delete");
		rightButtonGroup.add(btnDelete);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
						groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addContainerGap()
										.addComponent(lblKeyPhraseTemplate))
								.addGroup(groupLayout.createSequentialGroup().addGap(188).addComponent(lblTextLine,
										GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)))
								.addGap(20)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnMoveUp, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(btnInsertAbove, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(btnInsert, GroupLayout.PREFERRED_SIZE, 193, Short.MAX_VALUE)
										.addComponent(btnMoveDown, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
								.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblKeyPhraseTemplate)
						.addGap(54)
						.addComponent(lblTextLine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(117, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout
						.createSequentialGroup().addGap(16)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnMoveUp, GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnInsertAbove, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE).addGap(16))
						.addGroup(groupLayout.createSequentialGroup().addGap(2).addComponent(btnDelete,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnInsert, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnMoveDown, GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE).addGap(10)));
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
