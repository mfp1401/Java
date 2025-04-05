import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Computador[] computadores = new Computador[3];
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);
        boolean aux=false;

        cliente.nome = "Marcelo";
        cliente.cpf = 1481358278;

        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        MemoriaUSB musb1;
        MemoriaUSB musb2;
        MemoriaUSB musb3;

        musb1 = new MemoriaUSB(" Pendrive ", 16);
        musb2 = new MemoriaUSB(" Pendrive ", 32);
        musb3 = new MemoriaUSB(" HD Externo ", 1000);

        computador1.marca = "Apple";
        computador1.preco = 2071;

        computador1.addHardware("Pentium Core i3", 2200);
        computador1.addHardware("Memoria RAM", 8);
        computador1.addHardware("HD", 500);

        computador1.sistemaOperacional.nome = "Linux Ubuntu";
        computador1.sistemaOperacional.tipo = 32;

        computador1.addMemoriaUSB(musb1);
        computador1.codigoPromocao = 1;

        computador2.marca = "Samsung";
        computador2.preco = 2071 + 1234;

        computador2.addHardware("Pentium Core i5", 3370);
        computador2.addHardware("Memoria RAM", 16);
        computador2.addHardware("HD", 1000);

        computador2.sistemaOperacional.nome = "Windows 8";
        computador2.sistemaOperacional.tipo = 64;

        computador2.addMemoriaUSB(musb2);
        computador2.codigoPromocao = 2;

        computador3.marca = "Dell";
        computador3.preco = 2071 + 5678;

        computador3.addHardware("Pentium Core i7", 4500);
        computador3.addHardware("Memoria RAM", 32);
        computador3.addHardware("HD", 2000);

        computador3.sistemaOperacional.nome = "Windows 10";
        computador3.sistemaOperacional.tipo = 64;

        computador3.addMemoriaUSB(musb3);
        computador3.codigoPromocao = 3;

        computadores[0] = computador1;
        computadores[1] = computador2;
        computadores[2] = computador3;

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                computadores[i].mostraPCConfigs();
            }
        }
        System.out.println("Digite o numero da promocao: " );


        while(aux==false) {
            int option = sc.nextInt();
            if(option==0) {
                aux=true;

            }else{

                for(int i=0;i<computadores.length;i++) {
                    if(computadores[i]!=null) {
                        if(computadores[i].codigoPromocao== option){
                            for(int j=0;j<cliente.computadores.length;j++) {
                                if(cliente.computadores[j]==null){
                                    cliente.computadores[j]=computadores[i];
                                    break;

                                }

                            }

                        }


                    }

                }
            }

        }
        System.out.println("Total da compra: " + cliente.calculaTotalCompra());
        sc.close();
        }
    }