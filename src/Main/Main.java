
package Main;
import zFuncionamiento.*;
import Ventanas.*;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        ventanaMenu ventana = new ventanaMenu(sistema);
        ventana.setVisible(true);
    }
    
}
