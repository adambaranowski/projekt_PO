package gui;

import impl.ButtonsPosition;
import impl.PlayingEngine;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Board {

    private JPanel TilesBoard;
    private JButton key1;
    private JButton key4;
    private JButton key2;
    private JButton key3;
    private JPanel gameboard;

    PlayingEngine playingEngine = new PlayingEngine();
    ButtonsPosition buttonsPosition1 = new ButtonsPosition(0, 0,0,0,0,0,0,0);

    public Board() throws IOException, InterruptedException, UnsupportedAudioFileException, LineUnavailableException {

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


       /// ButtonsPosition buttonsPosition = new ButtonsPosition(key1x, key2x, key3x, key4x, key1y, key2y, key3y, key4y);

        key1.setLocation((int)buttonsPosition1.getKey1x(),(int)buttonsPosition1.getKey1y());
        key2.setLocation((int)buttonsPosition1.getKey2x(),(int)buttonsPosition1.getKey2y());
        key3.setLocation((int)buttonsPosition1.getKey3x(),(int)buttonsPosition1.getKey3y());
        key4.setLocation((int)buttonsPosition1.getKey4x(),(int)buttonsPosition1.getKey4y());




        Refresh();
        playingEngine.start();

    }
    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        JFrame frame = new JFrame("Board");
        frame.setContentPane(new Board().TilesBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


    public void Refresh(){

        key1.setLocation((int)buttonsPosition1.getKey1x(),(int)buttonsPosition1.getKey1y());
        key2.setLocation((int)buttonsPosition1.getKey2x(),(int)buttonsPosition1.getKey2y());
        key3.setLocation((int)buttonsPosition1.getKey3x(),(int)buttonsPosition1.getKey3y());
        key4.setLocation((int)buttonsPosition1.getKey4x(),(int)buttonsPosition1.getKey4y());

    }
        /*Speedtxt.setText(Double.toString(car.getActualV()));
        Modeltxt.setText(car.getModel());
        Rejestrationtxt.setText(car.getRejestration());
        Rmptxt.setText(Double.toString(car.getEng().getActualSpeed()));
        Geartxt.setText(Integer.toString(car.getGb().getActualGear()));
        GearboxNametxt.setText(car.getGb().getName());
        EngineNametxt.setText(car.getEng().getName());
        textJedzdoX.setText(String.valueOf(car.getXd()));
        textJedzDoY.setText(String.valueOf(car.getYd()));
        textAktX.setText(String.valueOf(car.getPos().getX()));
        textAktY.setText(String.valueOf(car.getPos().getY()));
        carIcon.setLocation((int)car.getPos().getX(), (int)car.getPos().getY());


    }*/



}
