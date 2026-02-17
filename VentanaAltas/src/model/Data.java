
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

		/*
		 * Datos personales
		 */
		texts.add("Nombre"); // 0
		texts.add("Primer apellido"); // 1
		texts.add("Segundo apellido"); // 2
		texts.add("Sexo"); // 3
		texts.add("Tipo de documento"); // 4
		texts.add("Número de documento"); // 5
		texts.add("Fecha de nacimiento"); // 6
		texts.add("Correo electrónico"); // 7
		texts.add("Teléfono de casa"); // 8
		texts.add("Movil personal"); // 9
		texts.add("Movil trabajo"); // 10
		
		/*
		 * Dirección
		 */
		texts.add("Tipo vía"); // 11
		texts.add("Calle"); // 12
		texts.add("Número"); // 13
		texts.add("Escalera"); // 14
		texts.add("Piso"); // 15
		texts.add("Puerta"); // 16
		texts.add("Código postal"); // 17
		texts.add("Localidad"); // 18
		texts.add("Código municipio"); // 19
		texts.add("Provincia"); // 20
		texts.add("Comunidad autónoma"); // 21
		texts.add("País"); // 22
	}

	// Getters & Setters

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

