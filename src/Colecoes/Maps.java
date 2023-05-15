
package Colecoes;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Carro> carros = new HashMap<String, Carro> ();
        
        Carro c1 = new Carro("Fiat", "Uno", 2012, 20000, "01234567");
        Carro c2 = new Carro("Renault", "Logan", 2015, 32000, "76543210");
        Carro c3 = new Carro("Ford", "Ka", 2010, 22000, "12345676");
        
        carros.put(c1.getChassi(), c1);
        carros.put(c2.getChassi(), c2);
        carros.put(c3.getChassi(), c3);
        
        Carro cConsulta = carros.get("01234567");
        System.out.println(cConsulta.toString());
  
    }
}
