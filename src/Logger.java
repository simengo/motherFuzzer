import java.util.List;
import java.util.Map;

public interface Logger {

    public void addRoundInfo(List<Field> changes, Map<Character, Integer> points);

    public void addInitialRound(Field[][] map, Map<Character, Integer> points);

    public void writeToFile();
    
}
