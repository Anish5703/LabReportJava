import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample {
    private JFrame frame;
    private JTextField numField1;
    private JTextField numField2;
    private JButton addButton;
    private JLabel resultLabel;

    public SwingExample() {
        // Create the frame
        frame = new JFrame("Addition Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel and set its layout manager
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        // Create text fields for input
        numField1 = new JTextField(10);
        numField2 = new JTextField(10);

        // Create a button
        addButton = new JButton("Add");

        // Add an action listener to the button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the input values
                int num1 = Integer.parseInt(numField1.getText());
                int num2 = Integer.parseInt(numField2.getText());

                // Perform the addition
                int result = num1 + num2;

                // Display the result
                resultLabel.setText("Result: " + result);
            }
        });

        // Create a label for displaying the result
        resultLabel = new JLabel("Result:");

        // Add components to the panel
        panel.add(new JLabel("Enter Number 1:"));
        panel.add(numField1);
        panel.add(new JLabel("Enter Number 2:"));
        panel.add(numField2);
        panel.add(addButton);
        panel.add(resultLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of AdditionExample
        SwingExample example = new SwingExample();
    }
}
