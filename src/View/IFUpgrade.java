package View;

import UpgradeUsuario.Upgrade;
import Usuario.Sessao.DadosSessaoUsuario;
import Usuario.TipoUsuario;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class IFUpgrade extends DadosSessaoUsuario{
    
    Scanner opcoesMenu = new Scanner(System.in);
    private DadosSessaoUsuario dadosSessaoUsuario;
    private TipoUsuario tipoUsuario;
    public String opcaoSelecionada = "";
    
    public IFUpgrade(DadosSessaoUsuario dadosSessaoUsuario) {
        this.tipoUsuario = dadosSessaoUsuario.getTipoUsuario();
        this.dadosSessaoUsuario = dadosSessaoUsuario;
    }
    
    
    public void menuUpgrade(){
        
        String[] Opcoes = new String [5];
        
        Opcoes[0] = " ";
        System.out.println("------------------------------------");
        System.out.println("1 - 3 Mêses");Opcoes[1]= "3MUpgrade";
        System.out.println("2 - 6 Mêses");Opcoes[2]= "6MUpgrade";
        System.out.println("3 - Menu anterior");Opcoes[3]= "menuPrincipal";
        System.out.println("4 - Sair do sistema");Opcoes[4]= "Sair";
        
        do {            
            System.out.println("Opção desejada: ");
            opcaoSelecionada = opcoesMenu.next();            
        } while (!(opcaoSelecionada.equals("1") || opcaoSelecionada.equals("2") ));
        
        
        
        ViewFactory fm = new ViewFactory(dadosSessaoUsuario);
        fm.instanciadorView(Opcoes[Integer.parseInt(opcaoSelecionada)]); 
        
    }
    
}
