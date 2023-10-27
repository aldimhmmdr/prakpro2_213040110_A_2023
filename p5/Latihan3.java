/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5;

/**
 *
 * @author acer
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author acer
 */
public class Latihan3 extends JFrame {
   private boolean checkboxSelected;

    public Latihan3() {
        this.checkboxSelected = false;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel headerLabel = new JLabel("Form Biodata", JLabel.CENTER);

        JPanel controlPanel = new JPanel();
        JPanel panel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(new GridBagLayout());
        panel.setSize(400,0);

//        KOMPONEN YA GAES
        JLabel labelnama = new JLabel("Nama :");
        JLabel labelnomor = new JLabel("Nomor HP:");
        JLabel labelradio = new JLabel("Jenis Kelamin :");

        JTextField textnama = new JTextField();
        JTextField textnomor = new JTextField();
        JTextArea txtoutput = new JTextArea();
        JScrollPane scroll = new JScrollPane (txtoutput);
        JButton button = new JButton("Simpan");

        JCheckBox checkbox = new JCheckBox("Warga negara Asing");checkbox.setBounds(15,230,200,30);

        JRadioButton radioButton_1 = new JRadioButton("Laki-laki", true);radioButton_1.setBounds(15,180,200,30);
        JRadioButton radioButton_2 = new JRadioButton("Perempuan");radioButton_2.setBounds(15,200,200,30);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(labelnama, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(labelradio, gbc);
//        textnama & radio laki-laki
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(textnama, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(radioButton_1, gbc);
//        nomor hape & perempuan
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelnomor, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(radioButton_2, gbc);
//        textnomor & checkbox
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(textnomor, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(checkbox, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(button, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.ipady = 100;
        panel.add(scroll, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                checkboxSelected = e.getStateChange() == 1;
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jenismember = "", nama = textnama.getText(), nomor = textnomor.getText(), wna;
                if(radioButton_1.isSelected()) jenismember = radioButton_1.getText();
                if(radioButton_2.isSelected()) jenismember = radioButton_2.getText();
                txtoutput.append("Nama \t: "+nama+"\n");
                txtoutput.append("Nomor HP \t: "+nomor+"\n");
                txtoutput.append("Jenis Kelamin \t:"+jenismember+"\n");
                if (checkboxSelected) wna = "Ya" ;else wna = "Tidak";
                txtoutput.append("WNA \t:"+wna+"\n");
                textnama.setText("");
                textnomor.setText("");
            }
        });


        controlPanel.add(panel);
        this.setLayout(new GridLayout(4,1));
        this.add(headerLabel);
        this.add(controlPanel);
        this.setSize(400,900);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Latihan3().setVisible(true);
            }
        });
    }
}
