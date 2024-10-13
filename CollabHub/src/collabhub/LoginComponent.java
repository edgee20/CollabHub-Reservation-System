/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collabhub;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Mark
 */
public class LoginComponent extends JPanel{
    private JButton signInButton;
    private CollabHub parent;
    public LoginComponent(CollabHub parent){
//        //Design
//        setTitle("Login");
//        setSize(1024,768); //not sure pa with this, pa edit mga frontend (NF)
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new GridBagLayout()); 
//        setResizable(false);
//        //-------------------------------//
//        
//        
//        //Input (email and pw) insert here
//        GridBagConstraints gbc = new GridBagConstraints();
//        
//        JPanel titlePanel = new JPanel();
//        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
//        
//        JPanel inputPanel = new JPanel();
//        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
//        
//        JLabel loginText = new JLabel("Login");
//        loginText.setPreferredSize(new Dimension(200, 30));
//        loginText.setFont(new Font("Arial", Font.BOLD, 20)); // Set bold font
//        
//        titlePanel.add(loginText);
//        titlePanel.add(Box.createVerticalStrut(20)); //margin-bot
//        
//        // Center title panel in the frame
//        gbc.gridx = 0; // Column 0
//        gbc.gridy = 0; // Row 0
//        gbc.weighty = 0.1; // Take up some vertical space
//        add(titlePanel, gbc); // Add title panel to the frame
//        
//        //Email
//        JLabel emailLabel = new JLabel("Email");
//        inputPanel.add(emailLabel);
//        
//        JTextField emailTextField = new JTextField(15);
//        inputPanel.add(emailTextField);
//        
//        inputPanel.add(Box.createVerticalStrut(10)); //space between email and pw
//        //--------------------------------//
//        
//        //Password
//        JLabel passwordLabel = new JLabel("Password");
//        inputPanel.add(passwordLabel);
//        
//        JPasswordField passwordTextField = new JPasswordField(15);
//        inputPanel.add(passwordTextField);
//        
//        // Add Input Panel to GridBag
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        gbc.weighty = 0.5; // Allow it to expand vertically
//        add(inputPanel, gbc);
//        //--------------------------------//==
//        
//        
//        
//        //Registration (backend mag work dito)
//        //onClick - redirect user to RegistrationComponent
//        
//        
//        
//        //--------------------------------//
//        
//        //Sign In Button (backend mag work dito)
//        // onClick - read file from personInfo.txt
//        //create arrayList for this, only one for the login component
//        //if user not found {JOptionPane.showMessageDialog("User npot found"), else{redirect rto HomeInterfaceComponent};}
//        
//        
//        
//        //--------------------------------//
//        
//        
//        
//        //Insert panels here
//
//        //--------------------------------//
//        
//        //--------------------------------//
//        
//        // Design
        this.parent = parent;
        setLayout(new GridBagLayout()); // Use GridBagLayout for component positioning
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Title Panel
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel loginText = new JLabel("Login");
        loginText.setFont(new Font("Arial", Font.BOLD, 20));
        titlePanel.add(loginText);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(50, 0, 20, 0); // Margin for title
        add(titlePanel, gbc);
        
        // Input Panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        
        // Email
        JLabel emailLabel = new JLabel("Email");
        JTextField emailTextField = new JTextField(15);
        inputPanel.add(emailLabel);
        inputPanel.add(emailTextField);
        inputPanel.add(Box.createVerticalStrut(10)); // Space between email and password
        
        // Password
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordTextField = new JPasswordField(15);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordTextField);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 0, 10, 0); // Margin for input fields
        add(inputPanel, gbc);
        
        // Sign In Button
        signInButton = new JButton("Sign In");
        signInButton.addActionListener(e -> {
            // Assume successful login, switch to reservation panel
            parent.switchToReservationPanel(); 
        });
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(signInButton, gbc);
        
        // Final adjustments
        setVisible(true);
    }
}
