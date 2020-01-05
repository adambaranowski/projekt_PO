package gui;
import impl.ButtonsPosition;
import impl.PlayingEngine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Board {

    private JPanel TilesBoard;
    private JButton key1;
    private JButton key4;
    private JButton key2;
    private JButton key3;
    private JPanel gameboard;
    private JLabel gameover;
    private JLabel pointsfield;

    private PlayingEngine playingEngine = new PlayingEngine();
    private ButtonsPosition buttonsPosition1 = new ButtonsPosition(0, 0,0,0,0,0,0,0);


    Timer timer = new Timer(2, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Refresh();
        }
    });

    public Board() throws IOException, InterruptedException, UnsupportedAudioFileException, LineUnavailableException {

        timer.start();
        playingEngine.getPlayingThread().start();
        playingEngine.getGraphicMovementThread().start();

        Refresh();

        KeyAdapter keyAdapter = new KeyAdapter() {


            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                int keyCode = e.getKeyCode();

                switch (keyCode) {
                    case 68:
                        if (buttonsPosition1.getKey1y() > 0 && buttonsPosition1.getKey1y() < 300) {
                            //System.out.println("trafione");
                            playingEngine.increasePoints();
                            playingEngine.getGraphicMovementThread().key1Up();
                        } else {
                            GameOver();
                        }
                        break;

                    case 71:
                        if (buttonsPosition1.getKey2y() > 0 && buttonsPosition1.getKey2y() < 300) {
                            playingEngine.increasePoints();
                            playingEngine.getGraphicMovementThread().key2Up();
                        } else {
                            GameOver();
                        }
                        break;

                    case 74:
                        if (buttonsPosition1.getKey3y() > 0 && buttonsPosition1.getKey3y() < 300) {
                            playingEngine.increasePoints();
                            playingEngine.getGraphicMovementThread().key3Up();
                        } else {
                            GameOver();
                        }
                        break;

                    case 76:
                        if (buttonsPosition1.getKey4y() > 0 && buttonsPosition1.getKey4y() < 300) {
                            playingEngine.increasePoints();
                            playingEngine.getGraphicMovementThread().key4Up();
                        } else {
                            GameOver();
                        }
                        break;
                }
            }

        };

        key1.addKeyListener(keyAdapter);
        key2.addKeyListener(keyAdapter);
        key3.addKeyListener(keyAdapter);
        key4.addKeyListener(keyAdapter);
    }


    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        JFrame frame = new JFrame("Board");
        frame.setContentPane(new Board().TilesBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLayout(null);


    }

    public void GameOver(){
        timer.stop();
        gameboard.setVisible(false);
        playingEngine.getPlayingThread().stop();
        gameover.setText("GAME OVER");

    }

    public void Refresh(){
        buttonsPosition1.UpdatePosition(
                playingEngine.getGraphicMovementThread().getY1(), playingEngine.getGraphicMovementThread().getY2(), playingEngine.getGraphicMovementThread().getY3(), playingEngine.getGraphicMovementThread().getY4()
        );

        key1.setLocation((int)buttonsPosition1.getKey1x(), (int)buttonsPosition1.getKey1y());
        key2.setLocation((int)buttonsPosition1.getKey2x(), (int)buttonsPosition1.getKey2y());
        key3.setLocation((int)buttonsPosition1.getKey3x(), (int)buttonsPosition1.getKey3y());
        key4.setLocation((int)buttonsPosition1.getKey4x(), (int)buttonsPosition1.getKey4y());
        pointsfield.setText("Points: "+String.valueOf(playingEngine.getPoints()));

        if(playingEngine.getGraphicMovementThread().getIfCrossTheBoard()){
            GameOver();
            }

    }


}
