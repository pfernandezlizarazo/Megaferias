
package core;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class Narrador extends Persona {
    
    private ArrayList<AudioLibro> libros;

    public Narrador(String nombre, int cedula) {
        super(nombre, cedula);
    }
    
    public boolean addLibro(AudioLibro libro){
        if (this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }
    
}
