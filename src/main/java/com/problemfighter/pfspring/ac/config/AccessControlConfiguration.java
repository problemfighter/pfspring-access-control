package com.problemfighter.pfspring.ac.config;

import com.problemfighter.pfspring.ac.service.AcIdentityCallbackService;
import com.problemfighter.pfspring.identity.service.IdentityCallbackInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AccessControlConfiguration {

    private final AcIdentityCallbackService acIdentityCallbackService;

    @Autowired
    public AccessControlConfiguration(AcIdentityCallbackService acIdentityCallbackService) {
        this.acIdentityCallbackService = acIdentityCallbackService;
    }

    @Bean
    @Primary
    public IdentityCallbackInterface acIdentityCallbackServiceBean(){
        return acIdentityCallbackService;
    }
}
