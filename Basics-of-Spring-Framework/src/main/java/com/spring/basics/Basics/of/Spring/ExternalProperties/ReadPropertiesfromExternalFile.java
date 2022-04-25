package com.spring.basics.Basics.of.Spring.ExternalProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadPropertiesfromExternalFile {

    @Value("${application.service.endpoint}")
    private String applicationurl;

    @Value("${application.service.username}")
    public  String username;

    @Value("${application.service.password}")
    public  String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getApplicationurl() {
        return applicationurl;

    }
}
