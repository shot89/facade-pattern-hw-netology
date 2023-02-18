package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();

        System.out.println(binOps.sum("11", "101"));
        System.out.println(binOps.mult("11", "101"));
        System.out.println(binOps.sum("as", "12"));
    }
}