public class Computador {
    public int tipo;
    String nome;
    String marca;
    float preco;
    int codigoPromocao;
    MemoriaUSB memoriaUSB;
    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwareBasico;

    public Computador(){
        sistemaOperacional = new SistemaOperacional();
        hardwareBasico = new HardwareBasico[3];
    }

    void addHardware(String nome, float capacidade){
        HardwareBasico hardware = new HardwareBasico();
        hardware.nome = nome;
        hardware.capacidade = capacidade;
        for(int i = 0; i < hardwareBasico.length; i++){
            if(hardwareBasico[i] == null){
                this.hardwareBasico[i] = hardware;
                break;
            }
        }
    }




    void mostraPCConfigs(){

        System.out.println("Promoção: " + this.codigoPromocao);
        System.out.println("Marca:" + this.marca);
        System.out.println("Preco: " + this.preco);

        for(int i=0 ; i < hardwareBasico.length;i++ ){
            System.out.println(hardwareBasico[i].nome);

            if(i==0){
                System.out.println("Capacidade do processador: " + hardwareBasico[i].capacidade +" Mhz ");
            }else{
                System.out.println("Capacidade da memória: " + hardwareBasico[i].capacidade + " Gb ");
            }



        }

        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " "+ sistemaOperacional.tipo + "bits");
        System.out.println("Memoria USB: " + memoriaUSB.nome  + " de " + memoriaUSB.capacidade + " Gb ");


    }

    void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;

    }
}
