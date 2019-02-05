package com.arun;

import java.util.ArrayList;
import java.util.List;

public class StringEnhancements {

    public static void main(String args[]) {
        StringEnhancements se = new StringEnhancements();
        System.out.println(se.format("What is orange and sounds like a Parrot?", "Carrot"));
        System.out.println(se.format("What has a face and two hands but no arms or legs?", "A Clcck"));
        System.out.println(se.format("What five-letter word becomes shorter when you add two letters to it?", "Short"));

        //isBlank
        System.out.println("   ".isBlank());

        //stripWhiteSpaces
        System.out.println("    Strip all spaces    ".strip());
        System.out.println("    Strip leading spaces    ".stripLeading());
        System.out.println("    Strip trailing spaces    ".stripTrailing());

        //Stream multiple lines
        String testString = "This\nis\njava11\nstreaming\nlines";
        List<String> lines = new ArrayList<>();
        testString.lines().forEach(line -> lines.add(line));
        lines.forEach(System.out::println);
    }

    private String format(String title, String value) {
        return title + ".".repeat(80 - title.length()
                - value.length()) + value;
    }


}
