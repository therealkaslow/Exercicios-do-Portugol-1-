package br.com.generation.exercicios;

import java.util.Scanner;

public class exercicio1 {
	/*1. "Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
				dias e mostre-a expressa apenas em dias."*/
	public static void main (String [] args){
		int idade,meses,dias,resultadoidDias,resultadoMdias,totalDias;
		Scanner ler = new Scanner(System.in);
		System.out.println("Por Favor digite a Sua idade: ");
		idade = ler.nextInt();
		System.out.println("Agora, Digite o seu Mês: ");
		meses = ler.nextInt();
		System.out.println("No Final, Digite o seu Dia:");
		dias = ler.nextInt();
		
		resultadoidDias = idade * 365;
		resultadoMdias = 30 * meses;
		totalDias = resultadoidDias + resultadoMdias;
		System.out.println("O Resultado da Sua idade em dias é: "+totalDias);
		ler.close();
	}

}
