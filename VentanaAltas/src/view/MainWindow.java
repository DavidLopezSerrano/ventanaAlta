package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
		createMainPanels(data);

		pack();

	}

	private void createMainPanels(Data data2) {
		JPanel mainPanel = new JPanel(new GridLayout(2,2));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.setBackground(Color.black);
		p2.setBackground(Color.RED);
		mainPanel.add(p1);
		mainPanel.add(p2);
		
		this.add(mainPanel);
		
		
		
		
	}

	private void setProperties() {
		setLayout(new BorderLayout());
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
