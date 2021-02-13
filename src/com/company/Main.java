package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double depozit = sumDepozuta();
       final double vidsotok = vidsotkovaStavka();
       final double kilkistRokiv = kilkistRokiv();



    }
    public static double kilkistRokiv (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість років : ");
        return scan.nextDouble();
    }
    public static double sumDepozuta (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть суму депозиту : ");
        return scan.nextDouble();
    }
    public static double vidsotkovaStavka (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть відсоткову ставку : ");
        return scan.nextDouble();
    }
    public static void vurahovuvannya (double kilkistRokiv) {
        final int rikVklady = 2021;
        double balans = 0;
        for (int rik = rikVklady; rik <= (rikVklady + kilkistRokiv); rik++) {
            balans = sumDepozuta() * Math.pow(1 + vidsotkovaStavka(), (rik - kilkistRokiv + 1));
        }
        System.out.println("vash balans" + balans);

    }
    }


