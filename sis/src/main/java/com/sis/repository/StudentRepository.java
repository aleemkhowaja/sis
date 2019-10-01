package com.sis.repository;

import org.springframework.data.repository.CrudRepository;
import com.sis.model.StudentModel;

/**
 * @author: Alim Khowaja
 * StudentRepository.java used to
 */
public interface StudentRepository extends CrudRepository<StudentModel, Long>
{

}
