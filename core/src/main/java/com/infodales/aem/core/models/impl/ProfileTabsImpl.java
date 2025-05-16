package com.infodales.aem.core.models.impl;


import com.infodales.aem.core.models.ProfileTabs;
import com.infodales.aem.core.models.pojo.ContactUserPojo;
import com.infodales.aem.core.models.pojo.ProfileTabsPojo;
import com.infodales.aem.core.services.StudentConfigService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,
adapters = ProfileTabs.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProfileTabsImpl implements ProfileTabs {

    @Inject
    List<ProfileTabsPojo> userInfo;

    @Inject
    List<ContactUserPojo> userContacts;


    private String name;
    private int id;
    private String grade;
    private String courses;
    

    @Override
    public List<ProfileTabsPojo> getUserProfile() {
        return userInfo;
    }

    @Override
    public List<ContactUserPojo> getContactUser() {
        return userContacts;
    }

    @OSGiService
    StudentConfigService studentDetails;
    @PostConstruct
    protected void init(){
        name = studentDetails.getStudentName();
        id = studentDetails.getRollNumber();
        grade = studentDetails.getStudentGrade();
        courses = studentDetails.getCourses();

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    public String getCourses() {
        return courses;
    }
}
