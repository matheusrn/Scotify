package DB;

import java.util.ArrayList;

public class DBLocal {

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

    public void DataBase() {
        musicas.add("");
        musicas.add("Local");
        musicas.add("BD Local");
        musicas.add("Local Teste");
        musicas.add("Local 123");        
    }

}
