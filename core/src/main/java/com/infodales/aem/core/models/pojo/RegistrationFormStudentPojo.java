package com.infodales.aem.core.models.pojo;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class RegistrationFormStudentPojo {


    @ValueMapValue
    private String stuFirstName;

    @ValueMapValue
    private String stuLastName;

    @ValueMapValue
    private String stuBranchId;

    @ValueMapValue
    private String stuContact;

    public String getStuContact() {
        return stuContact;
    }

    public String getUserFirstName() {
        return stuFirstName;
    }

    public String getUserLastName() {
        return stuLastName;
    }

    public String getUserAddress() {
        return stuBranchId;
    }

}
