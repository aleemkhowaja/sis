package com.sis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sis.common.ResponseObject;
import com.sis.model.StudentEnrollClassesModel;
import com.sis.service.StudentService;

/**
 * 
 * @author: Alim Khowaja
 * StudentController.java used to CRUD of student
 */
@RestController
public class StudentController
{

    @Autowired
    private StudentService studentService;

    /**
     * Enroll Student in multiple classes
     * @param studentEnrollClassesModels
     * @return
     */
    @PostMapping(path = "student/enrolStudentsInClass", consumes = "application/json", produces = "application/json")
    public ResponseObject enrolStudentsInClass(@RequestBody List<StudentEnrollClassesModel> studentEnrollClassesModels)
    {
	ResponseObject responseObject = studentService.enrollStudent(studentEnrollClassesModels);
	return responseObject;
    }

    /**
     * Cancel Enrollment of students from classes
     * @param studentEnrollClassesModels
     * @return
     */
    @PostMapping(path = "student/cancelStudentEnrollment", consumes = "application/json", produces = "application/json")
    public ResponseObject cancelStudentEnrollment(
	    @RequestBody List<StudentEnrollClassesModel> studentEnrollClassesModels)
    {
	ResponseObject responseObject = studentService.cancelStudentEnrollment(studentEnrollClassesModels);
	return responseObject;
    }

}
