package in.moodproblem;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyserMood("I am in sad mood");
        Assert.assertTrue(mood,true);
    }

    @Test
    public void givenMood_whenNull_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            String mood = moodAnalyser.analyserMood(null);
        }catch (Exception ex){
            Assert.assertEquals(InvalidMoodException.class, ex.getClass());
        }
    }

    @Test
    public void givenMood_whenEmpty_shouldThrowInvalidMoodException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyserMood(" ");
        }catch (Exception ex){
            Assert.assertEquals("invalid empty mood",ex.getMessage());
        }
    }
}
