package poo.classe;

//classe abstrata impede de criar instancias (objetos) dessa classe
public abstract class Construcao {

    //encapsulamento || protegido todas classes tem acesso a elas

    protected int qtoPortas;
    protected double frete;
    protected double fundo; 
    protected int qtoJanelas;
    protected double valor;


    public double getFrete() {
        return this.frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getFundo() {
        return this.fundo;
    }

    public void setFundo(double fundo) {
        this.fundo = fundo;
    }

    public int getQtoPortas() {
        return this.qtoPortas;
    }

    public void setQtoPortas(int qtoPortas) {
        this.qtoPortas = qtoPortas;
    }

    public int getQtoJanelas() {
        return this.qtoJanelas;
    }

    public void setQtoJanelas(int qtoJanelas) {
        this.qtoJanelas = qtoJanelas;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double alterarValor(){
        this.valor *= 1.1;
        return this.valor;
    }

    public double descontoVista(){
        return this.valor * 0.05;
    }

    public String toString(){
        return "ToString da super classe";
    }
}
