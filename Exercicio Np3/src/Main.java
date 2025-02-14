import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int npa,np3,nfa;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a nota: ");
        npa=entrada.nextInt();

        if(npa<60 && npa>=30){

            System.out.println("Faça a Np3 burro!");
            System.out.print("Quanto tirou na np3: ");

            np3 = entrada.nextInt();
            nfa = (npa+np3)/2;



            if(nfa>=50){
                System.out.println("Aprovado!");
            }else
                System.out.println("Reprovado anta!");

        }else if(npa<30){
            System.out.println("Reprovado animal!");
        }else
            System.out.println("Aprovado boa!");




    }
}