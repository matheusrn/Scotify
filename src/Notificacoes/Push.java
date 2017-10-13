package Notificacoes;


public class Push implements Notificador{

    @Override
    public void notificar(String mensagem) {
        System.out.println("Push: "+mensagem);
    }

}
