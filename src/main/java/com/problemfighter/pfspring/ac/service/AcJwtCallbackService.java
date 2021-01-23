package com.problemfighter.pfspring.ac.service;

import com.problemfighter.pfspring.jwt.service.JwtCallbackInterface;
import com.problemfighter.pfspring.jwt.service.JwtService;
import org.springframework.stereotype.Service;

@Service
public class AcJwtCallbackService implements JwtCallbackInterface {

    @Override
    public void onCreate(JwtService jwtService) {

    }

    @Override
    public void onRefreshTokenCreate(JwtService jwtService) {

    }

    @Override
    public void preValidate(JwtService jwtService) {

    }

    @Override
    public void refreshTokenPreValidate(JwtService jwtService) {

    }
}
