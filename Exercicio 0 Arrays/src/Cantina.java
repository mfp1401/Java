public class Cantina {
    String nome;
    Salgado salgado[]= new Salgado[3];
    boolean adicionado=false;

    void addSalgado(Salgado novoSalgado){
        boolean adicionado=false;
        adicionado=false;
        for(int i=0;i<salgado.length;i++){
            if(salgado[i]==null){
                salgado[i]=novoSalgado;
                adicionado=true;
                break;
            }
        }
        if(!adicionado){
            System.out.println("Nao foi possivel adicionar o salgado");
        }
    }

    void mostraInfo(){
        System.out.println("Lista de Salgado: ");
        for(int i=0;i<salgado.length;i++){
            System.out.println(salgado[i].nome);
        }
    }


}
