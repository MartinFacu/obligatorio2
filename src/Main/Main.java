
package Main;
import zFuncionamiento.*;
import Ventanas.*;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        ventanaMenu ventana = new ventanaMenu(sistema);
        ventana.setVisible(true);
        
        //datos precargados para testeo
        Tematica tema1 = new Tematica("HashMapeador","Anashee");
        Tematica tema2 = new Tematica("Javador","Anashee222");
        sistema.agregarUnaTematica(tema1);
        sistema.agregarUnaTematica(tema2);
    }
    
}
