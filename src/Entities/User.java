package Entities;



import Abstract.Entity;

import java.time.LocalDate;

public class User implements Entity {
    private int userID;
    private String userName;
    private String userLastName;
    private String nationalID;
    private LocalDate birthDate;

    public User(int userID, String userName, String userLastName, String nationalID, LocalDate birthDate) {
        this.userID = userID;
        this.userName = userName;
        this.userLastName = userLastName;
        this.nationalID = nationalID;
        this.birthDate = birthDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
