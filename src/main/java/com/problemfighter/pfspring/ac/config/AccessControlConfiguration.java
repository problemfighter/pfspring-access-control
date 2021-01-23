package com.problemfighter.pfspring.ac.config;

import com.problemfighter.pfspring.ac.auth.ACJwtTokenFilter;
import com.problemfighter.pfspring.ac.service.AcIdentityCallbackService;
import com.problemfighter.pfspring.identity.filter.JwtTokenFilter;
import com.problemfighter.pfspring.identity.filter.JwtTokenFilterInterface;
import com.problemfighter.pfspring.identity.service.IdentityCallbackInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AccessControlConfiguration {

    private final AcIdentityCallbackService acIdentityCallbackService;
    private final ACJwtTokenFilter acJwtTokenFilter;

    @Autowired
    public AccessControlConfiguration(AcIdentityCallbackService acIdentityCallbackService, ACJwtTokenFilter acJwtTokenFilter) {
        this.acIdentityCallbackService = acIdentityCallbackService;
        this.acJwtTokenFilter = acJwtTokenFilter;
    }

    @Bean
    @Primary
    public IdentityCallbackInterface acIdentityCallbackServiceBean(){
        return acIdentityCallbackService;
    }

    @Bean
    @Primary
    public JwtTokenFilterInterface acJwtTokenFilterBean(){
        return acJwtTokenFilter;
    }
}
