package javaapplication11;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.subtract(b);

        System.out.println(c.toString());
    }
}
