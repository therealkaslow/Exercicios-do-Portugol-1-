package br.com.generation.exercicios;

import java.util.Scanner;

public class exercicio3 {
/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
	 expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
public static void main(String [] args){
	Scanner ler = new Scanner(System.in);
	double h, m, s;
	System.out.println("Por Favor, Digite o tempo de Dura��o do Evento em Segundos: ");
	 s= ler.nextDouble();
	 m = s / 60;
	 h = (m / 60);
	System.out.println("O resultado do evento �: "+h+ " horas "+m+" Minutos e "+s+" Segundos!");
	}

}
