package saarland.cispa.sopra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;

public final class Matchmaker {

    private static Random generator = new Random();

    public static ArrayList<Brain> makeMatch(ArrayList<Brain> participants, ArrayList<String> maps) {

        ArrayList<Brain> initialBrainList = makeTournament(participants, maps);

        ArrayList<Brain> mutatedBrains = Mutationapplyer.applyMutations(initialBrainList);

        ArrayList<Brain> mutatedPointList = makeTournament(mutatedBrains, maps);

        ArrayList<Brain> remakeList = new ArrayList<>();

        for (int i = 0; i < mutatedPointList.size(); i++) {
            if (initialBrainList.get(i).getPoints() > mutatedPointList.get(i).getPoints()) {
                remakeList.add(initialBrainList.get(i));
            } else {
                remakeList.add(mutatedPointList.get(i));
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

    private static ArrayList<Brain> makeTournament(ArrayList<Brain> participants, ArrayList<String> maps) {

        Utils.clearPoints(participants);

        int teamID1 = 0, teamID2 = 0, teamID3 = 0, teamID4 = 0;

        ArrayList<Integer> matchup = Utils.makeMatchup(teamID1, teamID2, teamID3, teamID4);

        teamID1 = matchup.get(0);
        teamID2 = matchup.get(1);
        teamID3 = matchup.get(2);
        teamID4 = matchup.get(3);

        Game preGame1 = new Game();
        Game preGame2 = new Game();
        Game finalGame = new Game();
        Game thirdPlaceGame = new Game();

        Brain participantA = participants.get(teamID1);
        Brain participantB = participants.get(teamID2);
        Brain participantC = participants.get(teamID3);
        Brain participantD = participants.get(teamID4);

        for (String map : maps) {

            World world1 = (World) preGame1.simulate(10000, generator.nextInt(10000), map, participantA.getBrain(), participantB.getBrain());
            World world2 = (World) preGame2.simulate(10000, generator.nextInt(10000), map, participantC.getBrain(), participantD.getBrain());

            Brain preWinner1;
            Brain preWinner2;
            Brain preLoser1;
            Brain preLoser2;

            if (world1.getScore('A') > world1.getScore('B')) {
                preLoser1 = Utils.matchBrain(participants, world1.getSwarms().get('B').getBrain());
                preWinner1 = Utils.matchBrain(participants, world1.getSwarms().get('A').getBrain());
            } else {
                preLoser1 = Utils.matchBrain(participants, world1.getSwarms().get('A').getBrain());
                preWinner1 = Utils.matchBrain(participants, world1.getSwarms().get('B').getBrain());
            }

            if (world2.getScore('B') < world2.getScore('A')) {
                preWinner2 = Utils.matchBrain(participants, world2.getSwarms().get('A').getBrain());
                preLoser2 = Utils.matchBrain(participants, world2.getSwarms().get('B').getBrain());
            } else {
                preLoser2 = Utils.matchBrain(participants, world2.getSwarms().get('A').getBrain());
                preWinner2 = Utils.matchBrain(participants, world2.getSwarms().get('B').getBrain());
            }

            World loserWorld = (World) thirdPlaceGame.simulate(10000, generator.nextInt(10000), map, preLoser1.getBrain(), preLoser2.getBrain());
            World loserWorld2 = (World) thirdPlaceGame.simulate(10000, generator.nextInt(10000), map, preLoser2.getBrain(), preLoser1.getBrain());
            World finalWorld = (World) finalGame.simulate(10000, generator.nextInt(10000), map, preWinner1.getBrain(), preWinner2.getBrain());
            World finalWorld2 = (World) finalGame.simulate(10000, generator.nextInt(10000), map, preWinner2.getBrain(), preWinner1.getBrain());

            preLoser1.setPoints(preLoser1.getPoints() + loserWorld.getScore('A') + loserWorld2.getScore('B'));
            preLoser2.setPoints(preLoser2.getPoints() + loserWorld.getScore('B') + loserWorld2.getScore('A'));
            preWinner1.setPoints(preWinner1.getPoints() + finalWorld.getScore('A') + finalWorld2.getScore('B'));
            preWinner2.setPoints(preWinner2.getPoints() + finalWorld.getScore('B') + finalWorld2.getScore('A'));
        }
        ArrayList<Brain> result = new ArrayList<>();

        result.add(participantA);
        result.add(participantB);
        result.add(participantC);
        result.add(participantD);

        result.sort(Comparator.comparing(Brain::getPoints));

        ArrayList<Brain> resultclone = new ArrayList<>(result);
        return resultclone;
    }
}
