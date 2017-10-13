package Usuario.Sessao;

import Usuario.TipoUsuario;
import Notificacoes.Notificador;
import Notificacoes.Notificar;
import Usuario.TipoUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DadosSessaoUsuario {

    private TipoUsuario tipoUsuario;
    private String usuario;
    private boolean verificaLoginLugarDiferente;
    private String mensagemNotificacao;
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;

        verificaLoginLugarDiferente = Math.random() < 0.5;
        //verificaLoginLugarDiferente = false;
        
        if (verificaLoginLugarDiferente == true) {
            Notificar n = new Notificar();
            Date d = new Date();
            String mensagemNotificacao = "Um novo dispositivo acabou de acessar sua conta!" +"\nSO: "+System.getProperty("os.name") + " as " + d.getHours() + ":" + d.getMinutes();        
            n.efetuarNotificacao(mensagemNotificacao);
        }

    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
