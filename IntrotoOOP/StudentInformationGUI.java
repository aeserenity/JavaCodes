package IntrotoOOP;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StudentInformationGUI extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField ageField;
    private JButton submitButton;
    private JLabel messageLabel;

    public StudentInformationGUI() {
        setTitle("Student Information Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Labels and text fields
        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);

        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);

        add(new JLabel("Age:"));
        ageField = new JTextField();
        add(ageField);

        submitButton = new JButton("Submit");
        
        add(submitButton);

        messageLabel = new JLabel("", SwingConstants.CENTER);
        add(messageLabel);

        // Handle button click
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                int age = Integer.parseInt(ageField.getText());

                StudentInformation student = new StudentInformation(firstName, lastName, age);
                messageLabel.setText("Saved: " + student.toString());

                // Optional: clear fields
                firstNameField.setText("");
                lastNameField.setText("");
                ageField.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentInformationGUI();
    }
}
