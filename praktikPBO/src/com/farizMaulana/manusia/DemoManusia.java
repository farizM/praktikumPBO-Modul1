package com.farizMaulana.manusia;

//main class
public class DemoManusia {
    public static void main(String[] args) {
        //array of object
        Manusia arrayMahasiswa[] = new Manusia[3];

        //constructor pertama
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Jean");
        manusia1.setUmur(20);

        //constructor kedua
        Manusia manusia2 = new Manusia("Fischl");

        //constructor ketiga
        Manusia manusia3 = new Manusia("Barbara", 18);

        arrayMahasiswa[0] = manusia1;
        arrayMahasiswa[1] = manusia2;
        arrayMahasiswa[2] = manusia3;

        for (Manusia x :arrayMahasiswa) {
            System.out.println("Character");
            System.out.println("Nama\t: "+ x.getNama());
            System.out.println("Umur\t: "+ x.getUmur());
            System.out.println();
        }
    }
}
