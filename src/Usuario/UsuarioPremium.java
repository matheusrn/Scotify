package Usuario;

import BuscadorMusica.Buscador;
import BuscadorMusica.BuscadorLocal;
import BuscadorMusica.BuscadorNulo;
import BuscadorMusica.BuscadorNuvem;
import DB.DBLocal;
import Usuario.Sessao.DadosSessaoUsuario;
import View.JFMainFrame;
import View.Propagandas.BemVindo;
import View.Propagandas.Propaganda;
import View.ViewFactory;


public class UsuarioPremium implements TipoUsuario{
    private DadosSessaoUsuario dadosSessaoUsuario;

    
    public UsuarioPremium(DadosSessaoUsuario dadosSessaoUsuario) {
        this.dadosSessaoUsuario = dadosSessaoUsuario;
    }
    
    
    
    
    @Override
    public void mostrarPropaganda() {
        Propaganda p = new Propaganda();
        p.setTipoPropaganda(new BemVindo());
        p.mostrarPropaganda();
    }

    @Override
    public void buscarMusica(String musica) {
        Buscador nuvem = new BuscadorNuvem(new BuscadorNulo());
        Buscador local = new BuscadorLocal(nuvem);
        local.buscarEmCadeia(musica);
    }

    @Override
    public void mainMenu() {
        JFMainFrame mf = new JFMainFrame(dadosSessaoUsuario);
        mf.mainMenuUsuarioPremium();
    }

  

   

}
