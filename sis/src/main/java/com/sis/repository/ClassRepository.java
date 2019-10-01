package com.sis.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.sis.model.ClassModel;

/**
 * @author: Alim Khowaja
 * ClassRepository.java used to
 */
public interface ClassRepository extends Repository<ClassModel, String>
{

    /**
     * find All classes where isActive=true
     * @return
     */
    List<ClassModel> findByIsActiveTrue();

    /**
     * find classes by classname and isActive=true
     * @param className
     * @return
     */
    List<ClassModel> findByClassNameAndIsActiveTrue(String className);

}
