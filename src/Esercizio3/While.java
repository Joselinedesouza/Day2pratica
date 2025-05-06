package Esercizio3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Inserisci una stringa (\":q\" per uscire): ");
            input = scanner.nextLine();

            if(input.equals(":q")) break;

            StringBuilder output= new StringBuilder();

            for (int i= 0; i < input.length(); i++) {
                output.append(input.charAt(i));
                if (i< input.length()-1)
            output.append(",");
            }
                System.out.println("Output: " + output);
        }
        System.out.println("Termine");
    }

    }