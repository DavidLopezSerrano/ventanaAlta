package controller;

import model.Data;
import view.MainWindow;

public class MainController {
	
	public MainController() {
		
		Data data = new Data();
	
		MainWindow mainWindow = new MainWindow(data);

	}
}
