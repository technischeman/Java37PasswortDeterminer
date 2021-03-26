package PasswortDeterminer;

import java.util.Scanner;

public class passwort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write a password: ");
        String passwort = input.next();

        boolean isRight;
        if (passwort.length() > 10) {
            isRight = true;
        } else isRight = false;


        for (int i = 0; i < passwort.length(); i++) {
            char[] passarr = passwort.toCharArray();
            char karakter = passarr[i];
            if (Character.isAlphabetic(Character.valueOf(karakter)) || (Character.isDigit(Character.valueOf(karakter)))) {
            } else {
                System.out.println("wrong passwort because of different character please try again");
                return;
            }

        }
        boolean isRightig2 = true;

        int counter = 0;
        for (int i = 0; i < passwort.length(); i++) {
            char[] passarr = passwort.toCharArray();
            char karakter = passarr[i];
            if (Character.isDigit(karakter)) {
                counter++;
            }
        }
        boolean isRight3;
        if (counter < 3) {
            isRight3 = true;
        } else isRight3 = false;


        if (isRight & isRightig2 & isRight3) {
            System.out.println("valid");
        } else System.out.println("not valid");


    }
}



