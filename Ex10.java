import java.util.Scanner;


public class Ex10 {

 

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadePrimos = 0;

       
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

        
            if (ehPrimo(numero)) {
                quantidadePrimos++;
            }
        }

   
        System.out.println("Quantidade de números primos: " + quantidadePrimos);

        sc.close();
    }

   
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}   


    

