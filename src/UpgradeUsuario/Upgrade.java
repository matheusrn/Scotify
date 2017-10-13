package UpgradeUsuario;

import Notificacoes.Notificar;
import Usuario.Sessao.DadosSessaoUsuario;
import Usuario.UsuarioPremium;
import View.ViewFactory;
import java.util.Date;


public class Upgrade {
    
    private String mensagemNotificacao;
    private DadosSessaoUsuario dadosSessaoUsuario;
    private String tempoTotalUpgrade;
    
    public Upgrade(DadosSessaoUsuario dadosSessaoUsuario, String tempoTotalUpgrade) {
        this.dadosSessaoUsuario = dadosSessaoUsuario;
        this.tempoTotalUpgrade = tempoTotalUpgrade;
    }
    
    
    
    public void efetuaUpgrade(){      
        dadosSessaoUsuario.setTipoUsuario(new UsuarioPremium(dadosSessaoUsuario));
        System.out.println("------------------------------------");
        System.out.println("Upgrade de "+tempoTotalUpgrade+" efetuado com sucesso!");
        
        
            Notificar n = new Notificar();            
            mensagemNotificacao = "Obridado por adquirir a versão Premium do nosso aplicativo!";        
            n.efetuarNotificacao(mensagemNotificacao);
        
        
        ViewFactory vf = new ViewFactory(dadosSessaoUsuario);
        vf.instanciadorView("menuPrincipal");
    }
    
}
