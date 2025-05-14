package com.infodales.aem.core.models.pojo;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ContactUserPojo {
    @ValueMapValue
    private String contactUser;

    public String getContactUser() {
        return contactUser;
    }
}
