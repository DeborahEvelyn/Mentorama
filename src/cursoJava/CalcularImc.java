package cursoJava;

import java.util.Scanner;

public class CalcularImc {
	
	

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner (System.in); 
       
        int peso;
      
        double imc, altura;
        
      
            System.out.println ("Para calcular o IMC, digite sua altura:");
        altura = teclado.nextDouble();
        
        System.out.println("Para calcular o IMC, digite seu peso:");
        peso = teclado.nextInt();
        
        imc = peso/(Math.pow(altura, 2));
        
            
        System.out.printf ("Resultado do calculo IMC : " + imc + "\n");
        if (imc < 18.5)
            System.out.println ("Você está abaixo do peso ideal!");
        else
            if ((imc > 18.5) && (imc <24.9))
                System.out.println ("Você está no peso ideal, parabéns!");
        else
                if ((imc > 25.0) && (imc <29.9))
                    System.out.println("Você está com sobrepeso!");
        else
                    if ((imc > 30.0) && (imc <34.9))
                    System.out.println("Você está com obesidade grau I, cuidado!");
        else
                        if ((imc > 35.0) && (imc <39.9))
                            System.out.println ("Você está com obesidade grau II, cuidado!!");
        else 
                            if (imc >= 40)
                                System.out.println ("Você está com obesidade grau III, cuidado!!");
                   
                            
        
        
               
    }
 
	}

