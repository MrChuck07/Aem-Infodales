package com.infodales.aem.core.models.impl;


import com.infodales.aem.core.models.Author;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


import javax.inject.Inject;

@Model( adaptables = Resource.class,
        adapters = Author.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class AuthorImpl implements Author {
   // private final Logger logger = LoggerFactory.getLogger(getClass());
    @Inject
    String fname;

    @Inject
    String lname;

    @Inject
    String monumber;


    @Override
    public String getFirstName() {
        return fname;
    }

    @Override
    public String getLastName() {
        return lname;
    }

    @Override
    public String getMobileNumber() {
        return monumber;
    }
}
