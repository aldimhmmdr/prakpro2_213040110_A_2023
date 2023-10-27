/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6;

/**
 *
 * @author acer
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloMessageDialog2 extends JFrame {
    public HelloMessageDialog2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // JButton button = new JButton("Error");
        // JButton button = new JButton("Informasi");
        // JButton button = new JButton("Peringatan");
        // JButton button = new JButton("Pertanyaan");
        JButton button = new JButton("Polos");
        button.setBounds(130, 100, 100, 40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II.",
                // "Pesan Error", JOptionPane.ERROR_MESSAGE);
                // JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II.",
                // "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II.",
                // "Pesan Peringatan", JOptionPane.WARNING_MESSAGE);
                // JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II.",
                // "Pesan Pertanyaan", JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II.",
                "Pesan Polos", JOptionPane.PLAIN_MESSAGE);
            }
        });

        this.add(button);

        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloMessageDialog2 h = new HelloMessageDialog2();
                h.setVisible(true);
            }
        });
    }
}

