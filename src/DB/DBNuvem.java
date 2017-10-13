package DB;

import java.util.ArrayList;

public class DBNuvem {

    private ArrayList<String> musicas = new ArrayList();


    public String RetornaMusicaSeExistir(String musica) {
        DataBase();
        int i = 0;
        for (String a : musicas) {

            if (musica.equalsIgnoreCase(musicas.get(i))) {
                return musicas.get(i);
            }
            i++;
        }
        return musicas.get(0);
    }

    private void DataBase() {
        musicas.add("");
        musicas.add("Nuvem");
        musicas.add("Teste Nuvem");
        musicas.add("Abc Nuvem");
        musicas.add("Nuvem 123");        
    }

}
