package org.example;


import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        String table = new TableBuilder().buildHtmlTable();
        System.out.println(table);
    }
}