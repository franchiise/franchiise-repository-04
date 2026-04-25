package ex04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("ipi (%): ");
        float ipi = scan.nextFloat();

        System.out.print("codigo peca 1: ");
        int cod1 = scan.nextInt();
        
        System.out.print("valor peca 1: ");
        float val1 = scan.nextFloat();
        
        System.out.print("quantidade peca 1: ");
        int quant1 = scan.nextInt();

        System.out.print("codigo peca 2: ");
        int cod2 = scan.nextInt();
        
        System.out.print("valor peca 2: ");
        float  val2 = scan.nextFloat();
        
        System.out.print("quantidade peca 2: ");
        int quant2 = scan.nextInt();

        double total = (val1 * quant1 + val2 * quant2) * (ipi / 100 + 1);

        System.out.printf("valor total: R$%.1f ", total);
        
    }
    
}
