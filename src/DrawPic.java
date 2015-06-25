import javax.swing.*;
import java.awt.*;

/**
 * Created by evis on 15/06/06.
 */
public class DrawPic extends JPanel {
    int w, h;
    int axis, dec = 30, maxDepth = 6;
    public DrawPic(int w, int h){
        this.w = w;
        this.h = h;
        axis = h/2;  // the horizontal axis
    }
    void recursiveDrawing(Graphics g, int s, int e, int l, int cnt){
        //maxDepth determines the depth of the recursion calls,
        //thus the density of the lines
        if(cnt > maxDepth)
            return;
        g.drawLine((e+s)/2, axis + l/2, (e+s)/2, axis - l/2);
        //continue in the left part
        recursiveDrawing(g, s, (e + s) >> 1, l - dec, cnt + 1);
        //continue in the right part
        recursiveDrawing(g, (e + s) >> 1, e, l - dec, cnt + 1);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        recursiveDrawing(g, 0, w, 200, 0);
    }
}
