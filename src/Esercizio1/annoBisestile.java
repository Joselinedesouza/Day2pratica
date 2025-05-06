package Esercizio1;

import java.util.Scanner;

public class annoBisestile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un anno: ");
        int anno = scanner.nextInt();
        boolean bisestile =  annoBisestile(anno);
        if(bisestile){
            System.out.println("L'anno " + anno + " è bisestile ");
        } else {
            System.out.println("L'anno " + anno + " non è bisestile");
        }
       scanner.close();
        }
        public static boolean annoBisestile (int anno) {
            if (anno % 4 == 0) {
                if (anno % 100 == 0) {
                    return anno % 400 == 0;
                } else {
                    return true; }
                } else{
                    return false;
                }
            }
        }
