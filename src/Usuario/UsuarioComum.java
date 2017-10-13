package Usuario;


import BuscadorMusica.Buscador;
import BuscadorMusica.BuscadorNulo;
import BuscadorMusica.BuscadorNuvem;
import Usuario.Sessao.DadosSessaoUsuario;
import View.JFMainFrame;
import View.Propagandas.Propaganda;
import View.Propagandas.VantagensEmSerPremium;


public class UsuarioComum implements TipoUsuario{
    
    private DadosSessaoUsuario dadosSessaoUsuario;

    
    public UsuarioComum(DadosSessaoUsuario dadosSessaoUsuario) {
        this.dadosSessaoUsuario = dadosSessaoUsuario;
    }
    
    
    
    @Override
    public void mostrarPropaganda() {
        Propaganda p = new Propaganda();
        p.setTipoPropaganda(new VantagensEmSerPremium());
        p.mostrarPropaganda();
    }

    @Override
    public void buscarMusica(String musica) {        
        Buscador nuvem = new BuscadorNuvem(new BuscadorNulo());
        nuvem.buscarEmCadeia(musica);
    }

    @Override
    public void mainMenu() {
        JFMainFrame mf = new JFMainFrame(dadosSessaoUsuario);
        mf.mainMenuUsuarioComum();
    }

   

    

}
