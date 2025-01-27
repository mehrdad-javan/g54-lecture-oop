package org.example;

// Class is a blueprint
public class Person {

    // Fields
    private String ssn;
    private String name;
    private String email;
    // add more fields as needed.

    // Constructors
    public Person(String ssn, String name, String email) {
        this.ssn = ssn;
        this.name = name;
        this.email = email;
    }
    // add more ctros ad needed

    // Methods and setters and getters as needed
    public String getPersonInfo() {
        return "SSN: " + ssn + " ,Name: " + name;
    }

}
