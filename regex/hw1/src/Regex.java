import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
{
    public Regex(String text) {

        Pattern pattern =Pattern.compile("\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)");
        Matcher matcher= pattern.matcher(text);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}

