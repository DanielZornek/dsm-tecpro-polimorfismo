package br.edu.fatecpg.tecprog.veiculo.model;

public class Carro extends Veiculo{
	private String placa;
	
	public Carro(String placa, String modelo, String marca) {
		super(marca, modelo);
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public void mover() {
		System.out.println("O carro está dirigindo");
	}
	
}
