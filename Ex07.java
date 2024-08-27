import java.util.Scanner;


public class Ex07 {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Digite o primeiro número do intervalo: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número do intervalo: ");
        int numero2 = sc.nextInt();

        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        
        for (int i = inicio; i <= fim; i++) {
            long fatorial = 1;
            for (int j = 2; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println("O fatorial de " + i + " é " + fatorial);
        }


        sc.close();
    }
}

    

