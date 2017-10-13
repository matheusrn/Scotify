package View;

import UpgradeUsuario.Upgrade;
import Usuario.Sessao.DadosSessaoUsuario;
import Usuario.TipoUsuario;
import javax.swing.JOptionPane;

public class ViewFactory {

    private TipoUsuario tipoUsuario;
    private DadosSessaoUsuario dadosSessaoUsuario;

    public ViewFactory(DadosSessaoUsuario dadosSessaoUsuario) {
        this.tipoUsuario = dadosSessaoUsuario.getTipoUsuario();
        this.dadosSessaoUsuario = dadosSessaoUsuario;

    }

    public void instanciadorView(String opcao) {

        if (opcao.equalsIgnoreCase("Musica")) {            
            IFMusica m = new IFMusica(dadosSessaoUsuario);
            m.MenuMusica();            
        } else if (opcao.equalsIgnoreCase("Sair")) {            
            return;
        } else if (opcao.equalsIgnoreCase("menuPrincipal")) {
            dadosSessaoUsuario.getTipoUsuario().mainMenu();
        } else if (opcao.equals("pesquisarMusica")) {
            IFMusica m = new IFMusica(dadosSessaoUsuario);
            m.PesquisarMusica();
        } else if (opcao.equals("Upgrade")) {
            IFUpgrade u = new IFUpgrade(dadosSessaoUsuario);
            u.menuUpgrade();
        } else if (opcao.equals("3MUpgrade")) {
            Upgrade u = new Upgrade(dadosSessaoUsuario, "3 Mêses");
            u.efetuaUpgrade();
        } else if (opcao.equals("6MUpgrade")) {
            Upgrade u = new Upgrade(dadosSessaoUsuario, "6 Mêses");
            u.efetuaUpgrade();
        }

    }
}
