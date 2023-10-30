
package Main;
import zFuncionamiento.*;
import Ventanas.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        ventanaMenu ventana = new ventanaMenu(sistema);
        ventana.setVisible(true);
        
        //datos precargados para testeo
        Tematica tema1 = new Tematica("HashMapeador","Anashee");
        Tematica tema2 = new Tematica("Javador","Anashee222");
        Tematica tema3 = new Tematica("javascripteador","Anashee3");
        Tematica tema4 = new Tematica("Csseador","Anashee444");
        sistema.agregarUnaTematica(tema1);
        sistema.agregarUnaTematica(tema2);
        sistema.agregarUnaTematica(tema3);
        sistema.agregarUnaTematica(tema4);
        HashMap<Tematica, Integer> hashMap = new HashMap<>();
        hashMap.put(tema1, 5);
        hashMap.put(tema2, 3);
        Postulante postulante1 = new Postulante("Presencial", "linkedelfalo.com", "falo@gmail", 99234, "Bulevar Artigas", 123456, "Falo", hashMap);
        sistema.agregarPostulante(postulante1);
        hashMap.put(tema3, 7);
        hashMap.put(tema4, 2);
        Postulante postulante2 = new Postulante("Remoto", "linkedelmors.com", "mors@gmail", 993812, "Villas", 6789, "Mors", hashMap);
        sistema.agregarPostulante(postulante2);
    }
    
}
