public class Main {
    public static void main(String[] args) {

        Personagem personagem1 = new Personagem();
        Arma arma = new Arma();

        personagem1.nome = "Miguel";
        personagem1.pontos = 50;

        arma.nome = "m4a1-s";
        arma.poder = 23;
        arma.resistencia = 100;
        arma.descricao = "Com recuo baixo e alta cadencia de tiro, use para fazer a chacina";

        personagem1.arma = arma;

        personagem1.tomarDano();

        personagem1.usarArma();

        personagem1.arma.mostrarInfoArma();

    }
}