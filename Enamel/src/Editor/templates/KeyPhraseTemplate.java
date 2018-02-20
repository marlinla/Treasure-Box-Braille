package Editor.templates;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;

public class KeyPhraseTemplate extends JPanel {
	private final ButtonGroup buttonTopRight = new ButtonGroup();
	private final ButtonGroup buttonBottomLeft = new ButtonGroup();
	private final ButtonGroup buttonBottomRight = new ButtonGroup();

	public KeyPhraseTemplate() {
		
		JButton btnMoveUp = new JButton("Move Up");
		buttonTopRight.add(btnMoveUp);
		
		JButton btnMoveDown = new JButton("Move Down");
		buttonBottomRight.add(btnMoveDown);
		
		JButton btnInsert = new JButton("Insert");
		buttonBottomLeft.add(btnInsert);
		
		JButton btnDelete = new JButton("Delete");
		
		JLabel lblKeyPhraseTemplate = createJLabel("Key Phrase Template");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblKeyPhraseTemplate)
							.addPreferredGap(ComponentPlacement.RELATED, 683, Short.MAX_VALUE)
							.addComponent(btnMoveUp))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnInsert)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDelete)
							.addPreferredGap(ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
							.addComponent(btnMoveDown)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMoveUp)
						.addComponent(lblKeyPhraseTemplate))
					.addPreferredGap(ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMoveDown)
						.addComponent(btnInsert)
						.addComponent(btnDelete))
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
