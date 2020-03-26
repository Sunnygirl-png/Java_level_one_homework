package finalVersion_tictactoe;

import finalVersion_tictactoe.FieldPanel;

import javax.swing.*;
import java.awt.*;

public class Map extends JComponent {
    public Map(){
        super();
    }
private static class Line{
        int x1 = FieldPanel.WIDTH;
        int y1 = FieldPanel.HEIGHT;
        int x2 = FieldPanel.WIDTH;
        int y2= FieldPanel.HEIGHT;
        Color color = Color.BLACK;

        public Line(int x1, int y1, int x2, int y2, Color color){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            this.color = color;

        }
public void addLine(int x1, int y1, int x2, int y2, Color color) {
    FieldPanel.addLine(x1, y1, x2, y2, Color.BLACK);
    repaint();
}
public void repaint(){};

        }
    }
