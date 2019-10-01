package com.sis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sis.model.ClassModel;
import com.sis.repository.ClassRepository;

/**
 * 
 * @author: Alim Khowaja
 * ClassService.java used to
 */
@Service
public class ClassService
{

    @Autowired
    private ClassRepository classesRepository;

    /**
     * return all classes
     * @return
     */
    public List<ClassModel> returnAllClasss()
    {
	List<ClassModel> classModels = new ArrayList<ClassModel>();
	classesRepository.findByIsActiveTrue().forEach(classModels::add);
	return classModels;
    }

    /**
     * return classes by name
     * @param className
     * @return
     */
    public List<ClassModel> returnAllClasssByName(String className)
    {
	List<ClassModel> classModels = new ArrayList<ClassModel>();
	classesRepository.findByClassNameAndIsActiveTrue(className).forEach(classModels::add);
	return classModels;
    }

    public ClassModel returnClassByName(String className)
    {
	return null;
    }
}
