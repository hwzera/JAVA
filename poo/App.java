package poo;

import java.util.List;

import poo.classe.Comercial;

//import java.util.Scanner;

import poo.classe.Residencia;

public class App{
    public static void main(String[] args) {
       // Scanner s = new Scanner(System.in);
        Residencia minhaCasa = new Residencia("Lar doce Lar", true);
       // System.out.println("Digite o valor da casa: ");
        double valor = 650;
        minhaCasa.setValor(valor);
        System.out.println("Valor da residencia: " + minhaCasa.alterarValor());
        System.out.println("Valor do desconto: " + minhaCasa.descontoVista());

        Comercial comercialCamila = new Comercial();
        comercialCamila.setValor(3000);
        System.out.println("Valor do comercial: " + comercialCamila.alterarValor());
        System.out.println("Valor do desconto: " + comercialCamila.alterarValor());


        Comercial comercialHenrique = new Comercial();

        List<Comercial> listaComercial = new ArrayList<Comercial>();
        listaComercial.add(comercialCamila);
        listaComercial.add(comercialHenrique);

        listaComercial.get(0).getValor();
        
        for (Comercial c : listaComercial) {
            c.getValor();
        }
    }
}