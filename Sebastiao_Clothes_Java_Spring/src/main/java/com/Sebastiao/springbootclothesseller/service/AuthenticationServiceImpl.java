package com.Sebastiao.springbootclothesseller.service;

import com.Sebastiao.springbootclothesseller.model.User;
import com.Sebastiao.springbootclothesseller.security.UserPrinciple;
import com.Sebastiao.springbootclothesseller.security.jwt.JwtProvider;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService{
    public final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;

    @Override
    public User signInAndReturnJWT(User signInRequest){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getUsername(),signInRequest.getPassword())
        );
        UserPrinciple userPrinciple= (UserPrinciple) authentication.getPrincipal();
        String jwt=jwtProvider.generateToken(userPrinciple);

        User signInUser=userPrinciple.getUser();
        signInUser.setToken(jwt);

        return signInUser;
    }
}
