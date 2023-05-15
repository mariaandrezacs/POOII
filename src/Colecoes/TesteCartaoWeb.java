
package Colecoes;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

public class TesteCartaoWeb {
    public static void main(String[] args) {
        TreeMap<String, CartaoWeb> cartoes = new TreeMap<String, CartaoWeb> ();
        
        cartoes.put("Jose", new CartaoWeb("João", "Jose", "Bom carnaval parea!!!"));
        cartoes.put("Joaquina", new CartaoWeb("Maria", "Joaquina", "Vai ver se eu estou na esquina!!!"));
        cartoes.put("Zeferino", new CartaoWeb("Quiteria", "Zeferino", "Compre pão!!!"));

        CartaoWeb h = cartoes.get("Jose");
        
        Collection<CartaoWeb> b = cartoes.values();
        
        for(CartaoWeb c:b){
            c.MostraMensagem();
        }
        
    }
}
