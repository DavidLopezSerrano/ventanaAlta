package view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Data;

public class MainWindow extends JFrame {

	private ArrayList<JLabel> labels = new ArrayList<>();

	private ArrayList<JComboBox> combos = new ArrayList<>();

	private ArrayList<JTextField> textFields = new ArrayList<>();

	private Data data;

	public MainWindow(Data data) {

		super();
		setProperties();

		pack();

	}

	private void setProperties() {
		setLayout(new BorderLayout());
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
