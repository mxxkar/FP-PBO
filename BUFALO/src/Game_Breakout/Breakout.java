/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game_Breakout;

import javax.swing.JFrame;
import java.awt.EventQueue;

/**
 *
 * @author LENOVO
 */

public class Breakout extends JFrame {

    //Constructor
    public Breakout() {
        
        initUI();
    }
    
    private void initUI() {

        add(new Board());
        setTitle("BUFALO");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {

            var game = new Breakout();
            game.setVisible(true);
        });
    }
}
