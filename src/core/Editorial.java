
package core;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class Editorial {
    
    private String nit;
    private String nombre;
    private Gerente gerente;
    private ArrayList<Libro> libros;
    private ArrayList<Stand> stands;
  
    public Editorial(String nit, String nombre, Gerente gerente,  ArrayList<Libro> libros, ArrayList<Stand> stands) {
        this.nit = nit;
        this.nombre = nombre;
        this.gerente = gerente;
        this.libros = new ArrayList<>();
        this.stands = new ArrayList<>();
        
        this.gerente.setEditorial(this);
    }
    
    public boolean addLibro(Libro libro) {
        if (this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }
    
    
    public boolean addStand(Stand stand) {
        if (this.stands.contains(stand)) {
            this.stands.add(stand);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + this.nit + ", " + this.nombre + ')';
    }  
    
}
