package Login;

import Usuario.Sessao.DadosSessaoUsuario;
import Usuario.TipoUsuario;
import Usuario.UsuarioComum;
import Usuario.UsuarioPremium;
import Notificacoes.Email;
import Notificacoes.Notificador;
import Notificacoes.Notificar;
import Notificacoes.Push;
import java.util.Date;

public class LoginProxy implements ValidarLogin {

    private String usuario = "";
    private String senha = "";    
    
    
    public LoginProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    private String usuarioBD = "root";
    private String senhaBD = "123";
    
    
    
    
    @Override
    public void logar() {       
            
        if (usuario.equals(usuarioBD) & senha.equals(senhaBD)) {
            
            System.out.println("Login efetuado com sucesso!");
            
            DadosSessaoUsuario dsu = new DadosSessaoUsuario();                        
            dsu.setUsuario(usuario);
            dsu.setTipoUsuario(new UsuarioPremium(dsu));
            
            Logar l = new Logar(dsu);
            l.logar();
            
        } else {
            System.out.println("Usuário ou senha inválido!");
        }

        
    }

}
