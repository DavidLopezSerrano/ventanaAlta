package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
	
	private ArrayList<JPanel> panelsMain = new ArrayList<>();
	
	private ArrayList<JPanel> panelsBoxes = new ArrayList<>();

	private Data data;

	public MainWindow(Data data) {

		super();
		this.data=data;
		setProperties();
		createMainPanels();
		createPanelPersonal();
		createPanelAddress();

		pack();

	}

	private void createPanelAddress() {
		for (int i = 0; i < data.getAddress().size(); i++) {
			
			panelsBoxes.add(new JPanel(new GridLayout(2,1, 10,10)));
			
			labels.add(new JLabel(data.getAddress().get(i)));
			
			panelsBoxes.get(i).add(labels.get(i));
			
			panelsMain.get(1).add(panelsBoxes.get(i));
		}		
	}

	private void createPanelPersonal() {
		
		for (int i = 0; i < data.getPersonalData().size(); i++) {
			
			panelsBoxes.add(new JPanel(new GridLayout(2,1, 10,10)));
			
			labels.add(new JLabel(data.getPersonalData().get(i)));
			
			panelsBoxes.get(i).add(labels.get(i));
			
			panelsMain.get(0).add(panelsBoxes.get(i));
		}
		
	}

	private void createMainPanels() {
		JPanel mainPanel = new JPanel(new GridLayout(2,1));
		panelsMain.add(new JPanel());
		panelsMain.add(new JPanel());
		panelsMain.get(0).setBackground(Color.black);
		panelsMain.get(1).setBackground(Color.RED);
		
		for (int i = 0; i < panelsMain.size(); i++) {
		mainPanel.add(panelsMain.get(i));
		}
		
		this.add(mainPanel);
		
		
		
		
	}

	private void setProperties() {
		setLayout(new BorderLayout());
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public ArrayList<JLabel> getLabels() {
		return labels;
	}

	public void setLabels(ArrayList<JLabel> labels) {
		this.labels = labels;
	}

	public ArrayList<JComboBox> getCombos() {
		return combos;
	}

	public void setCombos(ArrayList<JComboBox> combos) {
		this.combos = combos;
	}

	public ArrayList<JTextField> getTextFields() {
		return textFields;
	}

	public void setTextFields(ArrayList<JTextField> textFields) {
		this.textFields = textFields;
	}

	public ArrayList<JPanel> getPanels() {
		return panelsMain;
	}

	public void setPanels(ArrayList<JPanel> panels) {
		this.panelsMain = panels;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public ArrayList<JPanel> getPanelsMain() {
		return panelsMain;
	}

	public void setPanelsMain(ArrayList<JPanel> panelsMain) {
		this.panelsMain = panelsMain;
	}

	public ArrayList<JPanel> getPanelsBoxes() {
		return panelsBoxes;
	}

	public void setPanelsBoxes(ArrayList<JPanel> panelsBoxes) {
		this.panelsBoxes = panelsBoxes;
	}
	
	
}
