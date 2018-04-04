package ru.geekbrains.tic_tac_toe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Map extends JPanel {

    Map() {
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                mouseRelease(e);
            }
        });
    }

    private void mouseRelease(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
//        int[][] array = new int[3][3];
        int i, j;
        if (x < 160) i = 0; else if (x < 310) i = 1; else i = 2;
        if (y < 145) j = 0; else if (y < 295) j = 1; else j = 2;
        System.out.println("Array[" + (i + 1) + "][" + (j + 1) + "]");
    }

    public void startNewGame() {
        System.out.println("New game");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(35, 142, 410, 6);
        g.fillRect(35, 292, 410, 6);
        g.fillRect(157, 10, 6, 410);
        g.fillRect(307, 10, 6, 410);
    }
}
