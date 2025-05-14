import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> songs = new HashMap<String, String>();
        songs.put("Makamelnash", "ana mafeesh 7ad gherha malane graaaaa7");
        songs.put("QusadEiny", "qusad 3iny fe kol makan");
        songs.put("RadE3tebar", "roga3ak tany le 7ayaty senario 7kaytoh marfoda");
        songs.put("qololohSamah", "bamoot gowaya w babky 3ala 7aly w a7zani ely gayyali");

        String lyrics =songs.get("RadE3tebar");
        System.out.println(lyrics);
        Set<String> keys = songs.keySet();
        for(String key : keys) {
            System.out.print(key +":");
            System.out.println(songs.get(key));    
        }
    }
}