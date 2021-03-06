package exercicios;

import java.util.Scanner;

public class VeiculoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double km = 628,preco = 7.39, quanTanq,divisao;
		
		//veiculo 1		
		
		Veiculo veiculo1 = new Veiculo(90,16,9);
		
		quanTanq = veiculo1.tanqueViagem(km);
		divisao = veiculo1.dividirDespesas(preco, km);
		
		System.out.println("\n**********************************************************");
		System.out.println("****************         VEICULO 1        ****************");
		System.out.println("**********************************************************");
		System.out.println(veiculo1.toString());
		System.out.printf("\nPara viagem Maring? a Blumenau ser? necess?rio %.1f tanques"
				+ "\nCada passageiro ir? contribuir com R$ %.2f\n\n", quanTanq,divisao);
		
		//veiculo 2
		
		Veiculo veiculo2 = new Veiculo(56,5,9);
		
		quanTanq = veiculo2.tanqueViagem(km);
		divisao = veiculo2.dividirDespesas(preco, km);
		
		System.out.println("\n**********************************************************");
		System.out.println("****************         VEICULO 2        ****************");
		System.out.println("**********************************************************");
		System.out.println(veiculo2.toString());
		System.out.printf("\nPara viagem Maring? a Blumenau ser? necess?rio %.1f tanques"
				+ "\nCada passageiro ir? contribuir com R$ %.2f", quanTanq,divisao);
		sc.close();
	}

}
