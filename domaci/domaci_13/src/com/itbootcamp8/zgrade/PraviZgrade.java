package com.itbootcamp8.zgrade;

import java.util.Scanner;

public class PraviZgrade {
    public static void main(String[] args) {
        Zgrada a = new Zgrada("Matije Gubca", 3, 20, 5);
        a.setStanari();
        System.out.println(a.getStanari());
        System.out.println(a.getSpratnost());
    }
}
