package View;

import Usuario.Sessao.DadosSessaoUsuario;
import Usuario.TipoUsuario;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class IFMusica {

    private TipoUsuario tipoUsuario;
    private String musica;
    private DadosSessaoUsuario dadosSessaoUsuario;
    
    public IFMusica(DadosSessaoUsuario dadosSessaoUsuario) {
        this.tipoUsuario = dadosSessaoUsuario.getTipoUsuario();
        this.dadosSessaoUsuario = dadosSessaoUsuario;
    }
    
    
    
    
    private Scanner scanOpcoesMenu = new Scanner(System.in);
    private Scanner scanNomeMusica = new Scanner(System.in);
    private String opcaoSelecionada = "";
    private String nomeMusica = "";
    
    
    public void MenuMusica(){
        String[] Opcoes = new String [4];
        Opcoes[0] = " ";
        do{
        System.out.println("------------------------------------");
        System.out.println("1 - Pesquisar");Opcoes[1] = "pesquisarMusica";
        System.out.println("2 - Menu anterior");Opcoes[2] = "menuPrincipal";        
        System.out.println("3 - Sair do sistema");Opcoes[3] = "Sair";        
            opcaoSelecionada = scanOpcoesMenu.next();            
        
         if(opcaoSelecionada.equals("1")){
             PesquisarMusica();
         }   
            
        } while (!(opcaoSelecionada.equals("2") || opcaoSelecionada.equals("3")));
        
        ViewFactory vf = new ViewFactory(dadosSessaoUsuario);
        vf.instanciadorView(Opcoes[Integer.parseInt(opcaoSelecionada)]);
        
    }
    
    public void PesquisarMusica(){
        
        System.out.println("------------------------------------");
        System.out.println("Nome da música");
        do{            
            nomeMusica = scanNomeMusica.next();             
            if(nomeMusica.length() < 2){
                System.out.println("Nome inválido! Digite novamente");
            }
        }while(nomeMusica.length() < 2);        
        tipoUsuario.buscarMusica(nomeMusica);
        
    }
    
    
    
}
