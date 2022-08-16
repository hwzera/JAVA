package poo.ex_heranca;

import java.time.LocalDate;
import java.time.Month;

public class TesteHeranca {
    public static void main(String[] args) {
        
        //Objeto Autor
        LocalDate dataNasc = LocalDate.of(1999, Month.MAY, 26);
        Autor mathews = new Autor("Mathews", dataNasc, "Rua Plinio Alarcon 564", "TADS3", 1); 

        //Objeto Livro POO
        Livro livroPOO= new Livro("Programando em Java OO");
        livroPOO.setEditora("Editora Erika");
        LocalDate dataLancamentoPOO = LocalDate.of(2005, Month.AUGUST, 13);
        livroPOO.setDtLancamento(dataLancamentoPOO);

        //Objeto Livro JS
        Livro livroNestJS = new Livro("Programando em Nest JS");
        livroNestJS.setEditora("Editora West");
        LocalDate dataLancamentoNestJS = LocalDate.of(2014, Month.APRIL, 8);
        livroNestJS.setDtLancamento(dataLancamentoNestJS);

        //Objeto Funcionario
        Funcionario func = new Funcionario();
        func.setNome("Camila");
        func.setEndereco("Rua n asfaltada");
        LocalDate dataNasCamila = LocalDate.of(2003, Month.JANUARY, 13);
        func.setDtNascimento(dataNasCamila);
        LocalDate dataAdm = LocalDate.of(2020, Month.MAY, 3);
        func.setDtAdmissao(dataAdm);
        func.setCargo("Faxineira");
        func.setMatricula("123456789");

        //Obj Estudante
        Estudante estudante1 = new Estudante();
        estudante1.setNome("Camila");
        estudante1.setEndereco("Rua n asfaltada");
        LocalDate dataNasEstudante1 = LocalDate.of(2000, Month.JUNE, 27);
        estudante1.setDtNascimento(dataNasEstudante1);
        estudante1.setRa("56498498");
        estudante1.setCurso("TADS");
        LocalDate dataInicio = LocalDate.of(2022, Month.FEBRUARY, 8);
        estudante1.setDtInicio(dataInicio);

    }
}
