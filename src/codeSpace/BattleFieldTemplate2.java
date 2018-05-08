package codeSpace;

import javax.swing.*;
import java.awt.*;

public class BattleFieldTemplate2 extends JPanel {
    final boolean COLORDED_MODE = true;
    final int BF_HEIGHT = 576;
    final int BF_WIDTH = 576;
    final int TOP = 1;
    final int BOTTOM = 2;
    final int LEFT = 3;
    final int RIGHT = 4;
    int tankDirection = RIGHT;
    int tankX = 0;
    int tankY = 0;
    int bulletX = -100;
    int bulletY = -100;
    final int SPEED = 20;
    final int BULLET_SPEED = 3;
    final int STEP = 1;
    final int CELL_SIZE = 64;
    /**
     * Write your code here.
     */
    String[][] battleField = {
            {" ", " ", "B", " ", " ", " ", " ", " ", "B"},
            {" ", "B", "B", "B", " ", "B", "B", "B", "B"},
            {" ", "B", "B", "B", " ", " ", " ", " ", " "},
            {" ", " ", "B", " ", " ", " ", "B", " ", "B"},
            {" ", " ", "B", " ", "B", " ", "B", " ", "B"},
            {" ", " ", "B", " ", "B", " ", "B", " ", "B"},
            {" ", " ", "B", " ", "B", " ", "B", " ", "B"},
            {" ", " ", "B", " ", "B", " ", "B", " ", "B"},
            {" ", " ", "B", " ", "B", " ", "B", " ", "B"}
    };

    void runTheGame() throws Exception {
//        Task22
//        moveToQuadrant(3, 7);
//        moveToQuadrant(2, 6);

//        Task2_2.3
//        while (fire()) ;
//        tankDirection = LEFT;
        setTankQuadrant(3, 4);
//        while (fire()) ;
        moveToQuadrant2(2, 6);
        moveToQuadrant2(1, 1);
        moveToQuadrant2(1, 9);
        moveToQuadrant2(9, 9);
        moveToQuadrant2(9, 1);
        System.out.println("the End");
    }

    void setTankQuadrant(int v, int h) {
        tankX = v * CELL_SIZE;
        tankY = h * CELL_SIZE;
    }

    void moveToQuadrant2(int v, int h) throws Exception {
        String cordinate = getQuadrantXY(v, h);
        int coreX = Integer.parseInt(cordinate.substring(0, cordinate.indexOf('_')));
        int coreY = Integer.parseInt(cordinate.substring(cordinate.indexOf('_') + 1));
        while (tankX != coreX) {
            if ((coreX - tankX) > 0) {
                tankDirection = RIGHT;
                move2();
            } else if ((coreX - tankX) < 0) {
                tankDirection = LEFT;
                move2();
            }
        }
        while (tankY != coreY) {
            if ((coreY - tankY) > 0) {
                tankDirection = BOTTOM;
                move2();
            } else if ((coreY - tankY) < 0) {
                tankDirection = TOP;
                move2();
            }
        }
    }

    void clearNextField() throws Exception {
        int tankXfuture = tankX;
        int tankYfuture = tankY;
        switch (tankDirection) {
            case TOP:
                tankYfuture = tankY - CELL_SIZE;
                break;
            case BOTTOM:
                tankYfuture = tankY + CELL_SIZE;
                break;
            case LEFT:
                tankXfuture = tankX - CELL_SIZE;
                break;
            case RIGHT:
                tankXfuture = tankX + CELL_SIZE;
                break;
        }
        if (processInterception(tankXfuture, tankYfuture)) {
            System.out.println("Make fire");
            fire();
        }

    }

    void move2() throws Exception {
        clearNextField();
        for (int i = 0; i < CELL_SIZE; i += STEP) {
            switch (tankDirection) {
                case TOP:
                    tankY -= STEP;
                    break;
                case BOTTOM:
                    tankY += STEP;
                    break;
                case LEFT:
                    tankX -= STEP;
                    break;
                case RIGHT:
                    tankX += STEP;
                    break;
            }
            repaint();
            Thread.sleep(SPEED);
        }
    }

    boolean verifyShoot() {
        if (bulletX < (BF_WIDTH - 32) && (bulletY < BF_HEIGHT - 32) && bulletX > 0 && bulletY > 0) {
            return true;
        }
        return false;
    }

    boolean fire() throws Exception {
        bulletX = tankX + 25;
        bulletY = tankY + 25;
        boolean doFire = false;
        int bulletStarterX = bulletX;
        int bulletStarterY = bulletY;
        while (verifyShoot()) {
            if (processInterception()) {
                bulletX = -100;
                bulletY = -100;
                doFire = true;
            }

            for (int i = 0; i < CELL_SIZE; i += STEP) {
                switch (tankDirection) {
                    case TOP:
                        bulletY -= STEP;
                        break;
                    case BOTTOM:
                        bulletY += STEP;
                        break;
                    case LEFT:
                        bulletX -= STEP;
                        break;
                    case RIGHT:
                        bulletX += STEP;
                        break;
                }
                repaint();
                Thread.sleep(BULLET_SPEED);
            }

        }
        return doFire;
    }

    boolean processInterception() {
        String quadrantNumbers = getQuadrant(bulletX, bulletY);
        int quadrantVertical = Integer.parseInt(quadrantNumbers.substring(0, quadrantNumbers.indexOf('_')));
        int quadrantHorizontal = Integer.parseInt(quadrantNumbers.substring(quadrantNumbers.indexOf('_') + 1));
        if (verifyExistenceOfCell(quadrantVertical, quadrantHorizontal)) {
            if (battleField[quadrantVertical][quadrantHorizontal].equals("B")) {
                battleField[quadrantVertical][quadrantHorizontal] = " ";
                return true;
            }
        }

        return false;
    }

    boolean processInterception(int x, int y) {
        String quadrantNumbers = getQuadrant(x, y);
        int quadrantVertical = Integer.parseInt(quadrantNumbers.substring(0, quadrantNumbers.indexOf('_')));
        int quadrantHorizontal = Integer.parseInt(quadrantNumbers.substring(quadrantNumbers.indexOf('_') + 1));
        if (verifyExistenceOfCell(quadrantVertical, quadrantHorizontal)) {
            if (battleField[quadrantVertical][quadrantHorizontal].equals("B")) {
//                battleField[quadrantVertical][quadrantHorizontal] = " ";
                return true;
            }
        }
        return false;
    }

    boolean verifyExistenceOfCell(int v, int h) {
        if ((v >= 0 && v < battleField.length) && (h >= 0 && h < battleField[v].length)) {
            return true;
        }
        return false;
    }

    void turn(int direction) {
        if (tankDirection != direction) {
            tankDirection = direction;
        }
    }

    String getQuadrantXY(int v, int h) {
        if (v <= 0 | h <= 0 | v > 10 | h > 10) {
            return "Invalid Quadrant number";
        }
        h = (h - 1) * CELL_SIZE;
        v = (v - 1) * CELL_SIZE;
        String coordinates = h + "_" + v;
        return coordinates;
    }

    String getQuadrant(int x, int y) {

        int vertical = y / CELL_SIZE;
        int horizontal = x / CELL_SIZE;
        String coordinateOfBullet = vertical + "_" + horizontal;
        return coordinateOfBullet;
    }

    void moveToQuadrant(int v, int h) throws Exception {
        String cordinate = getQuadrantXY(v, h);
        int coreX = Integer.parseInt(cordinate.substring(0, cordinate.indexOf('_')));
        int coreY = Integer.parseInt(cordinate.substring(cordinate.indexOf('_') + 1));
        while (tankX != coreX) {
            if ((coreX - tankX) > 0) {
                tankDirection = RIGHT;
                move(tankDirection);
            } else if ((coreX - tankX) < 0) {
                tankDirection = LEFT;
                move(tankDirection);
            }
        }
        while (tankY != coreY) {
            if ((coreY - tankY) > 0) {
                tankDirection = BOTTOM;
                move(tankDirection);
            } else if ((coreY - tankY) < 0) {
                tankDirection = TOP;
                move(tankDirection);
            }
        }
    }

    void move(int direction) throws InterruptedException {
        turn(direction);
        for (int i = 0; i < CELL_SIZE; i += STEP) {
            switch (tankDirection) {
                case TOP:
                    tankY -= STEP;
                    break;
                case BOTTOM:
                    tankY += STEP;
                    break;
                case LEFT:
                    tankX -= STEP;
                    break;
                case RIGHT:
                    tankX += STEP;
                    break;
            }
            repaint();
            Thread.sleep(SPEED);
        }
    }
// Magic bellow. Do not worry about this now, you will understand
// everything in this course.
// Please concentrate on your tasks only.

    public static void main(String[] args) throws Exception {
        BattleFieldTemplate2 bf = new BattleFieldTemplate2();
        bf.runTheGame();
    }

    public BattleFieldTemplate2() throws Exception {
        JFrame frame = new JFrame("BATTLE FIELD 2");
        frame.setLocation(750, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH + 18, BF_HEIGHT + 46));
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
                g.fillRect(h * CELL_SIZE, v * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
        for (int j = 0; j < battleField.length; j++) {
            for (int k = 0; k < battleField.length; k++) {
                if (battleField[j][k].equals("B")) {
                    String coordinates = getQuadrantXY(j + 1, k + 1);
                    int separator = coordinates.indexOf("_");
                    int x = Integer.parseInt(coordinates.substring(0, separator));
                    int y = Integer.parseInt(coordinates.substring(separator + 1));
                    g.setColor(new Color(0, 0, 155));
                    g.fillOval(x, y, CELL_SIZE, CELL_SIZE);
                }
            }
        }
        g.setColor(new Color(255, 0, 0));
        g.fillOval(tankX, tankY, CELL_SIZE, CELL_SIZE);
        g.setColor(new Color(0, 255, 0));
        if (tankDirection == TOP) {
            g.fillRect(tankX + 20, tankY, 24, 34);
        } else if (tankDirection == BOTTOM) {
            g.fillRect(tankX + 20, tankY + 30, 24, 34);
        } else if (tankDirection == LEFT) {
            g.fillRect(tankX, tankY + 20, 34, 24);
        } else {
            g.fillRect(tankX + 30, tankY + 20, 34, 24);
        }
        g.setColor(new Color(255, 255, 0));
        g.fillOval(bulletX, bulletY, 14, 14);
    }
}