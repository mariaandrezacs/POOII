
package Interface;

public class Lancha extends Veiculo implements MinhaInterface{
    boolean temGps;
    
    @Override
    public void ligar() {
        System.out.println("Liguei a lancha");
    }

    @Override
    public void desligar() {
        System.out.println("desliguei a lancha");
    }
}
