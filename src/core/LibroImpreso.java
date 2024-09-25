
package core;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class LibroImpreso extends Libro {
    
    private int paginas;
    private int numEjemplares;
    
    public LibroImpreso(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, int paginas, int numEjemplares) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.paginas = paginas;
        this.numEjemplares = numEjemplares;
        
    }
    
  
        
   
}
