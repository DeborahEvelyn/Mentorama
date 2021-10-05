package cursoJava;

import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
	
		
		System.out.println("Curso de Java");
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Oie, qual é o seu nome?");
		
		String Nome = teclado.next();
		
		System.out.println("Oi " + Nome + ", tudo bem?");
	}

}
