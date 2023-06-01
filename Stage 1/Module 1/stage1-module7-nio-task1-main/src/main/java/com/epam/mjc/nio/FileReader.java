package com.epam.mjc.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(file))) {
            String name = br.readLine().split(" ")[1].trim();
            int age = parseIntNumericString(br.readLine().split(" ")[1].trim());
            String email = br.readLine().split(" ")[1].trim();
            Long phone = parseLongNumericString(br.readLine().split(" ")[1].trim());
            return new Profile(name, age, email, phone);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Profile();
    }

    private int parseIntNumericString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    private Long parseLongNumericString(String number) {
        try {
            return Long.parseLong(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return null;
    }
}
