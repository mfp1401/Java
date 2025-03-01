public class Zumbi {

    String nome;
    double vida;

    void mostrarVida(){
        System.out.println("Vida do zumbi: " + vida);
    }

    void transfereVida(Zumbi zombie2, double quantia){
        vida -= quantia;
        zombie2.vida += quantia;
        System.out.println("Vida do zumbie1 " + vida);
        System.out.println("Vida do zumbi alvo " + zombie2.vida);
    }


}
