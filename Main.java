package com.company;


class Games {
    String nama;
    int size;
    String spek;

}

public class Main {


    public static void main(String[] args) {
	Games games1 = new Games();
    games1.nama = "Fifa 22";
    games1.size = 40 ;
    games1.spek = "Intel Core Pentium, 4gb Ram";


        System.out.println(" Nama Game " + games1.nama);
        System.out.println(" Ukuran " + games1.size + " Gb");
        System.out.println(" Minimum Spek " + games1.spek);
    }
}
