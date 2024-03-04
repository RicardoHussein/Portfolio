package com.Sebastiao.springbootclothesseller.service;

import com.Sebastiao.springbootclothesseller.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
