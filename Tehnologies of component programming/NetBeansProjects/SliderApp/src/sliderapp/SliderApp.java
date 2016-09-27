package sliderapp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderApp extends JFrame {

    public SliderApp() {
        super("Slider in Action");
        setSize(220, 400);
        setLocation(300, 400);
        Container cnt = getContentPane();
        JPanel gp1 = new JPanel(new GridLayout(2, 1));
        JPanel gp2 = new JPanel();
        JPanel gp3 = new JPanel();
        
        final JScrollBar scrb = new JScrollBar(JScrollBar.HORIZONTAL);
        final JScrollBar scrb1 = new JScrollBar(JScrollBar.VERTICAL);
        int height = scrb.getPreferredSize().height;
        int width = scrb1.getPreferredSize().width;
        scrb.setPreferredSize(new Dimension(175, height));
        scrb1.setPreferredSize(new Dimension(width, 150));
//        scrb1.setSize(10,200);
        gp2.add(scrb);
        gp3.add(scrb1);
        
        gp1.add(gp2);
        gp1.add(gp3);
        cnt.add(gp1);
        
        scrb.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int r = (int) (Math.random() * 255);
                int g = (int) (Math.random() * 255);
                int b = (int) (Math.random() * 255);
                scrb.setBackground(new Color(r, g, b));
            }
        });
        scrb1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int r = (int) (Math.random() * 255);
                int g = (int) (Math.random() * 255);
                int b = (int) (Math.random() * 255);
                scrb1.setBackground(new Color(r, g, b));
            }
        });
    }

    public static void main(String[] args) {
        SliderApp f = new SliderApp();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

}
