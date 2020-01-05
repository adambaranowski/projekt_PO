package impl;
import java.io.IOException;
import java.util.List;

public class PlayingEngine extends Thread  {
        MusicReader musicReader = new MusicReader("src/impl/BACH_PRELUDE.txt");
        List<String> song  = musicReader.getSong();
        private int points = 0;

        public int getPoints() {
                return points;
        }

        public void increasePoints() {
                points +=1;
        }

        public PlayingEngine() throws  IOException{
}
        private PlayingThread playingThread = new PlayingThread(song);
        private GraphicMovementThread graphicMovementThread = new GraphicMovementThread();

        public PlayingThread getPlayingThread() {
           return playingThread;
        }

        public GraphicMovementThread getGraphicMovementThread() {
            return graphicMovementThread;
        }

}
