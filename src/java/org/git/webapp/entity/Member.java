/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.git.webapp.entity;

/**
 *
 * @author Rasna
 */
public class Member {
    private int id;
    private String firstName,lastName,email,contact_no;

    public Member() {
    }

    public Member(int id, String firstName, String lastName, String email, String contact_no) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact_no = contact_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", contact_no=" + contact_no + '}';
    }
    
    
    
    
    
    
}
