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



    private PlayingEngine playingEngine = new PlayingEngine();
    private ButtonsPosition buttonsPosition1 = new ButtonsPosition(0, 0,0,0,0,0,0,0);



    public Board() throws IOException, InterruptedException, UnsupportedAudioFileException, LineUnavailableException {

        /////ŁADOWANIE POCZĄTKOWEJ POZYCJI BUTTONÓW DO KLASY PRZECHWUJĄCEJ POZYCJE ZEBY MIEĆ X KTORY SIE NIE BEDZIE ZMIENIAŁ///////////

        Point key1Location = key1.getLocation();
        double key1x = key1Location.x;
        double key1y = key1Location.y;

        Point key2Location = key2.getLocation();
        double key2x = key2Location.x;
        double key2y = key2Location.y;

        Point key3Location = key3.getLocation();
        double key3x = key3Location.x;
        double key3y = key3Location.y;

        Point key4Location = key4.getLocation();
        double key4x = key4Location.x;
        double key4y = key4Location.y;



        buttonsPosition1.setKey1x(key1x);
        buttonsPosition1.setKey2x(key2x);
        buttonsPosition1.setKey3x(key3x);
        buttonsPosition1.setKey4x(key4x);
        buttonsPosition1.setKey1y(key1y);
        buttonsPosition1.setKey2y(key2y);
        buttonsPosition1.setKey3y(key3y);
        buttonsPosition1.setKey4y(key4y);
        ////////////////////////////////////////////////


        Timer timer = new Timer(2, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Refresh();
            }
        });
        //timer.setInitialDelay(500);
        timer.start();

        playingEngine.getPlayingThread().start();
        playingEngine.getGraphicMovementThread().start();
        Refresh();

        key1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(buttonsPosition1.getKey1y());
                if(buttonsPosition1.getKey1y()>200 && buttonsPosition1.getKey1y()<400)
                {
                if(e.getKeyCode()==68){
                    //czy wcisniety d

                }
                else{
                    System.out.println("nie wcisniete d");

                }
            }
                else{
                System.out.println("zepsułes");
                }
            }
        });
        key2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (buttonsPosition1.getKey2y() > 200 && buttonsPosition1.getKey2y() < 400) {
                    if (e.getKeyCode() == 71) {
                        //czy wcisniety g

                    } else {
                        System.out.println("nie wcisniete g");

                    }
                }
                else{

                    System.out.println("zepsułes");
                }
            }

        });
        key3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (buttonsPosition1.getKey3y() > 200 && buttonsPosition1.getKey3y() < 400){
                    if(e.getKeyCode()==74){
                        //czy wcisniety j

                    }
                    else{
                        System.out.println("nie wcisniete j");

                    }
                }
                else{

                    System.out.println("zepsułes");
                }
                }


        });
        key4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (buttonsPosition1.getKey3y() > 200 && buttonsPosition1.getKey3y() < 400){
                if(e.getKeyCode()==76){
                    //czy wcisniety l

                }
                else{
                    System.out.println("nie wcisniete l");

                }
            }
                else{

                    System.out.println("zepsułes");
                }
            }
        });
    }

    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        JFrame frame = new JFrame("Board");
        frame.setContentPane(new Board().TilesBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
       frame.setLayout(null);

    }

    public void Refresh(){
        buttonsPosition1.UpdatePosition(
                playingEngine.getGraphicMovementThread().getY1(), playingEngine.getGraphicMovementThread().getY2(), playingEngine.getGraphicMovementThread().getY3(), playingEngine.getGraphicMovementThread().getY4()
        );

        key1.setLocation((int)buttonsPosition1.getKey1x(), (int)buttonsPosition1.getKey1y());
        key2.setLocation((int)buttonsPosition1.getKey2x(), (int)buttonsPosition1.getKey2y());
        key3.setLocation((int)buttonsPosition1.getKey3x(), (int)buttonsPosition1.getKey3y());
        key4.setLocation((int)buttonsPosition1.getKey4x(), (int)buttonsPosition1.getKey4y());

    }

}
