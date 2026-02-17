/*
 * Programa que calcula el precio de viajes segun la opcion que elijas y el numero de personas que establezcas
 * 
 * Autor: David López Serrano
 * Fecha: 16/02/2026
 * Version: 1.0.0
 */
	package model;
	
	import java.util.ArrayList;
	
	public class Data {
		// Atributos
		private ArrayList<String> texts = new ArrayList<>();
		private ArrayList<Integer> numbers = new ArrayList<>();
	
		// Constructor de data
		public Data() {
			
			createTexts();
			createNumbers();
	
		}
		
		// Metodos

		private void createNumbers() {
			
			numbers.add(null);
			numbers.add(null);
			numbers.add(null);
			numbers.add(null);
			numbers.add(null);
			numbers.add(null);
			
		}

		private void createTexts() {
			texts.add(null);
			texts.add(null);
			texts.add(null);
			texts.add(null);
			texts.add(null);
			texts.add(null);
			
		}
		
		

		//Getters & Setters 

		public ArrayList<String> getTexts() {
			return texts;
		}

		public void setTexts(ArrayList<String> texts) {
			this.texts = texts;
		}

		public ArrayList<Integer> getNumbers() {
			return numbers;
		}

		public void setNumbers(ArrayList<Integer> numbers) {
			this.numbers = numbers;
		}
	
		
	
	
	
	
		}
	
		
		
	
		
	
	
