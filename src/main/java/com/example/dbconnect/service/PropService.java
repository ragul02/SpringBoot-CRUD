package com.example.dbconnect.service;

import com.example.dbconnect.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropService {
    @Autowired
    private  final ApplicationConfig applicationConfig;


    public PropService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    public String getUserRole() {
        return  applicationConfig.getRole();
    }
}
