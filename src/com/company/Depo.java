package com.company;

import java.util.Scanner;

public class Depo {

    public void calcDep() {
        final double vidsotok = vidsotkovaStavka();
        final double kilkistRokiv = kilkistRokiv();

        vurahovuvannya(kilkistRokiv, sumDepozuta(), vidsotok);
    }

    private double kilkistRokiv() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість років : ");
        return scan.nextDouble();
    }

    private double sumDepozuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть суму депозиту : ");
        return scan.nextDouble();
    }

    private double vidsotkovaStavka() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть відсоткову ставку : ");
        return scan.nextDouble();
    }

    public void vurahovuvannya(double kilkistRokiv, double sumaDepozuta, double vidsotkovaStavka) {
        final int rikVklady = 2021;
        double balans = 0;
        for (int rik = rikVklady; rik < (rikVklady + kilkistRokiv); rik++) {
            final double yearSum = (sumaDepozuta + balans) * vidsotkovaStavka;
            balans += yearSum;
            System.out.println("vash yearSum = " + yearSum);
        }
        System.out.println("vash balans = " + balans);
    }
}
