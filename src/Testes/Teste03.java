
package Testes;

public class Teste03 {
    public static void main(String[] args) {
        int a, b, c;
        
        a = 6;
        b = 4;
        
        
        
        try{
            c = a / b;
            System.out.println("Divisão: " + c);
        } catch (ArithmeticException ex){
            System.out.println("Aconteceu um erro nas variaveis: " + ex.getMessage());
        } catch (NumberFormatException ex){
            System.out.println("Aconteceu um erro de formatação: " + ex.getMessage());
        } finally {
            System.out.println("Preciso rodar isso de qualquer jeito.");
        }
        
        System.out.println("Conjuntos de comandos importantes no sistema. execute!!!");
        /*try{
            c = a / b;
            System.out.println("Divisão" + c);
        } catch (ArithmeticException ex){
            System.out.println("Aconteceu um erro nas variaveis: " + ex.getMessage());
        }
        
        
        System.out.println("Conjuntos de comandos importantes no sistema. execute!!!");*/
    }
}
