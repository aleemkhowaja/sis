package com.sis.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentModel extends Model
{

    @Id
    private Integer studentId;
    private String studentName;
    private String fatherName;
    private String idNo;
    private String address;
    private String contactNo;

    public Integer getStudentId()
    {
	return studentId;
    }

    public void setStudentId(Integer studentId)
    {
	this.studentId = studentId;
    }

    public String getStudentName()
    {
	return studentName;
    }

    public void setStudentName(String studentName)
    {
	this.studentName = studentName;
    }

    public String getFatherName()
    {
	return fatherName;
    }

    public void setFatherName(String fatherName)
    {
	this.fatherName = fatherName;
    }

    public String getIdNo()
    {
	return idNo;
    }

    public void setIdNo(String idNo)
    {
	this.idNo = idNo;
    }

    public String getAddress()
    {
	return address;
    }

    public void setAddress(String address)
    {
	this.address = address;
    }

    public String getContactNo()
    {
	return contactNo;
    }

    public void setContactNo(String contactNo)
    {
	this.contactNo = contactNo;
    }
}