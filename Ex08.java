import java.util.*;
public class Ex08 {


    /* valor da conta: 82
     * pagamento: 100
     * Troco: 1x 10, 1x 5, 1x 2, 1x 1 real
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      

        
        float valor = 71;
        float pagamneto =  100;
        float troco = pagamneto - valor; //18
        int contCedulas;
        int []  cedulas = {100,50,20,10,5,2,1};

        System.out.println("Valor do troco: R$" +troco);


        for(int cedula: cedulas){
            contCedulas = (int)troco/cedula;
            if(contCedulas>0)
                System.out.println(" Tem " + contCedulas + " cedula(s) de "  +cedula);
                troco = troco%cedula;
                










        }

        /* 
        System.out.println(troco %100);
        //System.out.println(troco %50);
        // System.out.println(troco %20);
        System.out.println(troco %10);
        troco = troco%10;
        System.out.println("");
        System.out.println("Tem uma cedula de 10 ");
        troco = troco%5;
        System.out.println("Tem uma cedula de 5");
        troco = troco%2;
        System.out.println("Tem uma cedula de 2");
        System.out.println("Tem uma cedula de 1");*/

        //System.out.println(troco %100);


;    }



    
}
