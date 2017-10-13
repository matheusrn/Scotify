package BuscadorMusica;

import Usuario.Sessao.DadosSessaoUsuario;
import Usuario.TipoUsuario;
import View.IFReprodutor;
import javax.swing.JOptionPane;

public abstract class Buscador {

    private Buscador proximo;
    

    public Buscador(Buscador proximo) {
        this.proximo = proximo;
    }

    public void buscarEmCadeia(String musica) {
        
        String achei = buscar(musica);
        
        
        if (achei.length() == 0) {
            proximo.buscarEmCadeia(musica);                          
        }else if(!achei.equals("-1")){
            IFReprodutor r = new IFReprodutor();            
            r.reproduzirMusica(musica); 
        }
        
    }

    protected abstract String buscar(String musica);

}
