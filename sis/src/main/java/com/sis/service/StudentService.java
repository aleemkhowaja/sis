package com.sis.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sis.common.CommonConstant;
import com.sis.common.ResponseObject;
import com.sis.model.StudentEnrollClassesModel;
import com.sis.repository.StudentEnrollRepository;

/**
 * @author: Alim Khowaja 
 * StudentService.java used to
 */
@Service
public class StudentService
{

    @Autowired
    private StudentEnrollRepository studentEnrollRepository;

    /**
     * Enroll Student in multiple Classes
     * 
     * @param studentEnrollClassesModels
     * @return
     */
    @Transactional
    public ResponseObject enrollStudent(List<StudentEnrollClassesModel> studentEnrollClassesModels)
    {
	ResponseObject responseObject = new ResponseObject();
	try
	{
	    // enroll Students
	    studentEnrollClassesModels.forEach(item -> {
		studentEnrollRepository.save(item);
	    });
	    responseObject.setStatus(CommonConstant.SUCCESS);
	    responseObject.setResponseMessage(CommonConstant.STUDENT_ENROLLED_MSG);
	}
	catch(Exception e)
	{
	    responseObject.setStatus(CommonConstant.BAD_REQUEST);
	    responseObject.setResponseMessage(CommonConstant.BAD_REQ_MESSAGE + " : " + e.getMessage());
	}
	return responseObject;
    }

    /**
     * Cancel Student Enrollment
     * 
     * @param studentEnrollClassesModels
     * @return
     */
    @Transactional
    public ResponseObject cancelStudentEnrollment(List<StudentEnrollClassesModel> studentEnrollClassesModels)
    {
	ResponseObject responseObject = new ResponseObject();
	try
	{
	    // delete Student Enrollment
	    studentEnrollClassesModels.forEach(item -> {

		studentEnrollRepository.deleteByStudentModelAndClassModel(item.getStudentModel(), item.getClassModel());
	    });
	    responseObject.setStatus(CommonConstant.SUCCESS);
	    responseObject.setResponseMessage(CommonConstant.STUDENT_CANCEL_ENROLLED_MSG);
	}
	catch(Exception e)
	{
	    responseObject.setStatus(CommonConstant.BAD_REQUEST);
	    responseObject.setResponseMessage(CommonConstant.BAD_REQ_MESSAGE + " : " + e.getMessage());
	}
	return responseObject;
    }

}
