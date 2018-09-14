package saarland.cispa.sopra;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

abstract class BrainParserHelper {

    protected abstract void iDontCare();

    protected static void checkForIllegal(int x, int max) {
        if (x < 0 || x > max) {
            throw new IllegalArgumentException("illegal integer given to brain");
        }
    }

    protected static int checkLength(String[] instructionStringArr) {
        int length = instructionStringArr.length;
        if (length == 0) {
            throw new IllegalArgumentException("");
        }
        if ("".equals(instructionStringArr[0])) {
            throw new IllegalArgumentException("");
        }
        return length;
    }

    protected static Map<Character, Swarm> checkForBrokenBrain(Instruction[][] brainArray, Map<Character, Swarm> brainMap, List<String> name) {
        for (int iterator = 0; iterator < brainArray.length; iterator++) {
            brainMap.put((char) ('A' + iterator), new Swarm((char) ('A' + iterator), brainArray[iterator], name.get(iterator)));
        }
        return brainMap;
    }

    protected static void checkBrainContent(String[] brains) {
        for (String brain : brains) {
            if ("".equals(brain)) {
                throw new IllegalArgumentException("empty brain was submitted");
            }
        }
    }

    protected static String[] removeEmpty(String[] instrArray) {
        ArrayList<String> temp = new ArrayList<>();
        String asdf = "\\";
        for (String x : instrArray) {
            String str1 = "";
            String str2 = " ";
            String str3 = " ";
            if (str1.equals(x) || str2.equals(x) || str3.equals(x)) {
                continue;
            }
            if (!x.isEmpty()){
                if(!asdf.equals(x.substring(0,1))){
                    temp.add(x);
                }
            }
        }
        String[] retList = new String[temp.size()];
        int iter = 0;
        for (String x : temp) {
            retList[iter] = x;
            iter++;
        }
        return retList;
    }
}
