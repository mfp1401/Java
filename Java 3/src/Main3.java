import java.util.Random;
import java.util.Scanner;

// Exercicio 6
public class Main3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int x = rand.nextInt(10)+1;

        System.out.println(x);
        System.out.println("Qual numero foi gerado?");





        for(int i=0;i<10;i++){
            int y =entrada.nextInt();
            if(x>y){
                System.out.println("Numero digitado menor que o gerado!");
            }else if(x<y){
                System.out.println("Numero digitado maior que o gerado!");
            }else {
                System.out.println("Numeor igual ao numero gerado");
                break;
            }

        }
    }
}
