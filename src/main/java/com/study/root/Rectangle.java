package com.study.root;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

import java.math.MathContext;

/**
 * Created by dzzm1214 on 30.03.2017.
 */
public class Rectangle {
    public static void main(String[] args) {
        double x, y;
        y = 3;
        x = 3.7;
        Perimetr(x, y);
        Square(x, y);
        return;
    }

    public static void Perimetr(double x, double y) {

        double z = (x + y) * 2;
        System.out.println("Периметр 4-х угольника = " + z);

    }

    public static void Square(double x, double y) {
        double s = (x * y);
        System.out.println("Площадь 4-х угольника = " + s);
    }
}
