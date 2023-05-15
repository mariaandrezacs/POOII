
package Colecoes;

public class Cliente{    // implements Comparable<Cliente>
    public String nome;
    public String endereco;
    public int numero;

    public Cliente(String nome, String endereco, int numero) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }

    public int compareTor(Cliente c){
        return this.nome.compareTo(c.nome + c.endereco);
        
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", endereco=" + endereco + ", numero=" + numero + '}';
    }
   

}
