
package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class TestePessoa {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        //ArrayList<Pessoa> num = new ArrayList<Pessoa>();
        
        /*Pessoa p1 = new Pessoa("João", "Casa 2", "9999-9888");
        Pessoa p2 = new Pessoa("Maria", "Casa 3", "4444-9988");
        Pessoa p3 = new Pessoa("João", "Casa 4", "2222-3333");*/
        
        
        num.add(4);
        num.add(3);
        num.add(0);
        num.add(1);
        /*num.add(p1);
        num.add(p2);
        num.add(p3);*/
        
        System.out.println("O Array já tem" + num.size()+ "elementos.");
        
        System.out.println(num.toString());
        System.out.println(num.get(3));
        //System.out.println(num.get(0).toString());
        Collections.sort(num);
        System.out.println(num.toString());
        System.out.println(num.get(3));
        
        
        /*for (i = 0, i < num.size(); i++){
            Pessoa p = num.get(i);
            System.out.println("Agora ja li a pessoa" + p.getNome());
        }
            OR
        for (Pessoa p : num){
            System.out.println("Agora ja li a pessoa" + p.getNome());
        }*/
    }
            
}
