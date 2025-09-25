package unibg.it.progetto2509;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il primo valore: ");
		float primo = sc.nextInt();
		
		System.out.print("Inserisci il secondo valore: ");
		float secondo = sc.nextInt();
		
		Calculator c = new Calculator(primo, secondo);
		
		c.somm(primo, secondo);
		c.diff(primo, secondo);
		c.prod(primo, secondo);
		c.div(primo, secondo);
		
		sc.close();
		
	}
	
}
