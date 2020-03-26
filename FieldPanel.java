package finalVersion_tictactoe;

import javax.swing.*;
import java.awt.*;

public class FieldPanel extends JPanel {
    FieldPanel(){
        setBackground(Color.PINK);
    }
    public static void addLine(int x1, int y1, int x2, int y2, Color color){
        FieldPanel.addLine(x1,y1,x2, y2,Color.BLACK);
    }
    void startNewGame(int GameMode, int fieldSizeX, int fieldSizeY, int winLength){
        System.out.printf("field size: %d, \nwin length: %d\n",fieldSizeX, winLength);
    }
    FieldPanel line = new FieldPanel();

}
