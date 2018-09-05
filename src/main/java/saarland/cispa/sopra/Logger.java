package saarland.cispa.sopra;

import java.util.List;
import java.util.Map;

public interface Logger {



    public void addRoundInfo(List<Field> changes,Map<Character,Integer> points, Map<Character,Integer> numOfAntsInSwarm);

    public void addInitialRound(Field[][] map, Map<Character,Swarm> swarms);

    public void writeToFile();


}
