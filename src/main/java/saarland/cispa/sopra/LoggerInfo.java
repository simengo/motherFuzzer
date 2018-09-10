package saarland.cispa.sopra;

import java.util.List;
import java.util.Map;

public interface LoggerInfo {



    void addRoundInfo(List<Field> changes,Map<Character,Integer> points, Map<Character,Integer> numOfAntsInSwarm);

    void addInitialRound(Field[][] map, Map<Character,Swarm> swarms);

    void writeToFile();


}
