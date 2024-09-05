package com.dicoding.javafundamental.accessmodifier.package2;
import com.dicoding.javafundamental.accessmodifier.package1.kelasA;

public class kelasB extends kelasA {

protected void methodC() {
    super.methodC();
    System.out.println("Contoh pemanggilan protected dari package luar");
}
}
