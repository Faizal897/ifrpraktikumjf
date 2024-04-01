/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author FX504GE a.k.a. Imam FR
Java Developer
Created on 01/04/2024 5:39 AM
@Last Modified 01/04/2024 5:39 AM
Version 1.0
*/

package com.juaracoding.ifrpraktikumjf;

public class ClassA {
    public static void main(String[] args) {
        ClassB angkaBaru = new ClassB();

        angkaBaru.btAngka = 127;
        angkaBaru.shortAngka = 32767;
        angkaBaru.intAngka = 2147483647;
        angkaBaru.longAngka = 9223372036854775807L;
        angkaBaru.floatAngka = 3.4E38F;
        angkaBaru.doubleAngka = 1.7E308D;


        long longPenjumlahan = angkaBaru.longAngka + angkaBaru.intAngka;
        short shortPengurangan = (short) (angkaBaru.btAngka - angkaBaru.shortAngka);
        double doublePerkalian = angkaBaru.intAngka * angkaBaru.btAngka;
        double doublePembagian = angkaBaru.doubleAngka / angkaBaru.floatAngka;
        int intDivide = angkaBaru.intAngka % angkaBaru.shortAngka;

        System.out.println(longPenjumlahan);
        System.out.println(shortPengurangan);
        System.out.println(doublePerkalian);
        System.out.println(doublePembagian);
        System.out.println(intDivide);

    }
}
