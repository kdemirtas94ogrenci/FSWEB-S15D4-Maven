package org.example;


public class Main {
    public static void main(String[] args) {


    }
    public static boolean checkForPalindrome(String input) {
        String yeni = "";

        for (int i = 0; i < input.length(); i++) {
            char karakter = input.charAt(i);

            if (Character.isLetterOrDigit(karakter)) {
                yeni += Character.toLowerCase(karakter);
            }
        }

        String ters = "";
        for (int i = yeni.length() - 1; i >= 0; i--) {
            ters = ters + yeni.charAt(i);
        }

        if (yeni.equals(ters)) {
            return true;
        } else {
            return false;
        }
    }

public static String convertDecimalToBinary(int input) {
    if (input == 0) {
        return "0";
    }

    String binary = "";

    int sayi = input;

    while (sayi > 0) {
        int kalan = sayi % 2;
        binary = kalan + binary;
        sayi = sayi / 2;
    }

    return binary;
}

}






