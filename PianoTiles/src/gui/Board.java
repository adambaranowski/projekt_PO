package gui;

import javax.swing.*;

public class Board {

    private JPanel TilesBoard;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Board");
        frame.setContentPane(new Board().TilesBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
