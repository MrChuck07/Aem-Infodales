package com.infodales.aem.core.models.impl;


import com.infodales.aem.core.models.ProfileTabs;
import com.infodales.aem.core.models.pojo.ContactUserPojo;
import com.infodales.aem.core.models.pojo.ProfileTabsPojo;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

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

    

    @Override
    public List<ProfileTabsPojo> getUserProfile() {
        return userInfo;
    }

    @Override
    public List<ContactUserPojo> getContactUser() {
        return userContacts;
    }

    @PostConstruct
    protected void init(){


    }
}
