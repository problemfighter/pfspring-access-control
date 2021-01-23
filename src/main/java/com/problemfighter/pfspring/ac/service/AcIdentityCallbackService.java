package com.problemfighter.pfspring.ac.service;

import com.problemfighter.pfspring.identity.model.dto.AuthResponseInterface;
import com.problemfighter.pfspring.identity.model.entity.Identity;
import com.problemfighter.pfspring.identity.service.IdentityCallbackInterface;
import com.problemfighter.pfspring.jwt.service.JwtService;
import org.springframework.stereotype.Service;

@Service
public class AcIdentityCallbackService implements IdentityCallbackInterface {


    @Override
    public AuthResponseInterface beforeAuthResponse(JwtService jwtService, Identity identity) {
        return null;
    }
}
