/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game_Breakout;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class Breakout extends JFrame {

    public Breakout() {
        
        initUI();
    }
    
    private void initUI() {

        add(new Board());
        setTitle("Breakout");

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
