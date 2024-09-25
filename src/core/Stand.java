package core;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class Stand {

    private static int idCount = 0; // contador para asignar el id unico de cada stand, estatic porque es de la clase, no al objeto.

    private int id; // deberia de ser autogenerado para que no se repita
    private float precio;
    private ArrayList<Editorial> editoriales; // lista vacia porque al principio no esta asignado a ningun stand

    public Stand(float precio) {
        this.id = Stand.idCount;
        this.precio = precio;
        this.editoriales = new ArrayList();

        Stand.idCount++; // se incrementa el valor de la variable al final de la creacion del objeto para cambiar el id para el proximo stand.

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + this.id + ", " + this.precio + ")"; // esto me daria por ej. Stand(0, x precio), Stand(1, y precio), etc
    }

    public int getId() {
        return id;
    }

    
    public boolean addEditorial(Editorial editorial) {
        if (!this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

}
