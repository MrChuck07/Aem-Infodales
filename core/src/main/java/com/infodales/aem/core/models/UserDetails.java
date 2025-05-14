package com.infodales.aem.core.models;

import com.infodales.aem.core.models.pojo.UserPojo;

import java.util.List;

public interface UserDetails {
    String getFirstName();
    String getLastName();
    String getAddress();
    List<UserPojo> getMobileNumber();
}
