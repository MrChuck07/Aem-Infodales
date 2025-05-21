package com.infodales.aem.core.configurations;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Campaign", description = "Campaign details")
public @interface RegistrationFormConfig {

    @AttributeDefinition(name = "Campaign Id",
            type = AttributeType.INTEGER,
            description = "Enter the campaign Id here!...")
    public int getCampaignId();
}
