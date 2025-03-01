public class Main {
    public static void main(String[] args) {

        Zumbi zombie1 = new Zumbi();
        Zumbi zombie2 = new Zumbi();
        Zumbi zombie3 = new Zumbi();
        Zumbi zombie4 = new Zumbi();

        zombie1.nome = "Chris";
        zombie2.nome = "Laura";

        zombie1.careca = true;
        zombie2.careca = false;

        zombie1.forca = 10;
        zombie2.forca = 20;

        zombie1.vida = 100;
        zombie2.vida = 200;

        zombie1.seAlimentar();
        zombie2.correr();
    }
}