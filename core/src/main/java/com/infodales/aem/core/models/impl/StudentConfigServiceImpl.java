package com.infodales.aem.core.models.impl;

import com.infodales.aem.core.configurations.StudentConfig;
import com.infodales.aem.core.services.StudentConfigService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;


@Component(service = StudentConfigService.class, immediate = true)
@Designate(ocd = StudentConfig.class)
public class StudentConfigServiceImpl implements StudentConfigService {

    private String studentName;
    private int rollNumber;
    private String grade;
    private String courses;

    @Activate
    protected void init(StudentConfig config){
        studentName = config.getStudentName();
        rollNumber = config.getRollNumber();
        grade = config.getStudentGrade();
        courses = config.getCourses();
    }

    @Override
    public String getStudentName() {
        return studentName;
    }

    @Override
    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String getStudentGrade() {
        return grade;
    }

    @Override
    public String getCourses() {
        return courses;
    }

}
