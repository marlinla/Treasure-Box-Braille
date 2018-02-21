package Editor;

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

public class KeyPhraseTemplate extends JPanel {
	private final ButtonGroup buttonTopRight = new ButtonGroup();
	private final ButtonGroup buttonBottomLeft = new ButtonGroup();
	private final ButtonGroup buttonBottomRight = new ButtonGroup();

	
	public KeyPhraseTemplate() {
		this("Text Line");
	}
	
	public KeyPhraseTemplate(String line) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		JButton btnMoveUp = new JButton("Move Up");
		buttonTopRight.add(btnMoveUp);
		
		JButton btnMoveDown = new JButton("Move Down");
		buttonBottomRight.add(btnMoveDown);
		
		JButton btnInsert = new JButton("Insert Below");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonBottomLeft.add(btnInsert);
		
		JButton btnDelete = new JButton("Insert Above");
		buttonBottomLeft.add(btnDelete);
		
		JLabel lblKeyPhraseTemplate = createJLabel("Key Phrase Template");
		
		JTextField lblTextLine = new JTextField(line);
		lblTextLine.setHorizontalAlignment(SwingConstants.LEFT);
		lblTextLine.setAlignmentX(CENTER_ALIGNMENT);
		lblTextLine.setAlignmentY(CENTER_ALIGNMENT);
		
		JButton btnDelete_1 = new JButton("Delete");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnInsert)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDelete)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDelete_1))
								.addComponent(lblKeyPhraseTemplate))
							.addPreferredGap(ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnMoveUp, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnMoveDown, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(188)
							.addComponent(lblTextLine, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblKeyPhraseTemplate)
							.addGap(54)
							.addComponent(lblTextLine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnMoveUp))
					.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMoveDown)
						.addComponent(btnInsert)
						.addComponent(btnDelete)
						.addComponent(btnDelete_1))
					.addContainerGap())
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
	public static JLabel createJLabel(String text) {
		JLabel label = new JLabel(text);
		return label;
	}
}
