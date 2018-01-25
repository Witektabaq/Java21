package com.java21days;


class HalfDollars {
    public static void main(String[] arguments) {
        int[] denver = { 1_700_000, 4_600_000, 2_100_000};
        int[] philadelfia = new int[denver.length];
        int[] total = new int[denver.length];
        int average;
        
        philadelfia[0] = 1_800_000;
        philadelfia[1] = 5_000_000;
        philadelfia[2] = 2_500_000;
        
        total[0] = denver[0] + philadelfia[0];
        total[1] = denver[1] + philadelfia[1];
        total[2] = denver[2] + philadelfia[2];
        average = (total[0] + total[1] + total[3]);
        
        System.out.println("Produkcja w 2012: ");
        System.out.format("%,d%n", total[0]);
        System.out.println("Produkcja w 2013: ");
        System.out.format("%,d%n", total[1]);
        System.out.println("Produkcja w 2014: ");
        System.out.format("%,d%n", total[2]);
        System.out.println("Średnia produkcja: ");
        System.out.format("%,d%n", average);
       
    }
}