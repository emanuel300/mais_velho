package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        int idademaior,maior, posicao;

        System.out.print("Quantas pessoas voce vai digitar: ");
        int n = ler.nextInt();
        Pessoa[] vetPessoa = new Pessoa[n];

        for (int i = 0; i < vetPessoa.length; i++){
            ler.nextLine();
            System.out.println("Dados da pessoa");
            System.out.print("Nome: ");
            String nome =ler.nextLine();
            System.out.print("Idade");
            int idade = ler.nextInt();
            vetPessoa[i] = new Pessoa(nome, idade );
        }

        idademaior = vetPessoa[0].getIdade();
        posicao = 0;


        for (int i = 0; i < vetPessoa.length; i++){
            if (vetPessoa[i].getIdade() > idademaior){
                maior = vetPessoa[i].getIdade();
                posicao = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + vetPessoa[posicao].getNome());



        ler.close();
    }
}
