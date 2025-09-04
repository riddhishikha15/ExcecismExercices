import com.sun.jdi.CharType;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class SqueakyClean {
    private static final HashMap<Character, Character> charMap = new HashMap<>();
    static {
        charMap.put('4', 'a');
        charMap.put('3', 'e');
        charMap.put('0', 'o');
        charMap.put('1', 'l');
        charMap.put('7', 't');
    }

    static String clean(String identifier) {
        if (identifier.isEmpty()) {
            return identifier;
        }



        StringBuilder results = new StringBuilder();
        boolean capitalizeNext = false;

        for(char c : identifier.toCharArray()) {
            // Rule 1: Space is replaced with underscore
            if(c == ' ') {
                results.append('_');
            } else if (c == '-') {
                // Rule 2: convert for kebab-case to camelCase
                capitalizeNext = true;
            } else {
                // Rule 3: LeetSpeak number to letter
                if (charMap.containsKey(c)) {
                    c = charMap.get(c);
                }

                // Rule 4: remove non letters
                if(!Character.isLetter(c)) {
                    continue;
                }
                if(capitalizeNext) {
                    results.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                   results.append(c);
                }
            }


        }
//        String result = identifier.replaceAll(" ", "_");
        return results.toString();
//        throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
    }
}
