package impl;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayer {

    void playSound(String soundFile, int time) throws IOException, LineUnavailableException, UnsupportedAudioFileException, InterruptedException {

       // time = 500;
        File f = new File("./sound/samples/" + soundFile);
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        Thread.sleep(time);
        clip.stop();
    }
}
