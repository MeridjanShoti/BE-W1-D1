package org.example;

import java.util.Scanner;

public class Esercizio3 {
    static double perimetroRettangolo(double latoA, double latoB){
        return (latoA*2) + (latoB*2);
    }
    static int pariDispari(int a){
        if(a%2==0){return 0;}else {return 1;}
    }
    static double perimetroTriangolo (double a, double b, double c){
        double perimetro = a + b + c;
        return Math.sqrt(perimetro*(perimetro-a)*(perimetro-b)*(perimetro-c));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci lato A");
        double latoA = scanner.nextDouble();
        System.out.println("inserisci lato B");
        double latoB = scanner.nextDouble();
        System.out.println("il perimetro del rettangolo è: ");
        System.out.println(perimetroRettangolo(latoA, latoB));

        System.out.println("inserisci un numero intero per verificare se è pari");
        int numero = scanner.nextInt();
        System.out.println("il numero è pari se 0, dispari se 1");
        System.out.println(pariDispari(numero));
        System.out.println("inserisci il primo lato del triangolo");
        double lato1 = scanner.nextDouble();
        System.out.println("inserisci il secondo lato del triangolo");
        double lato2 = scanner.nextDouble();
        System.out.println("inserisci il terzo lato del triangolo");
        double lato3 = scanner.nextDouble();
        System.out.println(perimetroTriangolo(lato1, lato2, lato3));
    }
}
