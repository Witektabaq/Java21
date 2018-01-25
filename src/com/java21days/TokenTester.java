package com.java21days;

import java.util.StringTokenizer;

class TokenTester {
    
    public static void main(String[] arguments) {
      //  StringTokenizer st1, st2;
        String quote1 = "GOOG 530,80  -9,98 wd tre 54 n,g c doim n73    wed";
        StringTokenizer st1 = new StringTokenizer(quote1);
         while (st1.hasMoreTokens()) {
         System.out.println(st1.nextToken());
     }
       // System.out.println("Token 1: " + st1.nextToken());
       // System.out.println("Token 2: " + st1.nextToken());
      //  System.out.println("Token 3: " + st1.nextToken());
       // System.out.println("Token 4: " + st1.nextToken());
       // System.out.println("Token 5: " + st1.nextToken());
       // System.out.println("Token 6: " + st1.nextToken());
       // System.out.println("Token 7: " + st1.nextToken());
        
        String quote2 = "RHT 75,00 0,22 MA@ 67 bb";
        StringTokenizer st2 = new StringTokenizer(quote2, "@");
        System.out.println("\nToken 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        /*System.out.println("Token 3: " + st2.nextToken());
        System.out.println("Token 4: " + st2.nextToken());
        System.out.println("Token 5: " + st2.nextToken());
        System.out.println("Token 6: " + st2.nextToken());*/
        
        
         }   
    }