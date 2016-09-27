package labTable;

import java.awt.*;
import java.awt.event.*;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javax.swing.*;
import javax.swing.table.*;

public class Lab_Table extends JFrame implements ActionListener, MouseListener {

    JTable table;
    JScrollPane scroller;
    JButton fb = new JButton("fillTable");
    JButton cb = new JButton("clearTable");
    String[] heads = new String[]{"name", "group"};

    public Lab_Table() {
        table = new JTable(4, 2);
        scroller = new javax.swing.JScrollPane(table);
//        table.addMouseListener(this);
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int rw = table.getSelectedRow();
                int cl = table.getSelectedColumn();
                String s = "" + table.getValueAt(rw, cl);
                javax.swing.JOptionPane.showMessageDialog(null, s);
            }
        });
        setLayout(null);
        add(scroller);
        add(fb);
        add(cb);
        fb.addActionListener(this);
        cb.addActionListener(this);
        fb.setSize(300,400);
        this.setBackground(new Color(140, 120, 60));
        fb.setBounds(20, 280, 100, 20);
        cb.setBounds(130, 280, 100, 20);
        scroller.setBounds(20, 20, 260, 250);
        this.setLocationRelativeTo(null);
        int view = table.convertColumnIndexToView(0);
        javax.swing.table.TableColumn tbc = table.getColumnModel().getColumn(view);
        tbc.setHeaderValue("name");
        view = table.convertColumnIndexToView(1);
        tbc = table.getColumnModel().getColumn(view);
        tbc.setHeaderValue("group");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == fb) {
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    String s = "" + i + ";" + j;
                    table.setValueAt(s, i, j);
                }
            }
        } else if (ae.getSource() == cb) {
            String s = "";
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    table.setValueAt(s, i, j);
                }
            }
        }
    }

    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }

    public static void main(String[] args) {
        Lab_Table z = new Lab_Table();
        z.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

}
