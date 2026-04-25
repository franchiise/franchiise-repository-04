package ex05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("qual o valor de um salario minimo? ");
        double sm = scan.nextDouble();

        System.out.print("qual o salario do usuario? ");
        double salario = scan.nextDouble();

        double quant = salario / sm;

        System.out.printf("o usuario ganha %.1f salarios minimos ", quant);
        
    }
    
}
