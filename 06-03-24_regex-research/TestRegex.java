import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {


  public static void main(String[] args) {

    String filePath = "./regex-doc.txt";
    Map<String, String> keyValueMap = new HashMap<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] parts = line.split("\\|");
        if (parts.length >= 3) {
          String value = parts[0].trim().substring(3, parts[0].trim().length() - 3);
          String key = parts[1].trim();
          keyValueMap.put(key, value);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Print the key-value pairs

    String regexPattern = keyValueMap.get("basic-matches");

    String inputString = "This mac mbc muc mkc is an example sentence. Another example is here.";

    Pattern pattern = Pattern.compile(regexPattern);

    Matcher matcher = pattern.matcher(inputString);

    while (matcher.find()) {
      String match = matcher.group();
      System.out.println("Match found: " + match);
    }
  }
}