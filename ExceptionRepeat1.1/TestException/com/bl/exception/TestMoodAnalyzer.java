package com.bl.exception;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzer {

    @Test
    public void analyzeMoodSad_thenSad() {

        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Sad Mood");
        Assert.assertEquals("Sad", analyzer.analyseMood());

    }

}
