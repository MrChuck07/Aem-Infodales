package com.infodales.aem.core.models.pojo;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class UserProfilesPojo {
    @ValueMapValue
    private String fiName;

    @ValueMapValue
    private String laName;

    @ValueMapValue
    private String address;

    @Inject
    private List<UserContacts> userContacts;

    public String getFiName() {
        return fiName;
    }

    public String getLaName() {
        return laName;
    }

    public String getAddress() {
        return address;
    }

    public List<UserContacts> getUserContacts() {
        return userContacts;
    }
}
