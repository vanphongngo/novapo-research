import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
  public static void main(String[] args) {
    String regexPattern = "m[^uk]c";
    String inputString = "This mac mbc muc mkc is an example sentence. Another example is here.";

    Pattern pattern = Pattern.compile(regexPattern);
    Matcher matcher = pattern.matcher(inputString);

    while (matcher.find()) {
      String match = matcher.group();
      System.out.println("Match found: " + match);
    }
  }
}