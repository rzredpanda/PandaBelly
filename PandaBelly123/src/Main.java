import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Storage Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);    
        frame.setVisible(true);

        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button);
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));
        button.setBounds(150, 100, 100, 50);
        button.setLayout(null);
        //button.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
