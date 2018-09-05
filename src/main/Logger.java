import java.util.List;

public interface Logger {



    public void addRoundInfo(List<Field> changes);

    public void addInitialRound(Field[][] map);

    public void writeToFile();


}
