import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalJogadores = 5 * 11;  
        int jogadoresMenores18 = 0;
        double somaAlturas = 0;
        int jogadoresMais80kg = 0;

        for (int i = 1; i <= 5; i++) { 
            int somaIdades = 0;

            System.out.println("Time " + i + ":");
            for (int j = 1; j <= 11; j++) { 
                System.out.println(" Jogador " + j + ":");

                System.out.print("  Idade: ");
                int idade = sc.nextInt();
                somaIdades += idade;

               
                if (idade < 18) {
                    jogadoresMenores18++;
                }

              
                System.out.print("Peso (kg): ");
                double peso = sc.nextDouble();

           
                if (peso > 80) {
                    jogadoresMais80kg++;
                }

                
                System.out.print("  Altura (m):");
                double altura = sc.nextDouble();
                somaAlturas += altura;
            }

      
            double mediaIdades = somaIdades / 11.0;
            System.out.printf("Média das idades do Time %d: %.2f anos%n", i, mediaIdades);
        }

       
        double mediaAlturas = somaAlturas / totalJogadores;
        System.out.printf("Média das alturas de todos os jogadores: %.2f m%n", mediaAlturas);

        double porcentagemMais80kg = (jogadoresMais80kg / (double) totalJogadores) * 100;
        System.out.printf("Porcentagem de jogadores com mais de 80kg: %.2f%%%n", porcentagemMais80kg);

        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenores18);

        sc.close();
    }
}



    

