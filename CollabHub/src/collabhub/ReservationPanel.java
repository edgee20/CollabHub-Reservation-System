/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collabhub;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author Mark
 */
public class ReservationPanel extends JPanel{
    public ReservationPanel() {
        setLayout(new BorderLayout()); // Using GridBagLayout
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));
         headerPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.insets = new Insets(20, 0, 10, 0); // Margin
        JLabel headerLabel = new JLabel("Personal Information");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        JLabel username = new JLabel("Quibod, Alejandro");
        headerPanel.add(headerLabel);
        headerPanel.add(username);
        
        add(headerPanel);
        
//        JPanel information = new JPanel();
//        information.setLayout(new BoxLayout(information, BoxLayout.Y_AXIS));
//        
//        JLabel lastName = new JLabel("Last Name");
//        JTextField lName = new JTextField(15);
//        lName.setMaximumSize(new Dimension(Integer.MAX_VALUE, lName.getPreferredSize().height));
//        information.add(lastName);
//        information.add(lName);
//        information.add(Box.createVerticalStrut(10));
//        
//        JLabel firstName = new JLabel("FIrst Name");
//        JTextField fName = new JTextField(15);
//        fName.setMaximumSize(new Dimension(Integer.MAX_VALUE, fName.getPreferredSize().height));
//        information.add(firstName);
//        information.add(firstName);
//        
//        add(information);
//        
//        add(Box.createVerticalStrut(20));       
//        
//        JLabel roomLabel = new JLabel("Select Room:");
//        String[] rooms = {"Room A", "Room B", "Room C"}; // Example rooms
//        JComboBox<String> roomDropdown = new JComboBox<>(rooms);
//        add(roomLabel);
//        add(roomDropdown);
//        add(Box.createVerticalStrut(20));
//        // Add Date and Time Pickers here...
//        
//        JButton reserveButton = new JButton("Reserve");
//        reserveButton.addActionListener(e -> {
//            // Handle reservation logic
//        });
//        add(reserveButton);
//        
        setVisible(true);
    }
}
