package com.bl.exception;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        this.message = message;

    }

    public String analyseMood() {

        String a;

            if (message.contains("Sad"))
                a = "Sad";

            else
                a =  "Happy";

        System.out.println(a);
        return a ;

    }

    public static void main(String[] args) {

        MoodAnalyzer analyzer = new MoodAnalyzer("Mood is Happy");
        analyzer.analyseMood();

    }
}
