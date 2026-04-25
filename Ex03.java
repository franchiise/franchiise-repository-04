package ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        System.out.print("digite um saldo: ");
        Scanner scan = new Scanner(System.in);
        
        float saldo = scan.nextFloat();
        float reajuste = (float) (0.01 * saldo);
        
        System.out.println("reajuste do saldo: R$" + (saldo + reajuste));
        
    }
    
}
