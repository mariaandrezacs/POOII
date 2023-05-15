
package Interface;

public class Carro extends Veiculo implements MinhaInterface{

    @Override
    public void ligar() {
        System.out.println("Liguei o carro");
    }

    @Override
    public void desligar() {
        System.out.println("desliguei o carro");
    }
    
}
