import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public Regex(String text) {
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        Pattern pattern = Pattern.compile("^[0-2][0-9]:[0-5][0-9]");
        for(String word : words){
            Matcher matcher = pattern.matcher(word);
            if(matcher.matches())
                System.out.println(word);
        }
    }
}

