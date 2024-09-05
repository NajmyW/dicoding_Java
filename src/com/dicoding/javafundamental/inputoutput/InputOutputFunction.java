package com.dicoding.javafundamental.inputoutput;
import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukan Angka Pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : "+result);
    }
}
