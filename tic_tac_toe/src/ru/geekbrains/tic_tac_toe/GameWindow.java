package ru.geekbrains.tic_tac_toe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame implements ActionListener {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameWindow();
            }
        });
    }

    private final JButton buttonExit = new JButton("Exit");
    private final JButton buttonNewGame = new JButton("New game");

    private GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(500, 100);
        setSize(500,500);
        setTitle("Tic-Tac-Toe");
        buttonNewGame.addActionListener(this);
        buttonExit.addActionListener(this);
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        bottomPanel.add(buttonNewGame);
        bottomPanel.add(buttonExit);
        add(bottomPanel, BorderLayout.SOUTH);

        Map map = new Map();
        add(map, BorderLayout.CENTER);

        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonNewGame) {
            Map map = new Map(); //Правильно???
            map.startNewGame();
        } else if (source == buttonExit) {
            System.out.println("Push Exit");
        }
    }
}
