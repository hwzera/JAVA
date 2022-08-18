package poo.ex_heranca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaBibliotecario {
    private final static String[] opcoes = {
        "|----- SISTEMA BIBLIOTECA -----|",
        "|      Escolha uma opção:      |",
        "|------------------------------|",
        "|1 - Cadastrar Livro           |",
        "|2 - Cadastrar Funcionário     |",
        "|3 - Cadastrar Estudante       |",
        "|4 - Cadastrar Autor           |",
        "|5 - Realizar Emprestimo       |",
        "|6 - Receber Emprestimo        |",
        "|0 - Sair                      |",
        "|------------------------------|",
    };

 
    private static List<Livro> livros = new ArrayList<Livro>();
    //private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    //private static List<Autor> autores = new ArrayList<Autor>();
    private static Scanner buffer = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int op = 1;

        while(op != 0){
            printMenu();
            System.out.println("\n");
            op = buffer.nextInt();
            escolha(op);
            System.in.read();
        }   

    }

    public static void printMenu(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
        for(String op : opcoes){
            System.out.println(op);
        }
    }

    private static void escolha(int op){
        switch (op) {

            // cadastrar o livro
            case 1:
                Livro novoLivro = Livro.cadastrarLivro();
                System.out.println("\nLivro cadastrado!\nResumo ... \n");
                System.out.println(novoLivro.toString());
                livros.add(novoLivro);
                break;
            
            //cadastrar funcionario
          //  case 2:
               // Funcionario novoFunc = Funcionario.cadastrarFuncionario();


            default:
            System.out.println("Saindo da função ");

        }
    }
}
