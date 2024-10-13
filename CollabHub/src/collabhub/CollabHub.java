/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collabhub;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class CollabHub extends JFrame{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    
        private CardLayout cardLayout;
        private JPanel mainPanel;

        public CollabHub() {
            setTitle("Collab Hub");
            setSize(1024, 768);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            cardLayout = new CardLayout();
            mainPanel = new JPanel(cardLayout);

            mainPanel.add(new LoginComponent(this), "Login");
            mainPanel.add(new ReservationPanel(), "Reservation");

            add(mainPanel, BorderLayout.CENTER);
            setVisible(true);
        }

        public void switchToReservationPanel() {
            cardLayout.show(mainPanel, "Reservation");
        }
        
    public static void main(String[] args) throws FileNotFoundException{
        /* *Concept for System:
        - Our system is a Collaboration Hub Reservation System. Through this system, people may reserve a collaboration hub room within a specified time slot in which a collaboration hub room is available. There are 7 collaboration hubs in total. They may check the available time slots for each collaboration hub and select one to their liking.

        *Main Classes & Relationship
        1. reservations class
        - It is the parent class which contains information on each person and their reserved collaboration hub and time.
        2. collabHub class
        - Contains information on every collaboration hub, including location, service (which collaboration hub), worker, and date & time.
        3. dateAndTime class
        - Contains information on the date and time, and availability of each collaboration hub.
        4. personInfo class
        - Contains information of the person reserving the collaboration hub and their purpose.

        *# of text files
        Person information - contains person's personal information to be used for reserving the collaboration hub
        Collaboration Hub information - contains the collaboration room's details and availability.*/

        
        //Ensures that no files are missing
        PrintWriter collabOutput = null;
        PrintWriter peopleOutput = null;
        
        try{
        Scanner collabRoomInput = new Scanner(new FileReader("collabInfo.txt"));
        collabOutput = new PrintWriter("collabInfo.txt");
        Scanner peopleInput = new Scanner(new FileReader("peopleInput.txt"));
        peopleOutput = new PrintWriter(("peopleInput.txt"));
        
        Scanner userInput = new Scanner(System.in);
        }catch(FileNotFoundException e){
            System.out.println("Files are not findable, creating new files. Please reload the program");
            peopleOutput = new PrintWriter("peopleInput.txt");
            collabOutput = new PrintWriter("collabInfo.txt");
        }
        
        //Execute program - START 
        SwingUtilities.invokeLater(() -> new CollabHub());
        
        
    }
    
    private static boolean isPeopleInputValid(Scanner scanner){
        return true;
    }
    
    private static boolean isCollabRoomInputValid(Scanner scanner){
        return true;
    }
    
}
