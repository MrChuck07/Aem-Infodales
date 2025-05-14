package com.infodales.aem.core.models.pojo;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class UserPojo {
    @Inject
    private String mobNum;

    public String getMobNum() {
        return mobNum;
    }
}
