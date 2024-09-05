package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gitar.bunyi();

        Mobil.tampillkanJumlahBan();
        Motor.tampilkanJumlahBan();
        Kereta.tampilkanJumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok hari = " + tomorrow);

        // STRING
        String greeting = "Hello World!";
        System.out.println(greeting);

        // array string
        char[] dicodingChars = { 'd', 'i', 'c', 'o', 'd', 'i', 'n', 'g' };
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);

        // mengetahui panjang string
        String dicoding = "dicoding";
        int length = dicoding.length();
        System.out.println(length);

        // mengambil karakter string
        char result = dicoding.charAt(7);
        System.out.println(result);
    }
}