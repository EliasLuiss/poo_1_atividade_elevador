public class Elevador {
    int andar = 1;
    boolean porta = true; //Porta esta aberta

    public void abrirPorta (){
        if (porta) {
            System.out.println("Porta ja esta aberta");
        } else {
            System.out.println("Abrindo porta");
            porta = true;
        }
    }

    public void fecharPorta(){
        if (!porta) {
            System.out.println("Porta ja esta fechada");
        } else {
            System.out.println("Fechando porta");
            porta = false;
        }
    }

    public void Subir () {
        if (!porta && andar < 8) {
            System.out.println("Voce esta subindo para o andar " + (andar = 1 + andar));
        } else if (porta){
            System.out.println("Porta esta aberta");
        } else {
            System.out.println("Não ha mais andares");
        }
    }

    public void StatusPorta (){
        if (porta) {
            System.out.println("Porta esta aberta");
        } else {
            System.out.println("Porta esta fechada");
        }
    }

    public void MostrarAndar (){
        System.out.println("Voce esta no Andar" + andar);
    }


    public void Descer (){
        if (porta) {
            System.out.println("Porta ainda aberta");
        } else {
            if (andar == 1 ) {
                System.out.println("Não há mais andares");
            } else {
                System.out.println("Voce esta descendo para o andar " + (andar = andar - 1) );
            }
        }
    }
}
