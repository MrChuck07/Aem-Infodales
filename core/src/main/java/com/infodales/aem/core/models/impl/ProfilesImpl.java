package com.infodales.aem.core.models.impl;


import com.infodales.aem.core.models.Profiles;
import com.infodales.aem.core.models.pojo.UserProfilesPojo;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,adapters = Profiles.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProfilesImpl implements Profiles {

    @Inject
    List<UserProfilesPojo> profile;


    @Override
    public List<UserProfilesPojo> getUserProfile() {
        return profile;
    }
}
