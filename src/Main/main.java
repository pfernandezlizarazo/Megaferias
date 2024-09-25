package Main;

import core.Editorial;
import core.Gerente;
import core.Megaferia;
import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class main {

    public static void main(String[] args) {
        Megaferia megaferia = new Megaferia(); // la megaferia esta compuesta de stands, se crean los stands.
        megaferia.createStand(100000);
        megaferia.createStand(200000);
        megaferia.createStand(150000);
        megaferia.createStand(300000);

        megaferia.verifyStands();

        Gerente gerente1 = new Gerente("Paula", 12345);
        Gerente gerente2 = new Gerente("Andrea", 23456);

       // Editorial editorial1 = new Editorial("1234567", "planeta", "miramar", gerente1);
        //Editorial editorial2 = new Editorial();
                
        ArrayList<Integer> standsIds = new ArrayList<>();
        standsIds.add(0);
        standsIds.add(1);
        standsIds.add(3);
        standsIds.add(4);

        ArrayList<Editorial> editoriales = new ArrayList<>();
        //editoriales.add(editorial1);
       // editoriales.add(editorial2);

        //megaferia.assignStandEditorial(standsIds, editoriales);
        
        megaferia.verifyStands();
    }

}
