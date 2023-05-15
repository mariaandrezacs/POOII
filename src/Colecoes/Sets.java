
package Colecoes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Sets {
    public static void main(String[] args) {
        //HashSet<Cliente> clientes = new HashSet<Cliente> ();
        HashSet clientes = new HashSet();
        
        //clientes.add(new Cliente("joão", "rua a", 3)); 
        //clientes.add(new Cliente("maria", "rua b", 5));
        //clientes.add(new Cliente("vitor", "rua c", 32));
        //clientes.add(new Cliente("robson", "rua f", 12));  // Mostra itens repetidos
        clientes.add(new Cliente("robson", "rua f", 12));

        
        clientes.add("joão");  // so vai ser mostrado na saida um joao
        clientes.add("joão");
        clientes.add("joão");
        clientes.add("joão");
        clientes.add("jose");
      
        System.out.println(clientes);
        
        
        Iterator it = clientes.iterator();
        while (it.hasNext()){
            Cliente c = (Cliente)it.next();
            System.out.println(c.toString());
        }
        
        
    }
}
