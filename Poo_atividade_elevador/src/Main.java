import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Elevador e = new Elevador();
        boolean rodando = true;
        int escolha;


        while (rodando) {
            System.out.println("Menu \n 1- Subir de Andar \n 2- Descer de Andar \n 3- Abrir a Porta \n 4- Fechar Porta \n 5- Andar Atual \n 6- Status Porta \n 7- Sair do Elevador");
            escolha = leitor.nextInt();
            switch (escolha) {
                case 1:
                    e.Subir();
                    break;
                case 2:
                    e.Descer();
                    break;
                case 3:
                    e.abrirPorta();
                    break;
                case 4:
                    e.fecharPorta();
                    break;
                case 5:
                    e.MostrarAndar();
                    break;
                case 6:
                    e.StatusPorta();
                    break;
                case 7:
                    System.out.println("Saindo do Elevador");
                    rodando = false;
                    break;
                default:
                    System.out.println("Erro");
            }
        }
    }
}