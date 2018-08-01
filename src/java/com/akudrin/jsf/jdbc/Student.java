package com.akudrin.jsf.jdbc;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String postalCode;
    private String phoneNumber;
    private String courseCode;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String phoneNumber, String email, String courseCode, String postalCode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.courseCode = courseCode;
        this.postalCode = postalCode;

    }
    
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    	public void validateTheCourseCode(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		if (value == null) {
			return;
		}
		
		String data = value.toString();
		
		// Course code must start with GUF ... if not, throw exception
		if (!data.startsWith("GUF")) {
			
			FacesMessage message = new FacesMessage("Course code must start with GUF");
			
			throw new ValidatorException(message);
		}
	}
        
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
                + phoneNumber + ", phoneNumber="
                + lastName + ", email=" + email + ", courseCode=" + courseCode + ", postalCode="
                + postalCode + "]";
    }

}
