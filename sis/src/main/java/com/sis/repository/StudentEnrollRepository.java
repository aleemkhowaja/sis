package com.sis.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import com.sis.model.ClassModel;
import com.sis.model.StudentEnrollClassesModel;
import com.sis.model.StudentModel;

/**
 * 
 * @author: Alim Khowaja
 * StudentEnrollRepository.java used to
 */
public interface StudentEnrollRepository extends CrudRepository<StudentEnrollClassesModel, Long>
{

    /**
     * cancel Student Enroll using deleting student and classes records from student_enrollment_table
     * @param studentModel
     * @param classModel
     */
    @Modifying
    void deleteByStudentModelAndClassModel(StudentModel studentModel, ClassModel classModel);

}
