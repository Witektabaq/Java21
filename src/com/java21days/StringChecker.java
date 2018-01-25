package com.java21days;

class StringChecker {
    
    public static void main(String[] args) {
        
        int accontBalance = 23467890;
        double pi = Math.PI;
        
        String str = "Lannister zawsze spłaca swoje długi.";
        System.out.println("Tekst to: " + str);
        System.out.println("Długość tekstu:" + str.length());
        System.out.println("Znak na pozycji 6.: " + str.charAt(6));
        System.out.println("Fragment od znaku 10. do 16.: " + str.substring(10, 16));
        System.out.println("Indeks pierwszej litery 't': " + str.indexOf('t'));
        System.out.println("Indeks początku podtekstu " + "\"długi\": " + str.indexOf("długi"));
        System.out.println("Tekst zapisany wielkimi literami: " + str.toUpperCase());
        System.out.format("Saldo: %,d zł%n", accontBalance );
        System.out.format("%.10f%n", pi);
    }
}