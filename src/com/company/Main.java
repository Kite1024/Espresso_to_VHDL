package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter line to convert: ");
        BufferedReader readIn = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String input = "";

        try {
            input = readIn.readLine();
            input = input.replaceAll("\\s", "");
            input = input.replaceAll("\\|", " OR ");
            input = input.replaceAll("\\&", " AND ");
            input = input.replaceAll("!(\\w*)\\s", "(NOT $1) ");
			input = input.replaceAll("!(\\w*)[\\&\\|\\)]", "(NOT $1)");
			System.out.println(input);
        } catch (Exception e) {
        	e.printStackTrace();
		}
    }
}
