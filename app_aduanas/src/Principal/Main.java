
package Principal;

import Controlador.ControladorVistaGerente;
import Vista.PestañaGerente;

public class Main {

    public static void main(String[] args) {
        ControladorVistaGerente ge= new ControladorVistaGerente(new PestañaGerente());
    }
    
}
