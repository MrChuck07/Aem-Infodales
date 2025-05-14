package com.infodales.aem.core.models;

import com.infodales.aem.core.models.pojo.ContactUserPojo;
import com.infodales.aem.core.models.pojo.ProfileTabsPojo;

import java.util.List;

public interface ProfileTabs {
    List<ProfileTabsPojo> getUserProfile();
    List<ContactUserPojo> getContactUser();
}
