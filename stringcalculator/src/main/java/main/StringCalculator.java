package main;

import java.util.ArrayList;
import java.util.List;

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
    private static String elvalaszto=",";
    public static int add(String numbers) throws Exception
    {
        int osszeg = 0;
        String negativ="";
        String[] szamok=numbers.split(elvalaszto);
        for (String szamok1 : szamok) {     
            if(!szamok1.isEmpty()){
                osszeg+=Integer.parseInt(szamok1);
                if(Integer.parseInt(szamok1)<0)negativ+=szamok1+",";
            }else
                osszeg+=0;
        }
        if(!negativ.isEmpty())
            throw new Exception("“Negatives not allowed: "+negativ);
        return osszeg;
    }

    public static String getElvalaszto() {
        return elvalaszto;
    }

    public static void setElvalaszto(String elvalaszto) {
        StringCalculator.elvalaszto = elvalaszto;
    }
    
}
