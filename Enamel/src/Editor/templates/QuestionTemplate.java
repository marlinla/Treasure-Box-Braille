package Editor.templates;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class QuestionTemplate extends JPanel {
	protected final Box verticalBox = Box.createVerticalBox();
	protected final Box horizontalBox = Box.createHorizontalBox();
	protected final Box horizontalBox_1 = Box.createHorizontalBox();
	protected final Box horizontalBox_2 = Box.createHorizontalBox();
	protected final Box horizontalBox_3 = Box.createHorizontalBox();
	protected final JCheckBox chckbxNewCheckBox = new JCheckBox("Enabled");
	protected final JTextField textField = new JTextField();
	protected final JCheckBox chckbxEnable_2 = new JCheckBox("Enabled");
	protected final JTextField textField_1 = new JTextField();
	protected final JCheckBox chckbxEnable_1 = new JCheckBox("Enabled");
	protected final JTextField textField_2 = new JTextField();
	protected final JCheckBox chckbxEnable = new JCheckBox("Enabled");
	protected final JTextField textField_3 = new JTextField();
	protected final Box horizontalBox_4 = Box.createHorizontalBox();
	protected final JLabel lblAskAQuestion = new JLabel("Ask a question:");
	protected final JTextField txtQuestion = new JTextField("Question");
	protected final JLabel lblAnswer = new JLabel("Answers:");
	protected final Box horizontalBox_5 = Box.createHorizontalBox();
	protected final JRadioButton rdbtnCorrect = new JRadioButton("Correct");
	protected final JRadioButton radioButton = new JRadioButton("Correct");
	protected final JRadioButton radioButton_1 = new JRadioButton("Correct");
	protected final JRadioButton radioButton_2 = new JRadioButton("Correct");
	protected final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * @wbp.parser.constructor
	 */
	public QuestionTemplate(String ...line) {
		
		initGUI(line);
	}
	private void initGUI(String ...line) {
		txtQuestion.setText(line[0]);
		if (line.length >=2) {
			textField.setText(line[1]);
			if (line.length >=3) {
				textField_1.setText(line[2]);
				if (line.length >=4) {
					textField_2.setText(line[3]);
					if (line.length >=5) {				
						textField_3.setText(line[4]);
					}
				}
			}
		}
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		verticalBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		txtQuestion.setColumns(10);
		textField.setColumns(10);
		add(verticalBox);
		horizontalBox_4.setAlignmentX(Component.LEFT_ALIGNMENT);
		verticalBox.add(horizontalBox_4);
		
		horizontalBox_4.add(lblAskAQuestion);
		
		verticalBox.add(txtQuestion);
		horizontalBox_5.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		verticalBox.add(horizontalBox_5);
		horizontalBox_5.add(lblAnswer);
		
		verticalBox.add(horizontalBox);
		
		horizontalBox.add(textField);
		
		horizontalBox.add(chckbxNewCheckBox);
		buttonGroup.add(rdbtnCorrect);
		
		horizontalBox.add(rdbtnCorrect);
		
		verticalBox.add(horizontalBox_1);
		textField_1.setColumns(10);
		
		horizontalBox_1.add(textField_1);
		
		horizontalBox_1.add(chckbxEnable_2);
		buttonGroup.add(radioButton);
		
		horizontalBox_1.add(radioButton);
		verticalBox.add(horizontalBox_2);
		textField_2.setColumns(10);
		
		horizontalBox_2.add(textField_2);
		
		horizontalBox_2.add(chckbxEnable_1);
		buttonGroup.add(radioButton_1);
		
		horizontalBox_2.add(radioButton_1);
		
		verticalBox.add(horizontalBox_3);
		textField_3.setColumns(10);
		
		horizontalBox_3.add(textField_3);
		
		horizontalBox_3.add(chckbxEnable);
		buttonGroup.add(radioButton_2);
		
		horizontalBox_3.add(radioButton_2);
	}

	public QuestionTemplate(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public QuestionTemplate(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public QuestionTemplate(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
