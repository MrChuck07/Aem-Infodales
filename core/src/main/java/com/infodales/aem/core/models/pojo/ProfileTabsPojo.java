package com.infodales.aem.core.models.pojo;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProfileTabsPojo {

    @ValueMapValue
    private String userFirstName;

    @ValueMapValue
    private String userLastName;

    @ValueMapValue
    private String userAddress;

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserAddress() {
        return userAddress;
    }
}
