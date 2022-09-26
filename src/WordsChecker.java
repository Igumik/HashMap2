import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    public WordsChecker() {
        this.text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    }
    Set<String> set = new HashSet<>();
    public boolean hasWord(String searchWord){
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (String word : words){
            set.add(word);
        }
        return set.contains(searchWord);
    }

    public String toString() {
        return text ;
    }
}
