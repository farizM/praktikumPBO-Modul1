package com.farizMaulana.modul1;
//main class / demo class
public class Objek {
    public static void main(String[] args) {
        //deklarsi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        //isi data variable dengan setter
        mahasiswaTanpa.setNama("Fariz");
        mahasiswaTanpa.setNim(19104035);

        //output dengan getter
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("nim\t\t: " + mahasiswaTanpa.getNim());

        //deklarasi method baru dengan parameter yang telah di isi
        Mahasiswa mahasiswa = new Mahasiswa("paimon", 902983);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());
    }
}
