package com.farizMaulana.pass;

public class TestPass {
    int nomor1;
    int nomor2;

    public TestPass(int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    //pass by value, parameter berupa tipe data primitive
    public void calculate(int n, int m){
        m = m* 10;
        n  = n/2;
    }

    //pass by reference, parameter berupa tipe data class
    public void calculate(TestPass pass){
        pass.nomor1 = pass.nomor1 * 10;
        pass.nomor2 = pass.nomor2 / 2;
    }
}
