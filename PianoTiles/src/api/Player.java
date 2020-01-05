package api;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public interface Player {
     void playSound(String soundFile, int time) throws IOException, LineUnavailableException, UnsupportedAudioFileException, InterruptedException;
}
