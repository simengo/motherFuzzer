import java.util.List;
import java.util.Map;

public class NOPLogger implements Logger {


    public NOPLogger(){



    }




    @Override
    public void addInitialRound(Field[][] map, Map<Character, Integer> points) {

        return;
    }


    @Override
    public void addRoundInfo(List<Field> changes,Map<Character, Integer> points) {

        return;
    }



    @Override
    public void writeToFile() {

        return;
    }




}
