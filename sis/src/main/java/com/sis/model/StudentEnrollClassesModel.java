package com.sis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_enrol_class")
public class StudentEnrollClassesModel
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentEnrolClassId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentModel studentModel;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassModel classModel;

    public Integer getStudentEnrolClassId()
    {
	return studentEnrolClassId;
    }

    public void setStudentEnrolClassId(Integer studentEnrolClassId)
    {
	this.studentEnrolClassId = studentEnrolClassId;
    }

    public StudentModel getStudentModel()
    {
	return studentModel;
    }

    public void setStudentModel(StudentModel studentModel)
    {
	this.studentModel = studentModel;
    }

    public ClassModel getClassModel()
    {
	return classModel;
    }

    public void setClassModel(ClassModel classModel)
    {
	this.classModel = classModel;
    }
}