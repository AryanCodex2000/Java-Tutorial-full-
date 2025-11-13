import javax.swing.*;
import java.awt.event.*;

public class UserForm extends JFrame  {
    JTextField nameField, emailField, phoneField, ageField;
    JTextArea addressArea;
    JButton submitButton;

    public UserForm(){
        setTitle("User Detail's Form");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 20, 100, 25);
        add(nameLabel);
        nameField = new JTextField();
        nameLabel.setBounds(150, 20, 200, 25);
        add(nameField);

        JLabel emailLabel = new JLabel("Email ID:");
        emailLabel.setBounds(30, 60, 100, 25);
        add(emailLabel);
        emailField = new JTextField();
        emailField.setBounds(150, 60, 200, 25);
        add(emailField);

        JLabel addressJLabel = new JLabel("Address:");
        addressJLabel.setBounds(30, 100, 100, 25);
        add(addressJLabel);
        addressArea = new JTextArea();
        addressArea.setBounds(150, 100, 200, 60);
        addressArea.setLineWrap(true);
        addressArea.setWrapStyleWord(true);
        add(addressArea);

        JLabel phoneLabel = new JLabel("Phone No:");
        phoneLabel.setBounds(30, 180, 100, 25);
        add(phoneLabel);
        phoneField = new JTextField();
        phoneField.setBounds(150, 180, 200, 25);
        add(phoneField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(30, 220, 100, 25);
        add(ageLabel);
        ageField = new JTextField();
        ageField.setBounds(150, 220, 200, 25);
        add(ageField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 270, 100, 30);
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String details = "Name: " + nameField.getText() + "\n"
                               + "Email ID: " + emailField.getText() + "\n"
                               + "Address: " + addressArea.getText() + "\n"
                               + "Phone Number: " + phoneField.getText() + "\n"
                               + "Age: " + ageField.getText();

                JOptionPane.showMessageDialog(null, details, "Submitted Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setVisible(true);
        

    }
    public static void main(String[] args) {
        new UserForm();
    }
    
}
