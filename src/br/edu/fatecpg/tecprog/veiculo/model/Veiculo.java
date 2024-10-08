package br.edu.fatecpg.tecprog.veiculo.model;
/*
 * Explicação sobrescrita
 * É possível sobrescritas distintas em objetos de mesma hierarquia
 * porque são classes distintas, e através da palavra reservada
 * @Override podemos fazer essa sobrescrita da classe mãe como
 * quisermos na classe filha, isso vale para todas as filhas que
 * a extendem, se não houver sobrescrita o método fará o que foi
 * designado na mãe
 * */
public class Veiculo {
	
	private String marca;
	private String modelo;
	
	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void mover() {
		System.out.println("Andando");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
