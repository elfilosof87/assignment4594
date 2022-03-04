package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Hello world!
 *
 */
public class GUI implements ActionListener {
    private static JTextField userText;
    private static JButton button;
    private static JLabel label1, label2;
    private static JComboBox<String> comboBox;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(550, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        label1 = new JLabel("First Name");
        label1.setBounds(10, 10, 120, 30);
        panel.add(label1);

        userText = new JTextField();
        userText.setBounds(130, 10, 200, 30);
        panel.add(userText);

        label2 = new JLabel("Select languages:");
        label2.setBounds(10, 50, 120, 30);
        panel.add(label2);

        String[] languages = { "", "Java", "C++", "Python", "C#", "JavaScript" };
        comboBox = new JComboBox<>(languages);
        comboBox.setBounds(130, 50, 200, 30);
        panel.add(comboBox);

        button = new JButton("Submit");
        button.setBounds(10, 100, 85, 20);
        button.addActionListener(new GUI());
        panel.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = userText.getText();
        String language = (String) comboBox.getSelectedItem();
        System.out.println(name + " , " + language);
    }
}
