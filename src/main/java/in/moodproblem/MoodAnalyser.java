package in.moodproblem;

public class MoodAnalyser {

    public String analyserMood(String message) {
        try {
            if (message.contains(("sad"))) {
                return "SAD";
            }
        } catch (NullPointerException ex){
                return "HAPPY";
        }
        return "HAPPY";
    }
}
