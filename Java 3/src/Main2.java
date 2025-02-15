//exercicio 5
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int x = rand.nextInt(10)+1;

        System.out.println(x);
        System.out.println("Qual numero foi gerado?");





        for(int i=0;i<10;i++){
            int y =entrada.nextInt();
            if(x==y){
                System.out.println("Voce acertou o numero!");
                break;
            }else {
                System.out.println("Voce errou o numero!");

            }

        }

    }
}
