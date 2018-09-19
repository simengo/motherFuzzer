package saarland.cispa.sopra;

import java.io.File;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {

        File simonki = new File("C:/Users/Miles/Documents/Sopra/KI/SimonKI.txt");
        File denniski = new File("C:/Users/Miles/Documents/Sopra/KI/KI189.txt");
        File ericki = new File("C:/Users/Miles/Documents/Sopra/KI/KI189.txt");
        File mischaki = new File("C:/Users/Miles/Documents/Sopra/KI/MKi.txt");

        File smallestMap = new File("C:/Users/Miles/Documents/Sopra/Maps/1616map.txt");
        File smallMap = new File("C:/Users/Miles/Documents/Sopra/Maps/6464map.txt");
        File mediumMap = new File("C:/Users/Miles/Documents/Sopra/Maps/9696map.txt");
        File bigMap = new File("C:/Users/Miles/Documents/Sopra/Maps/128128map.txt");


        Fuzzer fuzzer = new Fuzzer();

        fuzzer.initializeBrains(simonki, denniski, ericki, mischaki);
        fuzzer.initializeMaps(smallestMap, smallMap, mediumMap, bigMap);

        fuzzer.fuzz();
    }
}
