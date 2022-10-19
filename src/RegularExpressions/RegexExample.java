package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
    // what we are searching : data
    // where we are searching : source
    Pattern variable_pattern = Pattern.compile("are", Pattern.CASE_INSENSITIVE); // data
        Matcher variable_matcher= variable_pattern.matcher ("We are learning core java"); // input/source
        boolean matchFound = variable_matcher.find();
        System.out.println(matchFound);

        if(matchFound){
            System.out.println("Match found");
        }
        else
        {
            System.out.println("Match Not found");
        }



    }
}
