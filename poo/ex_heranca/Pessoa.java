package poo.ex_heranca;

import java.time.LocalDate;

public abstract class Pessoa { 

    protected String nome;
    protected LocalDate dtNascimento;
    protected String endereco;

    //esse construtor só existe para gerar instancia em estudante e funcionário
    protected Pessoa(){}

    //construtor obrigatorio para gerar instancia de Autor
    protected Pessoa(String _nome, LocalDate _dtNascimento, String _endereco){ //_ privado só pra classe
        this.nome = _nome;
        this.endereco = _endereco;
        this.dtNascimento = _dtNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return this.dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
