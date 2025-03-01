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

        zombie1 = zombie2;
        zombie1.vida += 50.5;

        System.out.println("Agora a vida dos zumbi1 eh = " + zombie1.vida);
        System.out.println("Agora a vida dos zumbi2 eh = " + zombie2.vida);
    }
}