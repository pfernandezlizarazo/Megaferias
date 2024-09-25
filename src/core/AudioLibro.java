
package core;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class AudioLibro extends Libro {
    
    private int duracion;
    private Narrador narrador;
    
    public AudioLibro(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, int duracion, Narrador narrador) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        
       this.duracion = duracion;
       this.narrador = narrador;
       
       this.narrador.addLibro(this);
    }
    
}
