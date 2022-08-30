package poo;

import poo.classe.Residencia;

public class App{
    public static void main(String[] args) {

        Residencia minhaCasa = new Residencia("Casa", true, 0, 0, 0, 0); // criando um objeto => alocando memoria 
        minhaCasa.setNome("Lar doce Lar");
        minhaCasa.setOcupada(false);

        System.out.println(minhaCasa);
        

    }
}