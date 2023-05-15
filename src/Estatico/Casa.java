
package Estatico;

public class Casa {
    int numero;
    static String cor;
    
    static double pi = 3.1415;

    @Override
    public String toString() {
        return "Casa{" + "numero=" + numero + ", cor=" + cor + '}';
    }

    public static void Escreve(){
        System.out.println("Qualquer coisa...");
    }
    
    
}
