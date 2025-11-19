import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Storage Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);    
        frame.setVisible(true);

        JButton cA = new JButton("Create Account");
        frame.getContentPane().add(cA);
        cA.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));
        cA.setBounds(250, 500, 150, 100);
        cA.setLayout(null);

        JButton login = new JButton("Log In");
        frame.getContentPane().add(login);
        login.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));
        login.setBounds(600, 500, 150, 100);
        login.setLayout(null);

        JButton exitButton = new JButton("Exit");
        frame.getContentPane().add(exitButton);
        exitButton.addActionListener(e -> System.exit(0));
        exitButton.setBounds(150, 200, 100, 50);
        exitButton.setLayout(null);

        
    }

    public void addToFile(String fileName, String textToAdd) {
        BufferedWriter writer = null;
        FileWriter fileWriter = new FileWriter(fileName, true);
        writer = new BufferedWriter(fileWriter);
        writer.write(textToAdd);
        writer.newLine();
        
    }

}
