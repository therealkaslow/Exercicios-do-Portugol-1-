package br.com.generation.exercicios;

import java.util.Scanner;


public class exercicio2 {
	public static void main (String [] args){
		int idade,meses,dias,idadeDias;
		/*2.Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
			expressa em anos, meses e dias.*/
		System.out.println("Digite a Sua Idade em Dias: ");
		Scanner ler = new Scanner(System.in);
		idadeDias = ler.nextInt();
		idade = idadeDias / 365;
		meses = (idadeDias % 365) / 30;
		dias = (meses % 30) % 30;
		System.out.println("A Sua idade é: "+idade+"Anos e"+meses+ " Meses e "+dias+ " Dias");
		ler.close();
	}
}
