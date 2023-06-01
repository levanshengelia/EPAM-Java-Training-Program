package com.epam.mjc.io;

import java.io.*;

public class FileReader {

    public Profile getDataFromFile(File file) {
        String content = getContent(file);
        String[] lines = content.split("\n");
        String name = lines[0].split(" ")[1].trim();
        int age = parseIntNumericString(lines[1].split(" ")[1].trim());
        String email = lines[2].split(" ")[1].trim();
        Long phone = parseLongNumericString(lines[3].split(" ")[1].trim());
        return new Profile(name, age, email, phone);
    }

    private Long parseLongNumericString(String number) {
        try {
            return Long.parseLong(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return null;
    }

    private int parseIntNumericString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }


    private String getContent(File file) {
        try (FileInputStream fis = new FileInputStream(file)) {
            String content = "";
            int c;
            while ((c = fis.read()) != -1) {
                content += (char) c;
            }
            return content;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
        return "";
    }
}
