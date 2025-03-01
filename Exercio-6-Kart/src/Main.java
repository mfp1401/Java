//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Piloto piloto1 =new Piloto();
        Piloto piloto2 =new Piloto();
        Piloto vilao1 =new Piloto();
        Piloto vilao2 =new Piloto();
        Kart kart1 =new Kart();
        Kart kart2 =new Kart();

        piloto1.nome = "Mario";
        piloto2.nome= "Waluigi";

        kart1.nome = "Uno";
        kart2.nome = "Golzin";

        piloto1.vilao = false;
        piloto2.vilao = true;

        kart1.motor.cilindradas= "150";
        kart2.motor.cilindradas="100";

        kart1.motor.velocidadeMaxima= 80;
        kart2.motor.velocidadeMaxima= 100;

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        kart1.soltarTurbo();
        kart2.pular();
        kart1.fazerDrift();
        kart1.motor.mostrarInfo();
        piloto1.soltaSuperpoder();










    }
}