

import java.util.Scanner;

public class Ex01 {

        public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
           
        float numHoras = 0 ;
        float valorPorHora;
        float imposto = 0; 
        float salario  = 0;
        float salarioaReceber;

        System.out.println("Digite o numero de horas trabalhadas");
        numHoras = sc.nextFloat();

        System.out.println("Digite o valor da hora trabalhada");
        valorPorHora = sc.nextFloat();

            
        salario =  (numHoras * valorPorHora);
            
        imposto =  0.30f * salario;
            
        salarioaReceber = salario - imposto;

        System.out.println("salariobruto  R$ " + salario);
        System.out.println(" Imposto "+ imposto);
        System.out.println("salaro a receber R " + salarioaReceber);
           
        sc.close();

    } 
}
