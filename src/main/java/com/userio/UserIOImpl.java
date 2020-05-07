package com.userio;

import java.util.Scanner;

public class UserIOImpl implements UserIO {
    private static Scanner ui = new Scanner(System.in);
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        String answer = "";
        try {
            System.out.println(prompt);
            answer = ui.nextLine();

        } catch (Exception ex) {
            System.out.println("Something wrong");
        }
        return answer;
    }

    @Override
    public int readInt(String prompt) {
        int result = 0;

        System.out.print(prompt);
        try {
            result = ui.nextInt();
        } catch (Exception ex) {
            System.out.println("Invalid Input");
        }
        return result;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        int result = min - 1;
        boolean valid = false;

        System.out.print(prompt);
        try {
            do {
                result = ui.nextInt();
                if(result >= min && result <= max) {
                    valid = true;
                } else {
                    System.out.println("Invalid Input. Please try again.");
                }
            } while(!valid);
        } catch (Exception ex) {
            System.out.println("Invalid Input");
        }
        return result;
    }

    @Override
    public double readDouble(String prompt) {
        double result = 0;

        System.out.print(prompt);
        try {
            result = ui.nextDouble();
        } catch (Exception ex) {
            System.out.println("Invalid Input");
        }
        return result;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double result = min - 1;
        boolean valid = false;

        System.out.print(prompt);
        try {
            do {
                result = ui.nextDouble();
                if(result >= min && result <= max) {
                    valid = true;
                } else {
                    System.out.println("Invalid Input. Please try again.");
                }
            } while(!valid);
        } catch (Exception ex) {
            System.out.println("Invalid Input");
        }
        return result;
    }

    @Override
    public float readFloat(String prompt) {
        float result = 0;

        System.out.print(prompt);
        try {
            result = ui.nextFloat();
        } catch (Exception ex) {
            System.out.println("Invalid Input");
        }
        return result;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float result = min - 1f;
        boolean valid = false;

        System.out.print(prompt);
        try {
            do {
                result = ui.nextFloat();
                if(result >= min && result <= max) {
                    valid = true;
                } else {
                    System.out.println("Invalid Input. Please try again.");
                }
            } while(!valid);
        } catch (Exception ex) {
            System.out.println("Invalid Input");
        }
        return result;
    }

    @Override
    public long readLong(String prompt) {
        long result = 0;

        System.out.print(prompt);
        try {
            result = ui.nextLong();
        } catch (Exception ex) {
            System.out.println("Invalid Input");
        }
        return result;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long result = min - 1L;
        boolean valid = false;

        System.out.print(prompt);
        try {
            do {
                result = ui.nextLong();
                if(result >= min && result <= max) {
                    valid = true;
                } else {
                    System.out.println("Invalid Input. Please try again.");
                }
            } while(!valid);
        } catch (Exception ex) {
            System.out.println("Invalid Input");
        }
        return result;
    }
}
