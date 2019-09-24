package nháp;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Nhap3 extends JPanel {

    public Nhap3(){
        
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(100, 100, 100, 100);
    }
}
