
package Colecoes;


public class CartaoWeb {
    private String remetente;
    private String destinatario;
    private String mensagem;

    public CartaoWeb(String remetente, String destinatario, String mensagem) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    void MostraMensagem(){
        System.out.println("WebMensagem*********");
        System.out.println("De: " + getRemetente());
        System.out.println("Para: " + getDestinatario());
        System.out.println(getMensagem());
        System.out.println("********************");
        
    }
}
