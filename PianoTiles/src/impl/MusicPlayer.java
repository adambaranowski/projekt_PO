package impl;

import api.Player;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayer implements Player {

    public void playSound(String soundFile, int time) throws IOException, LineUnavailableException, UnsupportedAudioFileException, InterruptedException {
        File f = new File("./sound/samples/" + soundFile);
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        Thread.sleep(time);
        clip.stop();
    }
}
