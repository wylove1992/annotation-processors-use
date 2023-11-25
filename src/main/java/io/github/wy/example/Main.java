package io.github.wy.example;

import io.github.wy.example.tables.PersonTable;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author rycat
 * @since 2023/11/25
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("running");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (PrintWriter out = new PrintWriter(buffer)) {
            out.println("hello world!!");
            out.println("hello world!!");
            out.println("hello world!!");
            out.println("hello world!!");
        }
        String s = buffer.toString();
        System.out.println(s);
    }
}
