package in.moodproblem;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyserMood();
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }

    @Test
    public void testMoodAnalysis1() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        String mood = moodAnalyser.analyserMood();
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
}
