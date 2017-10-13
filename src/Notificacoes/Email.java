package Notificacoes;


public class Email implements Notificador{

    @Override
    public void notificar(String mensagem) {
        System.out.println("Email: "+mensagem);
    }

}
