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



        try{musicReader.readSong();}
        catch (Exception e){
            System.out.println("nie działa");
        }

        List<String> song  = musicReader.getSong();
        System.out.println(song);
        for (String line: song
             ) {
            System.out.println(line);

        }

    }
}
