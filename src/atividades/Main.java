package atividades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao, idade;
        double lado;
        
    Scanner sc = new Scanner(System.in);
    
    do {
        System.out.println("1-Verificador de idade para votacao");
        System.out.println("2-Calculadora de area de quadrado");
        System.out.println("3-Conversor de temperatura (celsius para fahrenheit)");
        System.out.println("4-Concatenador de nome completo)");
        System.out.println("5-Sair");
        System.out.print("Escolha uma opcao: ");
        opcao = sc.nextInt();
        sc.nextLine(); // limpa o buffer
        
        switch (opcao){
            case 1:
                System.out.print("Digite sua idade: ");
                idade = sc.nextInt();
                
                VerificadorVoto oVerificador = new VerificadorVoto(idade);
                oVerificador.podeVotar();
            break;
                
            case 2:
                System.out.print("Digite o comprimento do lado: ");
                lado = sc.nextDouble();
                
                CalculadoraGeometria aCalculadora = new CalculadoraGeometria(lado);
                aCalculadora.calcularAreaQuadrado();
            break;
        }
        
    } while (opcao != 5);
        
    }
}
