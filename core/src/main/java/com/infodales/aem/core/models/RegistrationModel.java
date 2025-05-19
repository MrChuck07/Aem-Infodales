package com.infodales.aem.core.models;

import com.infodales.aem.core.models.pojo.RegistrationFormEmployeePojo;
import com.infodales.aem.core.models.pojo.RegistrationFormStudentPojo;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class RegistrationModel {
    @ValueMapValue
    private String listFrom;

    List<RegistrationFormStudentPojo> studentInfo;
    List<RegistrationFormEmployeePojo> employeeInfo;

    public String getListFrom() {
        return listFrom;
    }

    public List<RegistrationFormStudentPojo> getStudentInfo() {
        return studentInfo;
    }

    public List<RegistrationFormEmployeePojo> getEmployeeInfo() {
        return employeeInfo;
    }
}
