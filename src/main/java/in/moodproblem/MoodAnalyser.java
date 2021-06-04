package in.moodproblem;

public class MoodAnalyser {

    String message;
    public MoodAnalyser() {
    }

    MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyserMood() {
        if (message.contains(("sad"))) {
            return "SAD";
        }else {
            return "HAPPY";
        }
    }
}
