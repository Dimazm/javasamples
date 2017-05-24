package com.study.root;

import com.study.root.exs1_square.Rectangle_1;
import com.study.root.exs2_moon.Moon;
import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.Scanner;

/**
 * Hello world!
 */
class App {
    public static void main(String[] args) {

     Moon m = new Moon();
        double v = m.moonW(85);
        Rectangle_1 s = new Rectangle_1();
        int q = s.rectangleS(10,5);


        System.out.println("Масса тела на Луне = "  + v);
        System.out.println("Площадь прямоуголтьника = " + q);
    }
}
