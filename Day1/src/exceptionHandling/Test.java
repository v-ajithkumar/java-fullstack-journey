package exceptionHandling;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            print();
        } catch (IOException e) {
            System.out.println("Exception handled");
        }
    }

    public static void print() throws IOException {
        throw new IOException();
    }
}
