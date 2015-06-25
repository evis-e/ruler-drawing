import javax.swing.*;

/**
 * Created by evis on 15/06/06.
 */
public class RulerDrawing extends JFrame {
    public RulerDrawing(){
        int w=1000, h=300; //size of the window
        setTitle("Ruler drawing");
        setSize(w, h);
        setResizable(false);
        setLocationRelativeTo(null);
        //sets the position of the window to the center.

        DrawPic draw = new DrawPic(w, h);
        add(draw);
        setVisible(true);
    }
}
