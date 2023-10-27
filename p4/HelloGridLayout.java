/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4;

/**
 *
 * @author acer
 */

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author acer
 */
public class HelloGridLayout extends JFrame implements ActionListener  {
    private JButton buttonA; //code ini untuk tombol yang digunakan untuk permainan tictactoe.
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JButton buttonE;
    private JButton buttonF;
    private JButton buttonG;
    private JButton buttonH;
    private JButton buttonI;
    
    //code ini untuk buttons dari sembilan tombol gameOver untuk menandakan bahwa permainanmberakhir.
    private JButton[] buttons;
    private boolean gameOver;

    //code ini  untuk menghentikan output ketika di tutup dan untuk mengatur penutupan output ketika tombol penutup ditekan.
    public HelloGridLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        gameOver = false; // ini untuk menandakan bahwa permainan belum dimulai.
        
        //code ini untuk merespon tindakan pengguna 
        buttonA = new JButton("");
        buttonB = new JButton("");
        buttonC = new JButton("");
        buttonD = new JButton("");
        buttonE = new JButton("");
        buttonF = new JButton("");
        buttonG = new JButton("");
        buttonH = new JButton("");
        buttonI = new JButton("");
      
        buttons = new JButton[9];
        buttons[0] = buttonA;
        buttons[1] = buttonB;
        buttons[2] = buttonC;
        buttons[3] = buttonD;
        buttons[4] = buttonE;
        buttons[5] = buttonF;
        buttons[6] = buttonG;
        buttons[7] = buttonH;
        buttons[8] = buttonI;
        
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonG.addActionListener(this);
        buttonH.addActionListener(this);
        buttonI.addActionListener(this);
        
        //code ini untuk mengatur tata letak tanda GridLayout
        this.setLayout(new GridLayout(3, 3));
        
        //code ini untuk menambahkan tombol pada frame sesuai dengan tata letak GridLayout
        this.add(buttonA);
        this.add(buttonB);
        this.add(buttonC);
        this.add(buttonD);
        this.add(buttonE);
        this.add(buttonF);
        this.add(buttonG);
        this.add(buttonH);
        this.add(buttonI);
        
        //code ini untuk mengatur ukuran frame.
        this.setSize(300, 400);
        
    }

    //code ini untuk pengkondisian ketika salah satu tombol ditekan akan muncul tombol O dan X secara bergantian
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            JButton button = (JButton) e.getSource();
            if (button.getText().isEmpty()) {
                button.setText("0");
                checkWinner();
                if (!gameOver) {
                    for (int i = 0; i < buttons.length; i++) {
                        if(buttons[i].getText().isEmpty()) {
                           buttons[i].setText("X");
                           break;
                        }               
                    }
                    checkWinner(); //code ini untuk mengecek apakah sudah ada pemenangnya atau permainan nya seri. 
                }
            }
        }
    }
    
    //code ini unntuk menjelaskan bahwa winner itu digunakan untuk menyimpan simbol X dan O dari pemain yang menang 
    private void checkWinner() {
        String winner = "";
        //code ini untuk pengecekan apakah tombol A ini memiliki teks yang tidak kosong
        if (!buttonA.getText().isEmpty()
            && buttonA.getText().equals(buttonB.getText())
            && buttonA.getText().equals(buttonC.getText())) 
        {
            winner = buttonA.getText();
            buttonA.setForeground(Color.RED);
            buttonB.setForeground(Color.RED);
            buttonC.setForeground(Color.RED);
        } else if (!buttonD.getText().isEmpty()
            && buttonD.getText().equals(buttonE.getText())
            && buttonD.getText().equals(buttonF.getText()))
        {
            winner = buttonD.getText();
            buttonD.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonF.setForeground(Color.RED);
        } else if (!buttonG.getText().isEmpty()
            && buttonG.getText().equals(buttonH.getText())
            && buttonG.getText().equals(buttonI.getText()))
        {
            winner = buttonG.getText();
            buttonG.setForeground(Color.RED);
            buttonH.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        } else if (!buttonA.getText().isEmpty()
            && buttonA.getText().equals(buttonD.getText())
            && buttonA.getText().equals(buttonG.getText()))
        {
            winner = buttonA.getText();
            buttonA.setForeground(Color.RED);
            buttonD.setForeground(Color.RED);
            buttonG.setForeground(Color.RED);
        } else if (!buttonB.getText().isEmpty()
            && buttonB.getText().equals(buttonE.getText())
            && buttonB.getText().equals(buttonH.getText()))
        {
            winner = buttonB.getText();
            buttonB.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonH.setForeground(Color.RED);
        } else if (!buttonC.getText().isEmpty()
            && buttonC.getText().equals(buttonF.getText())
            && buttonC.getText().equals(buttonI.getText()))
        {
            winner = buttonC.getText();
            buttonC.setForeground(Color.RED);
            buttonF.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        } else if (!buttonA.getText().isEmpty()
            && buttonA.getText().equals(buttonE.getText())
            && buttonA.getText().equals(buttonI.getText()))
        {
            winner = buttonA.getText();
            buttonA.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        } else if (!buttonC.getText().isEmpty()
            && buttonC.getText().equals(buttonE.getText())
            && buttonC.getText().equals(buttonG.getText()))
        {
            winner = buttonC.getText();
            buttonC.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonG.setForeground(Color.RED);
        } 

        gameOver = !winner.isEmpty(); //code ini adalah jika winner  sudah ada pemenangnya maka game tersebut telah selesai.
    }
    
    //code ini adalah metode main fungsinya untuk mengatur menjadi terlihat 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloGridLayout f = new HelloGridLayout();
                f.setVisible(true);
            }
        });
    }   
}