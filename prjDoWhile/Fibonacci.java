package prjDoWhile;

import java.util.Scanner;

class Fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, c;
		int a=0, b=1, i=0;
		System.out.println("Informe o número de termos.");
		n = ler.nextInt();
		do {
			System.out.println(a);
			c = a+b;
			a = b;
			b = c;
			i = i+1;
		} while (i<=n);
		ler.close();
	}

}
