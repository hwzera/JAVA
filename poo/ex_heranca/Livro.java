package poo.ex_heranca;

import java.time.LocalDate;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String editora;
    private LocalDate dtLancamento;

    public Livro(String titulo){ //Titulo é obrigatorio
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDtLancamento() {
        return this.dtLancamento;
    }

    public void setDtLancamento(LocalDate dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

    @Override
    public String toString(){
        return "Título: " + this.titulo + "\n Editora\t" + this.editora + "\nData Lançamento:\t" + this.dtLancamento; //DateTimeFormarter
    }

    public static Livro cadastrarLivro(){
        Scanner in = new Scanner(System.in); //Leitura
        System.out.print("Digite o titulo do livro: ");
        String titulo = in.next(); //Armazena o titulo

        if (titulo.length() < 2){
            System.out.println("O título deve ter ao menos 2 caracteres");
            return null;
        }

        Livro novoLivro = new Livro(titulo);
        System.out.print("Digite a editora do Livro: ");
        novoLivro.setEditora(in.next());

        System.out.println("Digite uma data de laçamento:  dd/mm/yyyy");
        String data = in.next();
        String dtLanc[] = data.split("/");

        if (dtLanc.length != 3){
            System.out.println("Digite a data corretamente");
            return null;
        }

        int dd = Integer.parseInt(dtLanc[0]); //Converter string para inteiro
        int m = Integer.parseInt(dtLanc[1]);
        int y = Integer.parseInt(dtLanc[2]);

        LocalDate d = LocalDate.of(y, m, dd);

        novoLivro.setDtLancamento(d);
        
        return novoLivro;
    }

}
