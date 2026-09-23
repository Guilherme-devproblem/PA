package prjDoWhile;

import java.util.Scanner;

class Potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	    int e,b, r=0, i=0;
	    System.out.println("Inserte um número ");
	    b = ler.nextInt();
	    System.out.println("Inserte um expoente ");
		e = ler.nextInt();
		do {
			r=b*b;
			i = i+1;
		} while (i<=e);
		System.out.println("O resultado é "+r);
		ler.close();
	}

}
