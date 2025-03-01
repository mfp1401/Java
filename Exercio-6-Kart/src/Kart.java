public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;


    public Kart(){
        motor = new Motor();

    }
    void pular(){
        System.out.println(piloto.nome +" Pulando..");
    }

    void soltarTurbo(){
        System.out.println(piloto.nome + " Soltando turbo..");
    }

    void fazerDrift(){
        System.out.println(nome + "Fazendo drift..");
    }


}
