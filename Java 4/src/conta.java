public class Conta {

    double saldo;
    double limite;
    int numerodaconta;
    String nome;

    void sacar(int quantia){
        saldo  -=quantia;
    }

    void depositar(int quantia){
        saldo += quantia;
    }


}
