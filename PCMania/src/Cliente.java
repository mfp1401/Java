public class Cliente {
    String nome;
    long cpf;
    float total=0;
    Computador[] computadores = new Computador[3];

    void addComputador(Computador computador) {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {

                computadores[i] = computador;
                break;
            }


        }
    }


    float calculaTotalCompra(){

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {

                total += computadores[i].preco;

            }
        }

        return total;

    }

}
