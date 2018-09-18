package saarland.cispa.sopra;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public final class Matchmaker {

    private static Random generator = new Random();

    public static ArrayList<Instruction[]> makeMatch(ArrayList<Instruction[]> participants) {

        ArrayList<HashMap<Integer, Instruction[]>> PointList = makeTournament(participants);

        ArrayList<Integer> convertedPoints = convertPoints(PointList);
        ArrayList<Instruction[]> convertedBrains = new ArrayList<>();

        for (int i = 0; i < PointList.size(); i++) {
            HashMap<Integer, Instruction[]> pointBrainSet = PointList.get(i);
            Instruction[] brainObject = pointBrainSet.get(convertedPoints.get(i));
            convertedBrains.add(brainObject);
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
            for (int key : participantPoints.keySet()) {
                points += key;
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

        Game preGame1 = new Game();
        Game preGame2 = new Game();
        Game finalGame = new Game();
        Game thirdPlaceGame = new Game();

        Instruction[] participantA = participants.get(teamID1);
        Instruction[] participantB = participants.get(teamID2);
        Instruction[] participantC = participants.get(teamID3);
        Instruction[] participantD = participants.get(teamID4);

        World world1 = (World) preGame1.simulate(10000, generator.nextInt(10000), "", participantA, participantB);
        World world2 = (World) preGame2.simulate(10000, generator.nextInt(10000), "", participantC, participantD);

        Instruction[] preWinner1;
        Instruction[] preWinner2;
        Instruction[] preLoser1;
        Instruction[] preLoser2;

        HashMap<Integer, Instruction[]> loserPoints;
        HashMap<Integer, Instruction[]> thirdPoints;
        HashMap<Integer, Instruction[]> secondPoints;
        HashMap<Integer, Instruction[]> winnerPoints;

        if (world1.getScore('A') > world1.getScore('B')) {
            preLoser1 = world1.getSwarms().get('B').getBrain();
            preWinner1 = world1.getSwarms().get('A').getBrain();
        } else {
            preLoser1 = world1.getSwarms().get('A').getBrain();
            preWinner1 = world1.getSwarms().get('B').getBrain();
        }

        if (world2.getScore('B') < world2.getScore('A')) {
            preWinner2 = world2.getSwarms().get('A').getBrain();
            preLoser2 = world2.getSwarms().get('B').getBrain();
        } else {
            preLoser2 = world2.getSwarms().get('A').getBrain();
            preWinner2 = world2.getSwarms().get('B').getBrain();
        }

        World loserWorld = (World) thirdPlaceGame.simulate(10000, 42, "", preLoser1, preLoser2);

        if (loserWorld.getScore('A') > loserWorld.getScore('B')) {
            thirdPoints = loserWorld.getBrainPoints('A');
            loserPoints = loserWorld.getBrainPoints('B');
        } else {
            thirdPoints = loserWorld.getBrainPoints('B');
            loserPoints = loserWorld.getBrainPoints('A');
        }

        World finalWorld = (World) finalGame.simulate(10000, 42, "", preWinner1, preWinner2);

        if (finalWorld.getScore('A') > finalWorld.getScore('B')) {
            winnerPoints = finalWorld.getBrainPoints('A');
            secondPoints = finalWorld.getBrainPoints('B');
        } else {
            secondPoints = finalWorld.getBrainPoints('A');
            winnerPoints = finalWorld.getBrainPoints('B');
        }

        ArrayList<HashMap<Integer, Instruction[]>> result = new ArrayList<>();

        result.add(loserPoints);
        result.add(thirdPoints);
        result.add(secondPoints);
        result.add(winnerPoints);

        return result;
    }
}
