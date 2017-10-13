
package BuscadorMusica;


public class BuscadorNulo extends Buscador{

    public BuscadorNulo(Buscador proximo) {
        super(proximo);
    }
    public BuscadorNulo() {
        super(null);
    }

    
    @Override
    public String buscar(String musica) {
        System.out.println("------------------------------------");
        System.out.println("#Música não encontrada#");
        return "-1";
    }
    
}
