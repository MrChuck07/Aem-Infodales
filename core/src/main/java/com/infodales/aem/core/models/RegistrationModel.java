package com.infodales.aem.core.models;
import com.infodales.aem.core.services.RegistrationFormConfigService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class RegistrationModel {

    @ValueMapValue
    private String listFrom;

    @OSGiService
    RegistrationFormConfigService registrationFormConfigService;

    private String campaignID;


//Student
    @ValueMapValue
    private String stuFirstName;

    @ValueMapValue
    private String stuLastName;

    @ValueMapValue
    private String stuBranchId;

    @ValueMapValue
    private String stuContact;


//Employee
    @ValueMapValue
    private String empFirstName;

    @ValueMapValue
    private String empLastName;

    @ValueMapValue
    private String empId;

    @ValueMapValue
    private String empContactNumber;

    @PostConstruct
    protected void init(){
        campaignID = registrationFormConfigService.getcampaignId();
    }


    public String getListFrom() {
        return listFrom;
    }

    public String getStuFirstName() {
        return stuFirstName;
    }

    public String getStuLastName() {
        return stuLastName;
    }

    public String getStuBranchId() {
        return stuBranchId;
    }

    public String getStuContact() {
        return stuContact;
    }

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

    public String getCampaignID() {
        return campaignID;
    }
}
