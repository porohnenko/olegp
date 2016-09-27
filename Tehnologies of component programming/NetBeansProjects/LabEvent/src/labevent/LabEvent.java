package labevent;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.JFrame;

public class LabEvent extends Frame implements ActionListener, MouseListener {

    Button bt = new Button("Exit!");
    TextField tf = new TextField();
    MenuItem mi1 = new MenuItem("Exit");
    MenuItem mi2 = new MenuItem("ShowTime");
    Date dt;

    public LabEvent() {

        super("Event Handling");
        setSize(300, 300);
        MenuBar mbr = new MenuBar();
        Menu m1 = new Menu("Action");
        Menu m2 = new Menu("Options");

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        m1.add(mi1);
        m2.add(mi2);
        mbr.add(m1);
        mbr.add(m2);
        setLayout(new BorderLayout());
        add(bt, BorderLayout.NORTH);
        add(tf, BorderLayout.SOUTH);
        bt.addActionListener(this);
        tf.addMouseListener(this);
        setMenuBar(mbr);
        bt.addMouseListener(this);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt) {
            System.exit(0);
        } else if (ae.getSource() == mi2) {
            dt = new Date();
        }
    }

    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == bt) {
            bt.setLabel(tf.getText());
        }
        tf.setVisible(false);
    }

    public void mouseExited(MouseEvent me) {
        tf.setVisible(true);
    }

    public void mousePressed(MouseEvent me) {
        tf.setVisible(true);
    }

    public void mouseClicked(MouseEvent me) {
       
        javax.swing.JOptionPane.showMessageDialog(null, "" + dt);
    }

    public void mouseReleased(MouseEvent me) {
        tf.setVisible(true);
    }

    public static void main(String[] args) {
        LabEvent le = new LabEvent();
        
    }

}
