package cursoJava;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		

		int opcao;
		
		do { 
			System.out.println("MENU");
		    
		    System.out.println("Selecione uma op��o a seguir: ");
		    
		    System.out.println(" 1- Op��o A ");
			System.out.println(" 2- Op��o B ");
			System.out.println(" 3- SAIR ");
			
			Scanner menu = new Scanner(System.in);
			opcao = menu.nextInt();
		
			
	     } while (opcao != 3);
	
		
					
		switch (opcao) {
		case 1:
			System.out.println("Op��o 1 selecionada!");
			break;
		case 2:
			System.out.println("Op��o 2 selecionada!");
			break;
		case 3:
			System.out.println("Voc� saiu do programa!");
			break;
			
			default:
			System.out.println("Voc� selecionou uma op��o inv�lida!");
		}
		
	
		
		
	}

}
