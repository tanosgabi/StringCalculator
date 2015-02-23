package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gábor
 */
public class StringCalculator {
    public static int add(String numbers)
    {
        int osszeg = 0;
        if(numbers.isEmpty())
            osszeg=0;
        else
        {
            String[] szamok=numbers.split(",");
            for (String szamok1 : szamok) {
                osszeg+=Integer.parseInt(szamok1);
            }
        }
        return osszeg;
    }
}
