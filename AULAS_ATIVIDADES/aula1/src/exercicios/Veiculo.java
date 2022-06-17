package exercicios;

public class Veiculo {
	
	//atributos
	private double capacidade;
	private int passageiro;
	private double consumo;
	
	//construtor
	public Veiculo(double capac, int passag, double cons) {
		capacidade = capac;
		passageiro = passag;
		consumo = cons;
	}
	
	//metódos
	public double tanqueViagem(double quilometro) {
		return quilometro / (capacidade * consumo);
	}
	public double dividirDespesas(double combustivel, double quilometro) {
		return (quilometro / capacidade * combustivel)/passageiro;
	}
	
	//getters e setters
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public int getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public String toString() {
		return "\nO Veiculo tem capacidade de "+passageiro+" passageiros."
				+ "\nO tanque comporta "+capacidade+" litros."
				+ "\nO veiculo faz "+consumo+" km/litro."; 
	}
	

}
