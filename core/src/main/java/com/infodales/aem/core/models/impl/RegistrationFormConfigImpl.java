package com.infodales.aem.core.models.impl;

import com.infodales.aem.core.configurations.RegistrationFormConfig;
import com.infodales.aem.core.services.RegistrationFormConfigService;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = RegistrationFormConfigService.class, immediate = true)
@Designate(ocd = RegistrationFormConfig.class)
public class RegistrationFormConfigImpl implements RegistrationFormConfigService{

    private String campaignId;

    @Activate
    protected void init(RegistrationFormConfig config){
        campaignId = String.valueOf(config.getCampaignId());
    }

    @Override
    public String getcampaignId() {
        return campaignId;
    }
}
