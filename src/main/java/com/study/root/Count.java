package com.study.root;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;
import javafx.scene.effect.Light;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by dzzm1214 on 29.03.2017.
 */
public class Count {
    public static void main(String[] args)
    {
        double num,sroot,rerr;


        for (num =1.0; num<100.0; num++) {
            sroot = Math.sqrt(num);
        System.out.println("Square root of " + num + " is " +  sroot);
        rerr = num - (sroot * sroot);
        System.out.println("error id " + rerr);
        System.out.println();

    }
    }
}




