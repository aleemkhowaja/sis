package com.sis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sis.model.ClassModel;
import com.sis.service.ClassService;

/**
 * 
 * @author: Alim Khowaja
 *
 * ClassController.java used to crud of classes
 */
@RestController
public class ClassController
{

    @Autowired
    private ClassService classesService;
    
    /**
     * return all classes
     * @return
     */
    @GetMapping("classes/returnAllClasses")
    public List<ClassModel> getAllClasses()
    {
	return classesService.returnAllClasss();
    }

    /**
     * return classes by class name
     * @param className
     * @return
     */
    @GetMapping("classes/returnAllCalssesByName")
    public List<ClassModel> returnCalssByName(@RequestParam("className") String className)
    {
	return classesService.returnAllClasssByName(className);
    }

}
