
package Colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> bandas = new ArrayList<String> ();
        
        bandas.add("Rush");
        System.out.println("Adicionando a banda");
        System.out.println(bandas.get(0));
        
        bandas.add("Beatles");
        System.out.println("Adicionando a banda");
        System.out.println(bandas.get(1));
        
        bandas.add("Iron Maiden");
        System.out.println("Adicionando a banda");
        System.out.println(bandas.get(2));
        
        System.out.println("Quem está no indice 0: ");
        System.out.println(bandas.get(0));
        
        System.out.println("Adicionando Tiririca onde estava o Rush: ");
        bandas.add(bandas.indexOf("Rush"), "Tiririca");
        System.out.println(bandas.get(0));
        
        System.out.println("Numeros de elementos na lista: ");
        System.out.println(bandas.size());
        
        System.out.println("Ordenando a lista: ");
        Collections.sort(bandas);
        System.out.println(bandas.toString());
        
        
        
        
    }
}
