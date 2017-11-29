package com.company;

import java.util.*;

public class Tester
{
    public static void main(String args[]) {
        String t1 = cat(68, 108);
        System.out.println(t1);

        String t2 = cat(35, 59);
        System.out.println(t2);


        StringBuffer conc = new StringBuffer();
        conc.append(t1);
        conc.append(t2);

        String fullString = conc.toString();
        System.out.println(fullString);
    }

    //Enter this method with a starting ASCII code(start) and an ending ASCII code(end).
//Return a String that is the concatenation of all the characters represented
//by the continuous range of ASCII codes, start through end.



    private static String cat(int start, int end){




    }
}