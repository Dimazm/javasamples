package com.study.root;

/**
 * Created by dzzm1214 on 29.03.2017.
 */
public class Count {
    public static void main(String[] args) {

        double m;
        int d;
        int count;
        count = 0;

        for (d = 1; d <= 100; d++) {
            m = d / 39.37;
            System.out.println(d + " Дюймов" + " = " + m + " Meters");

            count++;
            if (count == 12)
            {
                System.out.println();

            count = 0;}

        }
    }
}



