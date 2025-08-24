import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        // System.out.println(languages.isEmpty());
        return languages.isEmpty() ? true : false;
    }

    public void addLanguage(String language) {
        languages.add(language);
        // System.out.println(languages);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
        // System.out.println(languages);
    }

    public String firstLanguage() {
       return languages.get(0);    
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
       return languages.contains(language);
    }

    public boolean isExciting() {
       return (languages.contains("Java") || languages.contains("Kotlin"));
    }
}
