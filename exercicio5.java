/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/
 
package br.com.generation.exercicios;
import java.util.Scanner;
public class exercicio5 {
public static void main (String [] args) {
double a, b, c, r;
Scanner ler = new Scanner(System.in);
System.out.println("Digite a Sua Primeira Nota: ");
a = ler.nextDouble();
System.out.println("Digite a Sua Segunda Nota: ");
b = ler.nextDouble();
System.out.println("Digite a Sua Terceira Nota: ");
c = ler.nextDouble();

a = a*2;

b = b*3;

c = c*5;

r = (a+b+c)/(2+3+5);

System.out.println("O Resultado da média é:"+r);
ler.close();
//fechar o ler!
/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/
 
}
}
