import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PandaBelly");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(1000,700);
        frame.setLocationRelativeTo(null); // Center the frame
        
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> dropdown = new JComboBox<>(options);

        JPanel panel = new JPanel();
        panel.add(dropdown);
        panel.setBounds(175,50,200,50);
        frame.add(panel);


        JButton addCategoryButton = new JButton("Add Category");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(375,50,200,50);
        buttonPanel.add(addCategoryButton);
        frame.add(buttonPanel);
        addCategoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newCategory = JOptionPane.showInputDialog(frame, "Enter new category name:");
                if (newCategory != null && !newCategory.trim().isEmpty()) {
                    dropdown.addItem(newCategory.trim());
                    // Here you would also add code to save the new category to a file
                }
            }
        });

        JButton removeCategoryButton = new JButton("Remove Category");
        JPanel removeButtonPanel = new JPanel();
        removeButtonPanel.setBounds(575,50,200,50);
        removeButtonPanel.add(removeCategoryButton);
        frame.add(removeButtonPanel);
        removeCategoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCategory = JOptionPane.showInputDialog(frame, "Enter category name to remove:");
                if (selectedCategory != null && !selectedCategory.trim().isEmpty()) {
                    dropdown.removeItem(selectedCategory.trim());
                    // Here you would also add code to save the removed category to a file
                }
            }
        });
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
