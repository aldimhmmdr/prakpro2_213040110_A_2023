/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6;

/**
 *
 * @author acer latihan 7
 */
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

public class BioDataApp4 extends JFrame {
    public BioDataApp4() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelNama = new JLabel("Nama:");
        labelNama.setBounds(15, 40, 100, 10);

        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(15, 60, 350, 30);

        JLabel labelNomorHP = new JLabel("Nomor HP:");
        labelNomorHP.setBounds(15, 95, 100, 10);

        JTextField textFieldNomorHP = new JTextField();
        textFieldNomorHP.setBounds(15, 110, 350, 30);

        JLabel labelRadio = new JLabel("Jenis Kelamin");
        labelRadio.setBounds(15, 130, 350, 10);

        JRadioButton radioButton1 = new JRadioButton("Laki-Laki", true);
        radioButton1.setBounds(15, 145, 350, 30);

        JRadioButton radioButton2 = new JRadioButton("Perempuan");
        radioButton2.setBounds(15, 175, 350, 30);

        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");
        checkBox.setBounds(15, 205, 350, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);

        JButton button = new JButton("Simpan");
        button.setBounds(15, 240, 100, 40);

        javax.swing.JTable table = new JTable();
        JScrollPane scrollableTable2 = new JScrollPane(table);
        scrollableTable2.setBounds(15, 300, 350, 200);

        MyTableModel2 tableModel2 = new MyTableModel2();
        table.setModel(tableModel2);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jenisKelamin = "";

                if(radioButton1.isSelected()) {
                    jenisKelamin = radioButton1.getText();
                }
                if(radioButton2.isSelected()) {
                    jenisKelamin = radioButton2.getText();
                }

                String nama = textFieldNama.getText();
                String nomorHP = textFieldNomorHP.getText();
                String statusWNA = checkBox.isSelected() ? "Ya" : "Bukan";

                tableModel2.add(new ArrayList<>(Arrays.asList(nama, nomorHP, jenisKelamin,statusWNA)));
            }
        });

        this.add(button);
        this.add(labelNama);
        this.add(textFieldNama);
        this.add(labelNomorHP);
        this.add(textFieldNomorHP);
        this.add(labelRadio);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(checkBox);
        this.add(scrollableTable2);

        this.setSize(400, 550);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BioDataApp4 b4 = new BioDataApp4();
                b4.setVisible(true);
            }
        });
    }
}