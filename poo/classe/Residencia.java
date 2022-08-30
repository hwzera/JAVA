package poo.classe;

public class Residencia extends Construcao {

    //atributos private = encapsulado proteger atributos
    private int num; 
    private String nome; 
    private boolean ocupada; //true or false 
    private double valor; 

    //obrigando na criação do objeto se passar os parametros

    public Residencia(String nome, boolean ocupada, int janelas, int portas, double valor, int num){
        this.nome = nome;
        this.ocupada = ocupada;
        this.qtoJanelas = janelas;
        this.qtoPortas = portas;
        this.num = num;

    }
    super();

      // após isso get and setter

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public boolean isOcupada() {
        return this.ocupada;
    }

    public boolean getOcupada() {
        return this.ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNum(){
        return this.num;
    } 

    public void setNum(int valor){
        this.num = valor;
    }

    @Override
    public String toString(){
        return "Novo método toString";
    }

}
