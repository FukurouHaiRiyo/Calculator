package eclipse;

import java.awt.EventQueue;
import javax.swing.JFrame;

import ui.CalculatorFrame;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalculatorFrame frame = new CalculatorFrame();
                frame.setTitle("Calculator");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
