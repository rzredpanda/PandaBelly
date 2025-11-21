import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PandaBelly");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);    
        



        /**READ THIS TEXT: We plan to have the front page just open to the table, and one of the buttons should be a drop down
        menu of all the categories.
        **/
        JButton button = new JButton("Click Me");
        button.setBounds(50,100,95,30);
        button.setSize(100,100);

        String[] categories = {"Fruits", "Vegetables", "Dairy", "Bakery", "Meat"};
        JComboBox<String> categoryList = new JComboBox<String>(categories);
        categoryList.setBounds(50,50,100,30);
        categoryList.setSize(100, 30);
        

        categoryList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCategory = (String) categoryList.getSelectedItem();
                button.setText("Selected: " + selectedCategory);
            }
        });
        frame.add(categoryList);
        frame.setVisible(true);
    }

    // public void addToFile(String fileName, String textToAdd) {
    //     BufferedWriter writer = null;
    //     FileWriter fileWriter = new FileWriter(fileName, true);
    //     writer = new BufferedWriter(fileWriter);
    //     writer.write(textToAdd);
    //     writer.newLine();
        
    // }

}
