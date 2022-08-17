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

        //Objeto Func  = camila
        Funcionario func = new Funcionario();
        func.setNome("Camila");
        func.setEndereco("Rua n asfaltada");
        LocalDate dataNasCamila = LocalDate.of(2003, Month.JANUARY, 13);
        func.setDtNascimento(dataNasCamila);
        LocalDate dataAdm = LocalDate.of(2020, Month.MAY, 3);
        func.setDtAdmissao(dataAdm);
        func.setCargo("Faxineira");
        func.setMatricula("123456789");

        //Obj Estudante1 = Henrique
        Estudante estudante1 = new Estudante();
        estudante1.setNome("Henrique");
        estudante1.setEndereco("Rua duque de caxias");
        LocalDate dataNasEstudante1 = LocalDate.of(1999, Month.MARCH, 23);
        estudante1.setDtNascimento(dataNasEstudante1);
        estudante1.setRa("56498498");
        estudante1.setCurso("TADS");
        LocalDate dataInicio = LocalDate.of(2019, Month.FEBRUARY, 8);
        estudante1.setDtInicio(dataInicio);

        //Obj Emprestimo
        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.setEstudante(estudante1);
        emprestimo1.setFuncionario(func);
        emprestimo1.setLivro(livroPOO);
        LocalDate dtEmprestimo = LocalDate.of(2022, Month.AUGUST, 15);
        LocalDate dtDevolucao = LocalDate.of(2022, Month.SEPTEMBER, 15);
        emprestimo1.setDtEmprestimo(dtEmprestimo);
        emprestimo1.setDtDevolucao(dtDevolucao);
        
    }
}
