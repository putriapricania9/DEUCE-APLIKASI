package mypackage;

import javax.swing.*;

public class Deuce {
    public static void main(String[] args){

        // Frame
        JFrame frameUtama = new JFrame();
        frameUtama.setSize(1336,709);
        OrderMenu orderMenu = new OrderMenu();
        orderMenu.login(frameUtama);
        frameUtama.setVisible(true);
        frameUtama.setResizable(false);
        frameUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameUtama.setLocationRelativeTo(null);
        frameUtama.setLayout(null);

    }
}
