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

        MusicPlayer musicPlayer = new MusicPlayer();

        for (String line:
                song
             )
        {
            String[] sound = line.split("#");
            musicPlayer.playSound( keyMap.getFileName(sound[1]), 40*Integer.parseInt(sound[2]));
            System.out.println(keyMap.getFileName(sound[1]));

        }

    }
}
