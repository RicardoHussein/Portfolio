package com.Sebastiao.springbootclothesseller.controller;


import com.Sebastiao.springbootclothesseller.model.User;
import com.Sebastiao.springbootclothesseller.service.UserService;
import com.Sebastiao.springbootclothesseller.service.AuthenticationService;
import lombok.Getter;
 import lombok.RequiredArgsConstructor;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.HttpStatus;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/authentication") //pre-path
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final UserService userService;

    @PostMapping("sign-up")//api/authentication/sign-up
    public ResponseEntity<?> signUp(@RequestBody User user)
    {
        if (userService.findByUsername(user.getUsername()).isPresent())
        {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("deneme")
    public ResponseEntity<String> deneme(){
        return new ResponseEntity<String>("burak",HttpStatus.OK);
    }

    @PostMapping("sign-in")
    public ResponseEntity<?> signIn(@RequestBody User user){
        return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user),HttpStatus.OK);
    }
}
