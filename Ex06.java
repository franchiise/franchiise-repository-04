package ex06;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        
        System.out.print("digite um numero: ");
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        anteSuc(num);
                        
    }

    static void anteSuc(int n) {

        int ant = n - 1;
        int suc = n + 1;
        
        System.out.printf("antecessor: %d\nsucessor: %d \n", ant, suc);

    }
    
}
