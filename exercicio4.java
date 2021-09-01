package br.com.generation.exercicios;
import java.util.Scanner;
public class exercicio4 {
/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
  calcule a seguinte expressão:*/
public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
		int a, b, c;/*valores captados*/
		int d, r, s;/*resultados*/
		
	System.out.println("Por favor Digite o Seu Numero A:");
		a = ler.nextInt();
	System.out.println("Agora digite o seu Numero B:");
		b = ler.nextInt();
	System.out.println("Por Ultimo, Digite o Valor de C:");
		c = ler.nextInt();
		
		r = (a + b)/2;
		
		s = (b + c)/2;
		
		d = (r + s)/2;
	System.out.println("Os Valores São: "+d+" "+r+" "+s+" ");
		
		
		
	
	}
}
