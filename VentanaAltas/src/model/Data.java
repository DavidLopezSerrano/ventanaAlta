
package model;

import java.util.ArrayList;

public class Data {
	// Atributos
	private ArrayList<String> personalData = new ArrayList<>();
	private ArrayList<String> address = new ArrayList<>();
	private ArrayList<Integer> numbers = new ArrayList<>();

	// Constructor de data
	public Data() {
		super();
		
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
		personalData.add("Nombre"); // 0
		personalData.add("Primer apellido"); // 1
		personalData.add("Segundo apellido"); // 2
		personalData.add("Sexo"); // 3
		personalData.add("Tipo de documento"); // 4
		personalData.add("Número de documento"); // 5
		personalData.add("Fecha de nacimiento"); // 6
		personalData.add("Correo electrónico"); // 7
		personalData.add("Teléfono de casa"); // 8
		personalData.add("Movil personal"); // 9
		personalData.add("Movil trabajo"); // 10
		
		/*
		 * Dirección
		 */
		address.add("Tipo vía"); // 0
		address.add("Calle"); // 1
		address.add("Número"); // 2
		address.add("Escalera"); // 3
		address.add("Piso"); // 4
		address.add("Puerta"); // 5
		address.add("Código postal"); // 6
		address.add("Localidad"); // 7
		address.add("Código municipio"); // 8
		address.add("Provincia"); // 9
		address.add("Comunidad autónoma"); // 10
		address.add("País"); // 11
	}

	// Getters & Setters

	public ArrayList<String> getPersonalData() {
		return personalData;
	}

	public void setPersonalData(ArrayList<String> personalData) {
		this.personalData = personalData;
	}

	public ArrayList<String> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}

	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}

}

