package com.bl.exception;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMoodAnalyzer {
    private static MoodAnalyzer analyzer;

    @Before
    public void createObj() {

        analyzer = new MoodAnalyzer();
    }

    @Test
    public void analyzeMoodSad_thenSad() {

        Assert.assertEquals("Sad", analyzer.analyseMood("I am in Sad Mood"));

    }

    @Test
    public void analyzeMoodAny_thenHappy() {

        Assert.assertEquals("Happy", analyzer.analyseMood("I am in Any Mood"));

    }
}
