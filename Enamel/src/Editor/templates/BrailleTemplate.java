package Editor.templates;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Component;
import javax.swing.JLabel;

public class BrailleTemplate extends JPanel {
	protected final Box verticalBox = Box.createVerticalBox();
	protected final JPanel panel = new JPanel();
	protected final Box horizontalBox = Box.createHorizontalBox();
	protected final JButton btnNewButton = new JButton("New button");
	protected final JRadioButton radioButton = new JRadioButton("");
	protected final JRadioButton radioButton_1 = new JRadioButton("");
	protected final JRadioButton radioButton_2 = new JRadioButton("");
	protected final JRadioButton radioButton_3 = new JRadioButton("");
	protected final JRadioButton radioButton_4 = new JRadioButton("");
	protected final JRadioButton radioButton_5 = new JRadioButton("");
	protected final JPanel panel_1 = new JPanel();
	protected final JRadioButton radioButton_6 = new JRadioButton("");
	protected final JRadioButton radioButton_7 = new JRadioButton("");
	protected final JRadioButton radioButton_8 = new JRadioButton("");
	protected final JRadioButton radioButton_9 = new JRadioButton("");
	protected final JRadioButton radioButton_10 = new JRadioButton("");
	protected final JRadioButton radioButton_11 = new JRadioButton("");
	protected final JRadioButton radioButton_12 = new JRadioButton("");
	protected final JRadioButton radioButton_13 = new JRadioButton("");
	protected final Box horizontalBox_1 = Box.createHorizontalBox();
	protected final Box verticalBox_1 = Box.createVerticalBox();
	protected final JCheckBox chckbxEnable = new JCheckBox("Enable");
	protected final Box verticalBox_2 = Box.createVerticalBox();
	protected final JPanel panel_3 = new JPanel();
	protected final JRadioButton radioButton_14 = new JRadioButton("");
	protected final JRadioButton radioButton_15 = new JRadioButton("");
	protected final JRadioButton radioButton_16 = new JRadioButton("");
	protected final JRadioButton radioButton_17 = new JRadioButton("");
	protected final JRadioButton radioButton_18 = new JRadioButton("");
	protected final JRadioButton radioButton_19 = new JRadioButton("");
	protected final JRadioButton radioButton_20 = new JRadioButton("");
	protected final JRadioButton radioButton_21 = new JRadioButton("");
	protected final JCheckBox checkBox = new JCheckBox("Enable");
	protected final Box verticalBox_3 = Box.createVerticalBox();
	protected final JPanel panel_4 = new JPanel();
	protected final JRadioButton radioButton_22 = new JRadioButton("");
	protected final JRadioButton radioButton_23 = new JRadioButton("");
	protected final JRadioButton radioButton_24 = new JRadioButton("");
	protected final JRadioButton radioButton_25 = new JRadioButton("");
	protected final JRadioButton radioButton_26 = new JRadioButton("");
	protected final JRadioButton radioButton_27 = new JRadioButton("");
	protected final JRadioButton radioButton_28 = new JRadioButton("");
	protected final JRadioButton radioButton_29 = new JRadioButton("");
	protected final JCheckBox checkBox_1 = new JCheckBox("Enable");
	protected final Box verticalBox_4 = Box.createVerticalBox();
	protected final JPanel panel_5 = new JPanel();
	protected final JRadioButton radioButton_30 = new JRadioButton("");
	protected final JRadioButton radioButton_31 = new JRadioButton("");
	protected final JRadioButton radioButton_32 = new JRadioButton("");
	protected final JRadioButton radioButton_33 = new JRadioButton("");
	protected final JRadioButton radioButton_34 = new JRadioButton("");
	protected final JRadioButton radioButton_35 = new JRadioButton("");
	protected final JRadioButton radioButton_36 = new JRadioButton("");
	protected final JRadioButton radioButton_37 = new JRadioButton("");
	protected final JCheckBox checkBox_2 = new JCheckBox("Enable");
	protected final Box verticalBox_5 = Box.createVerticalBox();
	protected final JPanel panel_6 = new JPanel();
	protected final JRadioButton radioButton_38 = new JRadioButton("");
	protected final JRadioButton radioButton_39 = new JRadioButton("");
	protected final JRadioButton radioButton_40 = new JRadioButton("");
	protected final JRadioButton radioButton_41 = new JRadioButton("");
	protected final JRadioButton radioButton_42 = new JRadioButton("");
	protected final JRadioButton radioButton_43 = new JRadioButton("");
	protected final JRadioButton radioButton_44 = new JRadioButton("");
	protected final JRadioButton radioButton_45 = new JRadioButton("");
	protected final JCheckBox checkBox_3 = new JCheckBox("Enable");
	protected final Box verticalBox_6 = Box.createVerticalBox();
	protected final JLabel lblBrailleCellsTo = new JLabel("Braille cells to be displayed on the Treasure Box Braille");

	public BrailleTemplate() {
		// TODO Auto-generated constructor stub
		this("Default Line");
	}
	public BrailleTemplate(String line) {
		initGUI(line);
	}
	private void initGUI(String line) {
		setLayout(new BorderLayout());
		
		add(verticalBox_6, BorderLayout.NORTH);
		lblBrailleCellsTo.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		verticalBox_6.add(lblBrailleCellsTo);
		verticalBox_6.add(horizontalBox_1);
		horizontalBox_1.add(verticalBox_1);
		verticalBox_1.add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(new GridLayout(4, 2, 0, 0));
		radioButton_6.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_1.add(radioButton_6);
		panel_1.add(radioButton_10);
		radioButton_7.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_1.add(radioButton_7);
		panel_1.add(radioButton_11);
		radioButton_8.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_1.add(radioButton_8);
		panel_1.add(radioButton_12);
		radioButton_9.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_1.add(radioButton_9);
		panel_1.add(radioButton_13);
		panel_1.setSize(50, 50);
		chckbxEnable.setAlignmentX(Component.CENTER_ALIGNMENT);
		chckbxEnable.setHorizontalAlignment(SwingConstants.LEFT);
		
		verticalBox_1.add(chckbxEnable);
		
		horizontalBox_1.add(verticalBox_2);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		verticalBox_2.add(panel_3);
		panel_3.setLayout(new GridLayout(4, 2, 0, 0));
		radioButton_14.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_3.add(radioButton_14);
		
		panel_3.add(radioButton_15);
		radioButton_16.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_3.add(radioButton_16);
		
		panel_3.add(radioButton_17);
		radioButton_18.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_3.add(radioButton_18);
		
		panel_3.add(radioButton_19);
		radioButton_20.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_3.add(radioButton_20);
		
		panel_3.add(radioButton_21);
		checkBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		checkBox.setHorizontalAlignment(SwingConstants.LEFT);
		
		verticalBox_2.add(checkBox);
		
		horizontalBox_1.add(verticalBox_3);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		verticalBox_3.add(panel_4);
		panel_4.setLayout(new GridLayout(4, 2, 0, 0));
		radioButton_22.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_4.add(radioButton_22);
		
		panel_4.add(radioButton_23);
		radioButton_24.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_4.add(radioButton_24);
		
		panel_4.add(radioButton_25);
		radioButton_26.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_4.add(radioButton_26);
		
		panel_4.add(radioButton_27);
		radioButton_28.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_4.add(radioButton_28);
		
		panel_4.add(radioButton_29);
		checkBox_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		checkBox_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		verticalBox_3.add(checkBox_1);
		
		horizontalBox_1.add(verticalBox_4);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		verticalBox_4.add(panel_5);
		panel_5.setLayout(new GridLayout(4, 2, 0, 0));
		radioButton_30.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_5.add(radioButton_30);
		
		panel_5.add(radioButton_31);
		radioButton_32.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_5.add(radioButton_32);
		
		panel_5.add(radioButton_33);
		radioButton_34.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_5.add(radioButton_34);
		
		panel_5.add(radioButton_35);
		radioButton_36.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_5.add(radioButton_36);
		
		panel_5.add(radioButton_37);
		checkBox_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		checkBox_2.setHorizontalAlignment(SwingConstants.LEFT);
		
		verticalBox_4.add(checkBox_2);
		
		horizontalBox_1.add(verticalBox_5);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		verticalBox_5.add(panel_6);
		panel_6.setLayout(new GridLayout(4, 2, 0, 0));
		radioButton_38.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_6.add(radioButton_38);
		
		panel_6.add(radioButton_39);
		radioButton_40.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_6.add(radioButton_40);
		
		panel_6.add(radioButton_41);
		radioButton_42.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_6.add(radioButton_42);
		
		panel_6.add(radioButton_43);
		radioButton_44.setHorizontalAlignment(SwingConstants.TRAILING);
		
		panel_6.add(radioButton_44);
		
		panel_6.add(radioButton_45);
		checkBox_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		checkBox_3.setHorizontalAlignment(SwingConstants.LEFT);
		
		verticalBox_5.add(checkBox_3);
		
	}

	public BrailleTemplate(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public BrailleTemplate(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public BrailleTemplate(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
