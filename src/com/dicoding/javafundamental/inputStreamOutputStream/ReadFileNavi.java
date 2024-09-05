package com.dicoding.javafundamental.inputStreamOutputStream;

import java.io.File;

public class ReadFileNavi  {
    public static void main(String args[]) {
        String dirname = "/java/latihan1";
        File file = null;
        String[] paths;
        try {
            // Instansiasi objek File
            file = new File(dirname);
            // Ambil list files dan masukkan ke string paths
            paths = file.list();
            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
