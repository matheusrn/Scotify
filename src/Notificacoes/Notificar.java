package Notificacoes;

import Usuario.Sessao.DadosSessaoUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Notificar {
    
    
    private List<Notificador> listaNotificados = new ArrayList<>();
    private String mensagem;
    
    private void dispositivosQueSeraoNotificados() {        
        listaNotificados.add(new Email());
        listaNotificados.add(new Push());                
    }
    
    
    
    public void efetuarNotificacao(String mensagem){        
        dispositivosQueSeraoNotificados();
        
        
        for(Notificador notificador: listaNotificados){            
            notificador.notificar(mensagem);
        }
    }
    
    
    private void novoNotificado(Notificador notificador){
        this.listaNotificados.add(notificador);
    }

}
