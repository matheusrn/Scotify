package View;

import Usuario.Sessao.DadosSessaoUsuario;
import Usuario.TipoUsuario;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JFMainFrame {

    Scanner opcoesMenu = new Scanner(System.in);
    public String opcaoSelecionada = "";
    private TipoUsuario tipoUsuario;
    private DadosSessaoUsuario dadosSessaoUsuario;
    
    
    public JFMainFrame(DadosSessaoUsuario dadosSessaoUsuario) {
        this.tipoUsuario = dadosSessaoUsuario.getTipoUsuario();
        this.dadosSessaoUsuario = dadosSessaoUsuario;
    }
    
    
    public void mainMenuUsuarioPremium() {        
        String[] Opcoes = new String [4];
        
        Opcoes[0] = " ";
        System.out.println("------------------------------------");
        System.out.println("1 - Músicas");Opcoes[1]= "Musica";
        System.out.println("2 - Renovar premium");Opcoes[2]= "Upgrade";                
        System.out.println("3 - Sair do sistema");Opcoes[3]= "Sair";
        
        do {            
            System.out.println("Opção desejada: ");
            opcaoSelecionada = opcoesMenu.next();            
        } while (!(opcaoSelecionada.equals("1") || opcaoSelecionada.equals("2") || opcaoSelecionada.equals("3")));
        
        ViewFactory fm = new ViewFactory(dadosSessaoUsuario);
        fm.instanciadorView(Opcoes[Integer.parseInt(opcaoSelecionada)]);        
    }
    
    public void mainMenuUsuarioComum() {        
        String[] Opcoes = new String [4];
        
        Opcoes[0] = " ";
        System.out.println("------------------------------------");
        System.out.println("1 - Músicas");Opcoes[1]= "Musica";
        System.out.println("2 - Tornar-se Premium");Opcoes[2]= "Upgrade";                
        System.out.println("3 - Sair do sistema");Opcoes[3]= "Sair";
        
        do {            
            System.out.println("Opção desejada: ");
            opcaoSelecionada = opcoesMenu.next();            
        } while (!(opcaoSelecionada.equals("1") || opcaoSelecionada.equals("2")|| opcaoSelecionada.equals("3")) );
        
        ViewFactory fm = new ViewFactory(dadosSessaoUsuario);
        fm.instanciadorView(Opcoes[Integer.parseInt(opcaoSelecionada)]);        
    }
    
}
