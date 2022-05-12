package com.bl.exception;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzer {

    @Test
    public void analyzeMoodSad() {

        MoodAnalyzer analyzer = new MoodAnalyzer();

        Assert.assertEquals("Sad",analyzer.analyseMood("I am in Sad Mood"));

    }
}
