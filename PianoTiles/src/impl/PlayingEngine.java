package impl;

import java.util.List;

public class PlayingEngine {
    public static void main(String[] args) {

        //musicReader class needs constructor
        // ==> new MusicReader("src/impl/Song1.txt")
        // or
        // ==> new MusicReader()
        // musicreader.setFileName(fileName)
        MusicReader musicReader = new MusicReader("src/impl/Song1.txt");


        // testowanie
        try{musicReader.readSong();}
        catch (Exception e){
            System.out.println("nie działa");
        }


        //testowanie
        List<String> piosenka  = musicReader.getSong();
        System.out.println(piosenka);
        for (String linia: piosenka
             ) {
            System.out.println(linia);

        }

    }
}
