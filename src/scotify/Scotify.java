

package scotify;

import Login.LoginProxy;
import Login.ValidarLogin;


public class Scotify {

    
    public static void main(String[] args) {
        
        
        ValidarLogin vl = new LoginProxy("root", "123");
        vl.logar();
    }

}
