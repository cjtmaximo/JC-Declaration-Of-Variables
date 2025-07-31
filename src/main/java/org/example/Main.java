package org.example;

public class Main {
    // Static variables
    static int staticHex = 0x1A2B;
    static byte staticByte = 1;
    static String staticString = "Progress, not perfection.";

    // Instance variables
    int instanceBinary = 0b0010_1101;
    int instanceOctal = 072;
    double instanceDouble = 1234.95;

    // Method with local variables
    public void method() {
        int localDecimal = 100;
        int localHex = 0xFF;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 10_000_000L;
        String localString = "Every step I take gets me closer to my goal.";

        System.out.println("localDecimal = " + localDecimal);
        System.out.println("localHex = " + localHex);
        System.out.println("localBinary = " + localBinary);
        System.out.println("localOctal = " + localOctal);
        System.out.println("localLong = " + localLong);
        System.out.println("localString = "+ localString);
        System.out.println();
    }

    public static void main(String[] args) {
        Main main = new Main();

        // Print local variables
        System.out.println("Local Variables:");
        main.method();

        // Print instance variables
        System.out.println("Instance Variables:");
        System.out.println("instanceBinary = " + main.instanceBinary);
        System.out.println("instanceOctal = " + main.instanceOctal);
        System.out.println("instanceDouble = " + main.instanceDouble);
        System.out.println();

        // Print static variables
        System.out.println("Static Variables:");
        System.out.println("staticHex = " + staticHex);
        System.out.println("staticByte = " + staticByte);
        System.out.println("staticString = " + staticString);
    }
}