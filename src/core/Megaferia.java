
package core;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class Megaferia {
    
    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;
    
    public Megaferia() {
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }

    
    
    public void createStand(float precio) {
        this.stands.add(new Stand(precio));
    }

    public ArrayList<Stand> getStands() {
        return stands;
    }

    public void verifyStands() {
        for (Stand stand : this.stands) {
            System.out.println(stand);
        }
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

    public void assignStandEditorial(ArrayList<Integer> standsIds, ArrayList<Editorial> editoriales) {
        for (Editorial editorial : editoriales ) {
            this.addEditorial(editorial); // se asegura que se anadan todas las editoriales, en el metodo de addEditorial se rectifica que si no esta en la lista, se anada. 
            for (Integer standId : standsIds) {
                Stand stand = this.getStandById(standId);
                if (stand !=null){
                    editorial.addStand(stand);
                    stand.addEditorial(editorial);
                }
            }
            
        }
    }
    private Stand getStandById(int standId) { //recorre a todos los stands en base al id recibido, y verifica hasta que encuentre uno que coincida. si son iguales, lo retorna.
        for (Stand stand : this.stands) {
            if (stand.getId() == standId) {
                return stand; 
            }
        }
        return null;
    }

}