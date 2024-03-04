package com.Sebastiao.springbootclothesseller.security.jwt;

import com.Sebastiao.springbootclothesseller.security.UserPrinciple;
import org.springframework.security.core.Authentication;

import jakarta.servlet.http.HttpServletRequest;


public interface JwtProvider {
    String generateToken(UserPrinciple auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);

}
