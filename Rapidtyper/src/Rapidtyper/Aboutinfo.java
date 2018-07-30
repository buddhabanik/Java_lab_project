/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rapidtyper;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Buddha
 */
public class Aboutinfo extends JPanel {

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Font plainFont = new Font("Verdana", Font.BOLD + Font.PLAIN, 40);
        g2.setFont(plainFont);
        g2.setColor(Color.BLACK);
        g2.drawString("About..>", 70, 130);
        Font italicFont = new Font("Verdana", Font.BOLD + Font.PLAIN, 20);
        g2.setFont(italicFont);
        g2.drawString("Buddha Chandra Banik", 70, 190);
        Font boldFont = new Font("Verdana",Font.BOLD + Font.PLAIN, 20);
        g2.setFont(boldFont);
        g2.drawString("Reg. no: 2013331034", 70, 220);
        Font boldItalicFont = new Font("Verdana", Font.BOLD + Font.PLAIN, 20);
        g2.setFont(boldItalicFont);
        g2.drawString("Dept. of CSE, SUST", 70, 250);
        Font conFont = new Font("Verdana", Font.BOLD + Font.PLAIN, 20);
        g2.setFont(conFont);
        g2.drawString("Contact: buddhobaniks@gmail.com", 70, 275);
        Font spFont = new Font("Verdana", Font.BOLD + Font.PLAIN + Font.PLAIN, 24);
        g2.setFont(spFont);
        g2.drawString("Under super Vision of : ", 70, 330);
        Font srFont = new Font("Verdana",Font.BOLD + Font.PLAIN, 20);
        g2.setFont(srFont);
        g2.drawString("Md. Eamin Rahaman", 70, 360);
        Font saFont = new Font("Verdana",Font.BOLD + Font.PLAIN, 20);
        g2.setFont(saFont);

        g2.drawString("Assistant Professor, Dept. of CSE, SUST", 70, 390);

    }

    public static void About(Frame p) {

        JFrame fabout = new JFrame("About info");
        Frame myparent;
        myparent = p;
        myparent.setVisible(false);
        Aboutinfo panel = new Aboutinfo();
        panel.setLayout(null);
        JButton back = new JButton("back");
        back.setBounds(10, 10, 120, 30);
        panel.add(back);
        Cursor c4 = new Cursor(Cursor.HAND_CURSOR);
        back.setCursor(c4);
        back.setFont(new Font("Arial", Font.PLAIN, 20 ));
        back.setBackground(Color.ORANGE);
        back.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                  try {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("button.wav").getAbsoluteFile());
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();
                } catch (Exception ex) {
                    System.out.println("ERROR in StartMenu!!!");
                }
                  
                fabout.dispose();
                myparent.setVisible(true);
            }
        });

        panel.setBackground(Color.PINK);
        fabout.add(panel);
        fabout.setSize(1000, 670);
        fabout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fabout.setVisible(true);
        fabout.setResizable(false);

        fabout.addWindowListener(new WindowListener() {
            @Override
            public void windowClosing(WindowEvent e) {
                myparent.setVisible(true);
            }

            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }

        });

    }
     private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
