package finalVersion_tictactoe;

import finalVersion_tictactoe.FieldPanel;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH = 507;
    private static final int WIN_HIGHT = 555;
    private static final int WIN_POSX = 605;
    private static final int WIN_POSY = 250;
    private FieldPanel fieldPanel;

    GameWindow() {
        setVisible(true);
        setSize(WIN_WIDTH, WIN_HIGHT);
        setLocation(WIN_POSX, WIN_POSY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton buttonStart = new JButton("Start game");
        JButton buttonExit = new JButton("Exit");
        add(buttonStart);
        add(buttonExit);

        JPanel pBtns = new JPanel(new GridLayout(1, 2));
        fieldPanel = new FieldPanel();
    }

    void startNewGame(int GameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        fieldPanel.startNewGame(GameMode, fieldSizeX, fieldSizeY, winLength);
    }

public static void main(String [] args){
        FieldPanel.addLine(3,3,3,3, Color.BLACK);
    }
}