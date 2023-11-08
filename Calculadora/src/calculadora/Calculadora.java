package calculadora;

import java.util.Scanner;


public class Calculadora {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el primer numero: ");
        double n1 = sc.nextInt();
        System.out.print("Digite el segundo numero: ");
        double n2 = sc.nextInt();
        System.out.println("Marca 1 para sumar: ");
        System.out.println("Marque 2 para restar: ");
        System.out.println("Marque 3 para multiplicar: ");
        System.out.println("Marque 4 para dividir: ");
        
        double resultado = 0;
        switch(sc.nextInt()){
            case 1: resultado = n1 + n2;
                break;
            case 2: resultado = n1 - n2;
                break;
            case 3: resultado = n1 * n2;
                break;
            case 4: resultado = n1 / n2;
                break;
            default: System.err.println("Opcion no valida");
        }
        System.out.println("El resultado es: " + resultado);
    }
    
}
