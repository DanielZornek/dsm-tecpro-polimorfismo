package br.edu.fatecpg.tecprog.veiculo.model;

public class Bicicleta extends Veiculo{
	private int aro;
	
	public Bicicleta(int aro, String marca, String modelo) {
		super(marca, modelo);
		this.aro = aro;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}
	
	@Override
	public void mover() {
		System.out.println("A bicicleta está pedalando");
	}
	
}
