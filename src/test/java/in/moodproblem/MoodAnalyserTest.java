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
        String mood = moodAnalyser.analyserMood(null);
        Assert.assertEquals("HAPPY",mood);
    }
}
