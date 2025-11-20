import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PandaBelly");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);    
        frame.setVisible(true);



        /**READ THIS TEXT: We plan to have the front page just open to the table, and one of the buttons should be a drop down
        menu of all the categories.
        **/


        
    }

    public void addToFile(String fileName, String textToAdd) {
        BufferedWriter writer = null;
        FileWriter fileWriter = new FileWriter(fileName, true);
        writer = new BufferedWriter(fileWriter);
        writer.write(textToAdd);
        writer.newLine();
        
    }

}
