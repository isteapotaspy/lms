/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Authentication;

enum HTTP_ERROR {
    HTTP200, // SUCCESS
    HTTP401, // AUTH FAILURE
    HTTP403, // FORBIDDEN ACCESS
    HTTP303; // USER IS HIDDEN
}

interface Authentication {
    HTTP_ERROR signIn() throws AuthenticationError;
    HTTP_ERROR SignOut();
}

interface PasswordSecurity {
    String hashPassword();
    boolean confirmPassword();
}

class AuthenticationError extends Exception {   
}

abstract class UserIdentity implements Authentication {
    // identifiers
    private String firstName;
    private String lastName;
    private int idNumber;
    private String email;
    
    // authentication
    private String hashedPassword;
    
    public UserIdentity(String firstName, String lastName, int idNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.email = email;
    }
    
    public void hashPassword() {} // to come
    
    
}

class Student extends UserIdentity {
    // additional identifiers
    private String department;
    private String program;
    private String year;
    private String status;
    
    public Student(String firstName, String lastName, int idNumber, String email) {
        super(firstName, lastName, idNumber, email);
    }
    
    protected void setStudentDetails(String department, String program, String year, String status) {
        this.department = department;
        this.program = program;
        this.year = year;
        this.status = status;
    }
}