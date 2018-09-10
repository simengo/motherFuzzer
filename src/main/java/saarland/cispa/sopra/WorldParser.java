package saarland.cispa.sopra;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public final class WorldParser {

    private WorldParser() {

    }

    public static World parseMap(File mapFile, long seed, Map<Character, Swarm> swarms) throws IOException {

        int iPMDleanger = 0;
        int jPMDlaenger = 0;

        try (BufferedReader bReader = Files.newBufferedReader(Paths.get(mapFile.getPath()))) {

            int counter = 0;
            boolean newLine1 = false;
            boolean ntoken = false;
            boolean nexttoken = false;
            boolean outbreak = false;
            String breite1 = bReader.readLine();
            char[] width = breite1.toCharArray();
            int breite = 0;
            int hoehe = 0;

            for (char x : width) {
                if (outbreak) break;
                switch (x) {

                    case 92:
                        newLine1 = true;
                        break;

                    case 'n':
                        if (newLine1) {
                            ntoken = true;
                            break;
                        } else {
                            throw new IllegalArgumentException("Map could not be parsed correctly");
                        }

                    default:
                        if (newLine1 && ntoken) {
                            newLine1 = false;
                            ntoken = false;
                            if (nexttoken) {
                                outbreak = true;
                                break;
                            }
                            nexttoken = true;
                            hoehe = hoehe * 10 + (x - 48);
                            break;

                        } else {
                            if (newLine1 || ntoken) {
                                throw new IllegalArgumentException("Map could not be parsed correctly");
                            } else {
                                if (nexttoken) {
                                    hoehe = hoehe * 10 + (x - 48);
                                    break;
                                } else {
                                    breite = breite * 10 + (x - 48);
                                    break;
                                }
                            }

                        }


                }
            }
      //      int hoehe = Integer.parseInt(bReader.readLine());

            Field[][] fields = new Field[breite][hoehe];

            while (true) {

                String line = bReader.readLine();

                if (line == null) {
                    if (counter % 2 != 0 || counter == 0 || counter != hoehe) {
                        throw new IllegalArgumentException();
                    }
                    break;
                }

                char[] row = line.toCharArray();

                boolean newLine = false;

                for (Character chara : row) {

                    switch (chara) {

                        case 92:
                            newLine = true;
                            break;

                        case 'n':
                            if (newLine) {
                                newLine = false;
                                if (jPMDlaenger != breite + 1) {
                                    throw new IllegalArgumentException("Map could not be parsed correctly");
                                }
                                jPMDlaenger = -1;
                                iPMDleanger++;
                                counter++;
                                break;
                            } else {
                                throw new IllegalArgumentException("Map could not be parsed correctly (Invalid character)");
                            }
                        case '.':
                            fields[iPMDleanger][jPMDlaenger] = new Normal(iPMDleanger, jPMDlaenger, 0);
                            break;

                        case '=':
                            fields[iPMDleanger][jPMDlaenger] = new Antlion(iPMDleanger, jPMDlaenger);
                            break;

                        case '#':
                            fields[iPMDleanger][jPMDlaenger] = new Rock(iPMDleanger, jPMDlaenger);
                            break;

                        default:
                            if (chara >= 65 && chara <= 90 || chara >= 97 && chara <= 122) {
                                fields[iPMDleanger][jPMDlaenger] = new Base(chara, iPMDleanger, jPMDlaenger);
                                break;
                            }

                            if (chara >= 49 && chara <= 57) {
                                fields[iPMDleanger][jPMDlaenger] = new Normal(iPMDleanger, jPMDlaenger, chara - 48);
                                break;
                            } else
                                throw new IllegalArgumentException("Map could not be parsed correctly (Invalid Character");
                    }
                    jPMDlaenger++;
                }
                if (jPMDlaenger != breite || iPMDleanger >= hoehe) {
                    throw new IllegalArgumentException("Map could not be parsed correctly");
                }
                jPMDlaenger = 0;
                iPMDleanger++;
                counter++;
            }
            Map<Integer, Ant> ants = spawnAnts(swarms, fields);
            World welt = new World(fields, seed, ants, swarms);
            welt.setAntlion();
            return welt;
        }
    }

    private static Map<Integer, Ant> spawnAnts(Map<Character, Swarm> swarms, Field[][] fields) {
        HashMap<Integer, Ant> ants = new HashMap<>();
        for (Field[] fieldh : fields) {
            for (Field field : fieldh) {
                Character type = field.getType();
                if (type != '.' && type != '=' && type != '#') {
                    if (swarms.get(type).getIdent() != type) {
                        throw new IllegalArgumentException("wrong swarm");
                    }
                    Ant ant = new Ant(swarms.get(type), ants.size(), field);
                    ants.put(ants.size(), ant);
                }
            }
        }
        return ants;
    }
}
