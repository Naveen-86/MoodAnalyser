package in.moodproblem;

public class MoodAnalyser {

    public String analyserMood(String message) {
        try {
            if (message.replaceAll(" ","").length() < 1){
                throw new InvalidMoodException("invalid empty mood");
            }
            if (message.contains(("sad"))) {
                return "SAD";
            }
        } catch (NullPointerException ex){
            throw new InvalidMoodException("invalid null Mood");
        }
        return "HAPPY";
    }
}
