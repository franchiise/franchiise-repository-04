package ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("anos: ");
        int ano = scan.nextInt();
        
        System.out.print("meses: ");
        int mes = scan.nextInt();
        
        System.out.print("dias: ");
        int dias = scan.nextInt();
        
        int total = (ano * 365) + (mes * 30) + dias;
        
        System.out.printf("%d anos, %d meses e %d dias = %d dias ", ano, mes, dias, total);
        
    }
    
}
