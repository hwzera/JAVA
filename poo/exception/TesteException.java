package poo.exception;

public class TesteException {
    
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {

        novaFrase = frase.toUpperCase();
    } catch (NullPointerException ex){
        System.out.println("Erro: Frase Nula!\nUsando uma frase default!");
        frase = "Estou aprendendo!";
        novaFrase = frase.toUpperCase();
    } catch (IllegalArgumentException ex){
        System.out.println("Argumento inválido!");
    }
    System.out.println("Frase antiga: " + frase);
    System.out.println("Nova Frase: " + novaFrase);

    //---------------------------------------------//

    String novaMsg = null;
    String msgCaixaAlta;
    
    try {
    msgCaixaAlta = caixaAlta(novaMsg);
    }catch (NullPointerException ex){
        System.out.println("Erro: Frase Nula!");
        novaMsg = "Mensagem da Caixa Alta";
        msgCaixaAlta = caixaAlta(novaMsg);
    }
    System.out.println("Msg Caixa Alta: " + msgCaixaAlta);
    //---------------------------------------------//
}

    public static String caixaAlta(String msg) throws NullPointerException{

        // pode acontecer um nullPointerException
        String ca = msg.toUpperCase();
        return ca;
    }
}
