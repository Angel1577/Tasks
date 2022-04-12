package com.company;

import java.util.Scanner;

public class Task1 {
    public interface InterfaceString {
        String getString(String s1, String s2);
    }
}
class T {
    public static void main(String[] args) {
        Task1.InterfaceString obj = (String string1, String string2) -> {
            if (string1.length() > string2.length())
                return string1;
            else
                return string2;
        };

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        String result = obj.getString(s1, s2);
        System.out.println(result);
    }
}