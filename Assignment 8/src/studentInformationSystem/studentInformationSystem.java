package studentInformationSystem;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class studentInformationSystem extends JFrame {
	
	public studentInformationSystem() {
		create();
		this.setTitle("Student Information System");
		Container con = getContentPane();
		add(con);
		addListeners();
		makeItVisible();
	}
	public void makeItVisible() {
		setSize(600, 600);
		setVisible(true);
	}
	
	private JLabel firstLabel, secondLabel, genderLabel, informationLabel;
	private JTextField firstText, secondText;
	private JComboBox<String> genders;
	private JButton addButton;
	private JTable informationTable;
	DefaultTableModel tableModel;
	
	public void create() {
		firstLabel = new JLabel("ID : ");
		secondLabel = new JLabel("Name : ");
		genderLabel = new JLabel("Gender : ");
		informationLabel = new JLabel("Information : ");

		firstText = new JTextField(10);
		secondText = new JTextField(10);

		genders = new JComboBox<String>(new String[] { "Male", "Female", "Others"});

		addButton = new JButton("Add");
		
		informationTable = new JTable();
		tableModel = (DefaultTableModel) informationTable.getModel();
		tableModel.addColumn("ID");
		tableModel.addColumn("Name");
		tableModel.addColumn("Gender");
		tableModel.addRow(new String[] {"ID", "Name", "Gender"});

	}
	
	public void add(Container con) {
		GridLayout gl = new GridLayout(5, 1);
		con.setLayout(gl);
		addFirstComponent(con);
		addGenders(con);
		addSecondComponent(con);
		addResultsButton(con);
		addInformationLabel(con);

	}
	
	private void addInformationLabel(Container con) {
		JPanel panel = new JPanel();
		panel.add(informationLabel);
		panel.add(informationTable);
		con.add(panel);

	}

	private void addResultsButton(Container con) {
		JPanel panel = new JPanel();
		panel.add(addButton);
		con.add(panel);

	}

	private void addSecondComponent(Container con) {
		addComponents(con, secondLabel, secondText);

	}

	private void addComponents(Container con, Component a, Component b) {
		JPanel panel = new JPanel();
		panel.add(a);
		panel.add(b);
		con.add(panel);

	}

	private void addGenders(Container con) {
		addComponents(con, genderLabel, genders);

	}

	private void addFirstComponent(Container con) {
		JPanel panel = new JPanel();
		panel.add(firstLabel);
		panel.add(firstText);

		con.add(panel);
	}
	
	void addStudent() {
		Integer id = 0;
		try {
			id = Integer.parseInt(firstText.getText());
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(this, "Number should be entered in the id field");
			throw e;
		}
		String name = secondText.getText();
		String gender = genders.getSelectedItem().toString();		
		String[] temp = new String[] {id.toString(), name, gender};
		tableModel.addRow(temp);
	}

	public void addListeners() {
		addButton.addActionListener((e) -> addStudent());

	}

	public static void main(String[] args) {
		new studentInformationSystem();

	}

}
