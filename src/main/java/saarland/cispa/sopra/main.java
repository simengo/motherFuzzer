package saarland.cispa.sopra;

import org.apache.commons.cli.*;

import static java.lang.System.exit;

public class main {

    public static void main(String[] args) {

        Options options = new Options();

        options.addOption("protocol", "protocol", true, "Protokollpfad");
        options.addOption("rounds", "rounds", true, "Rundenzahl");
        options.addOption("seed", "seed", true, "Seed");
        options.addOption("world", "world", true, "Worldpfad");
        options.addOption(Option.builder("brains").valueSeparator(',').hasArgs().longOpt("brains").build());

        String logfile = "";
        int rounds = 0;
        int seed = 0;
        String worldpath = "";
        String[] brainpaths = new String[60];

        CommandLineParser parser = new DefaultParser();

        try {

            CommandLine cmd = parser.parse(options, args);
            logfile = cmd.getOptionValue("protocol");
            rounds = Integer.parseInt(cmd.getOptionValue("rounds"));
            seed = Integer.parseInt(cmd.getOptionValue("seed"));
            worldpath = cmd.getOptionValue("world");
            brainpaths = cmd.getOptionValues("brains");

        } catch (ParseException e) {
            exit(1);
        }

        Game game = new Game(logfile);
        game.simulate(rounds,seed,worldpath,brainpaths);


    }
}
