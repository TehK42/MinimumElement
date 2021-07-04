package com.tehk42;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        MinimumElement.readIntegers(count);
    }
}
