import java.util.Scanner;

public class Ex04 {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.println("Digite o código do produto comprado: ");
        int codigodoProduto = sc.nextInt();

        System.out.println("Digite a quantidade comprada do produto: ");
        int quantidadeComprada = sc.nextInt();

        
        double preco;
        if (codigodoProduto >= 1 && codigodoProduto <= 10) {
            preco = 10.00;
        } else if (codigodoProduto >= 11 && codigodoProduto <= 20) {
            preco = 15.00;
        } else if (codigodoProduto >= 21 && codigodoProduto <= 30) {
            preco = 20.00;
        } else if (codigodoProduto >= 31 && codigodoProduto <= 40) {
            preco = 40.00;
        } else {
            System.out.println("Código do produto inválido!");
            return;
        }

        double precoTotal = preco * quantidadeComprada;
       
        double desconto;
        if (precoTotal <= 250.00) {
            desconto = 0.05 * precoTotal;
        } else if (precoTotal <= 500.00) {
            desconto = 0.10 * precoTotal;
        } else {
            desconto = 0.15 * precoTotal;
        }

       
        double precoFinal = precoTotal - desconto;

   
        System.out.printf("Preço do produto: R$ %.2f%n", preco);
        System.out.printf("Preço total da nota: R$ %.2f%n", preco);
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Preço final da nota após o desconto: R$ %.2f%n", precoFinal);

        
        sc.close();
    }

}


    

