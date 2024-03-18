
package com.mycompany.practical1._variant_4;


public class Person {
    public int number;
    private String fullName;
    public String job;
    public boolean accessAllowed;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    

    public Person(int number, String fullName, String job, boolean accessAllowed) {
        this.number = number;
        this.fullName = fullName;
        this.job = job;
        this.accessAllowed = accessAllowed;
    }

    public String toString() {
        return fullName + ", " + number + ", " + job + ", " + accessAllowed;
    }

}
