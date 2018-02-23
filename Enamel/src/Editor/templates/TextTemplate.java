package Editor.templates;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextTemplate extends JPanel {
	protected final Box verticalBoxTop = Box.createVerticalBox();
	protected final Box verticalBoxCenter = Box.createVerticalBox();
	protected final Box verticalBoxBottom = Box.createVerticalBox();

	
	protected final JTextField textField = new JTextField("Default Text");
	public TextTemplate() {
	
		this("Default Constructor");
	}
	private void initGUI(String line) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		verticalBoxCenter.add(textField);
		textField.setColumns(10);
		textField.setText(line);
			verticalBoxCenter.add(textField);
		add(verticalBoxTop);
		verticalBoxTop.add(verticalBoxCenter);
		verticalBoxCenter.add(verticalBoxBottom);
	}

	public TextTemplate(String line) {
		super();
		initGUI(line);
		// TODO Auto-generated constructor stub
	}

	public TextTemplate(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public TextTemplate(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public TextTemplate(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @wbp.factory
	 */
	
}
