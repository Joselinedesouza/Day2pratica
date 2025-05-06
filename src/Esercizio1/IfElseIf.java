package Esercizio1;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String inputString= scanner.nextLine();
        boolean pariDispari = stringaPariDispari(inputString);
        if(pariDispari){
            System.out.println("La stringa ha un numero pari di caratteri");
        } else{
            System.out.println("La stringa ha un numero dispari di caratteri");
        }
    }
     //Metodo che controlla la lunghezza della stringa
    private static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

}
