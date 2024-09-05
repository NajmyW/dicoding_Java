package com.dicoding.javafundamental.vokalkonsonan;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        String word = "";
        int vocal = 0;
        int konsonan = 0;

        System.out.print("Masukan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();
        //memanggil prosedur yang mengembalikan nilai int
        vocal = num_vocal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vokal : " +vocal);
        System.out.println("Jumlah huruf konsonan : " +konsonan);
    }

    private static int num_vocal(String word){
        int i;
        int jumlah_vocal = 0;

        for (i=0; i < word.length(); i++){
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jumlah_vocal++;
            }
        }
        return jumlah_vocal;
    }

    private static int num_konsonan(String word) {
        int i;
        int jumlah_konsonan = 0;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o' && word.charAt(i) != ' ') {
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }
}
