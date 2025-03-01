public class Main {
    public static void main(String[] args) {

        Zumbi zombie1 = new Zumbi();
        Zumbi zombie2 = new Zumbi();

        zombie1.nome = "Chris";
        zombie2.nome = "Laura";

        zombie1.vida = 100.00;
        zombie2.vida = 100.00;

        zombie1.mostrarVida();
        zombie1.transfereVida(zombie2, 20);
    }
}