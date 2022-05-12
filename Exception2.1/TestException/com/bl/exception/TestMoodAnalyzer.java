package com.bl.exception;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzer {

    @Test
    public void analyzeMoodSad_thenSad() {

        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Sad Mood");
        Assert.assertEquals("Sad", analyzer.analyseMood());

    }

    @Test
    public void analyzeMoodAny_thenHappy() {

        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Any Mood");
        Assert.assertEquals("Happy", analyzer.analyseMood());

    }

    @Test
    public void analyzeMoodNull_thenHappy() {

        try {

            MoodAnalyzer analyzer = new MoodAnalyzer(null);
            Assert.assertNotEquals("Happy", analyzer.analyseMood());
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Happy");
        }
    }
}
