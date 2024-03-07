import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex  {
    public static void main(String[] args) {
        String filePath = "input.txt"; // Path to the input file
        deleteContentAfterMarker(filePath,"--"); // Delete
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String sentence = reader.readLine(); // Read the sentence from the first line

            // Read regular expressions until "--" is encountered
            StringBuilder regexBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null && !line.equals("--")) {
                regexBuilder.append(line).append(System.lineSeparator());
            }
            String regexInput = regexBuilder.toString().trim();

            // Compile regular expressions
            Pattern[] patterns = compileRegexExpressions(regexInput);

            StringBuilder resultBuilder = new StringBuilder();

            // Apply each regular expression to the sentence
            for (Pattern pattern : patterns) {
                Matcher matcher = pattern.matcher(sentence);
                while (matcher.find()) {
                    resultBuilder.append(matcher.group());
                }
                resultBuilder.append("\n");
            }

            String result = resultBuilder.toString().trim();

            // Append the result to the same file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                writer.newLine();
                writer.write(result);
                System.out.println("Result appended to the file successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Compile regular expressions from the input string
    private static Pattern[] compileRegexExpressions(String regexInput) {
        String[] regexes = regexInput.split(System.lineSeparator());
        Pattern[] patterns = new Pattern[regexes.length];
        for (int i = 0; i < regexes.length; i++) {
            patterns[i] = Pattern.compile(regexes[i]);
        }
        return patterns;
    }

    public static void deleteContentAfterMarker(String filePath, String marker) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder contentBuilder = new StringBuilder();
            String line;

            // Read the file content until the marker is encountered
            while ((line = reader.readLine()) != null && !line.equals(marker)) {
                contentBuilder.append(line).append(System.lineSeparator());
            }
            contentBuilder.append(line).append(System.lineSeparator());


            // Write the modified content back to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(contentBuilder.toString());
                System.out.println("Content after the marker removed successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}