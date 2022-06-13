package com.codedifferently.atm.users;

public class User {
    private static Integer idCount = 1;
    private Integer id;
    private String firstName;
    private String lastName;
    private String accessCode;

    public User(String firstName, String lastName, String accessCode) {
        this.id = idCount++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accessCode = accessCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    @Override
    public String toString(){
        return String.format("%d %s %s %s", id, firstName, lastName, accessCode);
    }
}
