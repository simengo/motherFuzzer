package saarland.cispa.sopra;

import org.apache.commons.cli.*;

import static java.lang.System.exit;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {

        Options options = new Options();

        options.addOption("protocol", "protocol", true, "Protokollpfad");
        options.addOption("rounds", "rounds", true, "Rundenzahl");
        options.addOption("seed", "seed", true, "Seed");
        options.addOption("world", "world", true, "Worldpfad");
        options.addOption(Option.builder("brains").valueSeparator(',').hasArgs().longOpt("brains").build());

        CommandLineParser parser = new DefaultParser();

        try {

            CommandLine cmd = parser.parse(options, args);

            Game game = new Game();
            game.setLogger(cmd.getOptionValue("protocol"));
            game.simulate(Integer.parseInt(cmd.getOptionValue("rounds")), Integer.parseInt(cmd.getOptionValue("seed")), cmd.getOptionValue("world"), cmd.getOptionValues("brains"));

        } catch (ParseException e) {
            exit(1);
        }



    }
}
