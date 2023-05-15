
package Projects;

import java.util.ArrayList;
import java.util.Collections;


public class TestePessoa {
    public static void main(String[] args) {
        
        ArrayList num = new ArrayList();
        //ArrayList<Integer> num = new ArrayList<Integer>();
        
        Pessoa p1 = new Pessoa("João", "Casa 12", "5555-7777");
        Pessoa p2 = new Pessoa("Maria", "Casa 14", "5555-8888");
        Pessoa p3 = new Pessoa("José", "Casa 18", "8888-9999");
        
        num.add(p1);
        num.add(p2);
        num.add(p3);
        
        //num.add(3);
        //num.add(4);
        //num.add(0);
        //num.add(1);
        //num.add("Texto");
        //num.add(true);
        
        
        
        System.out.println(num.toString());
        //System.out.println(num.get(3));
        //Collections.sort(num);
        System.out.println(num.get(2).toString());
        
        
        
    }
        
}
