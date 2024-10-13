/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collabhub;

import java.util.*;
/**
 *
 * @author Mark
 */
public class personInfo {
    private String name, ID, email, patronType, department, phone;
    ArrayList<String> participantsList = new ArrayList<>();

    static Scanner input;
    
    public personInfo(String name, String ID, String email, String patronType, String department, String phone, ArrayList<String> participantsList) {
        setName(name);
        setID(ID);
        setEmail(email);
        setPatronType(patronType);
        setDepartment(department);
        setPhone(phone);
        this.participantsList = participantsList;
    }
    
    public String getName(){
        return name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatronType() {
        return patronType;
    }

    public void setPatronType(String patronType) {
        this.patronType = patronType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //participants list 
    public ArrayList<String> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(ArrayList<String> participantsList) {
        this.participantsList = participantsList;
    }

    public void addParticipant(String participant){
        this.participantsList.add(participant);
    }
    
    public void removeParticipant(String participant){
        this.participantsList.remove(participant);
    }
    
    //input
    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        personInfo.input = input;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
}
