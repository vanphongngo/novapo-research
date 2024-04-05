package org.beint.beintappapi.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {
    public static String getString (String inputString, String regexExpression){
        Pattern pattern = Pattern.compile(regexExpression);
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return "";
        }

    }
}
