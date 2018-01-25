package com.java21days;

public class Weather {
    public static void main(String[] arguments) {
        float fah = 86;
        System.out.println(fah + " stopni Fahrenheita to ...");
        //Aby skonwertować temperaturę  ze stopni Fahrenheita
        // na stopnie Celcjusza rozpocznij od odjęcia 32
        fah = fah - 32;
        //Podziel wynik przez 9
        fah = fah / 9;
        //pomnóż wynik przez 5;
        fah = fah * 5;
        System.out.println(fah + " stopni Celcjusza\n");
        
        float cel = 33;
        System.out.println(cel + " stopnie Celcjusza to ...");
        //Aby skonwertować temperaturę ze stopni Celcjusza
        //na stopnie Fahrenheita, rozpocznij od pomnożenia przez 9
        cel = cel * 9;
        //Podziel odpowiedz przez 5
        cel = cel / 5;
        //Dodaj do odpowiedzi 32
        cel = cel + 32;
        System.out.println(cel + " stopni Fahrenheita");
    }
}