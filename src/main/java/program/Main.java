package program;

import servico.ApiServico;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ApiServico apiServico = new ApiServico();

        System.out.println("Digite um Cep :");
        String cep = sc.nextLine();
        System.out.println(apiServico.getEndereco(cep));



    }
}
