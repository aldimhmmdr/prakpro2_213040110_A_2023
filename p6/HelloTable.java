/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6;


/**
 *
 * @author acer latihan 6
 */

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

public class HelloTable extends JFrame {
    public HelloTable() {
        // Mengatur operasi default saat tombol close di klik
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label "Nama:"
        JLabel labelInput = new JLabel("Nama:");
        labelInput.setBounds(15, 40, 350, 10);

        // Membuat field teks untuk input nama
        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);

        // Membuat label "Jenis Member:"
        JLabel labelRadio = new JLabel("Jenis Member:");
        labelRadio.setBounds(15, 100, 350, 10);

        // Membuat radio button untuk pilihan jenis member
        JRadioButton radioButton1 = new JRadioButton("Silver", true);
        radioButton1.setBounds(15, 115, 350, 30);

        JRadioButton radioButton2 = new JRadioButton("Gold");
        radioButton2.setBounds(15, 145, 350, 30);

        JRadioButton radioButton3 = new JRadioButton("Platinum");
        radioButton3.setBounds(15, 175, 350, 30);

        // Mengelompokkan radio button untuk memilih satu opsi saja
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);
        bg.add(radioButton3);

        // Membuat tombol "Simpan"
        JButton button = new JButton("Simpan");
        button.setBounds(15, 205, 100, 40);

        // Membuat tabel
        javax.swing.JTable table = new JTable();

        // Membuat area scrollable untuk tabel
        JScrollPane scrollableTable = new JScrollPane(table);
        scrollableTable.setBounds(15, 250, 350, 200);

        // Membuat model untuk tabel
        MyTableModel tableModel = new MyTableModel();
        table.setModel(tableModel);

        // Menambahkan aksi ketika tombol "Simpan" ditekan
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mendapatkan jenis member yang dipilih
                String jenisMember = "";
                if (radioButton1.isSelected()) {
                    jenisMember = radioButton1.getText();
                }
                if (radioButton2.isSelected()) {
                    jenisMember = radioButton2.getText();
                }
                if (radioButton3.isSelected()) {
                    jenisMember = radioButton3.getText();
                }

                // Mendapatkan nama dari field teks
                String nama = textField.getText();

                // Menambahkan data ke model tabel
                tableModel.add(new ArrayList<>(Arrays.asList(nama, jenisMember)));
            }
        });

        // Menambahkan komponen-komponen ke frame
        this.add(button);
        this.add(textField);
        this.add(labelRadio);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(labelInput);
        this.add(scrollableTable);

        // Mengatur ukuran frame dan layout menjadi null
        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        // Memulai aplikasi GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloTable h = new HelloTable();
                h.setVisible(true);
            }
        });
    }
}
