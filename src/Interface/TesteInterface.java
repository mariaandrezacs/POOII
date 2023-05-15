
package Interface;

public class TesteInterface {
    public static void main(String[] args) {
        Lancha l1 = new Lancha();
        Carro c1 = new Carro();
        
        Informacoes i = new Informacoes();
        i.comoSeLiga(l1);
        i.comoSeLiga(c1);
    }
}
