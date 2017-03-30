package com.study.root;

/**
 * Created by dzzm1214 on 29.03.2017.
 */
public class Count {

    public static final double ONE_METER = 39.37;

    public static void main(String[] args) {

        double m;
        int count;
        count = 0;

        for (int d = 1; d <= 100; d++) {

            m = d / ONE_METER;

            System.out.println(d + " Дюймов" + " = " + m + " Meters");

            count++;
            if (count == 11) {
                double f = d / 12;
                System.out.println(f + "Футов");
                count = 0;
            }

        }
    }
}



