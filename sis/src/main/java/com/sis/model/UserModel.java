package com.sis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel extends Model
{

    @Id
    private Integer userId;
    private String firstName;
    private String lastName;
    private String role;
    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentModel studentModel;

    public Integer getUserId()
    {
	return userId;
    }

    public void setUserId(Integer userId)
    {
	this.userId = userId;
    }

    public String getFirstName()
    {
	return firstName;
    }

    public void setFirstName(String firstName)
    {
	this.firstName = firstName;
    }

    public String getLastName()
    {
	return lastName;
    }

    public void setLastName(String lastName)
    {
	this.lastName = lastName;
    }

    public String getRole()
    {
	return role;
    }

    public void setRole(String role)
    {
	this.role = role;
    }

    public String getUsername()
    {
	return username;
    }

    public void setUsername(String username)
    {
	this.username = username;
    }

    public String getPassword()
    {
	return password;
    }

    public void setPassword(String password)
    {
	this.password = password;
    }

    public StudentModel getStudentModel()
    {
	return studentModel;
    }

    public void setStudentModel(StudentModel studentModel)
    {
	this.studentModel = studentModel;
    }

}
