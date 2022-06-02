package principal.Ejercicio_7_4;

import java.util.ArrayList;
import java.util.Collections;

public class Listas {
    public static void creacion(){
        ArrayList lista1 = new ArrayList();
        ArrayList lista2 = new ArrayList();
        lista1.add(3);
        lista1.add(12);
        lista1.add(2);
        lista1.add(9);
        lista1.add(4);
        lista2.add(8);
        lista2.add(4);
        lista2.add(6);
        lista2.add(2);
        lista2.add(5);
        Collections.sort(lista1);
        System.out.println(lista1);
        Collections.sort(lista2);
        System.out.println(lista2);
        System.out.println(fusionar(lista1, lista2));
    }

    public static ArrayList fusionar(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        ArrayList fusion= new ArrayList();
        int i=0, j=0, cont=0;
        while (cont<lista1.size()+lista2.size()-1){
            if (lista1.get(i)<lista2.get(j)){
                fusion.add(lista1.get(i));
                i++;
            }else {
                fusion.add(lista2.get(j));
                j++;
            }
            cont++;
            if (cont==lista1.size()+lista2.size()-1) fusion.add(lista1.get(i));
        }
        return fusion;
    }
}
