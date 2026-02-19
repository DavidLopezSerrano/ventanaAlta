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

	private ArrayList<JLabel> labelsPerson = new ArrayList<>();
	
	private ArrayList<JLabel> labelsAdress = new ArrayList<>();


	private ArrayList<JComboBox> combos = new ArrayList<>();

	private ArrayList<JTextField> textFields = new ArrayList<>();
	
	private ArrayList<JPanel> panelsMain = new ArrayList<>();
	
	private ArrayList<JPanel> panelsBoxesPersonal = new ArrayList<>();
	
	private ArrayList<JPanel> panelsBoxesAdress = new ArrayList<>();


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
			
			panelsBoxesAdress.add(new JPanel(new GridLayout(2,1, 10,10)));
			
			labelsAdress.add(new JLabel(data.getAddress().get(i)));
			
			panelsBoxesAdress.get(0).add(labelsAdress.get(i));
			
			panelsMain.get(1).add(panelsBoxesAdress.get(0));
		}		
	}

	private void createPanelPersonal() {
		
		for (int i = 0; i < data.getPersonalData().size(); i++) {
			
			panelsBoxesPersonal.add(new JPanel(new GridLayout(2,1, 10,10)));
			
			labelsPerson.add(new JLabel(data.getPersonalData().get(i)));
			
			panelsBoxesPersonal.get(0).add(labelsPerson.get(i));
			
			panelsMain.get(0).add(panelsBoxesPersonal.get(0));
		}
		
	}

	private void createMainPanels() {
		JPanel mainPanel = new JPanel(new GridLayout(2,1));
		panelsMain.add(new JPanel());
		panelsMain.add(new JPanel());
		panelsMain.get(0).setBackground(Color.pink);
		panelsMain.get(1).setBackground(Color.yellow);
		
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

	

	public ArrayList<JLabel> getLabelsPerson() {
		return labelsPerson;
	}

	public void setLabelsPerson(ArrayList<JLabel> labelsPerson) {
		this.labelsPerson = labelsPerson;
	}

	public ArrayList<JLabel> getLabelsAdress() {
		return labelsAdress;
	}

	public void setLabelsAdress(ArrayList<JLabel> labelsAdress) {
		this.labelsAdress = labelsAdress;
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

	public ArrayList<JPanel> getPanelsBoxesPersonal() {
		return panelsBoxesPersonal;
	}

	public void setPanelsBoxesPersonal(ArrayList<JPanel> panelsBoxesPersonal) {
		this.panelsBoxesPersonal = panelsBoxesPersonal;
	}

	public ArrayList<JPanel> getPanelsBoxesAdress() {
		return panelsBoxesAdress;
	}

	public void setPanelsBoxesAdress(ArrayList<JPanel> panelsBoxesAdress) {
		this.panelsBoxesAdress = panelsBoxesAdress;
	}

	
	
	
}
