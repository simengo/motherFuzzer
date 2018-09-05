import java.util.ArrayList;



public class main {

    public static void main(String args[]) {

        main main = new main();

        @Parameter
         ArrayList<String> parameters = new ArrayList<String>();

        @Parameter(names = "--protocol ", description = "Protokoll-Dateiname")
         String dateiname;

        @Parameter(names = "--brains ", description = "Brainliste")
        ArrayList<String> brains = new ArrayList<String>();

        @Parameter(names = "--rounds", description = "Rundenanzahl")
        int rounds;

        @Parameter(names = "--seed", description = "Seed")
        int seed;

        @Parameter(names = "--world", description = "Rundenanzahl-Dateiname")
        int world;

        JCommander.newBuilder().addObject(main).build().parse(args);






    }
}
