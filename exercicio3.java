package br.com.generation.exercicios;

import java.util.Scanner;

public class exercicio3 {
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	 expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
public static void main(String [] args){
	Scanner ler = new Scanner(System.in);
	double h, m, s;
	System.out.println("Por Favor, Digite o tempo de Duração do Evento em Segundos: ");
	 s= ler.nextDouble();
	 m = s / 60;
	 h = (m / 60);
	System.out.println("O resultado do evento é: "+h+ " horas "+m+" Minutos e "+s+" Segundos!");
	}

}
