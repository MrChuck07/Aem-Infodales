package com.infodales.aem.core.models.impl;

import com.infodales.aem.core.models.UserDetails;
import com.infodales.aem.core.models.pojo.UserPojo;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,
        adapters = UserDetails.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class UserDetailsImpl implements UserDetails {

    @Inject
    String fiName;

    @Inject
    String laName;

    @Inject
    String address;

    @Inject
    List<UserPojo> mnumber;

    @Override
    public String getFirstName() {
        return fiName;
    }

    @Override
    public String getLastName() {
        return laName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public List<UserPojo> getMobileNumber() {
        return mnumber;
    }
}
