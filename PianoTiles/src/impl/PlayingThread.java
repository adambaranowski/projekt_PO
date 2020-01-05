package impl;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayingThread extends Thread{
    List<String> song;
    MusicPlayer musicPlayer = new MusicPlayer();
    KeyMap keyMap = new KeyMap();

    PlayingThread(List<String> song){
        this.song = song;
    }

    public void run(){
        for (String line:
                song
        )
        {
            String[] sound = line.split("#");
            try {

                while(true){
                    break;
                }


                musicPlayer.playSound( keyMap.getFileName(sound[1]), 80*Integer.parseInt(sound[2]));

            } catch (IOException e) {
                e.printStackTrace();
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            } catch (UnsupportedAudioFileException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
