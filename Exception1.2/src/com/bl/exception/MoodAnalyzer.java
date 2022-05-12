package com.bl.exception;

public class MoodAnalyzer {

    public String analyseMood(String message) {

        String a;

            if (message.contains("Sad"))
                a = "Sad";

            else
                a =  "Happy";

        System.out.println(a);
        return a ;

    }

    public static void main(String[] args) {

        MoodAnalyzer analyzer = new MoodAnalyzer();
        analyzer.analyseMood("Mood is Happy");

    }
}
