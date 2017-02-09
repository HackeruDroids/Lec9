package edu.tomer;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String bookName = "Gone with the wind";
        boolean startsWithGone = bookName.toLowerCase().startsWith("gone".toLowerCase());
    }


    static void wrapperClasses(){
        Integer x = 10;
        double dbl = x.doubleValue();

        String s = String.valueOf(10.0);

        String num = "10.1";
        Double aDouble = Double.valueOf(num);
        Integer integer = Integer.valueOf("10");
    }

    static void older() {
        int x = 10;
        boolean b;
        char c;
        Scanner scan = new Scanner("Hello, world");
        scan.useDelimiter(",");
        System.out.println(scan.next());
        System.out.println(scan.next());
        String s = "String literal";
        double cos = Math.cos(20);
        int anInt = IO.getInt("Enter a number:");

        Employee employee = new Employee();
        employee.print();
    }
}
