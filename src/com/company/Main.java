package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("hi");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("vvedi kol-vo chisel:");
//        int kolvo = scanner.nextInt();
//        String[] num = new String[kolvo];
//        System.out.println("vvedi chisla:");
//        for (int i = 0; i < kolvo; i++) {
//            num[i] = scanner.next();
//        }
//        int min = num[0].length();
//        int max = 0;
//        for (String val : num) {
//            if (val.length() > max) max = val.length();
//            else if (val.length() < min) min = val.length();
//        }
//        for (int i = 0; i < num.length; i++) {
//            if (num[i].length() == max)
//                System.out.println("Max number is " + num[i] + " his length " + num[i].length());
//            else if (num[i].length() == min)
//                System.out.println("Min number is " + num[i] + " his length " + num[i].length());
//        }

        System.out.println("hi");
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedi kol-vo chisel:");
        int kolvo = scanner.nextInt();
        String[] num = new String[kolvo];
        System.out.println("vvedi chisla:");
        for (int i = 0; i < kolvo; i++) {
            num[i] = scanner.next();
        }
        for (int i = num.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (num[j].length() > num[j + 1].length()) {
                    String tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }

            }

        }
        System.out.println("print min to max? (y/n)");

        String str1 = "y";
        String str2 = "n";
        while (true) {
            String str = scanner.next();

            if (str.equals(str1))
                for (int i = 0; i < num.length; i++) {
                    System.out.println(num[i]);
                    break;
                }
            if (str.equals(str2))
                for (int i = num.length - 1; i >= 0; i--) {
                    System.out.println(num[i]);
                    break;
                }


        else System.out.println("try again (y/n)");
        }


    }


}
