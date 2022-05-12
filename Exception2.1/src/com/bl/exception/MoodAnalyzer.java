package com.bl.exception;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        this.message = message;

    }

    public String analyseMood() {

        String a = null;
        try {

            if (message.contains("Sad"))
                a = "Sad";

            else
                a = "Happy";
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println(a);
        return a ;

    }

    public static void main(String[] args) {

        MoodAnalyzer analyzer = new MoodAnalyzer(null);
        analyzer.analyseMood();

    }
}
