package saarland.cispa.sopra;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public final class Matchmaker {

    private static Random generator = new Random();

    public static ArrayList<Instruction[]> makeMatch(ArrayList<Instruction[]> participants) {

        ArrayList<HashMap<Integer, Instruction[]>> unmutatedPointList = makeTournament(participants);

        ArrayList<Integer> convertedPoints = convertPoints(unmutatedPointList);
        ArrayList<Instruction[]> convertedBrains = new ArrayList<>();

        for (int i = 0; i < unmutatedPointList.size(); i++) {
            HashMap<Integer, Instruction[]> pointbrainset = unmutatedPointList.get(i);
            Instruction[] brainobject = pointbrainset.get(convertedPoints.get(i));
            convertedBrains.add(brainobject);
        }

        ArrayList<Instruction[]> mutatedBrains = Mutationapplyer.applyMutations(convertedBrains);

        ArrayList<HashMap<Integer, Instruction[]>> mutatedPointList = makeTournament(mutatedBrains);

        ArrayList<Integer> mutatedPoints = convertPoints(mutatedPointList);

        ArrayList<Instruction[]> remakeList = new ArrayList<>();

        for (int i = 0; i < mutatedPoints.size(); i++) {
            if (mutatedPoints.get(i) > convertedPoints.get(i)) {
                remakeList.add(mutatedBrains.get(i));
            } else {
                remakeList.add(convertedBrains.get(i));
            }
        }

        return remakeList;

    }


    private static ArrayList<Integer> convertPoints(ArrayList<HashMap<Integer, Instruction[]>> pointList) {

        ArrayList<Integer> result = new ArrayList<>();

        for (HashMap<Integer, Instruction[]> participantPoints : pointList) {

            int points = 0;
            for (int point : participantPoints.keySet()) {
                points++;
            }
            result.add(points);
        }
        return result;
    }

    private static ArrayList<HashMap<Integer, Instruction[]>> makeTournament(ArrayList<Instruction[]> participants) {

        ArrayList<Integer> teamIDs = new ArrayList<>();
        teamIDs.add(0);
        teamIDs.add(1);
        teamIDs.add(2);
        teamIDs.add(3);

        int teamID1, teamID2, teamID3, teamID4;

        teamID1 = generator.nextInt(4);
        teamIDs.remove(teamID1);
        teamID2 = generator.nextInt(3);
        teamIDs.remove(teamID2);
        teamID3 = generator.nextInt(2);
        teamIDs.remove(teamID3);
        teamID4 = generator.nextInt(1);
        teamIDs.remove(teamID4);

        Game pregame1 = new Game();
        Game pregame2 = new Game();
        Game finalgame = new Game();
        Game thirdplacegame = new Game();

        Instruction[] participantA = participants.get(teamID1);
        Instruction[] participantB = participants.get(teamID2);
        Instruction[] participantC = participants.get(teamID3);
        Instruction[] participantD = participants.get(teamID4);

        World worldofgame1 = (World) pregame1.simulate(10000, 42, "", participantA, participantB);
        World worldofgame2 = (World) pregame2.simulate(10000, 42, "", participantC, participantD);

        Instruction[] prewinnerA;
        Instruction[] prewinnerB;
        Instruction[] preloserA;
        Instruction[] preloserB;

        HashMap<Integer, Instruction[]> loserpoints;
        HashMap<Integer, Instruction[]> thirdpoints;
        HashMap<Integer, Instruction[]> secondpoints;
        HashMap<Integer, Instruction[]> winnerpoints;

        if (worldofgame1.getScore('A') > worldofgame1.getScore('B')) {
            preloserA = worldofgame1.getSwarms().get('B').getBrain();
            prewinnerA = worldofgame1.getSwarms().get('A').getBrain();
        } else {
            preloserA = worldofgame1.getSwarms().get('A').getBrain();
            prewinnerA = worldofgame1.getSwarms().get('B').getBrain();
        }

        if (worldofgame1.getScore('B') < worldofgame2.getScore('A')) {
            prewinnerB = worldofgame2.getSwarms().get('A').getBrain();
            preloserB = worldofgame2.getSwarms().get('B').getBrain();
        } else {
            preloserB = worldofgame2.getSwarms().get('A').getBrain();
            prewinnerB = worldofgame2.getSwarms().get('B').getBrain();
        }

        World losergame = (World) thirdplacegame.simulate(10000, 42, "", preloserA, preloserB);

        if (losergame.getScore('A') > losergame.getScore('B')) {
            thirdpoints = losergame.getBrainPoints('A');
            loserpoints = losergame.getBrainPoints('B');
        } else {
            thirdpoints = losergame.getBrainPoints('B');
            loserpoints = losergame.getBrainPoints('A');
        }

        World finalworld = (World) finalgame.simulate(10000, 42, "", prewinnerA, prewinnerB);

        if (finalworld.getScore('A') > finalworld.getScore('B')) {
            winnerpoints = finalworld.getBrainPoints('A');
            secondpoints = finalworld.getBrainPoints('B');
        } else {
            secondpoints = finalworld.getBrainPoints('A');
            winnerpoints = finalworld.getBrainPoints('B');
        }

        ArrayList<HashMap<Integer, Instruction[]>> result = new ArrayList<>();

        result.add(loserpoints);
        result.add(thirdpoints);
        result.add(secondpoints);
        result.add(winnerpoints);

        return result;
    }
}
