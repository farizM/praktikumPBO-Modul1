package com.farizMaulana.pass;

public class Passed {
    public static void main(String[] args) {
        int nomor1, nomor2;
        TestPass pass = new TestPass(50, 100);
        nomor1 =  10;
        nomor2 = 20;

        //passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("nomor1 = "+nomor1);
        System.out.println("nomor2 = "+nomor2);


        pass.calculate(nomor1, nomor2);
        System.out.println("Nilai sesudah passed by value: ");
        System.out.println("nomor1 = "+nomor1);
        System.out.println("nomor2 = "+nomor2);

        System.out.println();
        //passed by reference
        System.out.println("Nilai sebelum passed by reference: ");
        System.out.println("nomor1 = " + pass.nomor1);
        System.out.println("nomor2 = " + pass.nomor2);

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by reference: ");
        System.out.println("nomor1 = " + pass.nomor1);
        System.out.println("nomor2 = " + pass.nomor2);
    }
}
