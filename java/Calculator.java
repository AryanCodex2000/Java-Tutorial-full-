import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    // Components of calculator
    JTextField textField;
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    // Constructor to set up components
    public Calculator() {
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(30, 40, 340, 50);
        add(textField);

        // Array for buttons
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        int x = 30, y = 120;
        for (int i = 0; i < buttonLabels.length; i++) {
            JButton button = new JButton(buttonLabels[i]);
            button.setBounds(x, y, 80, 60);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            add(button);

            x += 90; // Next button to right
            if ((i + 1) % 4 == 0) {
                x = 30;
                y += 70;
            }
        }

        JButton clearBtn = new JButton("C");
        clearBtn.setBounds(30, y, 350, 60);
        clearBtn.setFont(new Font("Arial", Font.BOLD, 20));
        clearBtn.addActionListener(e -> textField.setText(""));
        add(clearBtn);

        setVisible(true);
    }

    // Handles button actions
    public void actionPerformed(ActionEvent e) {
        String input = ((JButton) e.getSource()).getText();
        String current = textField.getText();

        if (input.charAt(0) >= '0' && input.charAt(0) <= '9' || input.equals(".")) {
            textField.setText(current + input);
        } else if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
            if (current.length() > 0) {
                num1 = Double.parseDouble(current);
                operator = input.charAt(0);
                textField.setText("");
            }
        } else if (input.equals("=")) {
            if (current.length() > 0) {
                num2 = Double.parseDouble(current);
                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/': result = (num2 == 0) ? 0 : num1 / num2; break;
                }
                textField.setText("" + result);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        new Calculator();
    }
}

