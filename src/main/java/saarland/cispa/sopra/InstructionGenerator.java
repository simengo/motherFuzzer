package saarland.cispa.sopra;

import java.util.Random;

public final class InstructionGenerator {


    private static String[] instructions = new String[]{"drop", "pickup", "set", "unset", "turn", "test", "mark", "unmark", "flip", "direction", "jump", "sense", "move", "breed"};
    private static TurnDirection[] turndirections = new TurnDirection[]{TurnDirection.left, TurnDirection.right};
    private static String[] sensedirections = new String[]{"left", "right", "ahead", "here"};
    private static Target[] senseobjects = new Target[]{Target.friend, Target.foe, Target.food, Target.rock, Target.home, Target.foehome, Target.marker, Target.foemarker, Target.friendfood, Target.foefood, Target.antlion};
    private static String[] directionDirections = new String[]{"northwest", "northeast", "east", "southeast", "southwest", "west"};
    private static Random generator = new Random();

    public static Instruction createInstruction(int maxPC) {

        Instruction result;
        int position = generator.nextInt(14);
        String instruction = instructions[position];
        int jumpPC;
        int register;
        int marker;

        switch (instruction) {

            case ("jump"):
                jumpPC = generator.nextInt(maxPC);
                result = new Jump(jumpPC);
                break;
            case ("drop"):
                jumpPC = generator.nextInt(maxPC);
                result = new Drop(jumpPC);
                break;

            case ("pickup"):
                jumpPC = generator.nextInt(maxPC);
                result = new Pickup(jumpPC);
                break;

            case ("set"):
                register = generator.nextInt(6);
                result = new Set(register);
                break;

            case ("unset"):
                register = generator.nextInt(6);
                result = new Unset(register);
                break;

            case ("turn"):
                TurnDirection turndirection = turndirections[generator.nextInt(2)];
                result = new Turn(turndirection);
                break;

            case ("test"):
                register = generator.nextInt(6);
                jumpPC = generator.nextInt(maxPC);
                result = new Test(register, jumpPC);
                break;

            case ("mark"):
                marker = generator.nextInt(7);
                result = new Mark(marker);
                break;

            case ("unmark"):
                marker = generator.nextInt(7);
                result = new Unmark(marker);
                break;

            case ("flip"):
                jumpPC = generator.nextInt(maxPC);
                int flipper = generator.nextInt(2);
                result = new Flip(flipper, jumpPC);
                break;

            case ("direction"):
                jumpPC = generator.nextInt(maxPC);
                String direction = directionDirections[generator.nextInt(6)];
                result = new Direction(jumpPC, direction);
                break;

            case ("sense"):
                jumpPC = generator.nextInt(maxPC);
                String senserichtung = sensedirections[generator.nextInt(4)];
                Target senseobjekt = senseobjects[generator.nextInt(11)];

                switch (senseobjekt) {
                    case marker:
                        return new SenseMarker(senserichtung, senseobjekt, generator.nextInt(7), jumpPC);

                    case foemarker:
                        return new SenseMarker(senserichtung, senseobjekt, generator.nextInt(7), jumpPC);

                    case foe:
                        return new SenseAnt(senserichtung, senseobjekt, jumpPC);
                    case home:
                        return new SenseField(senserichtung, senseobjekt, jumpPC);
                    case rock:
                        return new SenseField(senserichtung, senseobjekt, jumpPC);
                    case friend:
                        return new SenseAnt(senserichtung, senseobjekt, jumpPC);
                    case antlion:
                        return new SenseField(senserichtung, senseobjekt, jumpPC);
                    case foehome:
                        return new SenseField(senserichtung, senseobjekt, jumpPC);
                    case food:
                        return new SenseFood(senserichtung, senseobjekt, jumpPC);
                    case foefood:
                        return new SenseFood(senserichtung, senseobjekt, jumpPC);
                    case friendfood:
                        return new SenseFood(senserichtung, senseobjekt, jumpPC);
                }


            case ("move"):
                jumpPC = generator.nextInt(maxPC);
                result = new Move(jumpPC);
                break;

            case ("breed"):
                jumpPC = generator.nextInt(maxPC);
                result = new Breed(jumpPC);
                break;

            default:

                throw new IllegalArgumentException("Unimplemented method " + instruction.toString());
        }

        return result;

    }

}

