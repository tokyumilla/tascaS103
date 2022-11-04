package n1exercici1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Month> months = new ArrayList<>();
        Month enero = new Month("enero");
        Month febrero = new Month("febrero");
        Month marzo = new Month("marzo");
        Month abril = new Month("abril");
        Month mayo = new Month("mayo");
        Month junio = new Month("junio");
        Month julio = new Month("julio");
        Month agosto = new Month ("agosto");
        Month septiembre = new Month("septiembre");
        Month octubre = new Month("octubre");
        Month noviembre = new Month("noviembre");
        Month diciembre = new Month("diciembre");

        months.add(enero);
        months.add(febrero);
        months.add(marzo);
        months.add(abril);
        months.add(mayo);
        months.add(junio);
        months.add(julio);
        months.add(septiembre);
        months.add(octubre);
        months.add(noviembre);
        months.add(diciembre);


        months.add(7,agosto);

        System.out.println(months);

        Collection<Month> monthsHashSet = new HashSet<Month>(months);

        if (!monthsHashSet.add(junio)) {
            System.out.println("No se puede añadir junio porque ya está en la lista");
        }
        System.out.println(monthsHashSet);


    }
}