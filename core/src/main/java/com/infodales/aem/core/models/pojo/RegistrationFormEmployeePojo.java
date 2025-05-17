package com.infodales.aem.core.models.pojo;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class RegistrationFormEmployeePojo {


    @ValueMapValue
    private String empFirstName;

    @ValueMapValue
    private String empLastName;

    @ValueMapValue
    private String empId;

    @ValueMapValue
    private String empContactNumber;


    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpContactNumber() {
        return empContactNumber;
    }
}
