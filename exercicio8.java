package br.com.generation.exercicios;

import java.util.Scanner;
/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
		consumidor.*/
public class exercicio8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double custofabrica, custoConsumidor, distribuidor;
		
		System.out.println("Entre com o custo de fabrica:");
		custofabrica = leia.nextDouble();
		
		distribuidor = custofabrica + (custofabrica*0.28);
		custoConsumidor = distribuidor + (distribuidor*0.45);
		System.out.println("Custo ao Consumidor: "+custoConsumidor);
		leia.close();
	}

}
