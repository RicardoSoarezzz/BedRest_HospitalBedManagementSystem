package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        String table = new TableBuilder().buildUserTable();
        System.out.println(table);
    }
}