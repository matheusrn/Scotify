package Login;

import Usuario.Sessao.DadosSessaoUsuario;
import Usuario.TipoUsuario;
import View.JFMainFrame;
import View.ViewFactory;


public class Logar implements ValidarLogin{
    
    
    private DadosSessaoUsuario dadosSessaoUsuario;
    
    private String usuario;
    private TipoUsuario tipoUsuario;
    
    public Logar(DadosSessaoUsuario dadosSessaoUsuario) {        
        this.usuario = dadosSessaoUsuario.getUsuario();        
        this.tipoUsuario = dadosSessaoUsuario.getTipoUsuario();
        this.dadosSessaoUsuario = dadosSessaoUsuario;
    }
    
    
    @Override
    public void logar() {
        System.out.println("Logado com o usuario: "+usuario);
        
        tipoUsuario.mostrarPropaganda();
        
        System.out.println("Carregando componentes da view");
        
        dadosSessaoUsuario.getTipoUsuario().mainMenu();
        
    }

    
    
}
