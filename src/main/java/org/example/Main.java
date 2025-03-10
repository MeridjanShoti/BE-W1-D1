package org.example;

import java.util.Scanner;

public class Main {
    static int moltiplica(int a, int b){
        return a*b;
    };
    static String concatena(String stringa, int a){
        return stringa+a;
    }
    static String[] inserisciInArray(String[] arrayDiStringhe, String stringa2){
        String[] arrayDiStringhe2 = new String[arrayDiStringhe.length+1];
        arrayDiStringhe2[0] = arrayDiStringhe[0];
        arrayDiStringhe2[1] = arrayDiStringhe[1];
        arrayDiStringhe2[2] = stringa2;
        arrayDiStringhe2[3] = arrayDiStringhe[2];
        arrayDiStringhe2[4] = arrayDiStringhe[3];
        arrayDiStringhe2[5] = arrayDiStringhe[4];
        return arrayDiStringhe2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci primo numero");
        int a = scanner.nextInt();
        System.out.println("inserisci secondo numero");
        int b = scanner.nextInt();
        System.out.println("il risultato è: "+moltiplica(a,b));
        System.out.println("inserisci una stringa");
        String stringa = scanner.next();
        System.out.println("inserisci un numero");
        a = scanner.nextInt();
        System.out.println(concatena(stringa,a));
        String[] arrayDiStringhe = {"sono","un","array","di","stringhe"};
        System.out.println("inserisci una stringa");
        String stringa2 = scanner.next();
        System.out.println("otterrò:");
        String[] arrayDiStringhe2 = inserisciInArray(arrayDiStringhe,stringa2);
        for (int i = 0; i < arrayDiStringhe2.length; i++) {
            System.out.println(arrayDiStringhe2[i]);
        }
    }
}