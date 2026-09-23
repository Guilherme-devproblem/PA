package prjDoWhile;

import java.util.Scanner;

class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		int fat = 1;
		int i = 1;
		System.out.println("Digite um numero inteiro");
		n = ler.nextInt();
		if (n<=0) {
			System.out.println("Não há fatorial para números negativos.");
		} else {
			do {
				fat = fat*i;
				i++;
			} while (i<= n);
			System.out.println("O fatorial é: "+fat);
			ler.close();
		}
		}
	}
