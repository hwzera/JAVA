package poo.collection;

import java.util.ArrayList;
import java.util.List;

import poo.ex_heranca.Livro;

public class MinhaColecao {
    public static void main(String[] args) {

        //dessa forma eu declaro uma collection
        List<Livro> livros = new ArrayList<Livro>();

        Livro l1 = new Livro("Minha coleção");
        Livro l2 = new Livro("Minha coleção part 2");
        Livro l3 = new Livro("Minha coleção part 3");
        Livro l4 = new Livro("Minha coleção part 4");

        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        livros.add(l4);


        //Uma maneia de imprimir a lista
        for(int i = 0; i < livros.size(); i++){
            System.out.println(livros.get(i));
        }

        //Forma mais utilizada de imprimir a lista
        for(Livro l : livros){
            System.out.println(l);
        }

        livros.remove(0);
    }
}
