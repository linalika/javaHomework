package lesson4;

import java.util.Random;

public class Passports {
    public static void main(String[] args) {
        Integer[] passports = new Integer[50];

        Random r = new Random();
        for (int i = 0; i < passports.length; i++) {
            passports[i] = r.nextInt(999) + 11;
        }

        Integer[] newPassports = new Integer[51];
        System.arraycopy(passports,0,newPassports,0,passports.length);
        passports = newPassports;
        newPassports = null;

    }
}
