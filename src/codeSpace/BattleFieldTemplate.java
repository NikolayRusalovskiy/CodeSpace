package codeSpace;

import javax.swing.*;
import java.awt.*;

public class BattleFieldTemplate extends JPanel {
    /**
     * Write your code here.
     */
// task 2
    void runTheGame() throws Exception {

        for (int i = 0; i < 4; i++) {
            int radX = (int) (Math.random() * 9 + 1);
            int radY = (int) (Math.random() * 9 + 1);
            moveToQuadrant(radX, radY);
            Thread.sleep(500);
        }
    }

    void move1() throws Exception {

        for (int i = 0; i <= 64; i += step) {
            if (tankDirection == 1) {
                if (tankY == 0) {
                    graphCore("");
                    return;
                } else {
                    graphCore("Top");
                    tankY -= step;
                }
            } else if (tankDirection == 2) {
                if (tankY == (BF_HEIGHT - 64)) {
                    System.out.println("(" + tankX + "; " + tankY + ")");
                    return;
                } else {
                    System.out.println("Bottom (" + tankX + "; " + tankY + ")");
                    tankY += step;
                }
            } else if (tankDirection == 3) {
                if (tankX == 0) {
                    System.out.println("(" + tankX + "; " + tankY + ")");
                    return;
                } else {
                    graphCore("Left");
                    tankX -= step;
                }
            } else if (tankDirection == 4) {
                if (tankX == (BF_WIDTH - 64)) {
                    graphCore("");
                    return;
                } else {
                    graphCore("Right");
                    tankX += step;
                }
            }
            repaint();
            Thread.sleep(speed);
        }
    }

    void move() throws Exception {
        for (int i = 0; i < 64; i += step) {
            switch (tankDirection) {
                case 1:
                    tankY -= step;
                    break;
                case 2:
                    tankY += step;
                    break;
                case 3:
                    tankX -= step;
                    break;
                case 4:
                    tankX += step;
                    break;
            }
            repaint();
            Thread.sleep(speed);
        }
    }

    private void graphCore(String s) {
        System.out.println(s + "(" + tankX + "; " + tankY + ")");
    }


    String getQuadrantXY(int v, int h) {
        if (v <= 0 | h <= 0 | v > 10 | h > 10) {
            return "Invalid Quadrant number";
        }
        h = (h - 1) * 64;
        v = (v - 1) * 64;
        String coordinates = h + "_" + v;
        return coordinates;
    }

    void moveToQuadrant(int v, int h) throws Exception {
        String cordinate = getQuadrantXY(v, h);
        int coreX = Integer.parseInt(cordinate.substring(0, cordinate.indexOf('_')));
        int coreY = Integer.parseInt(cordinate.substring(cordinate.indexOf('_') + 1));
        while (tankX != coreX) {
            if ((coreX - tankX) > 0) {
                tankDirection = 4;
                move();
            } else if ((coreX - tankX) < 0) {
                tankDirection = 3;
                move();
            }
        }
        while (tankY != coreY) {
            if ((coreY - tankY) > 0) {
                tankDirection = 2;
                move();
            } else if ((coreY - tankY) < 0) {
                tankDirection = 1;
                move();
            }
        }


    }

    void moveRandom() throws Exception {
        while (true) {
            tankDirection = (int) (Math.random() * 4) + 1;
            move();
        }
    }

    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.
    int tankX = 0;
    int tankY = 0;
    long speed = 50;
    int tankDirection = 4;
    boolean COLORDED_MODE = true;
    final int BF_WIDTH = 576; // 9 kvadratov
    final int BF_HEIGHT = 576; // 9 kvadratov
    int step = 8; // 64

    public static void main(String[] args) throws Exception {
        BattleFieldTemplate bf = new BattleFieldTemplate();
        bf.runTheGame();
    }

    public BattleFieldTemplate() throws Exception {
        JFrame frame = new JFrame("BATTLE FIELD");
        frame.setLocation(500, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH + 20, BF_HEIGHT + 48));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++) {
            for (int h = 0; h < 9; h++) {
                if (COLORDED_MODE) {
                    if (i % 2 == 0) {
                        cc = new Color(252, 241, 177);
                    } else {
                        cc = new Color(233, 243, 255);
                    }
                } else {
                    cc = new Color(180, 180, 180);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }
        g.setColor(new Color(0, 255, 0));
        g.fillOval(tankX, tankY, 64, 64); //.fillRect(tankX, tankY, 64, 64);
    }
}