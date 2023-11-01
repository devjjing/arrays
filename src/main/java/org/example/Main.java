package org.example;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Florian";
        names[1] = "Bastian";
        names[2] = "Maximilian";
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[0]);

        int[] kontoAuszug = new int[8];

        kontoAuszug[0] = 120;
        kontoAuszug[1] = 130;
        kontoAuszug[2] = 115;
        kontoAuszug[3] = 100;
        kontoAuszug[4] = 105;
        kontoAuszug[5] = 125;
        kontoAuszug[6] = 165;
        kontoAuszug[7] = 150;


        for (int i = 0; i < 10; i++) {
            System.out.println("Geld" + " " + kontoAuszug);
        }
        for (int i = 0; i < kontoAuszug.length; i++) {
            System.out.println(kontoAuszug[i]);
        }
    }
}
