package com.userio;

import java.util.Scanner;

public class UserIOImpl implements UserIO {
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        String out = scan.nextLine();
        return out;
    }

    @Override
    public int readInt(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        int out = scan.nextInt();
        return out;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        Scanner scan = new Scanner(System.in);
        int out = 0;
        do {
            System.out.println(prompt);
            out = scan.nextInt();
        } while(out < min || out > max);
        return out;
    }

    @Override
    public double readDouble(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        double out = scan.nextDouble();
        return out;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        Scanner scan = new Scanner(System.in);
        double out = 0;
        do {
            System.out.println(prompt);
            out = scan.nextDouble();
        } while(out < min || out > max);
        return out;
    }

    @Override
    public float readFloat(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        float out = scan.nextFloat();
        return out;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        Scanner scan = new Scanner(System.in);
        float out = 0;
        do {
            System.out.println(prompt);
            out = scan.nextFloat();
        } while(out < min || out > max);
        return out;
    }

    @Override
    public long readLong(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        long out = scan.nextLong();
        return out;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        Scanner scan = new Scanner(System.in);
        long out = 0;
        do {
            System.out.println(prompt);
            out = scan.nextLong();
        } while(out < min || out > max);
        return out;
    }
}
