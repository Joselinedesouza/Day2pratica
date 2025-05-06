package Esercizio4;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un numero intero: ");
        int numb= scanner.nextInt();
        for( int i = numb; i>= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Conto alla rovescia finito!");
    }
}
