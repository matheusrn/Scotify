
package BuscadorMusica;

import DB.DBLocal;


public class BuscadorLocal extends Buscador{
    private String result;
    
    public BuscadorLocal(Buscador proximo) {
        super(proximo);
    }

    @Override
    public String buscar(String musica) {

        DBLocal bdLocal = new DBLocal();
        result =  bdLocal.RetornaMusicaSeExistir(musica);
        
        if(result.length() == 0){
            System.out.println("Não achei localmente");
        }else{
            System.out.println("#Achei localmente#");
        }
        
        
        return result;
    }
    
    
}
