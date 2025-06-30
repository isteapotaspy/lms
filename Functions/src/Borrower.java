/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CpE Laboratory BE216
 */
class Borrower {
    private String name;
    private int yearLevel;
    public String gender;
    public int studentId;
    private int contactNumber;
    
    public Borrower(String name, int year, String gender, int studentId, int contact) {
        this.name = name;
        this.gender = gender;
        this.studentId = studentId;
        this.contactNumber = contact;
    }
    public int getContactNumber() {
        return contactNumber;
    }
}
