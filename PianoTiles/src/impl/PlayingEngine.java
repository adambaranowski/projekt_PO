package impl;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.List;



public class PlayingEngine {
    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {

        MusicReader musicReader = new MusicReader("src/impl/BACH_PRELUDE.txt");
        KeyMap keyMap = new KeyMap();

        List<String> song  = musicReader.getSong();
        //System.out.println(song);
        //for (String line: song
        //     ) {
         //   System.out.println(line);
        //}
        MusicPlayer musicPlayer = new MusicPlayer();

        for (String line:
                song
             ) {
            String[] sound = line.split("#");

            musicPlayer.playSound( keyMap.getFileName(sound[1]), 50*Integer.parseInt(sound[2]));
            System.out.println(keyMap.getFileName(sound[1]));

        }


        //musicPlayer.playSound("081-a.wav", 1000);
        //musicPlayer.playSound("078-f#.wav", 1000);
        //musicPlayer.playSound("083-b.wav", 1000);

    }
}
