import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String field = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < field.length(); i++) {
            String fieldLower = field.toLowerCase();
            char symbol = fieldLower.charAt(i);
            if (Character.isLetter(symbol)) {
                if (!map.containsKey(symbol)) {
                    map.put(symbol, 1);
                } else if (map.containsKey(symbol)) {
                    int x = map.get(symbol);
                    x++;
                    map.put(symbol, x);
                }
            }
        }
        Character maxChar = null;
        Character minChar = null;
        for (Character key : map.keySet()) {
            if (maxChar == null || map.get(key) > map.get(maxChar)) {
                maxChar = key;
            }
        }
        for (Character key : map.keySet()) {
            if (minChar == null || map.get(key) < map.get(minChar)) {
                minChar = key;
            }
        }
        System.out.println(map.entrySet());
        System.out.println(maxChar + " - " + Collections.max(map.values()));
        System.out.println(minChar + " - " + Collections.min(map.values()));

        //TODO Вторая задача
        WordsChecker word = new WordsChecker();
        System.out.println();
        System.out.println(word);
        System.out.println(word.hasWord("ipsum"));

    }

}
