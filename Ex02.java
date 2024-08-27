


import java.util.Scanner;


public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o salário : ");
        float salario =  sc.nextFloat();

        
        System.out.println("Digite os quilowatts consumido: ");
        float EnerConsum = sc.nextFloat();

        
        double valorQuilowatt = salario * 0.01;

        double valorTotal = valorQuilowatt * EnerConsum;

        
        System.out.println("Valor dos quilowatt: R$ %.2f%n "  + valorQuilowatt);
        System.out.println("Valor total a ser pago: R$ %.2f%n " + valorTotal);

    
        sc.close();
    }
}

    

