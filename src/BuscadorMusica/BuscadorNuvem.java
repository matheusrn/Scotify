
package BuscadorMusica;

import DB.DBLocal;
import DB.DBNuvem;



public class BuscadorNuvem extends Buscador{
    private String result;

    public BuscadorNuvem(Buscador proximo) {
        super(proximo);
    }

    @Override
    public String buscar(String musica) {
        
        DBNuvem dbNuvem = new DBNuvem();
        result =  dbNuvem.RetornaMusicaSeExistir(musica);
        
        if(result.length() == 0){
            System.out.println("Não achei na nuvem");
        }else{
            System.out.println("#Achei na nuvem#");
        }
        
        
        
        return result;
    }
    
    
}
