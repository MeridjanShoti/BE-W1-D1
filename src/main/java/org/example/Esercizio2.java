package org.example;

import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci la prima stringa");
        String stringa1 = scanner.next();
        System.out.println("inserisci la seconda stringa");
        String stringa2 = scanner.next();
        System.out.println("inserisci la terza stringa");
        String stringa3 = scanner.next();
        System.out.println("ordine di inserimento:");
        System.out.println(stringa1+stringa2+stringa3);
        System.out.println("ordine inverso: ");
        System.out.println(stringa3+stringa2+stringa1);
    }
}
