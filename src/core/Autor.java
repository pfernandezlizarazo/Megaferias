
package core;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class Autor extends Persona {
    
    private ArrayList<Libro> libros;
    
    public Autor(String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
    
    public boolean addLibro(Libro libro) {
        if (this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }
}


